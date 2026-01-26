package org.apache.bookkeeper.client;


import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.util.RackAwarePPTestUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewEnsembleFromSlaveTest {

    private RackawareEnsemblePlacementPolicy policy;

    @Before
    public void initialize() {
        policy = RackAwarePPTestUtils.rackAwareEnsemblePlacementPolicyCreation(null);
        policy.initialize(
                RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3)),
                RackAwarePPTestUtils.mockTimer(),
                false,
                1, // => slave != null
                0,
                false,
                0,
                2,
                true,
                false,
                RackAwarePPTestUtils.mockStatsLogger(),
                RackAwarePPTestUtils.resolveSpecifiedAddress(RackAwarePPTestUtils.toBookieIdSet(Arrays.asList(1, 2, 3)))
        );

        // Writable bookies for policy is only 1
        policy.onClusterChanged(RackAwarePPTestUtils.toBookieIdSet(Collections.singletonList(1)), RackAwarePPTestUtils.toBookieIdSet(Collections.emptyList()));

        // Writable bookies for slave is 1, 2
        policy.slave.onClusterChanged(RackAwarePPTestUtils.toBookieIdSet(Arrays.asList(1, 2)), RackAwarePPTestUtils.toBookieIdSet(Collections.emptyList()));
    }

    @Test
    public void newEnsembleFromSlaveTest() {
        Assertions.assertDoesNotThrow(() -> {
            EnsemblePlacementPolicy.PlacementResult<List<BookieId>> result = policy.newEnsemble(2, 1, 1, Collections.emptyMap(), Collections.emptySet());
            Assertions.assertNotNull(result);
        });
    }
}
