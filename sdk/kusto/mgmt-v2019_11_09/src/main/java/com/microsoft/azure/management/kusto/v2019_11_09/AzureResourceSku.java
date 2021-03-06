/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.AzureResourceSkuInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_11_09.implementation.KustoManager;

/**
 * Type representing AzureResourceSku.
 */
public interface AzureResourceSku extends HasInner<AzureResourceSkuInner>, HasManager<KustoManager> {
    /**
     * @return the capacity value.
     */
    AzureCapacity capacity();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the sku value.
     */
    AzureSku sku();

}
