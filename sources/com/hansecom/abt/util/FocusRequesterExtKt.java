package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FocusRequesterExtKt {
    public static final void b(FocusRequester focusRequester, Composer composer, int i2) {
        int i3;
        Intrinsics.i(focusRequester, "<this>");
        Composer q2 = composer.q(806039226);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(focusRequester) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(806039226, i3, -1, "com.hansecom.abt.util.FocusRequestOnLaunch (FocusRequesterExt.kt:8)");
            }
            q2.X(1347840395);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object g2 = q2.g();
            if (z2 || g2 == Composer.f14567a.a()) {
                g2 = new FocusRequesterExtKt$FocusRequestOnLaunch$1$1(focusRequester, (Continuation) null);
                q2.N(g2);
            }
            q2.M();
            EffectsKt.g(focusRequester, (Function2) g2, q2, i4);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new d(focusRequester, i2));
        }
    }

    public static final Unit c(FocusRequester focusRequester, int i2, Composer composer, int i3) {
        b(focusRequester, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final FocusRequester d(boolean z2, Composer composer, int i2, int i3) {
        composer.X(1064507934);
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if (ComposerKt.P()) {
            ComposerKt.Y(1064507934, i2, -1, "com.hansecom.abt.util.rememberFocusRequester (FocusRequesterExt.kt:16)");
        }
        composer.X(1212528440);
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new FocusRequester();
            composer.N(g2);
        }
        FocusRequester focusRequester = (FocusRequester) g2;
        composer.M();
        composer.X(1212529895);
        if (z2) {
            b(focusRequester, composer, 0);
        }
        composer.M();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return focusRequester;
    }
}
