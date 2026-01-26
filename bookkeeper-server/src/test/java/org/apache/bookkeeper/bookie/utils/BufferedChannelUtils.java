package org.apache.bookkeeper.bookie.utils;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BufferedChannelUtils {

    public static ByteBufAllocator mockByteBufAllocator() {
        ByteBufAllocator byteBufAllocatorMock = mock(ByteBufAllocator.class);

        // When buffered channel require a buffer, mock must return a true memory container
        when(byteBufAllocatorMock.buffer(anyInt(), anyInt()))
                .thenAnswer(invocation -> {
                    int capacity = invocation.getArgument(0);
                    return Unpooled.buffer(capacity);
                });
        return byteBufAllocatorMock;
    }

    public static FileChannel validFileChannel() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("buff_channel_test", ".txt");

        // Set the file deletion at the process end
        tempFile.deleteOnExit();

        // Open the file in read-write mode
        // RandomAccessFile is needed for obtain a valid file channel
        RandomAccessFile raf = new RandomAccessFile(tempFile, "rw");
        FileChannel fileChannel = raf.getChannel();
        return fileChannel;
    }
}
