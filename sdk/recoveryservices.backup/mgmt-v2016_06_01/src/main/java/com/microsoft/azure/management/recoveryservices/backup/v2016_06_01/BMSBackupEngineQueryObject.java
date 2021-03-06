/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The query parameters used to GET the list of backup engines.
 */
public class BMSBackupEngineQueryObject {
    /**
     * The backup management type associated with the backup engine. Possible
     * values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM',
     * 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Get the backup management type associated with the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup management type associated with the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSBackupEngineQueryObject object itself.
     */
    public BMSBackupEngineQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

}
