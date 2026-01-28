package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;
import org.apache.bookkeeper.bookie.utils.sources.ReadSource;
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
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReadBufferedChannelTest {
    private final ReadSource.ReadParameters scenario;
    private BufferedChannel bufferedChannel;
    private ByteBuf expectedPayload;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return ReadSource.getReadParameters();
    }

    public ReadBufferedChannelTest(ReadSource.ReadParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void setUp() throws Exception {
        // Ensure the file is clean before the test
        File file = scenario.getWriteParams().getConstructorParameters().getFile();
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel fc = raf.getChannel();
        bufferedChannel = new BufferedChannel(
                scenario.getWriteParams().getConstructorParameters().getByteBufAllocator(),
                fc,
                scenario.getWriteParams().getConstructorParameters().getWriteCapacity(),
                scenario.getWriteParams().getConstructorParameters().getReadCapacity(),
                scenario.getWriteParams().getConstructorParameters().getUnpersistedBytesBounds());

        expectedPayload = BufferedChannelUtils.createFullByteBuf(scenario.getWriteParams().getSize());
        Assertions.assertNotNull(expectedPayload);
        bufferedChannel.write(expectedPayload);
    }

    @Test
    public void testRead() throws Exception {
        ByteBuf dest = BufferedChannelUtils.createAnEmptyBuffer(scenario.getReadByteBufferSize());
        if (scenario.getExpectedException() == null) {
            Assertions.assertNotNull(dest);
            int numReadBytes = bufferedChannel.read(dest, scenario.getPos(), scenario.getLength());
            Assertions.assertEquals(scenario.getLength(), numReadBytes);

            // Get the byte from the ByteBuf used for write
            byte[] expectedBytes = new byte[expectedPayload.readableBytes()];
            expectedPayload.getBytes(expectedPayload.readerIndex(), expectedBytes);

            // Get the byte from the ByteBuf used for the read
            byte[] readByte = new byte[dest.readableBytes()];
            dest.getBytes(dest.readerIndex(), readByte);
            if (scenario.getLength() > 0) {
                Assertions.assertArrayEquals(expectedBytes, readByte);
            } else {
                Assertions.assertEquals(0, readByte.length);
            }
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> bufferedChannel.read(dest, scenario.getPos(), scenario.getLength()));
        }
    }
}
