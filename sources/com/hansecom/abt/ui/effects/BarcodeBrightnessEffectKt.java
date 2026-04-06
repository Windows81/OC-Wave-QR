package com.hansecom.abt.ui.effects;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z.a;
import z.b;
import z.c;

@Metadata
public final class BarcodeBrightnessEffectKt {
    public static final void d(Composer composer, int i2) {
        Composer q2 = composer.q(1694840970);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1694840970, i2, -1, "com.hansecom.abt.ui.effects.BarcodeBrightnessEffect (BarcodeBrightnessEffect.kt:13)");
            }
            if (((Boolean) q2.C(InspectionModeKt.a())).booleanValue()) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new a(i2));
                    return;
                }
                return;
            }
            Activity activity = (Activity) q2.C(LocalActivityKt.a());
            q2.X(-245745913);
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                q2.N(g2);
            }
            MutableState mutableState = (MutableState) g2;
            q2.M();
            Unit unit = Unit.f40552a;
            q2.X(-245743022);
            boolean l2 = q2.l(activity);
            Object g3 = q2.g();
            if (l2 || g3 == companion.a()) {
                g3 = new b(activity, mutableState);
                q2.N(g3);
            }
            q2.M();
            EffectsKt.c(unit, (Function1) g3, q2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x3 = q2.x();
        if (x3 != null) {
            x3.a(new c(i2));
        }
    }

    public static final Unit e(int i2, Composer composer, int i3) {
        d(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Float f(MutableState mutableState) {
        return (Float) mutableState.getValue();
    }

    public static final void g(MutableState mutableState, Float f2) {
        mutableState.setValue(f2);
    }

    public static final DisposableEffectResult h(Activity activity, MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.i(disposableEffectScope, "$this$DisposableEffect");
        WindowManager.LayoutParams layoutParams = null;
        Window window = activity != null ? activity.getWindow() : null;
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            g(mutableState, Float.valueOf(layoutParams.screenBrightness));
            layoutParams.screenBrightness = 1.0f;
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.addFlags(8320);
        }
        return new BarcodeBrightnessEffectKt$BarcodeBrightnessEffect$lambda$6$lambda$5$$inlined$onDispose$1(layoutParams, window, mutableState);
    }

    public static final Unit i(int i2, Composer composer, int i3) {
        d(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
