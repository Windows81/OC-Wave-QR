package com.chuckerteam.chucker.api;

import kotlin.Metadata;

@Metadata
public final class RetentionManager {

    @Metadata
    public enum Period {
        ONE_HOUR,
        ONE_DAY,
        ONE_WEEK,
        FOREVER
    }
}
