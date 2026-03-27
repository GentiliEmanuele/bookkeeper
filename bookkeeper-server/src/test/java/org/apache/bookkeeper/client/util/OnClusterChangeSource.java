package org.apache.bookkeeper.client.util;

import lombok.Builder;
import lombok.Getter;

import java.util.*;

public class OnClusterChangeSource {
    @Builder
    @Getter
    public static class OnClusterChangesParameters {
        InitializeSource.InitializeParameters initializeParameters;
        List<Integer> startWritableBookies;
        List<Integer> startReadOnlyBookies;
        List<Integer> endWritableBookies;
        List<Integer> endReadOnlyBookies;
        List<Integer> expectedDeadBookies;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getOnClusterChangesParameters() {
        return Arrays.asList(new Object[][] {
                {
                        OnClusterChangesParameters.builder()
                                .initializeParameters(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .startWritableBookies(Collections.singletonList(1))
                                .startReadOnlyBookies(Collections.emptyList())
                                .endWritableBookies(Collections.emptyList())
                                .endReadOnlyBookies(Collections.emptyList())
                                .expectedDeadBookies(Collections.singletonList(1))
                                .expectedException(null)
                                .build(),
                },
                {
                        OnClusterChangesParameters.builder()
                                .initializeParameters(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .startWritableBookies(Arrays.asList(1, 2))
                                .startReadOnlyBookies(Collections.singletonList(3))
                                .endWritableBookies(Collections.singletonList(1))
                                .endReadOnlyBookies(Collections.singletonList(3))
                                .expectedDeadBookies(Collections.singletonList(2))
                                .build()
                }
        });
    }
}