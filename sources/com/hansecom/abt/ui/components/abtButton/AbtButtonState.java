package com.hansecom.abt.ui.components.abtButton;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AbtButtonState {
    Enabled,
    Loading,
    Disabled;

    static {
        AbtButtonState[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
