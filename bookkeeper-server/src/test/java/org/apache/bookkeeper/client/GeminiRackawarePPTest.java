/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.bookkeeper.client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException;
import org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble;
import org.apache.bookkeeper.net.BookieId;
import org.apache.bookkeeper.net.BookieNode;
import org.apache.bookkeeper.net.BookieSocketAddress;
import org.apache.bookkeeper.net.DNSToSwitchMapping;
import org.apache.bookkeeper.proto.BookieAddressResolver;
import org.apache.bookkeeper.stats.NullStatsLogger;
import org.apache.bookkeeper.stats.StatsLogger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.netty.util.HashedWheelTimer;

/**
 * JUnit 4 test for {@link RackawareEnsemblePlacementPolicy}.
 */
@RunWith(MockitoJUnitRunner.class)
public class GeminiRackawarePPTest {

    private RackawareEnsemblePlacementPolicy policy;

    @Mock
    private DNSToSwitchMapping dnsResolver;
    @Mock
    private HashedWheelTimer timer;
    @Mock
    private BookieAddressResolver addressResolver;

    private StatsLogger statsLogger;

    @Before
    public void setUp() {
        policy = new RackawareEnsemblePlacementPolicy();
        statsLogger = NullStatsLogger.INSTANCE;

        // Fix for NPE in replaceBookie tests:
        // The policy attempts to resolve the bookie ID to an address.
        // If the mock returns null, NetUtils throws an NPE.
        try {
            when(addressResolver.resolve(any(BookieId.class)))
                    .thenReturn(new BookieSocketAddress("127.0.0.1", 3181));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Helper method to access the private 'slave' field via reflection
    private Object getSlave(RackawareEnsemblePlacementPolicy policy) throws Exception {
        Field field = RackawareEnsemblePlacementPolicy.class.getDeclaredField("slave");
        field.setAccessible(true);
        return field.get(policy);
    }

    @Test
    public void testConstructors() {
        RackawareEnsemblePlacementPolicy p1 = new RackawareEnsemblePlacementPolicy();
        assertNotNull(p1);
        RackawareEnsemblePlacementPolicy p2 = new RackawareEnsemblePlacementPolicy(true);
        assertNotNull(p2);
    }

    @Test
    public void testInitializeWithoutSlave() throws Exception {
        // initialize with stabilizePeriodSeconds = 0, slave should be null
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        assertNull("Slave should be null when stabilizePeriodSeconds <= 0", getSlave(policy));
    }

    @Test
    public void testInitializeWithSlave() throws Exception {
        // initialize with stabilizePeriodSeconds > 0, slave should be instantiated
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        assertNotNull("Slave should not be null when stabilizePeriodSeconds > 0", getSlave(policy));
    }

    @Test
    public void testUninitialize() throws Exception {
        // Test uninitialize with slave present
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        policy.uninitalize();

        // Test uninitialize without slave
        RackawareEnsemblePlacementPolicy p2 = new RackawareEnsemblePlacementPolicy();
        p2.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        p2.uninitalize();
    }

    @Test
    public void testOnClusterChanged() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        Set<BookieId> writable = new HashSet<>();
        Set<BookieId> readOnly = new HashSet<>();

        // Add a dummy bookie to the writable set
        BookieId b1 = BookieId.parse("bookie1:3181");
        writable.add(b1);

        Set<BookieId> dead = policy.onClusterChanged(writable, readOnly);
        assertNotNull(dead);
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testNewEnsembleWithSlaveFallback() throws Exception {
        // Initialize WITH slave
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        // Execute newEnsemble with no available bookies.
        policy.newEnsemble(3, 2, 2, Collections.emptyMap(), Collections.emptySet());
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testNewEnsembleNoSlave() throws Exception {
        // Initialize WITHOUT slave
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        // Should throw immediately from super
        policy.newEnsemble(3, 2, 2, Collections.emptyMap(), Collections.emptySet());
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testReplaceBookieWithSlaveFallback() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        List<BookieId> ensemble = new ArrayList<>();
        ensemble.add(BookieId.parse("b1:3181"));

        // Use new HashSet<>() instead of Collections.emptySet() because the implementation
        // attempts to add the bookieToReplace to the exclusion list, which fails on immutable sets.
        policy.replaceBookie(3, 2, 2, Collections.emptyMap(), ensemble, BookieId.parse("b1:3181"), new HashSet<>());
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testReplaceBookieNoSlave() throws Exception {
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        List<BookieId> ensemble = new ArrayList<>();
        ensemble.add(BookieId.parse("b1:3181"));

        // Use new HashSet<>() instead of Collections.emptySet() for mutability
        policy.replaceBookie(3, 2, 2, Collections.emptyMap(), ensemble, BookieId.parse("b1:3181"), new HashSet<>());
    }

    @Test
    public void testReorderReadSequence() {
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        List<BookieId> ensemble = new ArrayList<>();
        DistributionSchedule.WriteSet writeSet = mock(DistributionSchedule.WriteSet.class);

        // delegates to super -> pass
        DistributionSchedule.WriteSet result = policy.reorderReadSequence(ensemble, null, writeSet);
        assertNotNull(result);
    }

    @Test
    public void testReorderReadLACSequence() {
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);
        List<BookieId> ensemble = new ArrayList<>();
        DistributionSchedule.WriteSet writeSet = mock(DistributionSchedule.WriteSet.class);

        // delegates to super -> pass
        DistributionSchedule.WriteSet result = policy.reorderReadLACSequence(ensemble, null, writeSet);
        assertNotNull(result);
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testNewEnsembleWithParentEnsembleWithSlave() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        policy.newEnsemble(3, 2, 2, Collections.emptySet(), null, null);
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testSelectFromNetworkLocationWithSlave() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        // Mock the Ensemble interface to prevent NullPointerException when the implementation calls .toList()
        @SuppressWarnings("unchecked")
        Ensemble<BookieNode> ensemble = mock(Ensemble.class);

        policy.selectFromNetworkLocation("/default-rack", Collections.emptySet(), null, ensemble, true);
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testSelectFromNetworkLocationExcludeRacksWithSlave() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        @SuppressWarnings("unchecked")
        Ensemble<BookieNode> ensemble = mock(Ensemble.class);

        policy.selectFromNetworkLocation(Collections.singleton("/bad-rack"), Collections.emptySet(), null, ensemble, true);
    }

    @Test(expected = BKNotEnoughBookiesException.class)
    public void testSelectFromNetworkLocationSpecificWithSlave() throws Exception {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        // Mock the Ensemble interface to prevent NullPointerException
        @SuppressWarnings("unchecked")
        Ensemble<BookieNode> ensemble = mock(Ensemble.class);

        policy.selectFromNetworkLocation("/default-rack", Collections.singleton("/bad-rack"), Collections.emptySet(), null, ensemble, true);
    }

    @Test
    public void testHandleBookiesUpdates() {
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        Set<BookieId> bookies = new HashSet<>();
        bookies.add(BookieId.parse("b1:3181"));

        // Verify these methods run without exception (delegation check)
        policy.handleBookiesThatLeft(bookies);
        policy.handleBookiesThatJoined(bookies);
    }

    @Test
    public void testReplaceToAdherePlacementPolicy() throws Exception {
        // Initialize with slave
        policy.initialize(dnsResolver, timer, true, 10, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        List<BookieId> ensemble = new ArrayList<>();
        ensemble.add(BookieId.parse("b1:3181"));

        EnsemblePlacementPolicy.PlacementResult<List<BookieId>> result = policy.replaceToAdherePlacementPolicy(3, 2, 2, Collections.emptySet(), ensemble);
        assertNotNull(result);
    }

    @Test
    public void testReplaceToAdherePlacementPolicyNoSlave() throws Exception {
        // Initialize without slave
        policy.initialize(dnsResolver, timer, true, 0, 0, false, 0, 0, false, false, statsLogger, addressResolver);

        List<BookieId> ensemble = new ArrayList<>();
        ensemble.add(BookieId.parse("b1:3181"));

        EnsemblePlacementPolicy.PlacementResult<List<BookieId>> result = policy.replaceToAdherePlacementPolicy(3, 2, 2, Collections.emptySet(), ensemble);
        assertNotNull(result);
    }
}