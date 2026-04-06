package com.hansecom.abt.ui.effects;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z.g;
import z.h;
import z.i;
import z.j;

@Metadata
public final class StatusBarColorEffectKt {
    public static final void e(boolean z2, Composer composer, int i2) {
        int i3;
        Window window;
        Composer q2 = composer.q(-1251097380);
        if ((i2 & 6) == 0) {
            i3 = (q2.d(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1251097380, i3, -1, "com.hansecom.abt.ui.effects.StatusBarColorEffect (StatusBarColorEffect.kt:10)");
            }
            if (((Boolean) q2.C(InspectionModeKt.a())).booleanValue()) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new g(z2, i2));
                    return;
                }
                return;
            }
            View view = (View) q2.C(AndroidCompositionLocals_androidKt.j());
            Context context = view.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x3 = q2.x();
                if (x3 != null) {
                    x3.a(new h(z2, i2));
                    return;
                }
                return;
            }
            Unit unit = Unit.f40552a;
            q2.X(1439149626);
            boolean l2 = ((i3 & 14) == 4) | q2.l(window) | q2.l(view);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new i(window, view, z2);
                q2.N(g2);
            }
            q2.M();
            EffectsKt.c(unit, (Function1) g2, q2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x4 = q2.x();
        if (x4 != null) {
            x4.a(new j(z2, i2));
        }
    }

    public static final Unit f(boolean z2, int i2, Composer composer, int i3) {
        e(z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit g(boolean z2, int i2, Composer composer, int i3) {
        e(z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final DisposableEffectResult h(Window window, View view, boolean z2, DisposableEffectScope disposableEffectScope) {
        Intrinsics.i(disposableEffectScope, "$this$DisposableEffect");
        WindowInsetsControllerCompat a2 = WindowCompat.a(window, view);
        Intrinsics.h(a2, "getInsetsController(...)");
        boolean a3 = a2.a();
        a2.c(z2);
        return new StatusBarColorEffectKt$StatusBarColorEffect$lambda$4$lambda$3$$inlined$onDispose$1(a2, a3);
    }

    public static final Unit i(boolean z2, int i2, Composer composer, int i3) {
        e(z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
