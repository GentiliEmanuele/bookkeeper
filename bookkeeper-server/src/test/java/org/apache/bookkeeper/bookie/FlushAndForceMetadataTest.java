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

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Collection;


@RunWith(Parameterized.class)
public class FlushAndForceMetadataTest {
    private final FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario;
    private BufferedChannel bufferedChannel;
    private ByteBuf expectedPayload;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return FlushAndForceMetadataSource.getFlushAndForceMetadataParameters();
    }

    public FlushAndForceMetadataTest(FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario) {
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
    public void testFlushAndForceMetadata() throws IOException {
        if (scenario.getExpectedException() == null) {
            File file = scenario.getConstructorParameters().getFile();
            bufferedChannel.flushAndForceWrite(scenario.isForceMetadata());
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
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.flushAndForceWrite(scenario.isForceMetadata()));
        }
    }

    @Test
    public void testForceWrite() throws IOException {
        if (scenario.getExpectedException() == null) {
            File file = scenario.getConstructorParameters().getFile();
            long persistentByte = bufferedChannel.forceWrite(scenario.isForceMetadata());

            // Before the flush operations persistentByte are 0
            Assert.assertEquals(0, persistentByte);
            // The length of the file content is 0
            byte[] fileContent = Files.readAllBytes(file.toPath());
            Assert.assertEquals(0, fileContent.length);

            bufferedChannel.flush();
            persistentByte = bufferedChannel.forceWrite(scenario.isForceMetadata());

            Assert.assertEquals(scenario.getSize(), persistentByte);

            // Read all byte from the file
            fileContent = Files.readAllBytes(file.toPath());

            // Get the byte from the ByteBuf used for write
            byte[] expectedBytes = new byte[expectedPayload.readableBytes()];
            expectedPayload.getBytes(expectedPayload.readerIndex(), expectedBytes);

            // Check if the length are the same
            Assert.assertEquals(expectedBytes.length, fileContent.length);
            Assert.assertArrayEquals(expectedBytes, fileContent);
        }
    }
}
