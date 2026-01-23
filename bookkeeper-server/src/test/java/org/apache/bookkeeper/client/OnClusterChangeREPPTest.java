package org.apache.bookkeeper.client;

import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.util.OnClusterChangeSource;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

@RunWith(Parameterized.class)
public class OnClusterChangeREPPTest {

    private final OnClusterChangeSource.OnClusterChangesParameters scenario;

    private RackawareEnsemblePlacementPolicy policy;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return OnClusterChangeSource.getOnClusterChangesParameters();
    }

    public OnClusterChangeREPPTest(OnClusterChangeSource.OnClusterChangesParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void initializeTest() {
        if (scenario.getInitializeParameters().getStaticDNSResolver() != null && scenario.getInitializeParameters().getBookieAddressResolver() != null)
            scenario.getInitializeParameters().getStaticDNSResolver().setBookieAddressResolver(scenario.getInitializeParameters().getBookieAddressResolver());

        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(Optional.of(false));
        policy.initialize(
                scenario.getInitializeParameters().getStaticDNSResolver(),
                scenario.getInitializeParameters().getHashedWheelTimer(),
                scenario.getInitializeParameters().isReorderReadsRandom(),
                scenario.getInitializeParameters().getStabilizePeriodSeconds(),
                scenario.getInitializeParameters().getReorderThresholdPendingRequests(),
                scenario.getInitializeParameters().isWeighted(),
                scenario.getInitializeParameters().getMaxWeightMultiple(),
                scenario.getInitializeParameters().getMinNumRacksPerWriteQuorum(),
                scenario.getInitializeParameters().isEnforceMinNumRacksPerWriteQuorum(),
                scenario.getInitializeParameters().isIgnoreLocalNodeInPlacementPolicy(),
                scenario.getInitializeParameters().getStatsLogger(),
                scenario.getInitializeParameters().getBookieAddressResolver()
        );

        if (scenario.getExpectedException() == null) {
            // Parse integer id in BookieId
            Set<BookieId> startWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getStartWritableBookies());
            Set<BookieId> startReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getStartReadOnlyBookies());

            // Init the topology
            policy.onClusterChanged(startWritableBookies, startReadOnlyBookies);
        }
    }


    @Test
    public void testOnClusterChange() {
        // Parse integer id in BookieId
        Set<BookieId> startWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getStartWritableBookies());
        Set<BookieId> startReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getStartReadOnlyBookies());

        if (scenario.getExpectedException() == null) {
            // If the initialization thrown an exception the execution of onClusterChange thrown a NullPointerException
            if (scenario.getInitializeParameters().getExpectedException() == null) {
                Set<BookieId> endWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getEndWritableBookies());
                Set<BookieId> endReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getEndReadOnlyBookies());

                Set<BookieId> deadBookies = policy.onClusterChanged(endWritableBookies, endReadOnlyBookies);
                Set<BookieId> expectedDeadBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getExpectedDeadBookies());

                Assertions.assertNotNull(deadBookies);
                Assertions.assertEquals(deadBookies, expectedDeadBookies);

            } else {
                Assertions.assertThrows(NullPointerException.class, () -> {
                    policy.onClusterChanged(startWritableBookies, startReadOnlyBookies);
                });
            }
        } else {
            Assertions.assertThrows(NullPointerException.class, () -> {
                policy.onClusterChanged(startWritableBookies, startReadOnlyBookies);
            });
        }
    }

}
