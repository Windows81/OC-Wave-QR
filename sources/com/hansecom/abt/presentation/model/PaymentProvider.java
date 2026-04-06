package com.hansecom.abt.presentation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum PaymentProvider {
    NMI,
    CYBERSOURCE;

    static {
        PaymentProvider[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
