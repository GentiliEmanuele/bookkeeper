package org.apache.bookkeeper.util;

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
        Collection<Object[]> initConfigs = InitializeSource.getParametersConfiguration();
        List<OnClusterChangesParameters> changeScenarios = getClusterChangeScenarios();
        List<Object[]> combinedParameters = new ArrayList<>();

        for (Object[] initConfigWrapper : initConfigs) {
            InitializeSource.InitializeParameters initParams = (InitializeSource.InitializeParameters) initConfigWrapper[0];
            if (initParams.getExpectedException() != null || initParams.stabilizePeriodSeconds > 0) continue;

            for (OnClusterChangesParameters scenario : changeScenarios) {
                OnClusterChangesParameters mergedParam = OnClusterChangesParameters.builder()
                        .initializeParameters(initParams)
                        .startWritableBookies(scenario.getStartWritableBookies())
                        .startReadOnlyBookies(scenario.getStartReadOnlyBookies())
                        .endWritableBookies(scenario.getEndWritableBookies())
                        .endReadOnlyBookies(scenario.getEndReadOnlyBookies())
                        .expectedDeadBookies(scenario.getExpectedDeadBookies())
                        .expectedException(scenario.getExpectedException() != null ?
                                scenario.getExpectedException() : initParams.getExpectedException())
                        .build();
                combinedParameters.add(new Object[]{mergedParam});
            }
        }
        return combinedParameters;
    }

    private static List<OnClusterChangesParameters> getClusterChangeScenarios() {
        return Arrays.asList(
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Collections.singletonList(1))
                        .startReadOnlyBookies(Collections.singletonList(1))
                        .endWritableBookies(Collections.emptyList())
                        .endReadOnlyBookies(Collections.singletonList(1))
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Collections.singletonList(1))
                        .startReadOnlyBookies(Collections.singletonList(1))
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Collections.emptyList())
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Collections.singletonList(1))
                        .startReadOnlyBookies(Collections.singletonList(1))
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Collections.singletonList(1))
                        .expectedDeadBookies(Collections.emptyList())
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Collections.singletonList(1))
                        .startReadOnlyBookies(Collections.emptyList())
                        .endWritableBookies(Collections.emptyList())
                        .endReadOnlyBookies(Collections.emptyList())
                        .expectedDeadBookies(Collections.singletonList(1))
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Arrays.asList(1, 2))
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Arrays.asList(1, 2))
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Arrays.asList(1, 2))
                        .endWritableBookies(Arrays.asList(1, 2))
                        .endReadOnlyBookies(Collections.singletonList(2))
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Collections.singletonList(3))
                        .endWritableBookies(Arrays.asList(1, 2))
                        .endReadOnlyBookies(Collections.emptyList())
                        .expectedDeadBookies(Collections.emptyList())
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Collections.singletonList(3))
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Collections.singletonList(3))
                        .expectedDeadBookies(Collections.singletonList(2))
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Collections.singletonList(2))
                        .endWritableBookies(Arrays.asList(1, 2))
                        .endReadOnlyBookies(Collections.emptyList())
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Collections.singletonList(2))
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Collections.singletonList(2))
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Arrays.asList(1, 2))
                        .startReadOnlyBookies(Collections.emptyList())
                        .endWritableBookies(Collections.singletonList(1))
                        .endReadOnlyBookies(Collections.singletonList(2))
                        .expectedDeadBookies(Collections.emptyList())
                        .expectedException(null)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(null)
                        .startReadOnlyBookies(Collections.singletonList(2))
                        .endWritableBookies(null)
                        .endReadOnlyBookies(Collections.singletonList(2))
                        .expectedException(NullPointerException.class)
                        .build(),
                OnClusterChangesParameters.builder()
                        .startWritableBookies(Collections.singletonList(2))
                        .startReadOnlyBookies(null)
                        .endWritableBookies(Collections.singletonList(2))
                        .endReadOnlyBookies(null)
                        .expectedException(NullPointerException.class)
                        .build()
        );
    }


}
