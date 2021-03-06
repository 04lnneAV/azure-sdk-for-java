/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Linked service debug resource.
 */
public class LinkedServiceDebugResource extends SubResourceDebugResource {
    /**
     * Properties of linked service.
     */
    @JsonProperty(value = "properties", required = true)
    private LinkedServiceInner properties;

    /**
     * Get properties of linked service.
     *
     * @return the properties value
     */
    public LinkedServiceInner properties() {
        return this.properties;
    }

    /**
     * Set properties of linked service.
     *
     * @param properties the properties value to set
     * @return the LinkedServiceDebugResource object itself.
     */
    public LinkedServiceDebugResource withProperties(LinkedServiceInner properties) {
        this.properties = properties;
        return this;
    }

}
