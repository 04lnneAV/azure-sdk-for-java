/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain purchase consent object, representing acceptance of applicable legal
 * agreements.
 */
public class DomainPurchaseConsent {
    /**
     * List of applicable legal agreement keys. This list can be retrieved
     * using ListLegalAgreements API under
     * &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     */
    @JsonProperty(value = "agreementKeys")
    private List<String> agreementKeys;

    /**
     * Client IP address.
     */
    @JsonProperty(value = "agreedBy")
    private String agreedBy;

    /**
     * Timestamp when the agreements were accepted.
     */
    @JsonProperty(value = "agreedAt")
    private DateTime agreedAt;

    /**
     * Get list of applicable legal agreement keys. This list can be retrieved using ListLegalAgreements API under &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     *
     * @return the agreementKeys value
     */
    public List<String> agreementKeys() {
        return this.agreementKeys;
    }

    /**
     * Set list of applicable legal agreement keys. This list can be retrieved using ListLegalAgreements API under &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     *
     * @param agreementKeys the agreementKeys value to set
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreementKeys(List<String> agreementKeys) {
        this.agreementKeys = agreementKeys;
        return this;
    }

    /**
     * Get client IP address.
     *
     * @return the agreedBy value
     */
    public String agreedBy() {
        return this.agreedBy;
    }

    /**
     * Set client IP address.
     *
     * @param agreedBy the agreedBy value to set
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreedBy(String agreedBy) {
        this.agreedBy = agreedBy;
        return this;
    }

    /**
     * Get timestamp when the agreements were accepted.
     *
     * @return the agreedAt value
     */
    public DateTime agreedAt() {
        return this.agreedAt;
    }

    /**
     * Set timestamp when the agreements were accepted.
     *
     * @param agreedAt the agreedAt value to set
     * @return the DomainPurchaseConsent object itself.
     */
    public DomainPurchaseConsent withAgreedAt(DateTime agreedAt) {
        this.agreedAt = agreedAt;
        return this;
    }

}
