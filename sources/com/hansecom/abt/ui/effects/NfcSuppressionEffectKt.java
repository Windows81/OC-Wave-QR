package com.hansecom.abt.ui.effects;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.InspectionModeKt;
import com.hansecom.abt.presentation.nfc.NfcHelper;
import com.hansecom.abt.presentation.nfc.NfcHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z.d;
import z.e;
import z.f;

@Metadata
public final class NfcSuppressionEffectKt {
    public static final void d(Composer composer, int i2) {
        Composer q2 = composer.q(-2052774282);
        if (i2 != 0 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-2052774282, i2, -1, "com.hansecom.abt.ui.effects.NfcSuppressionEffect (NfcSuppressionEffect.kt:8)");
            }
            if (((Boolean) q2.C(InspectionModeKt.a())).booleanValue()) {
                if (ComposerKt.P()) {
                    ComposerKt.X();
                }
                ScopeUpdateScope x2 = q2.x();
                if (x2 != null) {
                    x2.a(new d(i2));
                    return;
                }
                return;
            }
            NfcHelper nfcHelper = (NfcHelper) q2.C(NfcHelperKt.c());
            Unit unit = Unit.f40552a;
            q2.X(775531602);
            boolean l2 = q2.l(nfcHelper);
            Object g2 = q2.g();
            if (l2 || g2 == Composer.f14567a.a()) {
                g2 = new e(nfcHelper);
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
        ScopeUpdateScope x3 = q2.x();
        if (x3 != null) {
            x3.a(new f(i2));
        }
    }

    public static final Unit e(int i2, Composer composer, int i3) {
        d(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final DisposableEffectResult f(NfcHelper nfcHelper, DisposableEffectScope disposableEffectScope) {
        Intrinsics.i(disposableEffectScope, "$this$DisposableEffect");
        nfcHelper.d();
        return new NfcSuppressionEffectKt$NfcSuppressionEffect$lambda$3$lambda$2$$inlined$onDispose$1(nfcHelper);
    }

    public static final Unit g(int i2, Composer composer, int i3) {
        d(composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
