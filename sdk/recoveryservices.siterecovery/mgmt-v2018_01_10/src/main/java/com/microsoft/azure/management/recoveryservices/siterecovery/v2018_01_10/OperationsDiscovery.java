/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.OperationsDiscoveryInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing OperationsDiscovery.
 */
public interface OperationsDiscovery extends HasInner<OperationsDiscoveryInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the display value.
     */
    Display display();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the origin value.
     */
    String origin();

    /**
     * @return the properties value.
     */
    Object properties();

}
