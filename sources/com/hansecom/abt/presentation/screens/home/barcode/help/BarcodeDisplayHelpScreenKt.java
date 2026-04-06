package com.hansecom.abt.presentation.screens.home.barcode.help;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BarcodeDisplayHelpScreenKt {
    public static final void c(Function0 function0, Composer composer, int i2) {
        int i3;
        Intrinsics.i(function0, "onUpClick");
        Composer q2 = composer.q(830192945);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(830192945, i3, -1, "com.hansecom.abt.presentation.screens.home.barcode.help.BarcodeDisplayHelpScreen (BarcodeDisplayHelpScreen.kt:33)");
            }
            e(function0, q2, i3 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(function0, i2));
        }
    }

    public static final Unit d(Function0 function0, int i2, Composer composer, int i3) {
        c(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void e(Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Function0 function02 = function0;
        int i4 = i2;
        Composer q2 = composer.q(-1744761330);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function02) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1744761330, i3, -1, "com.hansecom.abt.presentation.screens.home.barcode.help.ScreenImpl (BarcodeDisplayHelpScreen.kt:42)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            long x2 = abtTheme.b(q2, 6).x();
            long o2 = abtTheme.b(q2, 6).o();
            composer2 = q2;
            ScaffoldKt.f((Modifier) null, ComposableLambdaKt.e(-368128566, true, new BarcodeDisplayHelpScreenKt$ScreenImpl$1(function02), q2, 54), (Function2) null, (Function2) null, (Function2) null, 0, x2, o2, (WindowInsets) null, ComposableSingletons$BarcodeDisplayHelpScreenKt.f35866a.a(), q2, 805306416, 317);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x3 = composer2.x();
        if (x3 != null) {
            x3.a(new b(function02, i4));
        }
    }

    public static final Unit f(Function0 function0, int i2, Composer composer, int i3) {
        e(function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
