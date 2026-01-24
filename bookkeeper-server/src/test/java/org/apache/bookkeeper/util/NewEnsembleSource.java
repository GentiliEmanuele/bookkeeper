package org.apache.bookkeeper.util;

import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.client.BKException;

import java.util.*;

public class NewEnsembleSource {
    @Builder
    @Getter
    public static class NewEnsembleParameters {
        // Configuration params
        InitializeSource.InitializeParameters initializeParams;
        List<Integer> writableBookies;
        List<Integer> readOnlyBookies;

        int ensembleSize;
        int writeQuorumSize;
        int ackQuorumSize;
        Map<String, byte[]> customMetadata;
        List<Integer> excludeBookie;
        Class<? extends Throwable> expectedException;
    }

    public static Collection<Object[]> getNewEnsembleParameters() {
        return Arrays.asList(new Object[][]{
                {
                    NewEnsembleParameters.builder()
                            .initializeParams(
                                    InitializeSource.InitializeParameters.builder().
                                            staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                            hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                            stabilizePeriodSeconds(0).
                                            minNumRacksPerWriteQuorum(1).
                                            enforceMinNumRacksPerWriteQuorum(false).
                                            statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                            bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                            expectedException(null).
                                            numRacks(1).
                                            build()
                            )
                            .writableBookies(Collections.singletonList(1))
                            .readOnlyBookies(Collections.emptyList())
                            .ensembleSize(1)
                            .writeQuorumSize(1)
                            .ackQuorumSize(1)
                            .customMetadata(Collections.emptyMap())
                            .excludeBookie(Collections.emptyList())
                            .expectedException(null)
                            .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(BKException.BKNotEnoughBookiesException.class)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(BKException.BKNotEnoughBookiesException.class)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(BKException.BKNotEnoughBookiesException.class)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Collections.singletonList(1))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(BKException.BKNotEnoughBookiesException.class)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(2)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(1, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(1).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(2)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(BKException.BKNotEnoughBookiesException.class)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(false).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(1)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(1).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(2)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(1)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                },
                {
                        NewEnsembleParameters.builder()
                                .initializeParams(
                                        InitializeSource.InitializeParameters.builder().
                                                staticDNSResolver(RackAwarePPTestUtils.mockDNSToSwitchMapping(2, Arrays.asList(1, 2, 3))).
                                                hashedWheelTimer(RackAwarePPTestUtils.mockTimer()).
                                                stabilizePeriodSeconds(0).
                                                minNumRacksPerWriteQuorum(2).
                                                enforceMinNumRacksPerWriteQuorum(true).
                                                statsLogger(RackAwarePPTestUtils.mockStatsLogger()).
                                                bookieAddressResolver(RackAwarePPTestUtils.wrapperCreationBookieAddressResolver(Arrays.asList(1, 2, 3))).
                                                expectedException(null).
                                                numRacks(2).
                                                build()
                                )
                                .writableBookies(Arrays.asList(1, 2))
                                .readOnlyBookies(Collections.emptyList())
                                .ensembleSize(2)
                                .writeQuorumSize(2)
                                .ackQuorumSize(1)
                                .customMetadata(Collections.emptyMap())
                                .excludeBookie(Collections.emptyList())
                                .expectedException(null)
                                .build()
                }

        });
    }

}
