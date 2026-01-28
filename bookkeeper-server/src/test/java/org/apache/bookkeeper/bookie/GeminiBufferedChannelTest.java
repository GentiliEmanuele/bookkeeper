package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.util.ReferenceCountUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Random;

public class GeminiBufferedChannelTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File tempFile;
    private RandomAccessFile raf;
    private FileChannel fileChannel;
    private ByteBufAllocator allocator;
    private BufferedChannel bufferedChannel;

    @Before
    public void setUp() throws IOException {
        tempFile = tempFolder.newFile("buffered-channel-test.log");
        raf = new RandomAccessFile(tempFile, "rw");
        fileChannel = raf.getChannel();
        allocator = UnpooledByteBufAllocator.DEFAULT;
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            // This will also close the fileChannel
            bufferedChannel.close();
        }
        // Double check to ensure resources are released if bufferedChannel was null
        if (fileChannel != null && fileChannel.isOpen()) {
            fileChannel.close();
        }
        if (raf != null) {
            raf.close();
        }
    }

    /**
     * Verifies that the constructor correctly initializes the channel,
     * sets the position, and allocates the write buffer.
     */
    @Test
    public void testConstructorAndInitialState() throws IOException {
        int capacity = 1024;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);

        Assert.assertNotNull("Write buffer should be allocated", bufferedChannel.writeBuffer);
        Assert.assertEquals("Write capacity should match", capacity, bufferedChannel.writeCapacity);
        Assert.assertEquals("Initial position should be 0", 0, bufferedChannel.position());
        Assert.assertEquals("Initial bytes in buffer should be 0", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    /**
     * Verifies that writing to the channel buffers data in memory and does not
     * write to the FileChannel until flushed or capacity is reached.
     */
    @Test
    public void testWriteBufferingAndFlush() throws IOException {
        int capacity = 100;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);

        byte[] data = new byte[50];
        new Random().nextBytes(data);
        ByteBuf src = Unpooled.wrappedBuffer(data);

        // Write data smaller than capacity
        bufferedChannel.write(src);

        // Verify logical position advanced
        Assert.assertEquals(50, bufferedChannel.position());
        // Verify data is in the buffer
        Assert.assertEquals(50, bufferedChannel.getNumOfBytesInWriteBuffer());
        // Verify nothing is written to file yet (File size should be 0)
        Assert.assertEquals(0, raf.length());

        // Flush manually
        bufferedChannel.flush();

        // Verify buffer is cleared and file is updated
        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        Assert.assertEquals(50, raf.length());

        // Verify file content matches
        byte[] fileContent = new byte[50];
        raf.seek(0);
        raf.readFully(fileContent);
        Assert.assertArrayEquals(data, fileContent);
    }

    /**
     * Verifies that writing data exceeding the write buffer capacity causes
     * an automatic flush of the buffer.
     */
    @Test
    public void testWriteExceedingCapacityTriggersFlush() throws IOException {
        int capacity = 10;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);

        byte[] data = new byte[25]; // Larger than capacity (10)
        new Random().nextBytes(data);
        ByteBuf src = Unpooled.wrappedBuffer(data);

        bufferedChannel.write(src);

        // We expect:
        // 1. First 10 bytes fill buffer -> Auto Flush.
        // 2. Next 10 bytes fill buffer -> Auto Flush.
        // 3. Last 5 bytes remain in buffer.

        Assert.assertEquals(25, bufferedChannel.position());
        Assert.assertEquals(5, bufferedChannel.getNumOfBytesInWriteBuffer()); // Remainder

        // Force flush remaining
        bufferedChannel.flush();
        Assert.assertEquals(25, raf.length());

        byte[] fileContent = new byte[25];
        raf.seek(0);
        raf.readFully(fileContent);
        Assert.assertArrayEquals(data, fileContent);
    }

    /**
     * Tests the "Hot Read" capability: Reading data that is currently sitting
     * in the write buffer but hasn't been flushed to disk yet.
     */
    @Test
    public void testReadFromWriteBuffer() throws IOException {
        int capacity = 1024;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);

        byte[] data = new byte[100];
        for (int i = 0; i < 100; i++) {
            data[i] = (byte) i;
        }
        ByteBuf src = Unpooled.wrappedBuffer(data);

        bufferedChannel.write(src); // Data is in writeBuffer, not on disk

        ByteBuf dst = Unpooled.buffer(100);

        // Read from position 0
        int bytesRead = bufferedChannel.read(dst, 0, 100);

        Assert.assertEquals(100, bytesRead);
        byte[] readData = new byte[100];
        dst.readBytes(readData);
        Assert.assertArrayEquals(data, readData);
    }

    /**
     * Tests reading data that has already been flushed to the FileChannel.
     */
    @Test
    public void testReadFromFileChannel() throws IOException {
        int capacity = 1024;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, capacity);

        byte[] data = "PersistentData".getBytes();
        ByteBuf src = Unpooled.wrappedBuffer(data);

        bufferedChannel.write(src);
        bufferedChannel.flush(); // Move to disk

        // Clear write buffer to ensure we aren't reading from memory artifact
        bufferedChannel.clear();

        ByteBuf dst = Unpooled.buffer(data.length);
        int bytesRead = bufferedChannel.read(dst, 0, data.length);

        Assert.assertEquals(data.length, bytesRead);
        byte[] readBytes = new byte[data.length];
        dst.readBytes(readBytes);
        Assert.assertArrayEquals(data, readBytes);
    }

    /**
     * Verifies that forceWrite clears the unpersistedBytes counter and
     * successfully persists data.
     */
    @Test
    public void testForceWriteAndUnpersistedBytes() throws IOException {
        // Setup with unpersistedBytesBound checking enabled
        long bound = 50;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024, 1024, bound);

        byte[] data = new byte[40]; // Less than bound
        bufferedChannel.write(Unpooled.wrappedBuffer(data));

        Assert.assertEquals("Unpersisted bytes should track writes", 40, bufferedChannel.getUnpersistedBytes());

        // Manual force write
        bufferedChannel.forceWrite(false);

        // Note: Implementation logic says: if unpersistedBytesBound > 0, forceWrite
        // synchronizes and sets unpersistedBytes to writeBuffer.readableBytes()
        // (which is 40 because we didn't flush).
        Assert.assertEquals("ForceWrite (without flush) should leave unpersisted bytes count as buffer size",
                40, bufferedChannel.getUnpersistedBytes());

        // Now flush and force
        bufferedChannel.flush();
        bufferedChannel.forceWrite(false);

        Assert.assertEquals("After flush and force, unpersisted bytes should be 0",
                0, bufferedChannel.getUnpersistedBytes());
    }

    /**
     * Verifies the logic where hitting the unpersistedBytesBound triggers
     * an automatic flush and force write.
     */
    @Test
    public void testRegularFlushesTriggered() throws IOException {
        long bound = 10;
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 100, 100, bound);

        // Write 5 bytes (under bound)
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[5]));
        Assert.assertEquals(5, bufferedChannel.getNumOfBytesInWriteBuffer());

        // Write 10 more bytes (total 15 > bound 10)
        // This should trigger the logic: flush() -> forceWrite()
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[10]));

        // Since it flushed automatically:
        Assert.assertEquals("Buffer should be empty after auto-flush-force",
                0, bufferedChannel.getNumOfBytesInWriteBuffer());
        Assert.assertEquals("File should have data due to auto-flush",
                15, raf.length());
    }

    /**
     * Tests the flushAndForceWriteIfRegularFlush method.
     */
    @Test
    public void testFlushAndForceWriteIfRegularFlush() throws IOException {
        // Case 1: Regular flushes disabled (bound = 0)
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024, 0L);
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[10]));
        bufferedChannel.flushAndForceWriteIfRegularFlush(false);
        // Should NOT have flushed
        Assert.assertEquals(10, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.close();

        // FIX: Re-open the FileChannel because the previous close() closed it.
        raf = new RandomAccessFile(tempFile, "rw");
        fileChannel = raf.getChannel();

        // Case 2: Regular flushes enabled (bound > 0)
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024, 100L);
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[10]));
        bufferedChannel.flushAndForceWriteIfRegularFlush(false);
        // Should HAVE flushed
        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        // Note: The file length includes the 10 bytes from Case 1 (even though Case 1 wasn't flushed,
        // closing the channel might discard the buffer, but here we are checking the new write).
        // Actually, since Case 1 wasn't flushed and we closed, those 10 bytes are lost.
        // We only see the 10 bytes from Case 2.
        Assert.assertEquals(10, raf.length());
    }

    /**
     * Verifies that close releases the Netty buffer reference count.
     */
    @Test
    public void testCloseReleasesResources() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024);
        ByteBuf internalBuffer = bufferedChannel.writeBuffer;

        Assert.assertEquals(1, ReferenceCountUtil.refCnt(internalBuffer));
        bufferedChannel.close();
        Assert.assertEquals(0, ReferenceCountUtil.refCnt(internalBuffer));

        // Verify idempotent close
        bufferedChannel.close();
        Assert.assertEquals(0, ReferenceCountUtil.refCnt(internalBuffer));
    }

    /**
     * Verifies the clear operation resets the write buffer.
     */
    @Test
    public void testClear() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024);
        bufferedChannel.write(Unpooled.wrappedBuffer(new byte[50]));

        Assert.assertEquals(50, bufferedChannel.getNumOfBytesInWriteBuffer());

        bufferedChannel.clear();

        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    /**
     * Edge case: destination buffer too small for read.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testReadWithSmallDestBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 1024);
        ByteBuf dest = Unpooled.buffer(5);
        // Try to read 10 bytes into a 5 byte buffer
        bufferedChannel.read(dest, 0, 10);
    }
}