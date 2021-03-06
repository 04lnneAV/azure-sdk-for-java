/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Data Factory nested debug resource.
 */
public class SubResourceDebugResource {
    /**
     * The resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the resource name.
     *
     * @param name the name value to set
     * @return the SubResourceDebugResource object itself.
     */
    public SubResourceDebugResource withName(String name) {
        this.name = name;
        return this;
    }

}
