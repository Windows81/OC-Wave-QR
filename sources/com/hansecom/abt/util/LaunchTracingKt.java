package com.hansecom.abt.util;

import android.app.Activity;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.firebase.perf.application.FrameMetricsRecorder;
import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LaunchTracingKt {
    public static final void c(String str, Composer composer, int i2) {
        int i3;
        Intrinsics.i(str, "route");
        Composer q2 = composer.q(-216884941);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-216884941, i3, -1, "com.hansecom.abt.util.LaunchTracing (LaunchTracing.kt:12)");
            }
            Activity activity = (Activity) q2.C(LocalActivityKt.a());
            if (activity != null) {
                q2.X(-39810157);
                int i4 = i3 & 14;
                boolean l2 = (i4 == 4) | q2.l(activity);
                Object g2 = q2.g();
                if (l2 || g2 == Composer.f14567a.a()) {
                    g2 = new f(str, activity);
                    q2.N(g2);
                }
                q2.M();
                EffectsKt.c(str, (Function1) g2, q2, i4);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new g(str, i2));
        }
    }

    public static final DisposableEffectResult d(String str, Activity activity, DisposableEffectScope disposableEffectScope) {
        Intrinsics.i(disposableEffectScope, "$this$DisposableEffect");
        Trace c2 = Trace.c("_st_" + str);
        c2.start();
        Intrinsics.h(c2, "apply(...)");
        FrameMetricsRecorder frameMetricsRecorder = new FrameMetricsRecorder(activity);
        frameMetricsRecorder.c();
        return new LaunchTracingKt$LaunchTracing$lambda$5$lambda$4$$inlined$onDispose$1(frameMetricsRecorder, c2);
    }

    public static final Unit e(String str, int i2, Composer composer, int i3) {
        c(str, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
