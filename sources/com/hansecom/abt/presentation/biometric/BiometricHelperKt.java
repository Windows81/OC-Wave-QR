package com.hansecom.abt.presentation.biometric;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import v.b;

@Metadata
public final class BiometricHelperKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f34160a = CompositionLocalKt.j(new b());

    public static final BiometricHelper b() {
        throw new IllegalStateException("CompositionLocal BiometricHelper not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f34160a;
    }
}
