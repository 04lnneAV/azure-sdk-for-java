/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;


/**
 * The TrainProjectOptionalParameter model.
 */
public class TrainProjectOptionalParameter {
    /**
     * The type of training to use to train the project (default: Regular).
     * Possible values include: 'Regular', 'Advanced'.
     */
    private String trainingType;

    /**
     * The number of hours reserved as budget for training (if applicable).
     */
    private Integer reservedBudgetInHours;

    /**
     * Whether to force train even if dataset and configuration does not change
     * (default: false).
     */
    private Boolean forceTrain;

    /**
     * The email address to send notification to when training finishes
     * (default: null).
     */
    private String notificationEmailAddress;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the trainingType value.
     *
     * @return the trainingType value
     */
    public String trainingType() {
        return this.trainingType;
    }

    /**
     * Set the trainingType value.
     *
     * @param trainingType the trainingType value to set
     * @return the TrainProjectOptionalParameter object itself.
     */
    public TrainProjectOptionalParameter withTrainingType(String trainingType) {
        this.trainingType = trainingType;
        return this;
    }

    /**
     * Get the reservedBudgetInHours value.
     *
     * @return the reservedBudgetInHours value
     */
    public Integer reservedBudgetInHours() {
        return this.reservedBudgetInHours;
    }

    /**
     * Set the reservedBudgetInHours value.
     *
     * @param reservedBudgetInHours the reservedBudgetInHours value to set
     * @return the TrainProjectOptionalParameter object itself.
     */
    public TrainProjectOptionalParameter withReservedBudgetInHours(Integer reservedBudgetInHours) {
        this.reservedBudgetInHours = reservedBudgetInHours;
        return this;
    }

    /**
     * Get the forceTrain value.
     *
     * @return the forceTrain value
     */
    public Boolean forceTrain() {
        return this.forceTrain;
    }

    /**
     * Set the forceTrain value.
     *
     * @param forceTrain the forceTrain value to set
     * @return the TrainProjectOptionalParameter object itself.
     */
    public TrainProjectOptionalParameter withForceTrain(Boolean forceTrain) {
        this.forceTrain = forceTrain;
        return this;
    }

    /**
     * Get the notificationEmailAddress value.
     *
     * @return the notificationEmailAddress value
     */
    public String notificationEmailAddress() {
        return this.notificationEmailAddress;
    }

    /**
     * Set the notificationEmailAddress value.
     *
     * @param notificationEmailAddress the notificationEmailAddress value to set
     * @return the TrainProjectOptionalParameter object itself.
     */
    public TrainProjectOptionalParameter withNotificationEmailAddress(String notificationEmailAddress) {
        this.notificationEmailAddress = notificationEmailAddress;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the TrainProjectOptionalParameter object itself.
     */
    public TrainProjectOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
