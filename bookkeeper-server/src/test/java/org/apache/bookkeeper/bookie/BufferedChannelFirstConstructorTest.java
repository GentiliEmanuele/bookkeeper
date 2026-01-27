package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCountUtil;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.ConstructorSources;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

@RunWith(Parameterized.class)
public class BufferedChannelFirstConstructorTest {

    private final ConstructorSources.FirstConstructorParameters scenario;
    private FileChannel fc;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return ConstructorSources.getFirstConstructorConfiguration();
    }

    public BufferedChannelFirstConstructorTest(ConstructorSources.FirstConstructorParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void setUp() throws Exception {
        if (scenario.getFile() != null) {
            // Open the file in read-write mode
            // RandomAccessFile is needed for obtain a valid file channel
            RandomAccessFile raf = new RandomAccessFile(scenario.getFile(), "rw");
            this.fc = raf.getChannel();
        } else {
            this.fc = null;
        }
    }


    @Test
    public void testConstructor() throws IOException {
        if (scenario.getExpectedException() == null) {
            BufferedChannel bufferedChannel = new BufferedChannel(scenario.getByteBufAllocator(), this.fc, scenario.getCapacity());
            Assert.assertNotNull(bufferedChannel);
            Assert.assertEquals(scenario.getCapacity(), bufferedChannel.writeCapacity);
            Assert.assertEquals(scenario.getCapacity(), bufferedChannel.readCapacity);
            Assert.assertEquals(0, bufferedChannel.position());
            Assert.assertNotNull(bufferedChannel.writeBuffer);
            Assert.assertEquals(new AtomicLong(0).get(), bufferedChannel.unpersistedBytes.get());
            Assert.assertEquals(0, bufferedChannel.unpersistedBytesBound);
            Assert.assertEquals(0, bufferedChannel.cacheHitCount);
            Assert.assertEquals(0, bufferedChannel.invocationCount);
            Assert.assertNotNull(bufferedChannel.readBuffer);
            Assert.assertFalse(bufferedChannel.sealed);
            Assert.assertEquals(new AtomicLong(0).get(), bufferedChannel.writeBufferStartPosition.get());
        } else {
            Assert.assertThrows(scenario.getExpectedException(), () -> {
               new BufferedChannel(scenario.getByteBufAllocator(), this.fc, scenario.getCapacity());
            });
        }
    }

    @Test
    public void testClear() throws IOException {
        if (scenario.getExpectedException() == null) {
            // Create a bufferedChannel
            BufferedChannel bufferedChannel = new BufferedChannel(scenario.getByteBufAllocator(), fc, scenario.getCapacity());

            // Write some byte into it
            ByteBuf src = BufferedChannelUtils.createFullByteBuf(128);
            Assert.assertNotNull(src);
            // Use a timer to avoid infinite loop
            Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), () -> bufferedChannel.write(src));

            // Check if position is updated after write
            Assert.assertEquals(128, bufferedChannel.getNumOfBytesInWriteBuffer());
            // Clear the buffer
            bufferedChannel.clear();
            // Check if the buffer position is returned to 0
            Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        }
    }

    @Test
    public void testClose() throws IOException {
        if (scenario.getExpectedException() == null) {
            BufferedChannel bufferedChannel = new BufferedChannel(scenario.getByteBufAllocator(), this.fc, scenario.getCapacity());
            int beforeCloseRefCounter = ReferenceCountUtil.refCnt(bufferedChannel.writeBuffer);
            bufferedChannel.close();
            int afterCloseRefCounter = ReferenceCountUtil.refCnt(bufferedChannel.writeBuffer);
            Assert.assertEquals(beforeCloseRefCounter - 1, afterCloseRefCounter);
        }
    }
}
