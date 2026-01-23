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

    @Parameters
    public static Collection<Object[]> data() {
        return NewEnsembleSource.getNewEnsembleParameters();
    }

    public NewEnsembleREPPTest(NewEnsembleSource.NewEnsembleParameters scenario) {
        this.scenario = scenario;
    }

    @Before
    public void initializeTest() {
        if (scenario.getOnClusterChangesParameters().getInitializeParameters().getStaticDNSResolver() != null &&
                scenario.getOnClusterChangesParameters().getInitializeParameters().getBookieAddressResolver() != null)
        {
            scenario.getOnClusterChangesParameters().getInitializeParameters()
                    .getStaticDNSResolver().setBookieAddressResolver(
                            scenario.getOnClusterChangesParameters().getInitializeParameters().getBookieAddressResolver());
        }

        // Create ad initialize the policy with current params
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(Optional.of(false));
        policy.initialize(
                scenario.getOnClusterChangesParameters().getInitializeParameters().getStaticDNSResolver(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getHashedWheelTimer(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().isReorderReadsRandom(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getStabilizePeriodSeconds(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getReorderThresholdPendingRequests(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().isWeighted(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getMaxWeightMultiple(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getMinNumRacksPerWriteQuorum(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().isEnforceMinNumRacksPerWriteQuorum(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().isIgnoreLocalNodeInPlacementPolicy(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getStatsLogger(),
                scenario.getOnClusterChangesParameters().getInitializeParameters().getBookieAddressResolver()
        );

        Set<BookieId> startWritableBookies = scenario.getOnClusterChangesParameters().getStartWritableBookies() != null ?
                RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParameters().getStartWritableBookies()) :
                new HashSet<>();
        Set<BookieId> startReadOnlyBookies = scenario.getOnClusterChangesParameters().getStartReadOnlyBookies() != null ?
                RackAwarePPTestUtils.toBookieIdSet(scenario.getOnClusterChangesParameters().getStartReadOnlyBookies()) :
                new HashSet<>();

        policy.onClusterChanged(startWritableBookies, startReadOnlyBookies);
    }

    @Test
    public void testNewEnsemble() {
        if (scenario.getExcludeBookie() == null) {
            Assertions.assertThrows(NullPointerException.class, () -> {
                policy.newEnsemble(scenario.getEnsembleSize(),
                        scenario.getWriteQuorumSize(),
                        scenario.getAckQuorumSize(),
                        scenario.getCustomMetadata(),
                        scenario.getExcludeBookie() != null ? RackAwarePPTestUtils.toBookieIdSet(scenario.getExcludeBookie()) : null
                );
            });
        }
        try {
            policy.newEnsemble(scenario.getEnsembleSize(),
                    scenario.getWriteQuorumSize(),
                    scenario.getAckQuorumSize(),
                    scenario.getCustomMetadata(),
                    RackAwarePPTestUtils.toBookieIdSet(scenario.getExcludeBookie())
            );
        } catch (BKException.BKNotEnoughBookiesException e ) {
            boolean c0 = scenario.getOnClusterChangesParameters().getStartWritableBookies() == null || scenario.getOnClusterChangesParameters().getStartReadOnlyBookies() == null;

            boolean c1 = false;
            boolean c2 = false;
            boolean c3 = false;

            if (!c0) {
                Set<Integer> allBookies = new HashSet<>(scenario.getOnClusterChangesParameters().getStartWritableBookies());
                Set<Integer> excluded = new HashSet<>(scenario.getExcludeBookie());
                int numRacksConfig = scenario.getOnClusterChangesParameters().getInitializeParameters().getNumRacks();
                boolean enforce = policy.enforceMinNumRacksPerWriteQuorum;

                // Compute te bookies really usable
                Set<Integer> usableBookies = new HashSet<>(allBookies);
                usableBookies.removeAll(excluded);

                // Not enough bookie are available
                c1 = usableBookies.size() < scenario.getEnsembleSize();

                if (enforce) {
                    int neededRacks = Math.min(scenario.getWriteQuorumSize(), policy.minNumRacksPerWriteQuorum);
                    int totalTopologyRacks = RackAwarePPTestUtils.countRacks(allBookies, numRacksConfig);

                    // Available racks are not enough
                    if (totalTopologyRacks < 2 && neededRacks > 1) {
                        c2 = true;
                    }

                    // Usable rack are not enough
                    int usableRacksCount = RackAwarePPTestUtils.countRacks(usableBookies, numRacksConfig);
                    if (usableRacksCount < neededRacks) {
                        c3 = true;
                    }
                }
            }
            Assertions.assertTrue(c0 || c1 | c2 | c3);
        } catch (NullPointerException e) {
            Assertions.assertTrue(scenario.getCustomMetadata() == null || scenario.getExcludeBookie() == null);
        }
    }

}
