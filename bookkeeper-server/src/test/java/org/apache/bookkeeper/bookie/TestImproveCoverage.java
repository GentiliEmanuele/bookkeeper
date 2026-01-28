package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Arrays;

public class TestImproveCoverage {
    @Test
    public void testReadBufferCacheHit() throws Exception {
        // Create a temp file
        File tmpFile = BufferedChannelUtils.createTempFile();
        // Write directly into the file
        BufferedChannelUtils.writeDirectlyToFile(tmpFile, 1024);
        byte[] expectedData = Files.readAllBytes(tmpFile.toPath());

        try (RandomAccessFile raf = new RandomAccessFile(tmpFile, "rw");
            FileChannel fc = raf.getChannel()) {
            fc.position(fc.size());
            BufferedChannel bufferedChannel = new BufferedChannel(ByteBufAllocator.DEFAULT, fc, 50, 50, 0); // ReadCapacity = 50

            ByteBuf dest = Unpooled.buffer(10);

            // First step cache miss
            int bytesRead1 = bufferedChannel.read(dest, 0, 10);

            // Check after first read
            Assert.assertEquals(10, bytesRead1);
            byte[] actualBytes1 = new byte[10];
            dest.readBytes(actualBytes1);
            byte[] expectedSubset1 = Arrays.copyOfRange(expectedData, 0, 10);
            Assert.assertArrayEquals(expectedSubset1, actualBytes1);

            dest.clear();

            // Second read: cache hit
            int bytesRead2 = bufferedChannel.read(dest, 5, 10);

            // Check after second read
            Assert.assertEquals(10, bytesRead2);
            byte[] actualBytes2 = new byte[10];
            dest.readBytes(actualBytes2);
            Assert.assertArrayEquals(Arrays.copyOfRange(expectedData, 5, 15), actualBytes2);

            dest.clear();

            // Third step cache miss
            int bytesRead3 = bufferedChannel.read(dest, 200, 10);
            // Check after the third step
            Assert.assertEquals(10, bytesRead3);
            byte[] actualBytes3 = new byte[10];
            dest.readBytes(actualBytes3);
            Assert.assertArrayEquals(Arrays.copyOfRange(expectedData, 200, 210), actualBytes3);

            dest.clear();

            // Last step read back
            int bytesRead4 = bufferedChannel.read(dest, 50, 10);

            // Check after
            Assert.assertEquals(10, bytesRead4);
            byte[] actualBytes4 = new byte[10];
            dest.readBytes(actualBytes4);
            Assert.assertArrayEquals(Arrays.copyOfRange(expectedData, 50, 60), actualBytes4);
        }
    }

    @Test
    public void testDoubleClose() throws IOException {
        // Create a temporary file
        File tmpFile = BufferedChannelUtils.createTempFile();

        try (RandomAccessFile raf = new RandomAccessFile(tmpFile, "rw")) {
            FileChannel fc = raf.getChannel();
            BufferedChannel bufferedChannel = new BufferedChannel(ByteBufAllocator.DEFAULT, fc, 1024, 512, 0);
            bufferedChannel.close();
            // If the channel is closed, flush ops thrown an exception
            Assertions.assertFalse(fc.isOpen());
            Assertions.assertDoesNotThrow(bufferedChannel::close);
        }
    }

    @Test
    public void testWriteOutOfBuffer() throws IOException {
        // Create a temporary file
        File tmpFile = BufferedChannelUtils.createTempFile();

        try (RandomAccessFile raf = new RandomAccessFile(tmpFile, "rw")) {
            FileChannel fc = raf.getChannel();
            BufferedChannel bufferedChannel = new BufferedChannel(ByteBufAllocator.DEFAULT, fc, 1024, 512, 128);
            ByteBuf src = BufferedChannelUtils.createFullByteBuf(1500);
            Assert.assertNotNull(src);
            Assertions.assertDoesNotThrow(() -> bufferedChannel.write(src));
            Assertions.assertNotEquals(0, bufferedChannel.position());

            bufferedChannel.flush();

            // Get the byte written with the write operations
            byte[] expectedBytes = new byte[src.readableBytes()];
            src.getBytes(src.readerIndex(), expectedBytes);

            // Read bypassing buffered channel
            raf.seek(0);
            byte[] actualBytes = new byte[(int) raf.length()];
            raf.readFully(actualBytes);

            // Compare the bytes
            Assert.assertArrayEquals(expectedBytes, actualBytes);
        }
    }

    @Test
    public void testFlushAndForceMetadataIfRegularFlush() throws IOException {
        // This test the method when regularFlush = true and there are byte to write
        File tmpFile = BufferedChannelUtils.createTempFile();

        RandomAccessFile raf = new RandomAccessFile(tmpFile, "rw");
        FileChannel fc = raf.getChannel();
        BufferedChannel bufferedChannel = new BufferedChannel(
                ByteBufAllocator.DEFAULT,
                fc,
                1024,
                1024,
                0);

        bufferedChannel.write(BufferedChannelUtils.createFullByteBuf(64));
        bufferedChannel.flushAndForceWriteIfRegularFlush(false);
        Assert.assertEquals(0, bufferedChannel.writeBufferStartPosition.get());
        // If no flush occur expected payload is empty
        Assertions.assertEquals(0, Files.readAllBytes(tmpFile.toPath()).length);
    }

}
