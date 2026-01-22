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

public class ParametersSource {
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
    }

    @Builder
    @Getter
    public static class OnClusterChangesParameters {
        List<Integer> startWritableBookies;
        List<Integer> startReadOnlyBookies;
        List<Integer> endWritableBookies;
        List<Integer> endReadOnlyBookies;
        List<Integer> expectedDeadBookies;
        Class<? extends Throwable> expectedException;
    }

    @Builder
    @Getter
    public static class NewEnsembleParameters {
        int ensembleSize;
        int writeQuorumSize;
        int ackQuorumSize;
        Map<String, byte[]> customMetadata;
        List<Integer> excludeBookie;
        Class<? extends Throwable> expectedNotEnoughBookies;
    }

    @Builder
    @Getter
    public static class PlacementPolicyTestScenario {
        InitializeParameters initParams;
        OnClusterChangesParameters onClusterChangesParams;
        NewEnsembleParameters newEnsembleParameters;
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

        List<Object[]> scenarios = new ArrayList<>();
        InitializeParameters [] initParametersList = {
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),

                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(null).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(NullPointerException.class).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(null).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(null).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(NullPointerException.class).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(null).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(true).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(-1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(0).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),

                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(1).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(null).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(NullPointerException.class).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(null).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(null).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(null).
                        bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                        expectedException(NullPointerException.class).
                        build(),
                InitializeParameters.builder().
                        staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                        hashedWheelTimer(mockTimer).
                        stabilizePeriodSeconds(1).
                        minNumRacksPerWriteQuorum(2).
                        enforceMinNumRacksPerWriteQuorum(false).
                        statsLogger(mockStatsLogger).
                        bookieAddressResolver(null).
                        expectedException(null).
                        build()
        };

        OnClusterChangesParameters [] onClusterChangesParametersList = {
                OnClusterChangesParameters.builder().
                        startWritableBookies(Collections.singletonList(1)).
                        startReadOnlyBookies(Collections.singletonList(1)).
                        endWritableBookies(Collections.emptyList()).
                        endReadOnlyBookies(Collections.singletonList(1)).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Collections.singletonList(1)).
                        startReadOnlyBookies(Collections.singletonList(1)).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Collections.emptyList()).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Collections.singletonList(1)).
                        startReadOnlyBookies(Collections.singletonList(1)).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Collections.singletonList(1)).
                        expectedDeadBookies(Collections.emptyList()).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Collections.singletonList(1)).
                        startReadOnlyBookies(Collections.emptyList()).
                        endWritableBookies(Collections.emptyList()).
                        endReadOnlyBookies(Collections.emptyList()).
                        expectedDeadBookies(Collections.singletonList(1)).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Arrays.asList(1, 2)).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Arrays.asList(1, 2)).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Arrays.asList(1, 2)).
                        endWritableBookies(Arrays.asList(1, 2)).
                        endReadOnlyBookies(Collections.singletonList(2)).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Collections.singletonList(3)).
                        endWritableBookies(Arrays.asList(1, 2)).
                        endReadOnlyBookies(Collections.emptyList()).
                        expectedDeadBookies(Collections.emptyList()).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Collections.singletonList(3)).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Collections.singletonList(3)).
                        expectedDeadBookies(Collections.singletonList(2)).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Collections.singletonList(2)).
                        endWritableBookies(Arrays.asList(1, 2)).
                        endReadOnlyBookies(Collections.emptyList()).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Collections.singletonList(2)).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Collections.singletonList(2)).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Arrays.asList(1, 2)).
                        startReadOnlyBookies(Collections.emptyList()).
                        endWritableBookies(Collections.singletonList(1)).
                        endReadOnlyBookies(Collections.singletonList(2)).
                        expectedDeadBookies(Collections.emptyList()).
                        expectedException(null).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(null).
                        startReadOnlyBookies(Collections.singletonList(2)).
                        endWritableBookies(null).
                        endReadOnlyBookies(Collections.singletonList(2)).
                        expectedException(NullPointerException.class).
                        build(),
                OnClusterChangesParameters.builder().
                        startWritableBookies(Collections.singletonList(2)).
                        startReadOnlyBookies(null).
                        endWritableBookies(Collections.singletonList(2)).
                        endReadOnlyBookies(null).
                        expectedException(NullPointerException.class).
                        build(),
        };

        NewEnsembleParameters [] newEnsembleParametersList = {
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.emptyList())
                        .build()
        };

        for (InitializeParameters initializeParameters : initParametersList) {
            for (OnClusterChangesParameters onClusterChangesParameters : onClusterChangesParametersList) {
                for (NewEnsembleParameters newEnsembleParameters : newEnsembleParametersList) {
                    if (initializeParameters.stabilizePeriodSeconds > 0) continue;
                    PlacementPolicyTestScenario placementPolicyTestScenario = PlacementPolicyTestScenario.builder()
                            .initParams(initializeParameters)
                            .onClusterChangesParams(onClusterChangesParameters)
                            .newEnsembleParameters(newEnsembleParameters)
                            .build();
                    scenarios.add(new Object[]{placementPolicyTestScenario});
                }
            }
        }
        return scenarios;
    }
}
