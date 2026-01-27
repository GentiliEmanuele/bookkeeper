package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collection;

public class ConstructorSources {

    @Builder
    @Getter
    public static class FirstConstructorParameters {
        ByteBufAllocator byteBufAllocator;
        File file;
        int capacity;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getFirstConstructorConfiguration() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    FirstConstructorParameters.builder()
                            .byteBufAllocator(ByteBufAllocator.DEFAULT)
                            .file(BufferedChannelUtils.validFileChannel())
                            .capacity(1024)
                            .expectedException(null)
                            .build()
                },
                {
                        FirstConstructorParameters.builder()
                            .byteBufAllocator(ByteBufAllocator.DEFAULT)
                            .file(BufferedChannelUtils.validFileChannel())
                            .capacity(0)
                            .expectedException(null)
                            .build()
                },
                {
                    FirstConstructorParameters.builder()
                        .byteBufAllocator(null)
                        .file(BufferedChannelUtils.validFileChannel())
                        .capacity(1024)
                        .expectedException(NullPointerException.class)
                        .build()
                },
                {
                    FirstConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(null)
                        .capacity(1024)
                        .expectedException(NullPointerException.class)
                        .build()
                }
        });
    }

    @Builder
    @Getter
    public static class SecondConstructorParameters {
        ByteBufAllocator byteBufAllocator;
        File file;
        int capacity;
        long unpersistedBytesBounds;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getSecondConstructorConfiguration() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    SecondConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .capacity(1024)
                        .unpersistedBytesBounds(0)
                        .expectedException(null)
                        .build()
                },
                {
                    SecondConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .capacity(1024)
                        .unpersistedBytesBounds(128)
                        .expectedException(null)
                        .build()
                },
                {
                    SecondConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .capacity(0)
                        .unpersistedBytesBounds(128)
                        .build()
                },
                {
                    SecondConstructorParameters.builder()
                        .byteBufAllocator(null)
                        .file(BufferedChannelUtils.validFileChannel())
                        .capacity(1024)
                        .unpersistedBytesBounds(0)
                        .expectedException(NullPointerException.class)
                        .build()
                },
                {
                    SecondConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(null)
                        .capacity(1024)
                        .unpersistedBytesBounds(128)
                        .expectedException(NullPointerException.class)
                        .build()
                }
        });
    }

    @Builder
    @Getter
    public static class ThirdConstructorParameters {
        ByteBufAllocator byteBufAllocator;
        File file;
        int writeCapacity;
        int readCapacity;
        long unpersistedBytesBounds;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getThirdConstructorConfiguration() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(1024)
                        .readCapacity(0)
                        .unpersistedBytesBounds(0)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())

                        .writeCapacity(1024)
                        .readCapacity(1024)
                        .unpersistedBytesBounds(0)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(1024)
                        .readCapacity(1024)
                        .unpersistedBytesBounds(128)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(0)
                        .readCapacity(1024)
                        .unpersistedBytesBounds(128)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(1024)
                        .readCapacity(0)
                        .unpersistedBytesBounds(128)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(1024)
                        .readCapacity(0)
                        .unpersistedBytesBounds(128)
                        .expectedException(null)
                        .build()
                },
                {
                    ThirdConstructorParameters.builder()
                        .byteBufAllocator(null)
                        .file(BufferedChannelUtils.validFileChannel())
                        .writeCapacity(1024)
                        .readCapacity(0)
                        .unpersistedBytesBounds(0)
                        .expectedException(NullPointerException.class)
                        .build()
                }
        });
    }

}

