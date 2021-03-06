/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DeinterlaceParity.
 */
public final class DeinterlaceParity extends ExpandableStringEnum<DeinterlaceParity> {
    /** Static value Auto for DeinterlaceParity. */
    public static final DeinterlaceParity AUTO = fromString("Auto");

    /** Static value TopFieldFirst for DeinterlaceParity. */
    public static final DeinterlaceParity TOP_FIELD_FIRST = fromString("TopFieldFirst");

    /** Static value BottomFieldFirst for DeinterlaceParity. */
    public static final DeinterlaceParity BOTTOM_FIELD_FIRST = fromString("BottomFieldFirst");

    /**
     * Creates or finds a DeinterlaceParity from its string representation.
     * @param name a name to look for
     * @return the corresponding DeinterlaceParity
     */
    @JsonCreator
    public static DeinterlaceParity fromString(String name) {
        return fromString(name, DeinterlaceParity.class);
    }

    /**
     * @return known DeinterlaceParity values
     */
    public static Collection<DeinterlaceParity> values() {
        return values(DeinterlaceParity.class);
    }
}
