package com.hansecom.abt.data.localDomain;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum VirtualCardType {
    UNAVAILABLE,
    BARCODE,
    WALLET;

    static {
        VirtualCardType[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
