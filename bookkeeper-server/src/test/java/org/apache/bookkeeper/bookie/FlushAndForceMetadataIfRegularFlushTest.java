package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.FlushAndForceMetadataIfRegularFlushSource;
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
public class FlushAndForceMetadataIfRegularFlushTest {

    private final FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario;
    private BufferedChannel bufferedChannel;
    private ByteBuf expectedPayload;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return FlushAndForceMetadataIfRegularFlushSource.getFlushAndForceMetadataParameters();
    }

    public FlushAndForceMetadataIfRegularFlushTest(FlushAndForceMetadataSource.FlushAndForceMedataParameters scenario) {
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
            bufferedChannel.flushAndForceWriteIfRegularFlush(scenario.isForceMetadata());
            if (scenario.getConstructorParameters().getUnpersistedBytesBounds() > 0) {
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
                // If call flushAndForceWriteIfRegularFlush but unpersistedByteBound = 0 flush and force are not called
                Assert.assertEquals(0, bufferedChannel.writeBufferStartPosition.get());

                // If no flush occur expected payload is empty
                Assertions.assertEquals(0, Files.readAllBytes(file.toPath()).length);
            }
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.flushAndForceWrite(scenario.isForceMetadata()));
        }
    }

    @Test
    public void testForceWrite() throws IOException {
        if (scenario.getExpectedException() == null) {
            File file = scenario.getConstructorParameters().getFile();
            long forcedWriteByte = bufferedChannel.forceWrite(scenario.isForceMetadata());
            if (scenario.getSize() >= bufferedChannel.unpersistedBytesBound) {
                Assert.assertEquals(scenario.getSize(), forcedWriteByte);

                // Check the content of the file
                // Read all byte from the file
                byte[] fileContent = Files.readAllBytes(file.toPath());

                // Get the byte from the ByteBuf used for write
                byte[] expectedBytes = new byte[expectedPayload.readableBytes()];
                expectedPayload.getBytes(expectedPayload.readerIndex(), expectedBytes);

                // Check if the length are the same
                Assert.assertEquals(expectedBytes.length, fileContent.length);
                Assert.assertArrayEquals(expectedBytes, fileContent);
            } else {
                Assert.assertEquals(0, forcedWriteByte);

                // At this point data is not on the file
                byte[] fileContent = Files.readAllBytes(file.toPath());
                Assertions.assertEquals(0, fileContent.length);

                // Execute a flush operation and repeat the check
                bufferedChannel.flush();
                fileContent = Files.readAllBytes(file.toPath());

                Assertions.assertEquals(scenario.getSize(), fileContent.length);

                // Get the byte from the ByteBuf used for write
                byte[] expectedBytes = new byte[expectedPayload.readableBytes()];
                expectedPayload.getBytes(expectedPayload.readerIndex(), expectedBytes);

                // Check if the length are the same
                Assert.assertEquals(expectedBytes.length, fileContent.length);
                Assert.assertArrayEquals(expectedBytes, fileContent);
            }
        }
    }
}
