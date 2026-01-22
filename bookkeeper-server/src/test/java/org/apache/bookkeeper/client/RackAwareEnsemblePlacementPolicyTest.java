package org.apache.bookkeeper.client;

import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.util.ParametersSource;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;


@RunWith(value=Parameterized.class)
public class RackAwareEnsemblePlacementPolicyTest {

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
        if (scenario.getInitParams().getStaticDNSResolver() != null && scenario.getInitParams().getBookieAddressResolver() != null)
            scenario.getInitParams().getStaticDNSResolver().setBookieAddressResolver(scenario.getInitParams().getBookieAddressResolver());

        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(Optional.of(false));
        if (scenario.getInitParams().getExpectedException() == null) {
            initializeResult = policy.initialize(
                    scenario.getInitParams().getStaticDNSResolver(),
                    scenario.getInitParams().getHashedWheelTimer(),
                    scenario.getInitParams().isReorderReadsRandom(),
                    scenario.getInitParams().getStabilizePeriodSeconds(),
                    scenario.getInitParams().getReorderThresholdPendingRequests(),
                    scenario.getInitParams().isWeighted(),
                    scenario.getInitParams().getMaxWeightMultiple(),
                    scenario.getInitParams().getMinNumRacksPerWriteQuorum(),
                    scenario.getInitParams().isEnforceMinNumRacksPerWriteQuorum(),
                    scenario.getInitParams().isIgnoreLocalNodeInPlacementPolicy(),
                    scenario.getInitParams().getStatsLogger(),
                    scenario.getInitParams().getBookieAddressResolver()
            );

            if (scenario.getOnClusterChangesParams().getExpectedException() == null) {
                // Parse integer id in BookieId
                Set<BookieId> startWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getStartWritableBookies());
                Set<BookieId> startReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getStartReadOnlyBookies());

                // Init the topology
                policy.onClusterChanged(startWritableBookies, startReadOnlyBookies);
            }
        }
    }

    @Test
    public void testInitWithNullDNSResolver() {
        if (scenario.getInitParams().getExpectedException() == null) {
            Assertions.assertTrue(true);
        } else {
            Assertions.assertThrows(scenario.getInitParams().getExpectedException(), () -> {
                policy.initialize(
                        scenario.getInitParams().getStaticDNSResolver(),
                        scenario.getInitParams().getHashedWheelTimer(),
                        scenario.getInitParams().isReorderReadsRandom(),
                        scenario.getInitParams().getStabilizePeriodSeconds(),
                        scenario.getInitParams().getReorderThresholdPendingRequests(),
                        scenario.getInitParams().isWeighted(),
                        scenario.getInitParams().getMaxWeightMultiple(),
                        scenario.getInitParams().getMinNumRacksPerWriteQuorum(),
                        scenario.getInitParams().isEnforceMinNumRacksPerWriteQuorum(),
                        scenario.getInitParams().isIgnoreLocalNodeInPlacementPolicy(),
                        scenario.getInitParams().getStatsLogger(),
                        scenario.getInitParams().getBookieAddressResolver()
                );
            });
        }
    }

    @Test
    public void testInitializeResult() {
        if (scenario.getInitParams().getExpectedException() == null) {
            // Check that initialize return a not null result
            Assertions.assertNotNull(initializeResult);
            // Check that initialize return exactly the created policy
            Assertions.assertEquals(policy, initializeResult);
        } else {
            // If one of the parameters is null initialization return a null value
            Assertions.assertNull(initializeResult);
        }
    }

    @Test
    public void testSlaveValue() {
        // If one of the parameters is null the slave is not created
        if (scenario.getInitParams().getExpectedException() != null) {
            Assertions.assertNull(policy.slave);
        } else {
            // Use scenario (and not policy) because the parameter getStabilizeSeconds is set only for the slave if not null
            if (scenario.getInitParams().getStabilizePeriodSeconds() > 0) {
                Assertions.assertNotNull(policy.slave);
            } else {
                Assertions.assertNull(policy.slave);
            }
        }
    }

    @Test
    public void testOnClusterChange() {
        // Parse integer id in BookieId
        Set<BookieId> startWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getStartWritableBookies());
        Set<BookieId> startReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getStartReadOnlyBookies());

        if (scenario.getOnClusterChangesParams().getExpectedException() == null) {
            // If the initialization thrown an exception the execution of onClusterChange thrown a NullPointerException
            if (scenario.getInitParams().getExpectedException() == null) {
                Set<BookieId> endWritableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getEndWritableBookies());
                Set<BookieId> endReadOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getEndReadOnlyBookies());

                Set<BookieId> deadBookies = policy.onClusterChanged(endWritableBookies, endReadOnlyBookies);
                Set<BookieId> expectedDeadBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParams().getExpectedDeadBookies());

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
