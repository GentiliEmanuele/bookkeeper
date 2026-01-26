package org.apache.bookkeeper.client;

import org.apache.bookkeeper.util.InitializeSource;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;


@RunWith(value=Parameterized.class)
public class InitializeREPPTest {

    private final InitializeSource.InitializeParameters scenario;

    private RackawareEnsemblePlacementPolicy policy;
    private RackawareEnsemblePlacementPolicy initializeResult;

    @Parameters
    public static Collection<Object[]> data() {
        return InitializeSource.getParametersConfiguration();
    }

    public InitializeREPPTest(InitializeSource.InitializeParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void initializeTest() {
        if (scenario.getStaticDNSResolver() != null && scenario.getBookieAddressResolver() != null)
            scenario.getStaticDNSResolver().setBookieAddressResolver(scenario.getBookieAddressResolver());

        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(scenario.getConstructorParameters());
        if (scenario.getExpectedException() == null) {
            initializeResult = policy.initialize(
                    scenario.getStaticDNSResolver(),
                    scenario.getHashedWheelTimer(),
                    scenario.isReorderReadsRandom(),
                    scenario.getStabilizePeriodSeconds(),
                    scenario.getReorderThresholdPendingRequests(),
                    scenario.isWeighted(),
                    scenario.getMaxWeightMultiple(),
                    scenario.getMinNumRacksPerWriteQuorum(),
                    scenario.isEnforceMinNumRacksPerWriteQuorum(),
                    scenario.isIgnoreLocalNodeInPlacementPolicy(),
                    scenario.getStatsLogger(),
                    scenario.getBookieAddressResolver()
            );
        }
    }

    @Test
    public void testInitWithNullDNSResolver() {
        if (scenario.getExpectedException() == null) {
            Assertions.assertTrue(true);
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> {
                policy.initialize(
                        scenario.getStaticDNSResolver(),
                        scenario.getHashedWheelTimer(),
                        scenario.isReorderReadsRandom(),
                        scenario.getStabilizePeriodSeconds(),
                        scenario.getReorderThresholdPendingRequests(),
                        scenario.isWeighted(),
                        scenario.getMaxWeightMultiple(),
                        scenario.getMinNumRacksPerWriteQuorum(),
                        scenario.isEnforceMinNumRacksPerWriteQuorum(),
                        scenario.isIgnoreLocalNodeInPlacementPolicy(),
                        scenario.getStatsLogger(),
                        scenario.getBookieAddressResolver()
                );
            });
        }
    }

    @Test
    public void testInitializeResult() {
        if (scenario.getExpectedException() == null) {
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
        if (scenario.getExpectedException() != null) {
            Assertions.assertNull(policy.slave);
        } else {
            // Use scenario (and not policy) because the parameter getStabilizeSeconds is set only for the slave if not null
            if (scenario.getStabilizePeriodSeconds() > 0) {
                Assertions.assertNotNull(policy.slave);
            } else {
                Assertions.assertNull(policy.slave);
            }
        }
    }

}
