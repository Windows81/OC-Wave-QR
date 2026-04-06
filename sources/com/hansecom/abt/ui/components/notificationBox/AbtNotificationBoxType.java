package com.hansecom.abt.ui.components.notificationBox;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum AbtNotificationBoxType {
    POSITIVE,
    WARNING,
    ERROR,
    INFO;

    static {
        AbtNotificationBoxType[] d2;
        E = EnumEntriesKt.a(d2);
    }

    public static EnumEntries f() {
        return E;
    }
}
