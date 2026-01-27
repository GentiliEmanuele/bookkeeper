package org.apache.bookkeeper.bookie.utils.sources;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.bookie.utils.BufferedChannelUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

public class ReadSource {
    @Builder
    @Getter
    public static class ReadParameters {
        WriteSource.WriteParameters writeParams;
        int readByteBufferSize;
        long pos;
        int length;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getReadParameters() throws IOException {
        return Arrays.asList(new Object[][] {
                {
                        ReadParameters.builder()
                                .writeParams(
                                    WriteSource.WriteParameters.builder()
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
                                )
                                .readByteBufferSize(128)
                                .pos(0)
                                .length(128)
                                .build()
                }
        });
    }
}
