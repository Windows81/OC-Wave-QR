package com.hansecom.abt.ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class UpIconButtonKt {
    public static final void b(Function0 function0, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Intrinsics.i(function0, "onClick");
        Composer q2 = composer.q(-1909975553);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(function0) ? 4 : 2) | i2;
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
                ComposerKt.Y(-1909975553, i4, -1, "com.hansecom.abt.ui.components.UpIconButton (UpIconButton.kt:15)");
            }
            IconButtonKt.e(function0, SizeKt.b(modifier, Dp.m((float) 48), 0.0f, 2, (Object) null), false, (IconButtonColors) null, (MutableInteractionSource) null, (Shape) null, ComposableSingletons$UpIconButtonKt.f37864a.a(), q2, (i4 & 14) | 1572864, 60);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new f(function0, modifier, i2, i3));
        }
    }

    public static final Unit c(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        b(function0, modifier, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
