package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

public class FlushSource {
    @Builder
    @Getter
    public static class FlushParameters {
        ConstructorSources.ThirdConstructorParameters constructorParameters;
        int size;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getFlushAndForceMetadataParameters() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                        FlushSource.FlushParameters.builder()
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
                        FlushSource.FlushParameters.builder()
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
                        FlushSource.FlushParameters.builder()
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
                        FlushSource.FlushParameters.builder()
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
                        FlushSource.FlushParameters.builder()
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
                }
        });
    }
}
