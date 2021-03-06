/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.ServerInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.MySQLManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ServerServer.
 */
public interface ServerServer extends HasInner<ServerInner>, HasManager<MySQLManager> {
    /**
     * @return the administratorLogin value.
     */
    String administratorLogin();

    /**
     * @return the earliestRestoreDate value.
     */
    DateTime earliestRestoreDate();

    /**
     * @return the fullyQualifiedDomainName value.
     */
    String fullyQualifiedDomainName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the masterServerId value.
     */
    String masterServerId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the replicaCapacity value.
     */
    Integer replicaCapacity();

    /**
     * @return the replicationRole value.
     */
    String replicationRole();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the sslEnforcement value.
     */
    SslEnforcementEnum sslEnforcement();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userVisibleState value.
     */
    ServerState userVisibleState();

    /**
     * @return the version value.
     */
    ServerVersion version();

}
