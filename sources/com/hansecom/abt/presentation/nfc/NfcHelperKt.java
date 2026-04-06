package com.hansecom.abt.presentation.nfc;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import x.c;

@Metadata
public final class NfcHelperKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f34215a = CompositionLocalKt.j(new c());

    public static final NfcHelper b() {
        throw new IllegalStateException("CompositionLocal NfcHelper not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f34215a;
    }
}
