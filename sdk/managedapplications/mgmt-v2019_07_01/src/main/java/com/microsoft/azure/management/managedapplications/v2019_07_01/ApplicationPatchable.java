/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about managed application.
 */
@JsonFlatten
public class ApplicationPatchable extends GenericResource {
    /**
     * The managed resource group Id.
     */
    @JsonProperty(value = "properties.managedResourceGroupId")
    private String managedResourceGroupId;

    /**
     * The fully qualified path of managed application definition Id.
     */
    @JsonProperty(value = "properties.applicationDefinitionId")
    private String applicationDefinitionId;

    /**
     * Name and value pairs that define the managed application parameters. It
     * can be a JObject or a well formed JSON string.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * Name and value pairs that define the managed application outputs.
     */
    @JsonProperty(value = "properties.outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * The managed application provisioning state. Possible values include:
     * 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created',
     * 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The plan information.
     */
    @JsonProperty(value = "plan")
    private PlanPatchable plan;

    /**
     * The kind of the managed application. Allowed values are MarketPlace and
     * ServiceCatalog.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the managed resource group Id.
     *
     * @return the managedResourceGroupId value
     */
    public String managedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * Set the managed resource group Id.
     *
     * @param managedResourceGroupId the managedResourceGroupId value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withManagedResourceGroupId(String managedResourceGroupId) {
        this.managedResourceGroupId = managedResourceGroupId;
        return this;
    }

    /**
     * Get the fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value
     */
    public String applicationDefinitionId() {
        return this.applicationDefinitionId;
    }

    /**
     * Set the fully qualified path of managed application definition Id.
     *
     * @param applicationDefinitionId the applicationDefinitionId value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withApplicationDefinitionId(String applicationDefinitionId) {
        this.applicationDefinitionId = applicationDefinitionId;
        return this;
    }

    /**
     * Get name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     *
     * @param parameters the parameters value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get name and value pairs that define the managed application outputs.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get the managed application provisioning state. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the plan information.
     *
     * @return the plan value
     */
    public PlanPatchable plan() {
        return this.plan;
    }

    /**
     * Set the plan information.
     *
     * @param plan the plan value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withPlan(PlanPatchable plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @param kind the kind value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the ApplicationPatchable object itself.
     */
    public ApplicationPatchable withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}
