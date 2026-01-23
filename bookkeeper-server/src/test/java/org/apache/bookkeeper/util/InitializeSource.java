package org.apache.bookkeeper.util;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.net.DNSToSwitchMapping;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.Counter;
import org.apache.bookkeeper.stats.OpStatsLogger;
import org.apache.bookkeeper.stats.StatsLogger;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
    }

    public static Collection<Object[]> getParametersConfiguration() {
        // Mock for the timer
        HashedWheelTimer mockTimer = mock(HashedWheelTimer.class);
        when(mockTimer.newTimeout(any(TimerTask.class), anyLong(), any(TimeUnit.class)))
                .thenReturn(mock(Timeout.class));
        // Mock for the statsLogger
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        Counter mockCounter = mock(Counter.class);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(mockCounter);
        OpStatsLogger opStatsLogger = mock(OpStatsLogger.class);
        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(opStatsLogger);

        return Arrays.asList(new Object[][] {
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(1).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(-1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(0).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build(),
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(null).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(NullPointerException.class).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(null).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(null).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(null).
                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                expectedException(NullPointerException.class).
                                numRacks(2).
                                build()
                },
                {
                        InitializeParameters.builder().
                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                hashedWheelTimer(mockTimer).
                                stabilizePeriodSeconds(1).
                                minNumRacksPerWriteQuorum(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                statsLogger(mockStatsLogger).
                                bookieAddressResolver(null).
                                expectedException(null).
                                numRacks(2).
                                build()
                }
        });
    }
}
