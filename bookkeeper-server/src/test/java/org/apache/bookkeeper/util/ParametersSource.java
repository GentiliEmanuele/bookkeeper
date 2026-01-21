package org.apache.bookkeeper.util;

import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.TimerTask;
import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.feature.FeatureProvider;
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
        StaticDNSResolver staticDNSResolver;
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
    public static class PlacementPolicyTestScenario {
        InitializeParameters initParams;
        Optional<Boolean> optEnforceDurability;
        Optional<FeatureProvider> optionalFeatureProvider;
        List<Integer> bookiesCanBeSolved;
        List<Integer> writableBookies;
        List<Integer> readOnlyBookies;
        int numberOfRack;
        int ensembleSize;
        int writeQuorumSize;
        int ackQuorumSize;
        List<Integer> excludeBookie;
        Class<? extends Throwable> expectedNotEnoughBookies;
    }


    public static Collection<Object[]> getParametersConfiguration() {
        // Mock for the timer
        HashedWheelTimer mockTimer = mock(HashedWheelTimer.class);
        when(mockTimer.newTimeout(any(TimerTask.class), anyLong(), any(TimeUnit.class)))
                .thenReturn(mock(Timeout.class));
        // Mock for the statsLogger
        // Mock for the stats
        StatsLogger mockStatsLogger = mock(StatsLogger.class);
        Counter mockCounter = mock(Counter.class);
        when(mockStatsLogger.getCounter(anyString())).thenReturn(mockCounter);
        OpStatsLogger opStatsLogger = mock(OpStatsLogger.class);
        when(mockStatsLogger.getOpStatsLogger(anyString())).thenReturn(opStatsLogger);

        return Arrays.asList(new Object[][] {
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(-1).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(-1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(-1).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(-1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(null).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(NullPointerException.class).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(null).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(null).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(NullPointerException.class).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
                {
                        PlacementPolicyTestScenario.builder().
                                initParams(
                                        InitializeParameters.builder().
                                                staticDNSResolver(new StaticDNSResolver()).
                                                hashedWheelTimer(mockTimer).
                                                stabilizePeriodSeconds(1).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(mockStatsLogger).
                                                bookieAddressResolver(null).
                                                expectedException(IllegalStateException.class).
                                                build()
                                ).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedNotEnoughBookies(null).
                                build()
                },
        });
    }
}
