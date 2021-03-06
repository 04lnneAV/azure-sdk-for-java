/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ClusterMonitoringResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ClusterMonitoringResponseImpl extends WrapperImpl<ClusterMonitoringResponseInner> implements ClusterMonitoringResponse {
    private final HDInsightManager manager;
    ClusterMonitoringResponseImpl(ClusterMonitoringResponseInner inner, HDInsightManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public Boolean clusterMonitoringEnabled() {
        return this.inner().clusterMonitoringEnabled();
    }

    @Override
    public String workspaceId() {
        return this.inner().workspaceId();
    }

}
