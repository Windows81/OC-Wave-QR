package com.lokalise.sdk.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokaliseInitException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LokaliseInitException(String str) {
        super(str);
        Intrinsics.i(str, "msg");
    }
}
