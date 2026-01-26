package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

public class ConstructorSources {

    @Builder
    @Getter
    public static class FirstConstructorParameters {
        ByteBufAllocator byteBufAllocator;
        FileChannel fc;
        int capacity;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getFirstConstructorConfiguration() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    FirstConstructorParameters.builder()
                            .byteBufAllocator(ByteBufAllocator.DEFAULT)
                            .fc(BufferedChannelUtils.validFileChannel())
                            .capacity(1024)
                            .expectedException(null)
                            .build()
                },
                {
                        FirstConstructorParameters.builder()
                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                .fc(BufferedChannelUtils.validFileChannel())
                                .capacity(0)
                                .expectedException(null)
                                .build()
                },
                {
                    FirstConstructorParameters.builder()
                        .byteBufAllocator(null)
                        .fc(BufferedChannelUtils.validFileChannel())
                        .capacity(1024)
                        .expectedException(NullPointerException.class)
                        .build()
                },
                {
                    FirstConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .fc(null)
                        .capacity(1024)
                        .expectedException(NullPointerException.class)
                        .build()
                }
        });
    }

}
