/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An update request for an Azure SQL Database managed instance.
 */
@JsonFlatten
public class ManagedInstanceUpdate {
    /**
     * Managed instance sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The fully qualified domain name of the managed instance.
     */
    @JsonProperty(value = "properties.fullyQualifiedDomainName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullyQualifiedDomainName;

    /**
     * Administrator username for the managed instance. Can only be specified
     * when the managed instance is being created (and is required for
     * creation).
     */
    @JsonProperty(value = "properties.administratorLogin")
    private String administratorLogin;

    /**
     * The administrator login password (required for managed instance
     * creation).
     */
    @JsonProperty(value = "properties.administratorLoginPassword")
    private String administratorLoginPassword;

    /**
     * Subnet resource ID for the managed instance.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /**
     * The state of the managed instance.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * The license type. Possible values are 'LicenseIncluded' and 'BasePrice'.
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /**
     * The number of VCores.
     */
    @JsonProperty(value = "properties.vCores")
    private Integer vCores;

    /**
     * The maximum storage size in GB.
     */
    @JsonProperty(value = "properties.storageSizeInGB")
    private Integer storageSizeInGB;

    /**
     * Collation of the managed instance.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * The Dns Zone that the managed instance is in.
     */
    @JsonProperty(value = "properties.dnsZone", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsZone;

    /**
     * The resource id of another managed instance whose DNS zone this managed
     * instance will share after creation.
     */
    @JsonProperty(value = "properties.dnsZonePartner")
    private String dnsZonePartner;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get managed instance sku.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set managed instance sku.
     *
     * @param sku the sku value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the fully qualified domain name of the managed instance.
     *
     * @return the fullyQualifiedDomainName value
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * Get administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set administrator username for the managed instance. Can only be specified when the managed instance is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administrator login password (required for managed instance creation).
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administrator login password (required for managed instance creation).
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get subnet resource ID for the managed instance.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set subnet resource ID for the managed instance.
     *
     * @param subnetId the subnetId value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the state of the managed instance.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the license type. Possible values are 'LicenseIncluded' and 'BasePrice'.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the license type. Possible values are 'LicenseIncluded' and 'BasePrice'.
     *
     * @param licenseType the licenseType value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the number of VCores.
     *
     * @return the vCores value
     */
    public Integer vCores() {
        return this.vCores;
    }

    /**
     * Set the number of VCores.
     *
     * @param vCores the vCores value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withVCores(Integer vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the maximum storage size in GB.
     *
     * @return the storageSizeInGB value
     */
    public Integer storageSizeInGB() {
        return this.storageSizeInGB;
    }

    /**
     * Set the maximum storage size in GB.
     *
     * @param storageSizeInGB the storageSizeInGB value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withStorageSizeInGB(Integer storageSizeInGB) {
        this.storageSizeInGB = storageSizeInGB;
        return this;
    }

    /**
     * Get collation of the managed instance.
     *
     * @return the collation value
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set collation of the managed instance.
     *
     * @param collation the collation value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the Dns Zone that the managed instance is in.
     *
     * @return the dnsZone value
     */
    public String dnsZone() {
        return this.dnsZone;
    }

    /**
     * Get the resource id of another managed instance whose DNS zone this managed instance will share after creation.
     *
     * @return the dnsZonePartner value
     */
    public String dnsZonePartner() {
        return this.dnsZonePartner;
    }

    /**
     * Set the resource id of another managed instance whose DNS zone this managed instance will share after creation.
     *
     * @param dnsZonePartner the dnsZonePartner value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withDnsZonePartner(String dnsZonePartner) {
        this.dnsZonePartner = dnsZonePartner;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the ManagedInstanceUpdate object itself.
     */
    public ManagedInstanceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
