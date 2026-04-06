package com.hansecom.abt.ui.components.snackbar;

import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtSnackbarHostKt {
    public static final void b(AbtSnackbarHostState abtSnackbarHostState, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(abtSnackbarHostState, "hostState");
        Composer q2 = composer.q(-57594753);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(abtSnackbarHostState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-57594753, i4, -1, "com.hansecom.abt.ui.components.snackbar.AbtSnackbarHost (AbtSnackbarHost.kt:11)");
            }
            SnackbarHostKt.f(abtSnackbarHostState.a(), ZIndexModifierKt.a(Modifier.f15489d, 1.0f).o0(modifier), ComposableSingletons$AbtSnackbarHostKt.f38800a.a(), q2, 384, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(abtSnackbarHostState, modifier, i2, i3));
        }
    }

    public static final Unit c(AbtSnackbarHostState abtSnackbarHostState, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(abtSnackbarHostState, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
