package org.apache.bookkeeper.client;

import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.util.NewEnsembleSource;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;


@RunWith(Parameterized.class)
public class NewEnsembleREPPTest {

    private final NewEnsembleSource.NewEnsembleParameters scenario;

    private RackawareEnsemblePlacementPolicy policy;
    private Set<BookieId> writableBookies;
    private Set<BookieId> readOnlyBookies;

    @Parameters
    public static Collection<Object[]> data() {
        return NewEnsembleSource.getNewEnsembleParameters();
    }

    public NewEnsembleREPPTest(NewEnsembleSource.NewEnsembleParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void initializeTest() {

        scenario.getInitializeParams().getStaticDNSResolver().setBookieAddressResolver(scenario.getInitializeParams().getBookieAddressResolver());


        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(scenario.getInitializeParams().getConstructorParameters());
        policy.initialize(
                scenario.getInitializeParams().getStaticDNSResolver(),
                scenario.getInitializeParams().getHashedWheelTimer(),
                scenario.getInitializeParams().isReorderReadsRandom(),
                scenario.getInitializeParams().getStabilizePeriodSeconds(),
                scenario.getInitializeParams().getReorderThresholdPendingRequests(),
                scenario.getInitializeParams().isWeighted(),
                scenario.getInitializeParams().getMaxWeightMultiple(),
                scenario.getInitializeParams().getMinNumRacksPerWriteQuorum(),
                scenario.getInitializeParams().isEnforceMinNumRacksPerWriteQuorum(),
                scenario.getInitializeParams().isIgnoreLocalNodeInPlacementPolicy(),
                scenario.getInitializeParams().getStatsLogger(),
                scenario.getInitializeParams().getBookieAddressResolver()
        );

        writableBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getWritableBookies());
        readOnlyBookies = RackAwarePPTestUtils.toBookieIdSet(scenario.getReadOnlyBookies());

        policy.onClusterChanged(writableBookies, readOnlyBookies);
    }

    @Test
    public void testNewEnsemble() throws BKException.BKNotEnoughBookiesException {
        if (scenario.getExpectedException() == null) {
            EnsemblePlacementPolicy.PlacementResult<List<BookieId>> placementResult = policy.newEnsemble(
                    scenario.getEnsembleSize(),
                    scenario.getWriteQuorumSize(),
                    scenario.getAckQuorumSize(),
                    scenario.getCustomMetadata(),
                    RackAwarePPTestUtils.toBookieIdSet(scenario.getExcludeBookie())
            );
            Assertions.assertNotNull(placementResult);
        } else {
            Assertions.assertThrows(scenario.getExpectedException(), () -> {
                policy.newEnsemble(
                        scenario.getEnsembleSize(),
                        scenario.getWriteQuorumSize(),
                        scenario.getAckQuorumSize(),
                        scenario.getCustomMetadata(),
                        RackAwarePPTestUtils.toBookieIdSet(scenario.getExcludeBookie()));
            });
        }
    }

}
