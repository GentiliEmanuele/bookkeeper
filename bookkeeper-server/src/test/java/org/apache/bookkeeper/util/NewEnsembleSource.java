package org.apache.bookkeeper.util;

import lombok.Builder;
import lombok.Getter;
import org.apache.bookkeeper.client.BKException;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class NewEnsembleSource {
    @Builder
    @Getter
    public static class NewEnsembleParameters {
        OnClusterChangeSource.OnClusterChangesParameters onClusterChangesParameters;
        int ensembleSize;
        int writeQuorumSize;
        int ackQuorumSize;
        Map<String, byte[]> customMetadata;
        List<Integer> excludeBookie;
    }

    public static Collection<Object[]> getNewEnsembleParameters() {
        Collection<Object[]> onClusterChangesParameters = OnClusterChangeSource.getOnClusterChangesParameters();
        List<NewEnsembleParameters> newEnsembleScenarios = getNewEnsembleScenarios();
        List<Object[]> combinedParameters = new ArrayList<>();

        for (Object[] onClusterChangeConf : onClusterChangesParameters) {
            OnClusterChangeSource.OnClusterChangesParameters occParams = (OnClusterChangeSource.OnClusterChangesParameters) onClusterChangeConf[0];
             for (NewEnsembleParameters scenario : newEnsembleScenarios) {
                 NewEnsembleParameters mergedParam = NewEnsembleParameters.builder()
                         .onClusterChangesParameters(occParams)
                         .ensembleSize(scenario.getEnsembleSize())
                         .writeQuorumSize(scenario.getWriteQuorumSize())
                         .ackQuorumSize(scenario.getAckQuorumSize())
                         .customMetadata(scenario.getCustomMetadata())
                         .excludeBookie(scenario.getExcludeBookie())
                         .build();
                 combinedParameters.add(new Object[]{mergedParam});
             }
        }
        return combinedParameters;
    }

    private static List<NewEnsembleParameters> getNewEnsembleScenarios() {
        Map<String, byte[]> validCustomMetadata = new HashMap<>();
        validCustomMetadata.put("ledger.type", "write-ahead-log".getBytes(StandardCharsets.UTF_8));
        return Arrays.asList(
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(validCustomMetadata)
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.singletonList(1))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(2)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(validCustomMetadata)
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.singletonList(1))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(validCustomMetadata)
                        .excludeBookie(Collections.singletonList(1))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Arrays.asList(1, 2))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(2)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(2)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(validCustomMetadata)
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(2)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(Collections.singletonList(2))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(2)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(validCustomMetadata)
                        .excludeBookie(Collections.singletonList(1))
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(null)
                        .excludeBookie(Collections.emptyList())
                        .build(),
                NewEnsembleParameters.builder()
                        .ensembleSize(1)
                        .ackQuorumSize(1)
                        .writeQuorumSize(1)
                        .customMetadata(new HashMap<>())
                        .excludeBookie(null)
                        .build()
        );
    }
}
