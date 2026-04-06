package com.hansecom.abt.ui.components.snackbar;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum SnackbarType {
    POSITIVE,
    WARNING,
    ERROR,
    INFO,
    NEUTRAL;

    static {
        SnackbarType[] d2;
        F = EnumEntriesKt.a(d2);
    }
}
