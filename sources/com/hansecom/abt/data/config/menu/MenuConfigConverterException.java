package com.hansecom.abt.data.config.menu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MenuConfigConverterException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuConfigConverterException(Throwable th) {
        super(th);
        Intrinsics.i(th, "throwable");
    }
}
