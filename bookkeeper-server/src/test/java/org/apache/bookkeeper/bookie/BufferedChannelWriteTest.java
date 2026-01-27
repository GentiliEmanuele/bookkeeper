package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.WriteSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;


@RunWith(Parameterized.class)
public class BufferedChannelWriteTest {
    private final WriteSource.WriteParameters scenario;
    private BufferedChannel bufferedChannel;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return WriteSource.getWriteParameters();
    }

    public BufferedChannelWriteTest(WriteSource.WriteParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void setUp() throws Exception {
        RandomAccessFile raf = new RandomAccessFile(scenario.getConstructorParameters().getFile(), "rw");
        FileChannel fc = raf.getChannel();
        bufferedChannel = new BufferedChannel(
                scenario.getConstructorParameters().getByteBufAllocator(),
                fc,
                scenario.getConstructorParameters().getWriteCapacity(),
                scenario.getConstructorParameters().getReadCapacity(),
                scenario.getConstructorParameters().getUnpersistedBytesBounds());
    }

    @Test
    public void testWrite() {
        // Create a byte buff of the specified size and write it in the BufferedChannel
        ByteBuf byteBuf = BufferedChannelUtils.createFullByteBuf(scenario.getSize());

        if (scenario.getExpectedException() == null) {
            // Get the position before write operation
            long positionBefore = bufferedChannel.position;
            AtomicLong unpersistedBytesBefore = bufferedChannel.unpersistedBytes;

            Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), () -> bufferedChannel.write(byteBuf));

            // Check if the position has been updated correctly
            Assert.assertEquals(positionBefore + scenario.getSize(), bufferedChannel.position);
            // Check if the amount of the bytes is updated correctly
            Assert.assertEquals(unpersistedBytesBefore.addAndGet(scenario.getSize()), bufferedChannel.unpersistedBytes.get());
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.write(byteBuf));
        }
    }
}
