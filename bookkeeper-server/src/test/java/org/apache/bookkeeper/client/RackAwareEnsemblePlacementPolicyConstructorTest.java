package org.apache.bookkeeper.client;

import org.apache.bookkeeper.util.ConstructorSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Collection;

@RunWith(Parameterized.class)
public class RackAwareEnsemblePlacementPolicyConstructorTest {

    private final Boolean scenario;
    private RackawareEnsemblePlacementPolicy policy;

    @Parameters
    public static Collection<Object[]> data() {
        return ConstructorSource.getConstructorConfiguration();
    }

    public RackAwareEnsemblePlacementPolicyConstructorTest(Boolean scenario) {
        this.scenario = scenario;
    }

    @Before
    public void construct() {
        if (scenario != null) {
            policy = new RackawareEnsemblePlacementPolicy(scenario);
        } else {
            policy = new RackawareEnsemblePlacementPolicy();
        }
    }

    @Test
    public void testConstruct() {
        if (scenario != null) {
            Assert.assertEquals(policy.enforceDurability, scenario);
        } else {
            Assert.assertFalse(policy.enforceDurability);
        }
    }

    @After
    public void destroyPolicy() {
        policy.uninitalize();
    }
}
