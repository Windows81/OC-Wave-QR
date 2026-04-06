package com.hansecom.abt.presentation.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.b;
import w.c;

@Metadata
public final class NavigationBarsStateKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f34212a = CompositionLocalKt.h((SnapshotMutationPolicy) null, new b(), 1, (Object) null);

    public static final MutableState c() {
        throw new IllegalStateException("No NavigationBarsState provided");
    }

    public static final ProvidableCompositionLocal d() {
        return f34212a;
    }

    public static final MutableState e(Composer composer, int i2) {
        composer.X(1361416708);
        if (ComposerKt.P()) {
            ComposerKt.Y(1361416708, i2, -1, "com.hansecom.abt.presentation.navigation.rememberNavigationBarsState (NavigationBarsState.kt:21)");
        }
        Object[] objArr = new Object[0];
        composer.X(174405145);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new c();
            composer.N(g2);
        }
        composer.M();
        MutableState mutableState = (MutableState) RememberSaveableKt.j(objArr, (Function0) g2, composer, 48);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return mutableState;
    }

    public static final MutableState f() {
        return SnapshotStateKt__SnapshotStateKt.e(new NavigationBarsState(false, true, (String) null, 4, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
