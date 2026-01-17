package org.apache.bookkeeper.util;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.apache.bookkeeper.client.BKException;
import org.apache.bookkeeper.feature.FeatureProvider;

import java.util.*;

public class ParametersSource {
    @ToString
    @Builder
    @Getter
    public static class PlacementPolicyTestScenario {
        boolean reorderReadsRandom;
        int stabilizePeriodSeconds;
        int reorderThresholdPendingRequests;
        boolean isWeighted;
        int maxWeightMultiple;
        boolean ignoreLocalNodeInPlacementPolicy;
        Optional<Boolean> optEnforceDurability;
        Optional<FeatureProvider> optionalFeatureProvider;
        EnsemblePlacementPolicyType EPPType;
        List<Integer> bookiesCanBeSolved;
        List<Integer> writableBookies;
        List<Integer> readOnlyBookies;
        int numberOfRack;
        boolean enforceMinNumRacksPerWriteQuorum;
        int ensembleSize;
        int writeQuorumSize;
        int ackQuorumSize;
        List<Integer> excludeBookie;
        Class<? extends Throwable> expectedException;
    }
    public static Collection<Object[]> getParametersConfiguration() {
        return Arrays.asList(new Object[][] {
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(-1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optionalFeatureProvider(Optional.empty()).
                                optEnforceDurability(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(1).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(1).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                            reorderReadsRandom(false).
                            stabilizePeriodSeconds(1).
                            reorderThresholdPendingRequests(1).
                            isWeighted(false).
                            maxWeightMultiple(0).
                            ignoreLocalNodeInPlacementPolicy(false).
                            optEnforceDurability(Optional.empty()).
                            optionalFeatureProvider(Optional.empty()).
                            EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                            bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                            writableBookies(Arrays.asList(1, 2)).
                            readOnlyBookies(Collections.emptyList()).
                            numberOfRack(1).
                            enforceMinNumRacksPerWriteQuorum(false).
                            ensembleSize(3).
                            writeQuorumSize(3).
                            ackQuorumSize(3).
                            excludeBookie(Collections.emptyList()).
                            expectedException(BKException.BKNotEnoughBookiesException.class).
                            build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2)).
                                readOnlyBookies(Arrays.asList(2, 3)).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2)).
                                readOnlyBookies(Arrays.asList(2, 3)).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2)).
                                readOnlyBookies(Collections.singletonList(3)).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.singletonList(3)).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.singletonList(3)).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(false).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.singletonList(3)).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                },

                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.of(true)).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.of(false)).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optEnforceDurability(Optional.of(false)).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2, 3)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.emptyList()).
                                expectedException(null).
                                build()
                },
                {
                        ParametersSource.PlacementPolicyTestScenario.builder().
                                reorderReadsRandom(false).
                                stabilizePeriodSeconds(1).
                                reorderThresholdPendingRequests(1).
                                isWeighted(false).
                                maxWeightMultiple(0).
                                ignoreLocalNodeInPlacementPolicy(false).
                                optEnforceDurability(Optional.empty()).
                                optionalFeatureProvider(Optional.empty()).
                                EPPType(EnsemblePlacementPolicyType.RACK_AWARE_ENSEMBLE_PLACEMENT_POLICY).
                                bookiesCanBeSolved(Arrays.asList(1, 2)).
                                writableBookies(Arrays.asList(1, 2, 3)).
                                readOnlyBookies(Collections.emptyList()).
                                numberOfRack(2).
                                enforceMinNumRacksPerWriteQuorum(true).
                                ensembleSize(3).
                                writeQuorumSize(3).
                                ackQuorumSize(3).
                                excludeBookie(Collections.singletonList(3)).
                                expectedException(BKException.BKNotEnoughBookiesException.class).
                                build()
                }
        });
    }
}
