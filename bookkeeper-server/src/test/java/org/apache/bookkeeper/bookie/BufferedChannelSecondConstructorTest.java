package org.apache.bookkeeper.bookie;

import org.apache.bookkeeper.bookie.utils.sources.ConstructorSources;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

@RunWith(Parameterized.class)
public class BufferedChannelSecondConstructorTest {

    private final ConstructorSources.SecondConstructorParameters scenario;

    @Parameters
    public static Collection<Object[]> data() throws IOException {
        return ConstructorSources.getSecondConstructorConfiguration();
    }

    public BufferedChannelSecondConstructorTest(ConstructorSources.SecondConstructorParameters scenario) {
        this.scenario = scenario;
    }

    @Test
    public void testConstructor() throws IOException {
        if (scenario.getExpectedException() == null) {
            BufferedChannel bufferedChannel = new BufferedChannel(scenario.getByteBufAllocator(), scenario.getFc(), scenario.getCapacity(), scenario.getUnpersistedBytesBounds());
            Assert.assertNotNull(bufferedChannel);
            Assert.assertEquals(scenario.getCapacity(), bufferedChannel.writeCapacity);
            Assert.assertEquals(scenario.getCapacity(), bufferedChannel.readCapacity);
            Assert.assertEquals(0, bufferedChannel.position());
            Assert.assertNotNull(bufferedChannel.writeBuffer);
            Assert.assertEquals(0, bufferedChannel.cacheHitCount);
            Assert.assertEquals(0, bufferedChannel.invocationCount);
            Assert.assertNotNull(bufferedChannel.readBuffer);
            Assert.assertFalse(bufferedChannel.sealed);
            Assert.assertEquals(new AtomicLong(0).get(), bufferedChannel.writeBufferStartPosition.get());
            Assert.assertEquals(scenario.getUnpersistedBytesBounds(), bufferedChannel.unpersistedBytesBound);
        } else {
            Assert.assertThrows(scenario.getExpectedException(), () -> {
                new BufferedChannel(scenario.getByteBufAllocator(), scenario.getFc(), scenario.getCapacity());
            });
        }
    }

}
