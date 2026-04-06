package com.hansecom.abt;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata
public final class AppFeaturesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f32869a = CompositionLocalKt.j(new a());

    public static final AppFeatures b() {
        throw new IllegalStateException("CompositionLocal AppFeatures not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f32869a;
    }
}
