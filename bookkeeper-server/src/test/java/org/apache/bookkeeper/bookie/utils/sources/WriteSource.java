package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

public class WriteSource {
    @Builder
    @Getter
    public static class WriteParameters {
        ConstructorSources.ThirdConstructorParameters constructorParameters;
        int size;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getWriteParameters() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    WriteParameters.builder()
                            .constructorParameters(
                            ConstructorSources.ThirdConstructorParameters.builder()
                                    .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                    .file(BufferedChannelUtils.validFileChannel())
                                    .writeCapacity(1024)
                                    .readCapacity(0)
                                    .unpersistedBytesBounds(0)
                                    .expectedException(null)
                                    .build()
                            )
                            .size(0)
                            .expectedException(null)
                            .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(1024)
                                                .readCapacity(0)
                                                .unpersistedBytesBounds(0)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(128)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                ConstructorSources.ThirdConstructorParameters.builder()
                                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                        .file(BufferedChannelUtils.validFileChannel())
                                        .writeCapacity(1024)
                                        .readCapacity(1024)
                                        .unpersistedBytesBounds(0)
                                        .expectedException(null)
                                        .build()
                                )
                                .size(0)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(1024)
                                                .readCapacity(1024)
                                                .unpersistedBytesBounds(0)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(128)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                ConstructorSources.ThirdConstructorParameters.builder()
                                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                        .file(BufferedChannelUtils.validFileChannel())
                                        .writeCapacity(1024)
                                        .readCapacity(1024)
                                        .unpersistedBytesBounds(128)
                                        .expectedException(null)
                                        .build()
                                )
                                .size(0)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(1024)
                                                .readCapacity(1024)
                                                .unpersistedBytesBounds(128)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(128)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                ConstructorSources.ThirdConstructorParameters.builder()
                                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                        .file(BufferedChannelUtils.validFileChannel())
                                        .writeCapacity(0)
                                        .readCapacity(1024)
                                        .unpersistedBytesBounds(128)
                                        .expectedException(null)
                                        .build()
                                )
                                .size(0)
                                .expectedException(null)
                                .build()
                },
                /*
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(0)
                                                .readCapacity(1024)
                                                .unpersistedBytesBounds(128)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(128)
                                .expectedException(null)
                                .build()
                },

                 */
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                ConstructorSources.ThirdConstructorParameters.builder()
                                        .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                        .file(BufferedChannelUtils.validFileChannel())
                                        .writeCapacity(1024)
                                        .readCapacity(0)
                                        .unpersistedBytesBounds(128)
                                        .expectedException(null)
                                        .build()
                                )
                                .size(0)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(1024)
                                                .readCapacity(0)
                                                .unpersistedBytesBounds(128)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(128)
                                .expectedException(null)
                                .build()
                },
                {
                        WriteParameters.builder()
                                .constructorParameters(
                                        ConstructorSources.ThirdConstructorParameters.builder()
                                                .byteBufAllocator(ByteBufAllocator.DEFAULT)
                                                .file(BufferedChannelUtils.validFileChannel())
                                                .writeCapacity(1024)
                                                .readCapacity(0)
                                                .unpersistedBytesBounds(0)
                                                .expectedException(null)
                                                .build()
                                )
                                .size(-1)
                                .expectedException(NullPointerException.class)
                                .build()
                },
        });
    }
}
