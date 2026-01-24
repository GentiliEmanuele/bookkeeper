package org.apache.bookkeeper.util;

import io.netty.util.HashedWheelTimer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.bookkeeper.net.DNSToSwitchMapping;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.StatsLogger;

import java.util.*;

public class InitializeSource {
    @Builder
    @Getter
    public static class InitializeParameters {
        // Populate default value
        @Builder.Default
        boolean reorderReadsRandom = false;
        @Builder.Default
        int reorderThresholdPendingRequests = 0;
        @Builder.Default
        boolean isWeighted = false;
        @Builder.Default
        int maxWeightMultiple = 0;
        @Builder.Default
        boolean ignoreLocalNodeInPlacementPolicy = false;

        // Variable parameters
        DNSToSwitchMapping staticDNSResolver;
        HashedWheelTimer hashedWheelTimer;
        int stabilizePeriodSeconds;
        int minNumRacksPerWriteQuorum;
        boolean enforceMinNumRacksPerWriteQuorum;
        StatsLogger statsLogger;
        BookieAddressResolver bookieAddressResolver;
        Class<? extends Throwable> expectedException;

        int numRacks;
        @Setter
        Boolean constructorParameters;
    }

    public static Collection<Object[]> getParametersConfiguration() {
        List<Boolean> booleans = Arrays.asList(true, false, null);
        List<InitializeParameters> scenarios = getInitializeScenarios();
        Collection<Object[]> parameters = new ArrayList<>();
        for (Boolean bool : booleans) {
            for (InitializeParameters scenario : scenarios) {
                scenario.setConstructorParameters(bool);
                parameters.add(new Object[]{scenario});
            }
        }
        return parameters;
    }

    private static List<InitializeParameters> getInitializeScenarios() {

        return Arrays.asList(
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(null).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(NullPointerException.class).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(null).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(null).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(NullPointerException.class).
                                numRacks(2).
                                build(),
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                bookieAddressResolver(null).
                                expectedException(null).
                                numRacks(2).
                                build());
    }
}
