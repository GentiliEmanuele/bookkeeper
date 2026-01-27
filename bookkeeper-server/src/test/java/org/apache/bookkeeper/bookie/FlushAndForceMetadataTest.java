package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.FlushAndForceMetadataSource;
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
import java.util.Collection;


@RunWith(Parameterized.class)
public class FlushAndForceMetadataTest {
    private final FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario;
    private BufferedChannel bufferedChannel;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return FlushAndForceMetadataSource.getFlushAndForceMetadataParameters();
    }

    public FlushAndForceMetadataTest(FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario) {
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

        ByteBuf byteBuf = BufferedChannelUtils.createFullByteBuf(scenario.getSize());
        Assertions.assertNotNull(byteBuf);
        bufferedChannel.write(byteBuf);
    }

    @Test
    public void testFlushAndForceMetadata() throws IOException {
        if (scenario.getExpectedException() == null) {
            bufferedChannel.flushAndForceWrite(scenario.isForceMetadata());
            Assert.assertEquals(scenario.getSize(), bufferedChannel.writeBufferStartPosition.get());
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.flushAndForceWrite(scenario.isForceMetadata()));
        }
    }
}
