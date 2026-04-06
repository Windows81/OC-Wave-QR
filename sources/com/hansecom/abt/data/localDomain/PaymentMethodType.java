package com.hansecom.abt.data.localDomain;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum PaymentMethodType {
    CREDIT_CARD,
    CASH,
    GOOGLE_PAY,
    FARE_MEDIA;

    static {
        PaymentMethodType[] d2;
        E = EnumEntriesKt.a(d2);
    }

    public static EnumEntries f() {
        return E;
    }
}
