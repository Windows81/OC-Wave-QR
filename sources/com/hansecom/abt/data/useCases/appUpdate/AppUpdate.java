package com.hansecom.abt.data.useCases.appUpdate;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AppUpdate {
    SOFT,
    HARD,
    NONE;

    static {
        AppUpdate[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
