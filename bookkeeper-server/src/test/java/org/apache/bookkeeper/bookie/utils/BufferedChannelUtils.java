package org.apache.bookkeeper.bookie.utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BufferedChannelUtils {

    public static File createTempFile() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("buff_channel_test", ".txt");

        // Set the file deletion at the process end
        tempFile.deleteOnExit();
        return tempFile;
    }

    /**
     * Create a byte buffer of the specified size and write size byte in the buffer.
     * Use size = -1 for null buffer
     * @param size size of the buffer
     * @return the created buffer
     */
    public static ByteBuf createFullByteBuf(int size) {
        if (size == -1) return null;
        ByteBuf buffer = Unpooled.buffer(size);
        for (int i = 0; i < size; i++) {
            buffer.writeByte((byte) i);
        }
        return buffer;
    }

    /**
     * Create a buffer of the specified size without write any byte into
     * @param size size of the buffer
     * @return the created buffer
     */
    public static ByteBuf createAnEmptyBuffer(int size) {
        return size >= 0 ? Unpooled.buffer(size) : null;
    }

    /**
     * Create a byte buffer allocator that return null foreach call to the method directBuffer()
     * @return the mocked byteBufAllocator
     */
    public static ByteBufAllocator createInvalidByteBufAllocator() {
        ByteBufAllocator byteBufAllocator = mock(ByteBufAllocator.class);
        when(byteBufAllocator.directBuffer(anyInt())).thenReturn(null);
        return byteBufAllocator;
    }

    public static void writeDirectlyToFile(File file, int size) throws FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] data = new byte[size];
            // Put random byte in the array
            new Random().nextBytes(data);
            // Write data into the file
            fos.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
