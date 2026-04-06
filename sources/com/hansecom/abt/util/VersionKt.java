package com.hansecom.abt.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VersionKt {
    public static final Version a(String str) {
        Intrinsics.i(str, "<this>");
        return new Version(str);
    }
}
