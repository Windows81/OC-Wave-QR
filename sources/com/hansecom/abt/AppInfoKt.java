package com.hansecom.abt;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;

@Metadata
public final class AppInfoKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f32874a = CompositionLocalKt.j(new b());

    public static final AppInfo b() {
        throw new IllegalStateException("CompositionLocal AppInfo not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f32874a;
    }
}
