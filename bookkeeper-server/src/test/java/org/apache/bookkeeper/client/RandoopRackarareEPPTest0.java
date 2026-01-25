package org.apache.bookkeeper.client;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRackarareEPPTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test01");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping5 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer6 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger15 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = rackawareEnsemblePlacementPolicy0.initialize(dNSToSwitchMapping5, hashedWheelTimer6, true, (-1), 1, false, (int) '4', 1, false, false, statsLogger15, bookieAddressResolver16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test02");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray5 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList6 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList6, bookieIdArray5);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo8 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet10 = rackawareEnsemblePlacementPolicy0.reorderReadLACSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList6, bookiesHealthInfo8, writeSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray5);
        org.junit.Assert.assertArrayEquals(bookieIdArray5, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test03");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        java.util.Set<java.lang.String> strSet2 = null;
        org.apache.bookkeeper.net.Node[] nodeArray3 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet4 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet4, nodeArray3);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate6 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode9 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("", strSet2, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet4, bookieNodePredicate6, bookieNodeEnsemble7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertArrayEquals(nodeArray3, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test04");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList11 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId bookieId13 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy14 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray15 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet16 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet16, bookieIdArray15);
        rackawareEnsemblePlacementPolicy14.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<org.apache.bookkeeper.net.BookieId> bookieIdPlacementResult19 = rackawareEnsemblePlacementPolicy0.replaceBookie(0, (int) (short) 10, (int) (byte) 10, strMap9, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList11, bookieId13, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray15);
        org.junit.Assert.assertArrayEquals(bookieIdArray15, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test05");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.Node[] nodeArray2 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet3, nodeArray2);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate5 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode8 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("", (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet3, bookieNodePredicate5, bookieNodeEnsemble6, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertArrayEquals(nodeArray2, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test06");
        java.lang.String str0 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl.REPP_RANDOM_READ_REORDERING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ensembleRandomReadReordering" + "'", str0, "ensembleRandomReadReordering");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test07");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "/default-rack" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.apache.bookkeeper.net.Node[] nodeArray21 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet22 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet22, nodeArray21);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate24 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode27 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation((java.util.Set<java.lang.String>) strSet19, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet22, bookieNodePredicate24, bookieNodeEnsemble25, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "/default-rack" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test08");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration38 = null;
        java.util.Optional<org.apache.bookkeeper.net.DNSToSwitchMapping> dNSToSwitchMappingOptional39 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer40 = null;
        org.apache.bookkeeper.feature.FeatureProvider featureProvider41 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger42 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl44 = rackawareEnsemblePlacementPolicy0.initialize(clientConfiguration38, dNSToSwitchMappingOptional39, hashedWheelTimer40, featureProvider41, statsLogger42, bookieAddressResolver43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test09");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        java.lang.Class<?> wildcardClass6 = rackawareEnsemblePlacementPolicy0.getClass();
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test10");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        java.util.Map<java.lang.String, byte[]> strMap9 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy10 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray11 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet12 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet12, bookieIdArray11);
        rackawareEnsemblePlacementPolicy10.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet12);
        java.lang.String str15 = rackawareEnsemblePlacementPolicy10.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray19 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet20 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, bookieIdArray19);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList23 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList23, bookieIdArray22);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult25 = rackawareEnsemblePlacementPolicy10.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) (byte) -1, (int) (short) -1, 10, strMap9, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray11);
        org.junit.Assert.assertArrayEquals(bookieIdArray11, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/default-rack" + "'", str15, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray19);
        org.junit.Assert.assertArrayEquals(bookieIdArray19, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertArrayEquals(bookieIdArray22, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult25);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test11");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        rackawareEnsemblePlacementPolicy1.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl38 = rackawareEnsemblePlacementPolicy1.withDefaultRack("/default-rack");
        rackawareEnsemblePlacementPolicy0.slave = rackawareEnsemblePlacementPolicyImpl38;
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping40 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer41 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger51 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy53 = rackawareEnsemblePlacementPolicy0.initialize(dNSToSwitchMapping40, hashedWheelTimer41, true, 0, (int) (short) -1, true, 2147483647, (int) (byte) 0, false, true, true, statsLogger51, bookieAddressResolver52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl38);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test12");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        rackawareEnsemblePlacementPolicy1.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl38 = rackawareEnsemblePlacementPolicy1.withDefaultRack("/default-rack");
        rackawareEnsemblePlacementPolicy0.slave = rackawareEnsemblePlacementPolicyImpl38;
        java.util.Map map40 = null;
        rackawareEnsemblePlacementPolicyImpl38.updateBookieInfo(map40);
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl38);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test13");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        java.lang.Class<?> wildcardClass1 = rackawareEnsemblePlacementPolicy0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test14");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy15 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        rackawareEnsemblePlacementPolicy15.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
        java.lang.String str20 = rackawareEnsemblePlacementPolicy15.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy24 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        rackawareEnsemblePlacementPolicy24.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26);
        java.lang.String str29 = rackawareEnsemblePlacementPolicy24.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray33 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet34 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, bookieIdArray33);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray36 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList37 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList37, bookieIdArray36);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult39 = rackawareEnsemblePlacementPolicy24.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy43 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray44 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet45 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet45, bookieIdArray44);
        rackawareEnsemblePlacementPolicy43.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet45);
        java.lang.String str48 = rackawareEnsemblePlacementPolicy43.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray52 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet53 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet53, bookieIdArray52);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray55 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList56 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList56, bookieIdArray55);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult58 = rackawareEnsemblePlacementPolicy43.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet53, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList56);
        int int59 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList56);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult60 = rackawareEnsemblePlacementPolicy15.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult61 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) (byte) 10, (int) (short) 0, 0, strMap14, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/default-rack" + "'", str20, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/default-rack" + "'", str29, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray33);
        org.junit.Assert.assertArrayEquals(bookieIdArray33, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookieIdArray36);
        org.junit.Assert.assertArrayEquals(bookieIdArray36, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult39);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdArray44);
        org.junit.Assert.assertArrayEquals(bookieIdArray44, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "/default-rack" + "'", str48, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray52);
        org.junit.Assert.assertArrayEquals(bookieIdArray52, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(bookieIdArray55);
        org.junit.Assert.assertArrayEquals(bookieIdArray55, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult60);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test15");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        boolean boolean19 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (int) '4', 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "ensembleRandomReadReordering" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.bookkeeper.net.Node[] nodeArray26 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet27, nodeArray26);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate29 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode32 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("hi!", (java.util.Set<java.lang.String>) strSet24, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet27, bookieNodePredicate29, bookieNodeEnsemble30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Network Location path does not start with /: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "ensembleRandomReadReordering" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test16");
        java.lang.String str0 = org.apache.bookkeeper.client.TopologyAwareEnsemblePlacementPolicy.REPP_DNS_RESOLVER_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "reppDnsResolverClass" + "'", str0, "reppDnsResolverClass");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test17");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.Node[] nodeArray7 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet8 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet8, nodeArray7);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate10 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode13 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("hi!", (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet8, bookieNodePredicate10, bookieNodeEnsemble11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Network Location path does not start with /: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertArrayEquals(nodeArray7, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test18");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy57 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray58 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet59 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, bookieIdArray58);
        rackawareEnsemblePlacementPolicy57.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        java.lang.String str62 = rackawareEnsemblePlacementPolicy57.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet67 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, bookieIdArray66);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray69 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList70 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList70, bookieIdArray69);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult72 = rackawareEnsemblePlacementPolicy57.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList70);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence75 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList70, (int) 'a', 0);
        java.lang.Class<?> wildcardClass76 = rackawareEnsemblePlacementPolicy0.getClass();
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(bookieIdArray58);
        org.junit.Assert.assertArrayEquals(bookieIdArray58, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/default-rack" + "'", str62, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdArray69);
        org.junit.Assert.assertArrayEquals(bookieIdArray69, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult72);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence75 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence75.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test19");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence22 = rackawareEnsemblePlacementPolicy1.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo23 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet25 = rackawareEnsemblePlacementPolicy0.reorderReadSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookiesHealthInfo23, writeSet24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence22 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence22.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test20");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble42 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult44 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) (byte) 100, (int) (short) -1, 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieNodeEnsemble42, bookieNodePredicate43);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test21");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        java.util.Map<java.lang.String, byte[]> strMap14 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy15 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet17 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet17, bookieIdArray16);
        rackawareEnsemblePlacementPolicy15.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult20 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) (short) 100, (int) (short) 1, (int) (byte) 10, strMap14, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet17);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test22");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence21 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList23 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList23, bookieIdArray22);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy25 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        rackawareEnsemblePlacementPolicy25.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27);
        java.lang.String str30 = rackawareEnsemblePlacementPolicy25.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet35 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, bookieIdArray34);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList38 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList38, bookieIdArray37);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult40 = rackawareEnsemblePlacementPolicy25.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList38);
        int int41 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList23, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList38);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList38);
        java.lang.Class<?> wildcardClass43 = rackawareEnsemblePlacementPolicy0.getClass();
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence21 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence21.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertArrayEquals(bookieIdArray22, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/default-rack" + "'", str30, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test23");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl49 = rackawareEnsemblePlacementPolicy0.withDefaultRack("ensembleRandomReadReordering");
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping50 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer51 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger61 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy63 = rackawareEnsemblePlacementPolicy0.initialize(dNSToSwitchMapping50, hashedWheelTimer51, true, 100, (int) (short) 10, true, (int) (byte) -1, (int) (byte) -1, false, false, true, statsLogger61, bookieAddressResolver62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl49);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test24");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        java.lang.String[] strArray40 = new java.lang.String[] { "ensembleRandomReadReordering", "ensembleRandomReadReordering", "hi!", "ensembleRandomReadReordering" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.apache.bookkeeper.net.Node[] nodeArray43 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet44 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet44, nodeArray43);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate46 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode49 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation((java.util.Set<java.lang.String>) strSet41, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet44, bookieNodePredicate46, bookieNodeEnsemble47, true);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "ensembleRandomReadReordering", "ensembleRandomReadReordering", "hi!", "ensembleRandomReadReordering" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertArrayEquals(nodeArray43, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test25");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList48 = null;
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence51 = rackawareEnsemblePlacementPolicyImpl47.isEnsembleAdheringToPlacementPolicy(bookieIdList48, 10, (int) (short) 100);
        java.util.Map map52 = null;
        rackawareEnsemblePlacementPolicyImpl47.updateBookieInfo(map52);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence51 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence51.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test26");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass57 = bookieIdSet48.getClass();
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test27");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        java.lang.String str16 = rackawareEnsemblePlacementPolicy11.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy11.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo27 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet29 = rackawareEnsemblePlacementPolicy0.reorderReadLACSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookiesHealthInfo27, writeSet28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/default-rack" + "'", str16, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertArrayEquals(bookieIdArray20, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult26);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test28");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        rackawareEnsemblePlacementPolicy1.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl38 = rackawareEnsemblePlacementPolicy1.withDefaultRack("/default-rack");
        rackawareEnsemblePlacementPolicy0.slave = rackawareEnsemblePlacementPolicyImpl38;
        java.lang.String str40 = rackawareEnsemblePlacementPolicyImpl38.getDefaultRack();
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/default-rack" + "'", str40, "/default-rack");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test29");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy21 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet23 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet23, bookieIdArray22);
        rackawareEnsemblePlacementPolicy21.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet23);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet23);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy27 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet29 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet29, bookieIdArray28);
        rackawareEnsemblePlacementPolicy27.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        java.lang.String str32 = rackawareEnsemblePlacementPolicy27.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray36 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet37 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet37, bookieIdArray36);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList40 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList40, bookieIdArray39);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult42 = rackawareEnsemblePlacementPolicy27.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet37, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList40);
        rackawareEnsemblePlacementPolicy16.onBookieRackChange((java.util.List) bookieIdList40);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray44 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList45 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList45, bookieIdArray44);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy47 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray48 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet49 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet49, bookieIdArray48);
        rackawareEnsemblePlacementPolicy47.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet49);
        java.lang.String str52 = rackawareEnsemblePlacementPolicy47.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray56 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet57 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet57, bookieIdArray56);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray59 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList60 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList60, bookieIdArray59);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult62 = rackawareEnsemblePlacementPolicy47.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet57, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList60);
        int int63 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList60);
        int int64 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList40, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy65 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet67 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, bookieIdArray66);
        rackawareEnsemblePlacementPolicy65.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet67);
        java.lang.String str70 = rackawareEnsemblePlacementPolicy65.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray74 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet75 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet75, bookieIdArray74);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray77 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList78 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList78, bookieIdArray77);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult80 = rackawareEnsemblePlacementPolicy65.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList78);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray81 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList82 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList82, bookieIdArray81);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence86 = rackawareEnsemblePlacementPolicy65.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList82, (int) (short) 0, (int) (byte) 100);
        int int87 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList40, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList82);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo88 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet90 = rackawareEnsemblePlacementPolicy0.reorderReadLACSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList82, bookiesHealthInfo88, writeSet89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertArrayEquals(bookieIdArray22, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/default-rack" + "'", str32, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray36);
        org.junit.Assert.assertArrayEquals(bookieIdArray36, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult42);
        org.junit.Assert.assertNotNull(bookieIdArray44);
        org.junit.Assert.assertArrayEquals(bookieIdArray44, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookieIdArray48);
        org.junit.Assert.assertArrayEquals(bookieIdArray48, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "/default-rack" + "'", str52, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray56);
        org.junit.Assert.assertArrayEquals(bookieIdArray56, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bookieIdArray59);
        org.junit.Assert.assertArrayEquals(bookieIdArray59, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "/default-rack" + "'", str70, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray74);
        org.junit.Assert.assertArrayEquals(bookieIdArray74, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(bookieIdArray77);
        org.junit.Assert.assertArrayEquals(bookieIdArray77, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult80);
        org.junit.Assert.assertNotNull(bookieIdArray81);
        org.junit.Assert.assertArrayEquals(bookieIdArray81, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence86 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence86.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test30");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.net.Node[] nodeArray12 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet13, nodeArray12);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate15 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode18 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("", (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet13, bookieNodePredicate15, bookieNodeEnsemble16, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertArrayEquals(nodeArray12, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test31");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy57 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray58 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet59 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, bookieIdArray58);
        rackawareEnsemblePlacementPolicy57.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        java.lang.String str62 = rackawareEnsemblePlacementPolicy57.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet67 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, bookieIdArray66);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray69 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList70 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList70, bookieIdArray69);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult72 = rackawareEnsemblePlacementPolicy57.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList70);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence75 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList70, (int) 'a', 0);
        java.util.Map map76 = null;
        rackawareEnsemblePlacementPolicy0.updateBookieInfo(map76);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(bookieIdArray58);
        org.junit.Assert.assertArrayEquals(bookieIdArray58, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/default-rack" + "'", str62, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdArray69);
        org.junit.Assert.assertArrayEquals(bookieIdArray69, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult72);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence75 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence75.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test32");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        org.apache.bookkeeper.conf.ClientConfiguration clientConfiguration35 = null;
        java.util.Optional<org.apache.bookkeeper.net.DNSToSwitchMapping> dNSToSwitchMappingOptional36 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer37 = null;
        org.apache.bookkeeper.feature.FeatureProvider featureProvider38 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger39 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl41 = rackawareEnsemblePlacementPolicy0.initialize(clientConfiguration35, dNSToSwitchMappingOptional36, hashedWheelTimer37, featureProvider38, statsLogger39, bookieAddressResolver40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test33");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence21 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy22 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet24, bookieIdArray23);
        rackawareEnsemblePlacementPolicy22.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy27 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet29 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet29, bookieIdArray28);
        rackawareEnsemblePlacementPolicy27.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        rackawareEnsemblePlacementPolicy22.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy33 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet35 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, bookieIdArray34);
        rackawareEnsemblePlacementPolicy33.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet35);
        java.lang.String str38 = rackawareEnsemblePlacementPolicy33.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray42 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet43 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet43, bookieIdArray42);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList46 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList46, bookieIdArray45);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult48 = rackawareEnsemblePlacementPolicy33.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet43, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList46);
        rackawareEnsemblePlacementPolicy22.onBookieRackChange((java.util.List) bookieIdList46);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy53 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray54 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet55 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet55, bookieIdArray54);
        rackawareEnsemblePlacementPolicy53.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet55);
        java.lang.String str58 = rackawareEnsemblePlacementPolicy53.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray62 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet63 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet63, bookieIdArray62);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray65 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList66 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList66, bookieIdArray65);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult68 = rackawareEnsemblePlacementPolicy53.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet63, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList66);
        int int69 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList66);
        int int70 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList46, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy71 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray72 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet73 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, bookieIdArray72);
        rackawareEnsemblePlacementPolicy71.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet73);
        java.lang.String str76 = rackawareEnsemblePlacementPolicy71.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray80 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet81 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, bookieIdArray80);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray83 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList84 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList84, bookieIdArray83);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult86 = rackawareEnsemblePlacementPolicy71.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList84);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray87 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList88 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList88, bookieIdArray87);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence92 = rackawareEnsemblePlacementPolicy71.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList88, (int) (short) 0, (int) (byte) 100);
        int int93 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList46, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList88);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo94 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet95 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet96 = rackawareEnsemblePlacementPolicy0.reorderReadSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList46, bookiesHealthInfo94, writeSet95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence21 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence21.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/default-rack" + "'", str38, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray42);
        org.junit.Assert.assertArrayEquals(bookieIdArray42, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult48);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdArray54);
        org.junit.Assert.assertArrayEquals(bookieIdArray54, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "/default-rack" + "'", str58, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray62);
        org.junit.Assert.assertArrayEquals(bookieIdArray62, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(bookieIdArray65);
        org.junit.Assert.assertArrayEquals(bookieIdArray65, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2147483647 + "'", int70 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdArray72);
        org.junit.Assert.assertArrayEquals(bookieIdArray72, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "/default-rack" + "'", str76, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray80);
        org.junit.Assert.assertArrayEquals(bookieIdArray80, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(bookieIdArray83);
        org.junit.Assert.assertArrayEquals(bookieIdArray83, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult86);
        org.junit.Assert.assertNotNull(bookieIdArray87);
        org.junit.Assert.assertArrayEquals(bookieIdArray87, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence92 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence92.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2147483647 + "'", int93 == 2147483647);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test34");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy35 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray36 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet37 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet37, bookieIdArray36);
        rackawareEnsemblePlacementPolicy35.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet37);
        java.lang.String str40 = rackawareEnsemblePlacementPolicy35.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy44 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet46 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, bookieIdArray45);
        rackawareEnsemblePlacementPolicy44.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46);
        java.lang.String str49 = rackawareEnsemblePlacementPolicy44.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray53 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet54 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, bookieIdArray53);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray56 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList57 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList57, bookieIdArray56);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult59 = rackawareEnsemblePlacementPolicy44.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList57);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList61 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList61, bookieIdArray60);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy63 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray64 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet65 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet65, bookieIdArray64);
        rackawareEnsemblePlacementPolicy63.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet65);
        java.lang.String str68 = rackawareEnsemblePlacementPolicy63.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray72 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet73 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, bookieIdArray72);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray75 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList76 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList76, bookieIdArray75);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult78 = rackawareEnsemblePlacementPolicy63.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        int int79 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList61, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult80 = rackawareEnsemblePlacementPolicy35.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatJoined((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        org.apache.bookkeeper.net.Node[] nodeArray90 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet91 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet91, nodeArray90);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate93 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode96 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation("hi!", (java.util.Set<java.lang.String>) strSet88, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet91, bookieNodePredicate93, bookieNodeEnsemble94, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Network Location path does not start with /: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray36);
        org.junit.Assert.assertArrayEquals(bookieIdArray36, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/default-rack" + "'", str40, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/default-rack" + "'", str49, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray53);
        org.junit.Assert.assertArrayEquals(bookieIdArray53, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookieIdArray56);
        org.junit.Assert.assertArrayEquals(bookieIdArray56, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult59);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookieIdArray64);
        org.junit.Assert.assertArrayEquals(bookieIdArray64, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "/default-rack" + "'", str68, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray72);
        org.junit.Assert.assertArrayEquals(bookieIdArray72, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookieIdArray75);
        org.junit.Assert.assertArrayEquals(bookieIdArray75, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult80);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(nodeArray90);
        org.junit.Assert.assertArrayEquals(nodeArray90, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test35");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy54 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray55 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet56 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet56, bookieIdArray55);
        rackawareEnsemblePlacementPolicy54.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet56);
        java.lang.String str59 = rackawareEnsemblePlacementPolicy54.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray63 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet64 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, bookieIdArray63);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList67 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList67, bookieIdArray66);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult69 = rackawareEnsemblePlacementPolicy54.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList67);
        boolean boolean72 = rackawareEnsemblePlacementPolicy38.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, 0, 0);
        rackawareEnsemblePlacementPolicy38.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl75 = rackawareEnsemblePlacementPolicy38.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy76 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray77 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet78 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet78, bookieIdArray77);
        rackawareEnsemblePlacementPolicy76.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet78);
        java.lang.String str81 = rackawareEnsemblePlacementPolicy76.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray85 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet86 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet86, bookieIdArray85);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray88 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList89 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList89, bookieIdArray88);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult91 = rackawareEnsemblePlacementPolicy76.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList89);
        boolean boolean94 = rackawareEnsemblePlacementPolicy38.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86, (int) (byte) 0, (int) (byte) 100);
        boolean boolean97 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86, (int) '#', (int) (short) 10);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        java.lang.String str99 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertNotNull(bookieIdArray55);
        org.junit.Assert.assertArrayEquals(bookieIdArray55, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/default-rack" + "'", str59, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray63);
        org.junit.Assert.assertArrayEquals(bookieIdArray63, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl75);
        org.junit.Assert.assertNotNull(bookieIdArray77);
        org.junit.Assert.assertArrayEquals(bookieIdArray77, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "/default-rack" + "'", str81, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray85);
        org.junit.Assert.assertArrayEquals(bookieIdArray85, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(bookieIdArray88);
        org.junit.Assert.assertArrayEquals(bookieIdArray88, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult91);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "/default-rack" + "'", str99, "/default-rack");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test36");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy39 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet41 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet41, bookieIdArray40);
        rackawareEnsemblePlacementPolicy39.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy44 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet46 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, bookieIdArray45);
        rackawareEnsemblePlacementPolicy44.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46);
        rackawareEnsemblePlacementPolicy39.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy50 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray51 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet52 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet52, bookieIdArray51);
        rackawareEnsemblePlacementPolicy50.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet52);
        java.lang.String str55 = rackawareEnsemblePlacementPolicy50.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray59 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet60 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet60, bookieIdArray59);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray62 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList63 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList63, bookieIdArray62);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult65 = rackawareEnsemblePlacementPolicy50.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet60, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList63);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult66 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (short) 100, (int) (byte) -1, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList63);
        java.util.Map map67 = null;
        rackawareEnsemblePlacementPolicy0.updateBookieInfo(map67);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookieIdArray51);
        org.junit.Assert.assertArrayEquals(bookieIdArray51, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "/default-rack" + "'", str55, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray59);
        org.junit.Assert.assertArrayEquals(bookieIdArray59, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(bookieIdArray62);
        org.junit.Assert.assertArrayEquals(bookieIdArray62, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult65);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult66);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test37");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy35 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray36 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet37 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet37, bookieIdArray36);
        rackawareEnsemblePlacementPolicy35.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet37);
        java.lang.String str40 = rackawareEnsemblePlacementPolicy35.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy44 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet46 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, bookieIdArray45);
        rackawareEnsemblePlacementPolicy44.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46);
        java.lang.String str49 = rackawareEnsemblePlacementPolicy44.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray53 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet54 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, bookieIdArray53);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray56 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList57 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList57, bookieIdArray56);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult59 = rackawareEnsemblePlacementPolicy44.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList57);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList61 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList61, bookieIdArray60);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy63 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray64 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet65 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet65, bookieIdArray64);
        rackawareEnsemblePlacementPolicy63.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet65);
        java.lang.String str68 = rackawareEnsemblePlacementPolicy63.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray72 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet73 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, bookieIdArray72);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray75 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList76 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList76, bookieIdArray75);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult78 = rackawareEnsemblePlacementPolicy63.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        int int79 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList61, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult80 = rackawareEnsemblePlacementPolicy35.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatJoined((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping82 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer83 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger93 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy95 = rackawareEnsemblePlacementPolicy0.initialize(dNSToSwitchMapping82, hashedWheelTimer83, false, (int) (short) 0, (int) (byte) -1, false, (int) (short) 1, (int) ' ', true, false, true, statsLogger93, bookieAddressResolver94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray36);
        org.junit.Assert.assertArrayEquals(bookieIdArray36, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/default-rack" + "'", str40, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/default-rack" + "'", str49, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray53);
        org.junit.Assert.assertArrayEquals(bookieIdArray53, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookieIdArray56);
        org.junit.Assert.assertArrayEquals(bookieIdArray56, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult59);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookieIdArray64);
        org.junit.Assert.assertArrayEquals(bookieIdArray64, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "/default-rack" + "'", str68, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray72);
        org.junit.Assert.assertArrayEquals(bookieIdArray72, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookieIdArray75);
        org.junit.Assert.assertArrayEquals(bookieIdArray75, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult80);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test38");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy48 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray49 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet50 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet50, bookieIdArray49);
        rackawareEnsemblePlacementPolicy48.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet50);
        java.lang.String str53 = rackawareEnsemblePlacementPolicy48.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray57 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet58 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet58, bookieIdArray57);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList61 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList61, bookieIdArray60);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult63 = rackawareEnsemblePlacementPolicy48.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet58, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList61);
        rackawareEnsemblePlacementPolicyImpl47.onBookieRackChange((java.util.List) bookieIdList61);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertNotNull(bookieIdArray49);
        org.junit.Assert.assertArrayEquals(bookieIdArray49, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "/default-rack" + "'", str53, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray57);
        org.junit.Assert.assertArrayEquals(bookieIdArray57, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult63);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test39");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy(false);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList3 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList3, bookieIdArray2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        java.lang.String str10 = rackawareEnsemblePlacementPolicy5.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult20 = rackawareEnsemblePlacementPolicy5.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18);
        int int21 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList3, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo22 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet24 = rackawareEnsemblePlacementPolicy1.reorderReadLACSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookiesHealthInfo22, writeSet23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/default-rack" + "'", str10, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertArrayEquals(bookieIdArray14, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test40");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet61 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet61, bookieIdArray60);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble63 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult65 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) ' ', 1, (-1), (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet61, bookieNodeEnsemble63, bookieNodePredicate64);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test41");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        rackawareEnsemblePlacementPolicy1.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl38 = rackawareEnsemblePlacementPolicy1.withDefaultRack("/default-rack");
        rackawareEnsemblePlacementPolicy0.slave = rackawareEnsemblePlacementPolicyImpl38;
        org.apache.bookkeeper.net.BookieId bookieId40 = null;
        // The following exception was thrown during execution in test generation
        try {
            rackawareEnsemblePlacementPolicy0.registerSlowBookie(bookieId40, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl38);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test42");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        boolean boolean19 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (int) '4', 100);
        org.apache.bookkeeper.client.api.LedgerMetadata ledgerMetadata20 = null;
        java.util.Optional<java.lang.Integer> intOptional21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = rackawareEnsemblePlacementPolicy0.getStickyReadBookieIndex(ledgerMetadata20, intOptional21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test43");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        java.util.Map<java.lang.String, byte[]> strMap51 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy52 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray53 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet54 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, bookieIdArray53);
        rackawareEnsemblePlacementPolicy52.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54);
        java.lang.String str57 = rackawareEnsemblePlacementPolicy52.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray61 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet62 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet62, bookieIdArray61);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray64 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList65 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList65, bookieIdArray64);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult67 = rackawareEnsemblePlacementPolicy52.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet62, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList65);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray68 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList69 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList69, bookieIdArray68);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence73 = rackawareEnsemblePlacementPolicy52.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList69, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy74 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray75 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet76 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet76, bookieIdArray75);
        rackawareEnsemblePlacementPolicy74.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet76);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy79 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray80 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet81 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, bookieIdArray80);
        rackawareEnsemblePlacementPolicy79.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81);
        rackawareEnsemblePlacementPolicy74.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy85 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray86 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet87 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet87, bookieIdArray86);
        rackawareEnsemblePlacementPolicy85.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet87);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet90 = rackawareEnsemblePlacementPolicy52.onClusterChanged((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet87);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult91 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) ' ', 100, (int) (short) 10, strMap51, bookieIdSet90);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertNotNull(bookieIdArray53);
        org.junit.Assert.assertArrayEquals(bookieIdArray53, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "/default-rack" + "'", str57, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray61);
        org.junit.Assert.assertArrayEquals(bookieIdArray61, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(bookieIdArray64);
        org.junit.Assert.assertArrayEquals(bookieIdArray64, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult67);
        org.junit.Assert.assertNotNull(bookieIdArray68);
        org.junit.Assert.assertArrayEquals(bookieIdArray68, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence73 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence73.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray75);
        org.junit.Assert.assertArrayEquals(bookieIdArray75, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bookieIdArray80);
        org.junit.Assert.assertArrayEquals(bookieIdArray80, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(bookieIdArray86);
        org.junit.Assert.assertArrayEquals(bookieIdArray86, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(bookieIdSet90);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test44");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        java.lang.String str16 = rackawareEnsemblePlacementPolicy11.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy11.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl28 = rackawareEnsemblePlacementPolicy0.slave;
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy32 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray33 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet34 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, bookieIdArray33);
        rackawareEnsemblePlacementPolicy32.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34);
        java.lang.String str37 = rackawareEnsemblePlacementPolicy32.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray41 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet42 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet42, bookieIdArray41);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray44 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList45 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList45, bookieIdArray44);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult47 = rackawareEnsemblePlacementPolicy32.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet42, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45);
        int int48 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45);
        org.apache.bookkeeper.client.BookiesHealthInfo bookiesHealthInfo49 = null;
        org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.DistributionSchedule.WriteSet writeSet51 = rackawareEnsemblePlacementPolicy0.reorderReadLACSequence((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45, bookiesHealthInfo49, writeSet50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/default-rack" + "'", str16, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertArrayEquals(bookieIdArray20, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult26);
        org.junit.Assert.assertNull(rackawareEnsemblePlacementPolicyImpl28);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdArray33);
        org.junit.Assert.assertArrayEquals(bookieIdArray33, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/default-rack" + "'", str37, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray41);
        org.junit.Assert.assertArrayEquals(bookieIdArray41, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookieIdArray44);
        org.junit.Assert.assertArrayEquals(bookieIdArray44, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test45");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.api.LedgerMetadata ledgerMetadata48 = null;
        java.util.Optional<java.lang.Integer> intOptional49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = rackawareEnsemblePlacementPolicy0.getStickyReadBookieIndex(ledgerMetadata48, intOptional49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test46");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        java.lang.String str16 = rackawareEnsemblePlacementPolicy11.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy11.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl28 = rackawareEnsemblePlacementPolicy0.slave;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy29 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray30 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet31 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet31, bookieIdArray30);
        rackawareEnsemblePlacementPolicy29.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet31);
        java.lang.String str34 = rackawareEnsemblePlacementPolicy29.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray38 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet39 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet39, bookieIdArray38);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray41 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList42 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList42, bookieIdArray41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult44 = rackawareEnsemblePlacementPolicy29.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet39, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList42);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy45 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray46 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet47 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet47, bookieIdArray46);
        rackawareEnsemblePlacementPolicy45.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet47);
        java.lang.String str50 = rackawareEnsemblePlacementPolicy45.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray54 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet55 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet55, bookieIdArray54);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray57 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList58 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList58, bookieIdArray57);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult60 = rackawareEnsemblePlacementPolicy45.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet55, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList58);
        boolean boolean63 = rackawareEnsemblePlacementPolicy29.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet55, 0, 0);
        rackawareEnsemblePlacementPolicy29.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy68 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray69 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet70 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet70, bookieIdArray69);
        rackawareEnsemblePlacementPolicy68.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet70);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy73 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray74 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet75 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet75, bookieIdArray74);
        rackawareEnsemblePlacementPolicy73.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75);
        rackawareEnsemblePlacementPolicy68.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy79 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray80 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet81 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, bookieIdArray80);
        rackawareEnsemblePlacementPolicy79.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81);
        java.lang.String str84 = rackawareEnsemblePlacementPolicy79.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray88 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet89 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet89, bookieIdArray88);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray91 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList92 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList92, bookieIdArray91);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult94 = rackawareEnsemblePlacementPolicy79.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet89, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList92);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult95 = rackawareEnsemblePlacementPolicy29.replaceToAdherePlacementPolicy((int) (short) 100, (int) (byte) -1, 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList92);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatJoined((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/default-rack" + "'", str16, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertArrayEquals(bookieIdArray20, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult26);
        org.junit.Assert.assertNull(rackawareEnsemblePlacementPolicyImpl28);
        org.junit.Assert.assertNotNull(bookieIdArray30);
        org.junit.Assert.assertArrayEquals(bookieIdArray30, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "/default-rack" + "'", str34, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray38);
        org.junit.Assert.assertArrayEquals(bookieIdArray38, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookieIdArray41);
        org.junit.Assert.assertArrayEquals(bookieIdArray41, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult44);
        org.junit.Assert.assertNotNull(bookieIdArray46);
        org.junit.Assert.assertArrayEquals(bookieIdArray46, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/default-rack" + "'", str50, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray54);
        org.junit.Assert.assertArrayEquals(bookieIdArray54, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(bookieIdArray57);
        org.junit.Assert.assertArrayEquals(bookieIdArray57, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(bookieIdArray69);
        org.junit.Assert.assertArrayEquals(bookieIdArray69, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bookieIdArray74);
        org.junit.Assert.assertArrayEquals(bookieIdArray74, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(bookieIdArray80);
        org.junit.Assert.assertArrayEquals(bookieIdArray80, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "/default-rack" + "'", str84, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray88);
        org.junit.Assert.assertArrayEquals(bookieIdArray88, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(bookieIdArray91);
        org.junit.Assert.assertArrayEquals(bookieIdArray91, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult94);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult95);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test47");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy54 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray55 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet56 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet56, bookieIdArray55);
        rackawareEnsemblePlacementPolicy54.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet56);
        java.lang.String str59 = rackawareEnsemblePlacementPolicy54.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray63 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet64 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, bookieIdArray63);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList67 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList67, bookieIdArray66);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult69 = rackawareEnsemblePlacementPolicy54.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList67);
        boolean boolean72 = rackawareEnsemblePlacementPolicy38.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, 0, 0);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble73 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult75 = rackawareEnsemblePlacementPolicy0.newEnsemble(1, (int) (short) -1, (int) (short) 0, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, bookieNodeEnsemble73, bookieNodePredicate74);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertNotNull(bookieIdArray55);
        org.junit.Assert.assertArrayEquals(bookieIdArray55, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/default-rack" + "'", str59, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray63);
        org.junit.Assert.assertArrayEquals(bookieIdArray63, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test48");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy6 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray7 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet8, bookieIdArray7);
        rackawareEnsemblePlacementPolicy6.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet8);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        rackawareEnsemblePlacementPolicy6.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        rackawareEnsemblePlacementPolicy6.onBookieRackChange((java.util.List) bookieIdList30);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList35 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList35, bookieIdArray34);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy37 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray38 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet39 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet39, bookieIdArray38);
        rackawareEnsemblePlacementPolicy37.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet39);
        java.lang.String str42 = rackawareEnsemblePlacementPolicy37.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray46 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet47 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet47, bookieIdArray46);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray49 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList50 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList50, bookieIdArray49);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult52 = rackawareEnsemblePlacementPolicy37.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet47, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList50);
        int int53 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList50);
        int int54 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence57 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray7);
        org.junit.Assert.assertArrayEquals(bookieIdArray7, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookieIdArray38);
        org.junit.Assert.assertArrayEquals(bookieIdArray38, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/default-rack" + "'", str42, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray46);
        org.junit.Assert.assertArrayEquals(bookieIdArray46, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookieIdArray49);
        org.junit.Assert.assertArrayEquals(bookieIdArray49, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence57 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence57.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test49");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy(false);
        java.lang.String str2 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/default-rack" + "'", str2, "/default-rack");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test50");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        java.lang.String[] strArray62 = new java.lang.String[] { "/default-rack", "ensembleRandomReadReordering", "/default-rack", "", "ensembleRandomReadReordering" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        org.apache.bookkeeper.net.Node[] nodeArray65 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet66 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet66, nodeArray65);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate68 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode71 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation((java.util.Set<java.lang.String>) strSet63, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet66, bookieNodePredicate68, bookieNodeEnsemble69, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "/default-rack", "ensembleRandomReadReordering", "/default-rack", "", "ensembleRandomReadReordering" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(nodeArray65);
        org.junit.Assert.assertArrayEquals(nodeArray65, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test51");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl49 = rackawareEnsemblePlacementPolicy0.withDefaultRack("ensembleRandomReadReordering");
        java.util.Map<java.lang.String, byte[]> strMap53 = null;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy54 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray55 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet56 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet56, bookieIdArray55);
        rackawareEnsemblePlacementPolicy54.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet56);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy59 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet61 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet61, bookieIdArray60);
        rackawareEnsemblePlacementPolicy59.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet61);
        rackawareEnsemblePlacementPolicy54.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet61);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult65 = rackawareEnsemblePlacementPolicy0.newEnsemble((int) ' ', (int) (byte) 100, 10, strMap53, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet61);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl49);
        org.junit.Assert.assertNotNull(bookieIdArray55);
        org.junit.Assert.assertArrayEquals(bookieIdArray55, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test52");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.net.BookieId bookieId5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rackawareEnsemblePlacementPolicy0.registerSlowBookie(bookieId5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test53");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        java.lang.String str16 = rackawareEnsemblePlacementPolicy11.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy11.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl28 = rackawareEnsemblePlacementPolicy0.slave;
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping29 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer30 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger39 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy41 = rackawareEnsemblePlacementPolicy0.initialize(dNSToSwitchMapping29, hashedWheelTimer30, false, 100, (int) (byte) 100, true, (int) (byte) 10, 2147483647, true, true, statsLogger39, bookieAddressResolver40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/default-rack" + "'", str16, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertArrayEquals(bookieIdArray20, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult26);
        org.junit.Assert.assertNull(rackawareEnsemblePlacementPolicyImpl28);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test54");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy35 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray36 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet37 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet37, bookieIdArray36);
        rackawareEnsemblePlacementPolicy35.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet37);
        java.lang.String str40 = rackawareEnsemblePlacementPolicy35.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy44 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet46 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, bookieIdArray45);
        rackawareEnsemblePlacementPolicy44.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46);
        java.lang.String str49 = rackawareEnsemblePlacementPolicy44.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray53 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet54 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, bookieIdArray53);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray56 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList57 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList57, bookieIdArray56);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult59 = rackawareEnsemblePlacementPolicy44.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList57);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray60 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList61 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList61, bookieIdArray60);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy63 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray64 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet65 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet65, bookieIdArray64);
        rackawareEnsemblePlacementPolicy63.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet65);
        java.lang.String str68 = rackawareEnsemblePlacementPolicy63.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray72 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet73 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, bookieIdArray72);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray75 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList76 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList76, bookieIdArray75);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult78 = rackawareEnsemblePlacementPolicy63.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet73, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        int int79 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList61, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult80 = rackawareEnsemblePlacementPolicy35.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList76);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatJoined((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl83 = rackawareEnsemblePlacementPolicy0.withDefaultRack("hi!");
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookieIdArray36);
        org.junit.Assert.assertArrayEquals(bookieIdArray36, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "/default-rack" + "'", str40, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/default-rack" + "'", str49, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray53);
        org.junit.Assert.assertArrayEquals(bookieIdArray53, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookieIdArray56);
        org.junit.Assert.assertArrayEquals(bookieIdArray56, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult59);
        org.junit.Assert.assertNotNull(bookieIdArray60);
        org.junit.Assert.assertArrayEquals(bookieIdArray60, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(bookieIdArray64);
        org.junit.Assert.assertArrayEquals(bookieIdArray64, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "/default-rack" + "'", str68, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray72);
        org.junit.Assert.assertArrayEquals(bookieIdArray72, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(bookieIdArray75);
        org.junit.Assert.assertArrayEquals(bookieIdArray75, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult80);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl83);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test55");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy9 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        rackawareEnsemblePlacementPolicy9.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11);
        java.lang.String str14 = rackawareEnsemblePlacementPolicy9.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult24 = rackawareEnsemblePlacementPolicy9.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList26 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList26, bookieIdArray25);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy28 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet30 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet30, bookieIdArray29);
        rackawareEnsemblePlacementPolicy28.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet30);
        java.lang.String str33 = rackawareEnsemblePlacementPolicy28.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray40 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList41 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList41, bookieIdArray40);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult43 = rackawareEnsemblePlacementPolicy28.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        int int44 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult45 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy(0, (int) (short) 10, (int) 'a', (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList41);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl47 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        java.util.List<org.apache.bookkeeper.net.BookieId> bookieIdList48 = null;
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence51 = rackawareEnsemblePlacementPolicyImpl47.isEnsembleAdheringToPlacementPolicy(bookieIdList48, 10, (int) (short) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy52 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray53 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet54 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet54, bookieIdArray53);
        rackawareEnsemblePlacementPolicy52.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet54);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy57 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray58 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet59 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, bookieIdArray58);
        rackawareEnsemblePlacementPolicy57.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        rackawareEnsemblePlacementPolicy52.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        boolean boolean65 = rackawareEnsemblePlacementPolicyImpl47.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/default-rack" + "'", str14, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult24);
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "/default-rack" + "'", str33, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdArray40);
        org.junit.Assert.assertArrayEquals(bookieIdArray40, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult45);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl47);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence51 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence51.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray53);
        org.junit.Assert.assertArrayEquals(bookieIdArray53, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookieIdArray58);
        org.junit.Assert.assertArrayEquals(bookieIdArray58, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test56");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy32 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray33 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet34 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, bookieIdArray33);
        rackawareEnsemblePlacementPolicy32.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34);
        java.lang.String str37 = rackawareEnsemblePlacementPolicy32.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray41 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet42 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet42, bookieIdArray41);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray44 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList45 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList45, bookieIdArray44);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult47 = rackawareEnsemblePlacementPolicy32.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet42, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList45);
        boolean boolean50 = rackawareEnsemblePlacementPolicy16.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet42, 0, 0);
        rackawareEnsemblePlacementPolicy16.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl53 = rackawareEnsemblePlacementPolicy16.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy54 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray55 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet56 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet56, bookieIdArray55);
        rackawareEnsemblePlacementPolicy54.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet56);
        java.lang.String str59 = rackawareEnsemblePlacementPolicy54.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray63 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet64 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, bookieIdArray63);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList67 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList67, bookieIdArray66);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult69 = rackawareEnsemblePlacementPolicy54.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList67);
        boolean boolean72 = rackawareEnsemblePlacementPolicy16.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet64, (int) (byte) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy73 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray74 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet75 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet75, bookieIdArray74);
        rackawareEnsemblePlacementPolicy73.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet75);
        java.lang.String str78 = rackawareEnsemblePlacementPolicy73.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray82 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet83 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet83, bookieIdArray82);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray85 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList86 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList86, bookieIdArray85);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult88 = rackawareEnsemblePlacementPolicy73.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet83, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList86);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence91 = rackawareEnsemblePlacementPolicy16.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList86, (int) 'a', 0);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence94 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList86, (-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertNotNull(bookieIdArray33);
        org.junit.Assert.assertArrayEquals(bookieIdArray33, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "/default-rack" + "'", str37, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray41);
        org.junit.Assert.assertArrayEquals(bookieIdArray41, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookieIdArray44);
        org.junit.Assert.assertArrayEquals(bookieIdArray44, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl53);
        org.junit.Assert.assertNotNull(bookieIdArray55);
        org.junit.Assert.assertArrayEquals(bookieIdArray55, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/default-rack" + "'", str59, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray63);
        org.junit.Assert.assertArrayEquals(bookieIdArray63, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(bookieIdArray74);
        org.junit.Assert.assertArrayEquals(bookieIdArray74, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "/default-rack" + "'", str78, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray82);
        org.junit.Assert.assertArrayEquals(bookieIdArray82, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(bookieIdArray85);
        org.junit.Assert.assertArrayEquals(bookieIdArray85, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult88);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence91 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence91.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence94 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence94.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test57");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        java.lang.String[] strArray7 = new java.lang.String[] { "reppDnsResolverClass" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.bookkeeper.net.Node[] nodeArray10 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet11, nodeArray10);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate13 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode16 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation((java.util.Set<java.lang.String>) strSet8, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet11, bookieNodePredicate13, bookieNodeEnsemble14, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "reppDnsResolverClass" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertArrayEquals(nodeArray10, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test58");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        rackawareEnsemblePlacementPolicy1.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl38 = rackawareEnsemblePlacementPolicy1.withDefaultRack("/default-rack");
        rackawareEnsemblePlacementPolicy0.slave = rackawareEnsemblePlacementPolicyImpl38;
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl41 = rackawareEnsemblePlacementPolicyImpl38.withDefaultRack("reppDnsResolverClass");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl43 = rackawareEnsemblePlacementPolicyImpl38.withDefaultRack("");
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl38);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl41);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl43);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test59");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence21 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray22 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList23 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList23, bookieIdArray22);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy25 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        rackawareEnsemblePlacementPolicy25.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27);
        java.lang.String str30 = rackawareEnsemblePlacementPolicy25.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet35 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, bookieIdArray34);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList38 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList38, bookieIdArray37);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult40 = rackawareEnsemblePlacementPolicy25.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList38);
        int int41 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList23, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList38);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList38);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl44 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence21 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence21.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray22);
        org.junit.Assert.assertArrayEquals(bookieIdArray22, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/default-rack" + "'", str30, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl44);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test60");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        java.lang.String str16 = rackawareEnsemblePlacementPolicy11.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray20 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet21 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, bookieIdArray20);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList24 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList24, bookieIdArray23);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult26 = rackawareEnsemblePlacementPolicy11.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet21, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList24);
        rackawareEnsemblePlacementPolicy0.onBookieRackChange((java.util.List) bookieIdList24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl28 = rackawareEnsemblePlacementPolicy0.slave;
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy33 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet35 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, bookieIdArray34);
        rackawareEnsemblePlacementPolicy33.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet35);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble38 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult40 = rackawareEnsemblePlacementPolicy0.newEnsemble(100, (int) ' ', 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet35, bookieNodeEnsemble38, bookieNodePredicate39);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/default-rack" + "'", str16, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray20);
        org.junit.Assert.assertArrayEquals(bookieIdArray20, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult26);
        org.junit.Assert.assertNull(rackawareEnsemblePlacementPolicyImpl28);
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test61");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy16 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet18 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet18, bookieIdArray17);
        rackawareEnsemblePlacementPolicy16.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet18);
        java.lang.String str21 = rackawareEnsemblePlacementPolicy16.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray25 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet26 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, bookieIdArray25);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList29 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList29, bookieIdArray28);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult31 = rackawareEnsemblePlacementPolicy16.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList29);
        boolean boolean34 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet26, 0, 0);
        rackawareEnsemblePlacementPolicy0.uninitalize();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl37 = rackawareEnsemblePlacementPolicy0.withDefaultRack("/default-rack");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.lang.String str43 = rackawareEnsemblePlacementPolicy38.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray47 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet48 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, bookieIdArray47);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray50 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList51 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList51, bookieIdArray50);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult53 = rackawareEnsemblePlacementPolicy38.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList51);
        boolean boolean56 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet48, (int) (byte) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy57 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray58 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet59 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, bookieIdArray58);
        rackawareEnsemblePlacementPolicy57.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        java.lang.String str62 = rackawareEnsemblePlacementPolicy57.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray66 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet67 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, bookieIdArray66);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray69 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList70 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList70, bookieIdArray69);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult72 = rackawareEnsemblePlacementPolicy57.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet67, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList70);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray73 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList74 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList74, bookieIdArray73);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence78 = rackawareEnsemblePlacementPolicy57.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList74, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy79 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray80 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet81 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet81, bookieIdArray80);
        rackawareEnsemblePlacementPolicy79.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet81);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy84 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray85 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet86 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet86, bookieIdArray85);
        rackawareEnsemblePlacementPolicy84.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86);
        rackawareEnsemblePlacementPolicy79.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86);
        rackawareEnsemblePlacementPolicy57.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatJoined((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet86);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/default-rack" + "'", str21, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray25);
        org.junit.Assert.assertArrayEquals(bookieIdArray25, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rackawareEnsemblePlacementPolicyImpl37);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "/default-rack" + "'", str43, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray47);
        org.junit.Assert.assertArrayEquals(bookieIdArray47, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(bookieIdArray50);
        org.junit.Assert.assertArrayEquals(bookieIdArray50, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(bookieIdArray58);
        org.junit.Assert.assertArrayEquals(bookieIdArray58, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "/default-rack" + "'", str62, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray66);
        org.junit.Assert.assertArrayEquals(bookieIdArray66, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(bookieIdArray69);
        org.junit.Assert.assertArrayEquals(bookieIdArray69, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult72);
        org.junit.Assert.assertNotNull(bookieIdArray73);
        org.junit.Assert.assertArrayEquals(bookieIdArray73, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence78 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence78.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray80);
        org.junit.Assert.assertArrayEquals(bookieIdArray80, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(bookieIdArray85);
        org.junit.Assert.assertArrayEquals(bookieIdArray85, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test62");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy5 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray6 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet7 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet7, bookieIdArray6);
        rackawareEnsemblePlacementPolicy5.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet7);
        java.lang.String str10 = rackawareEnsemblePlacementPolicy5.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray14 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet15 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, bookieIdArray14);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray17 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList18 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList18, bookieIdArray17);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult20 = rackawareEnsemblePlacementPolicy5.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet15, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList18);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray21 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList22 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList22, bookieIdArray21);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence26 = rackawareEnsemblePlacementPolicy5.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList22, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy27 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet29 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet29, bookieIdArray28);
        rackawareEnsemblePlacementPolicy27.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy32 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray33 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet34 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, bookieIdArray33);
        rackawareEnsemblePlacementPolicy32.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34);
        rackawareEnsemblePlacementPolicy27.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy38 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray39 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet40 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet40, bookieIdArray39);
        rackawareEnsemblePlacementPolicy38.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet43 = rackawareEnsemblePlacementPolicy5.onClusterChanged((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet40);
        boolean boolean46 = rackawareEnsemblePlacementPolicy0.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet34, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookieIdArray6);
        org.junit.Assert.assertArrayEquals(bookieIdArray6, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/default-rack" + "'", str10, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray14);
        org.junit.Assert.assertArrayEquals(bookieIdArray14, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookieIdArray17);
        org.junit.Assert.assertArrayEquals(bookieIdArray17, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult20);
        org.junit.Assert.assertNotNull(bookieIdArray21);
        org.junit.Assert.assertArrayEquals(bookieIdArray21, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence26 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence26.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookieIdArray33);
        org.junit.Assert.assertArrayEquals(bookieIdArray33, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookieIdArray39);
        org.junit.Assert.assertArrayEquals(bookieIdArray39, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookieIdSet43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test63");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy(false);
        org.apache.bookkeeper.net.DNSToSwitchMapping dNSToSwitchMapping2 = null;
        io.netty.util.HashedWheelTimer hashedWheelTimer3 = null;
        org.apache.bookkeeper.stats.StatsLogger statsLogger12 = null;
        org.apache.bookkeeper.proto.BookieAddressResolver bookieAddressResolver13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy14 = rackawareEnsemblePlacementPolicy1.initialize(dNSToSwitchMapping2, hashedWheelTimer3, false, 10, 0, true, (int) (byte) 100, (int) (short) 0, true, false, statsLogger12, bookieAddressResolver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: statsLogger should not be null, use NullStatsLogger instead.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test64");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy1 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray2 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet3 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet3, bookieIdArray2);
        rackawareEnsemblePlacementPolicy1.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet3);
        java.lang.String str6 = rackawareEnsemblePlacementPolicy1.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray10 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet11 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, bookieIdArray10);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray13 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList14 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList14, bookieIdArray13);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult16 = rackawareEnsemblePlacementPolicy1.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet11, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList14);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        boolean boolean35 = rackawareEnsemblePlacementPolicy1.areAckedBookiesAdheringToPlacementPolicy((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, 0, 0);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy36 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray37 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet38 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet38, bookieIdArray37);
        rackawareEnsemblePlacementPolicy36.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet38);
        java.lang.String str41 = rackawareEnsemblePlacementPolicy36.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray45 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet46 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, bookieIdArray45);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray48 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList49 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList49, bookieIdArray48);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult51 = rackawareEnsemblePlacementPolicy36.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet46, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList49);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray52 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList53 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList53, bookieIdArray52);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence57 = rackawareEnsemblePlacementPolicy36.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList53, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray58 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet59 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet59, bookieIdArray58);
        rackawareEnsemblePlacementPolicy36.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        java.util.Set<org.apache.bookkeeper.net.BookieId> bookieIdSet62 = rackawareEnsemblePlacementPolicy0.onClusterChanged((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet59);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicyImpl rackawareEnsemblePlacementPolicyImpl63 = rackawareEnsemblePlacementPolicy0.slave;
        org.junit.Assert.assertNotNull(bookieIdArray2);
        org.junit.Assert.assertArrayEquals(bookieIdArray2, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/default-rack" + "'", str6, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray10);
        org.junit.Assert.assertArrayEquals(bookieIdArray10, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookieIdArray13);
        org.junit.Assert.assertArrayEquals(bookieIdArray13, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult16);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(bookieIdArray37);
        org.junit.Assert.assertArrayEquals(bookieIdArray37, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/default-rack" + "'", str41, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray45);
        org.junit.Assert.assertArrayEquals(bookieIdArray45, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookieIdArray48);
        org.junit.Assert.assertArrayEquals(bookieIdArray48, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult51);
        org.junit.Assert.assertNotNull(bookieIdArray52);
        org.junit.Assert.assertArrayEquals(bookieIdArray52, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence57 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence57.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray58);
        org.junit.Assert.assertArrayEquals(bookieIdArray58, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(bookieIdSet62);
        org.junit.Assert.assertNull(rackawareEnsemblePlacementPolicyImpl63);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test65");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy6 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray7 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet8 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet8, bookieIdArray7);
        rackawareEnsemblePlacementPolicy6.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet8);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy11 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet13 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet13, bookieIdArray12);
        rackawareEnsemblePlacementPolicy11.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        rackawareEnsemblePlacementPolicy6.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet13);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy17 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray18 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet19 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet19, bookieIdArray18);
        rackawareEnsemblePlacementPolicy17.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet19);
        java.lang.String str22 = rackawareEnsemblePlacementPolicy17.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray26 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet27 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, bookieIdArray26);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray29 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList30 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList30, bookieIdArray29);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult32 = rackawareEnsemblePlacementPolicy17.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet27, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30);
        rackawareEnsemblePlacementPolicy6.onBookieRackChange((java.util.List) bookieIdList30);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray34 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList35 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList35, bookieIdArray34);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy37 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray38 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet39 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet39, bookieIdArray38);
        rackawareEnsemblePlacementPolicy37.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet39);
        java.lang.String str42 = rackawareEnsemblePlacementPolicy37.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray46 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet47 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet47, bookieIdArray46);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray49 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList50 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList50, bookieIdArray49);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult52 = rackawareEnsemblePlacementPolicy37.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet47, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList50);
        int int53 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList50);
        int int54 = org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy.differBetweenBookies((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList30, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence57 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList35, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray7);
        org.junit.Assert.assertArrayEquals(bookieIdArray7, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdArray18);
        org.junit.Assert.assertArrayEquals(bookieIdArray18, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/default-rack" + "'", str22, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray26);
        org.junit.Assert.assertArrayEquals(bookieIdArray26, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookieIdArray29);
        org.junit.Assert.assertArrayEquals(bookieIdArray29, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult32);
        org.junit.Assert.assertNotNull(bookieIdArray34);
        org.junit.Assert.assertArrayEquals(bookieIdArray34, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookieIdArray38);
        org.junit.Assert.assertArrayEquals(bookieIdArray38, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/default-rack" + "'", str42, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray46);
        org.junit.Assert.assertArrayEquals(bookieIdArray46, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookieIdArray49);
        org.junit.Assert.assertArrayEquals(bookieIdArray49, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence57 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence57.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRackarareEPPTest0.test66");
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy0 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray1 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet2 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet2, bookieIdArray1);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet2);
        java.lang.String str5 = rackawareEnsemblePlacementPolicy0.getDefaultRack();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray9 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet10 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, bookieIdArray9);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray12 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList13 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList13, bookieIdArray12);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementResult<java.util.List<org.apache.bookkeeper.net.BookieId>> bookieIdListPlacementResult15 = rackawareEnsemblePlacementPolicy0.replaceToAdherePlacementPolicy((int) (byte) 0, 0, (int) (short) 10, (java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet10, (java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList13);
        org.apache.bookkeeper.net.BookieId[] bookieIdArray16 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.ArrayList<org.apache.bookkeeper.net.BookieId> bookieIdList17 = new java.util.ArrayList<org.apache.bookkeeper.net.BookieId>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdList17, bookieIdArray16);
        org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence placementPolicyAdherence21 = rackawareEnsemblePlacementPolicy0.isEnsembleAdheringToPlacementPolicy((java.util.List<org.apache.bookkeeper.net.BookieId>) bookieIdList17, (int) (short) 0, (int) (byte) 100);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy22 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray23 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet24 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet24, bookieIdArray23);
        rackawareEnsemblePlacementPolicy22.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet24);
        org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy rackawareEnsemblePlacementPolicy27 = new org.apache.bookkeeper.client.RackawareEnsemblePlacementPolicy();
        org.apache.bookkeeper.net.BookieId[] bookieIdArray28 = new org.apache.bookkeeper.net.BookieId[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId> bookieIdSet29 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.BookieId>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.BookieId>) bookieIdSet29, bookieIdArray28);
        rackawareEnsemblePlacementPolicy27.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        rackawareEnsemblePlacementPolicy22.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        rackawareEnsemblePlacementPolicy0.handleBookiesThatLeft((java.util.Set<org.apache.bookkeeper.net.BookieId>) bookieIdSet29);
        java.lang.String[] strArray38 = new java.lang.String[] { "/default-rack", "hi!", "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.apache.bookkeeper.net.Node[] nodeArray41 = new org.apache.bookkeeper.net.Node[] {};
        java.util.LinkedHashSet<org.apache.bookkeeper.net.Node> nodeSet42 = new java.util.LinkedHashSet<org.apache.bookkeeper.net.Node>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.apache.bookkeeper.net.Node>) nodeSet42, nodeArray41);
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Predicate<org.apache.bookkeeper.net.BookieNode> bookieNodePredicate44 = null;
        org.apache.bookkeeper.client.ITopologyAwareEnsemblePlacementPolicy.Ensemble<org.apache.bookkeeper.net.BookieNode> bookieNodeEnsemble45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.net.BookieNode bookieNode47 = rackawareEnsemblePlacementPolicy0.selectFromNetworkLocation((java.util.Set<java.lang.String>) strSet39, (java.util.Set<org.apache.bookkeeper.net.Node>) nodeSet42, bookieNodePredicate44, bookieNodeEnsemble45, false);
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException; message: Not enough non-faulty bookies available");
        } catch (org.apache.bookkeeper.client.BKException.BKNotEnoughBookiesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookieIdArray1);
        org.junit.Assert.assertArrayEquals(bookieIdArray1, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/default-rack" + "'", str5, "/default-rack");
        org.junit.Assert.assertNotNull(bookieIdArray9);
        org.junit.Assert.assertArrayEquals(bookieIdArray9, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookieIdArray12);
        org.junit.Assert.assertArrayEquals(bookieIdArray12, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookieIdListPlacementResult15);
        org.junit.Assert.assertNotNull(bookieIdArray16);
        org.junit.Assert.assertArrayEquals(bookieIdArray16, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + placementPolicyAdherence21 + "' != '" + org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL + "'", placementPolicyAdherence21.equals(org.apache.bookkeeper.client.EnsemblePlacementPolicy.PlacementPolicyAdherence.FAIL));
        org.junit.Assert.assertNotNull(bookieIdArray23);
        org.junit.Assert.assertArrayEquals(bookieIdArray23, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookieIdArray28);
        org.junit.Assert.assertArrayEquals(bookieIdArray28, new org.apache.bookkeeper.net.BookieId[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "/default-rack", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertArrayEquals(nodeArray41, new org.apache.bookkeeper.net.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }
}

