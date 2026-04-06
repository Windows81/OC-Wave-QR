package com.lokalise.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResourceNameKt {
    public static final String toResName(String str) {
        Intrinsics.i(str, "<this>");
        return ResourceName.m32constructorimpl(str);
    }
}
