package com.hansecom.abt.ui.components.listItem;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OptionItemKt {
    public static final void b(String str, Function0 function0, Modifier modifier, boolean z2, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(str, "text");
        Intrinsics.i(function0, "onClick");
        Composer q2 = composer.q(1514242511);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.W(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.l(function0) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.W(modifier) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= q2.d(z2) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !q2.t()) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(1514242511, i4, -1, "com.hansecom.abt.ui.components.listItem.OptionItem (OptionItem.kt:25)");
            }
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(AbtTheme.f38851a.c(q2, 6).b(q2, 0))), ComposableLambdaKt.e(33199375, true, new OptionItemKt$OptionItem$1(modifier, function0, z2, str), q2, 54), q2, ProvidedValue.f14769i | 48);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        boolean z3 = z2;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new y(str, function0, modifier2, z3, i2, i3));
        }
    }

    public static final Unit c(String str, Function0 function0, Modifier modifier, boolean z2, int i2, int i3, Composer composer, int i4) {
        b(str, function0, modifier, z2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
