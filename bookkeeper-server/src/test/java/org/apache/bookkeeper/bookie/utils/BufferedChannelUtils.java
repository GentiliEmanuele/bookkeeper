package org.apache.bookkeeper.bookie.utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.File;
import java.io.IOException;


public class BufferedChannelUtils {

    public static File validFileChannel() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("buff_channel_test", ".txt");

        // Set the file deletion at the process end
        tempFile.deleteOnExit();
        return tempFile;
    }

    /**
     * Create a byte buffer of the specified size and write size byte in the buffer.
     * Use size = 0 for empty buffer and size = -1 for null buffer
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
}
