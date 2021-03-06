/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the IP tag associated with the public IP address.
 */
public class VirtualMachineScaleSetIpTag {
    /**
     * IP tag type. Example: FirstPartyUsage.
     */
    @JsonProperty(value = "ipTagType")
    private String ipTagType;

    /**
     * IP tag associated with the public IP. Example: SQL, Storage etc.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get iP tag type. Example: FirstPartyUsage.
     *
     * @return the ipTagType value
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set iP tag type. Example: FirstPartyUsage.
     *
     * @param ipTagType the ipTagType value to set
     * @return the VirtualMachineScaleSetIpTag object itself.
     */
    public VirtualMachineScaleSetIpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get iP tag associated with the public IP. Example: SQL, Storage etc.
     *
     * @return the tag value
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set iP tag associated with the public IP. Example: SQL, Storage etc.
     *
     * @param tag the tag value to set
     * @return the VirtualMachineScaleSetIpTag object itself.
     */
    public VirtualMachineScaleSetIpTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

}
