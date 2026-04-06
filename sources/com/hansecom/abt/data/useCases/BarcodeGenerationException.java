package com.hansecom.abt.data.useCases;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeGenerationException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcodeGenerationException(Exception exc) {
        super("Barcode generation failed", exc);
        Intrinsics.i(exc, "e");
    }
}
