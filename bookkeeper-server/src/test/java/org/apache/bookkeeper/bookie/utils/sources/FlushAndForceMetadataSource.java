package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

public class FlushAndForceMetadataSource {
    @Builder
    @Getter
    public static class FlushAndForceMedataParameters {
        ConstructorSources.ThirdConstructorParameters constructorParameters;
        int size;
        boolean forceMetadata;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getFlushAndForceMetadataParameters() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                    FlushAndForceMedataParameters.builder()
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
                            .forceMetadata(true)
                            .expectedException(null)
                            .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(false)
                                .expectedException(null)
                                .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(true)
                                .expectedException(null)
                                .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(false)
                                .expectedException(null)
                                .build()
                },
                {
                    FlushAndForceMedataParameters.builder()
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
                            .forceMetadata(true)
                            .expectedException(null)
                            .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(false)
                                .expectedException(null)
                                .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(true)
                                .expectedException(null)
                                .build()
                },
                {
                        FlushAndForceMedataParameters.builder()
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
                                .forceMetadata(false)
                                .expectedException(null)
                                .build()
                }
        });
    }
}
