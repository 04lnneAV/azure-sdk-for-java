/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiVersionSetContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.VersioningScheme;

class ApiVersionSetContractImpl extends CreatableUpdatableImpl<ApiVersionSetContract, ApiVersionSetContractInner, ApiVersionSetContractImpl> implements ApiVersionSetContract, ApiVersionSetContract.Definition, ApiVersionSetContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private String versionSetId;
    private String cifMatch;
    private String uifMatch;
    private final ApiManagementManager manager;

    ApiVersionSetContractImpl(String name, ApiManagementManager manager) {
        super(name, new ApiVersionSetContractInner());
        this.manager = manager;
        // Set resource name
        this.versionSetId = name;
        //
    }

    ApiVersionSetContractImpl(ApiVersionSetContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.versionSetId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.versionSetId = IdParsingUtils.getValueFromIdByName(inner.id(), "apiVersionSets");
        // set other parameters for create and update
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiVersionSetContract> createResourceAsync() {
        ApiVersionSetsInner client = this.manager().inner().apiVersionSets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.versionSetId, this.inner(), this.cifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApiVersionSetContract> updateResourceAsync() {
        ApiVersionSetsInner client = this.manager().inner().apiVersionSets();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.versionSetId, this.inner(), this.uifMatch)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApiVersionSetContractInner> getInnerAsync() {
        ApiVersionSetsInner client = this.manager().inner().apiVersionSets();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String versionHeaderName() {
        return this.inner().versionHeaderName();
    }

    @Override
    public VersioningScheme versioningScheme() {
        return this.inner().versioningScheme();
    }

    @Override
    public String versionQueryName() {
        return this.inner().versionQueryName();
    }

    @Override
    public ApiVersionSetContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withVersioningScheme(VersioningScheme versioningScheme) {
        this.inner().withVersioningScheme(versioningScheme);
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withVersionHeaderName(String versionHeaderName) {
        this.inner().withVersionHeaderName(versionHeaderName);
        return this;
    }

    @Override
    public ApiVersionSetContractImpl withVersionQueryName(String versionQueryName) {
        this.inner().withVersionQueryName(versionQueryName);
        return this;
    }

}
