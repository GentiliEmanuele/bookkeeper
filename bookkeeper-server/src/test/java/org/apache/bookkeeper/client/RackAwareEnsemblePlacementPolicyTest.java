package org.apache.bookkeeper.client;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;
import org.apache.bookkeeper.feature.Feature;
import org.apache.bookkeeper.feature.FeatureProvider;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.Counter;
import org.apache.bookkeeper.stats.OpStatsLogger;
import org.apache.bookkeeper.stats.StatsLogger;
import org.apache.bookkeeper.util.ParametersSource;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.apache.bookkeeper.util.StaticDNSResolver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(value=Parameterized.class)
public class RackAwareEnsemblePlacementPolicyTest {

    private final static int MIN_NUM_RACKS_PER_WRITE_QUORUM = 2;

    private final ParametersSource.PlacementPolicyTestScenario scenario;

    private RackawareEnsemblePlacementPolicy policy;
    private RackawareEnsemblePlacementPolicy initializeResult;

    @Parameters
    public static Collection<Object[]> data() {
        return ParametersSource.getParametersConfiguration();
    }

    public RackAwareEnsemblePlacementPolicyTest(ParametersSource.PlacementPolicyTestScenario scenario) {
        this.scenario = scenario;
    }


    @Before
    public void initializeTest() {
        // Use a mock to simulate an active timer
        HashedWheelTimer mockTimer = mock(HashedWheelTimer.class);
        when(mockTimer.newTimeout(any(TimerTask.class), anyLong(), any(TimeUnit.class)))
                .thenAnswer(invocation -> {
                    TimerTask task = invocation.getArgument(0);
                    task.run(mock(Timeout.class));
                    return mock(Timeout.class);
        });

        // Mock a valid feature provider for RegionAwareEnsemblePlacementPolicy
        FeatureProvider mockFeatureProvider = mock(FeatureProvider.class);
        Feature mockFeature = mock(Feature.class);
        when(mockFeature.isAvailable()).thenReturn(false);
        when(mockFeatureProvider.getFeature(anyString())).thenReturn(mockFeature);

        // Mock for the stats
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        Counter mockCounter = mock(Counter.class);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(mockCounter);
        OpStatsLogger opStatsLogger = mock(OpStatsLogger.class);
        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(opStatsLogger);

        // Create the bookie address resolver and the topology
        BookieAddressResolver bookieAddressResolver = RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(scenario.getBookiesCanBeSolved());
        RackAwarePPTestUtils.createNNodeMRackTopology(scenario.getEnsembleSize(), scenario.getNumberOfRack());

        // Create and configure StaticDNSResolver
        StaticDNSResolver staticDNSResolver = new StaticDNSResolver();
        staticDNSResolver.setBookieAddressResolver(bookieAddressResolver);
        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(scenario.getOptEnforceDurability());
        initializeResult = policy.initialize(
                staticDNSResolver,
                mockTimer,
                scenario.isReorderReadsRandom(),
                scenario.getStabilizePeriodSeconds(),
                scenario.getReorderThresholdPendingRequests(),
                scenario.isWeighted(),
                scenario.getMaxWeightMultiple(),
                MIN_NUM_RACKS_PER_WRITE_QUORUM,
                scenario.isEnforceMinNumRacksPerWriteQuorum(),
                scenario.isIgnoreLocalNodeInPlacementPolicy(),
                mockStatsLogger,
                bookieAddressResolver
        );
    }

    @Test
    public void testInitializeResult() {
        // Check that initialize return a not null result
        Assertions.assertNotNull(initializeResult);
        // Check that initialize return exactly the created policy
        Assertions.assertEquals(policy, initializeResult);
    }

    @Test
    public void testSlaveValue() {
        if (scenario.getStabilizePeriodSeconds() > 0) {
            Assertions.assertNotNull(policy.slave);
        } else {
            Assertions.assertNull(policy.slave);
        }
    }

    @Test
    public void testNewEnsemble() {
        // Create the set of writable and read-only bookie id
        Set<BookieId> writableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getWritableBookies());
        Set<BookieId> readOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getReadOnlyBookies());

        // Create the set of excluded bookie
        Set<BookieId> excludeBookie = RackAwarePPTestUtils.toBookieIdSet(scenario.getExcludeBookie());

        if (scenario.getExpectedException() == null) {
            Assertions.assertDoesNotThrow(() -> {
                policy.onClusterChanged(writableBookies, readOnlyBookies);
                policy.newEnsemble(scenario.getEnsembleSize(), scenario.getWriteQuorumSize(), scenario.getAckQuorumSize(), new HashMap<>(), excludeBookie);policy.uninitalize();
            });
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> {
                policy.onClusterChanged(writableBookies, readOnlyBookies);
                policy.newEnsemble(scenario.getEnsembleSize(), scenario.getWriteQuorumSize(), scenario.getAckQuorumSize(), new HashMap<>(), excludeBookie);
                policy.uninitalize();
            });
        }
    }

    @After
    public void cleanUp() {
        policy.uninitalize();
    }
}
