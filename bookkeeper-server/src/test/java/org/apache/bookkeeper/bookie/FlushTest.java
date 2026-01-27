package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.FlushSource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FlushTest {

    private final FlushSource.FlushParameters scenario;
    private BufferedChannel bufferedChannel;
    private ByteBuf expectedPayload;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return FlushSource.getFlushAndForceMetadataParameters();
    }

    public FlushTest(FlushSource.FlushParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void setUp() throws Exception {
        // Ensure the file is clean before the test
        File file = scenario.getConstructorParameters().getFile();
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel fc = raf.getChannel();
        bufferedChannel = new BufferedChannel(
                scenario.getConstructorParameters().getByteBufAllocator(),
                fc,
                scenario.getConstructorParameters().getWriteCapacity(),
                scenario.getConstructorParameters().getReadCapacity(),
                scenario.getConstructorParameters().getUnpersistedBytesBounds());

        expectedPayload = BufferedChannelUtils.createFullByteBuf(scenario.getSize());
        Assertions.assertNotNull(expectedPayload);
        bufferedChannel.write(expectedPayload);
    }

    @Test
    public void testFlush() throws Exception {
        if (scenario.getExpectedException() == null) {
            File file = scenario.getConstructorParameters().getFile();
            bufferedChannel.flush();
            Assert.assertEquals(scenario.getSize(), bufferedChannel.writeBufferStartPosition.get());

            // Read all byte from the file
            byte[] fileContent = Files.readAllBytes(file.toPath());

            // Get the byte from the ByteBuf used for write
            byte[] expectedBytes = new byte[expectedPayload.readableBytes()];
            expectedPayload.getBytes(expectedPayload.readerIndex(), expectedBytes);

            // Check if the length are the same
            Assert.assertEquals(expectedBytes.length, fileContent.length);
            Assert.assertArrayEquals(expectedBytes, fileContent);
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.flush());
        }
    }
}
