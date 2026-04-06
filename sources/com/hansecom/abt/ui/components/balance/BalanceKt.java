package com.hansecom.abt.ui.components.balance;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.components.AbtTextKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BalanceKt {
    public static final void b(Modifier modifier, String str, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Composer composer2;
        String str2 = str;
        Intrinsics.i(str2, "label");
        Composer q2 = composer.q(513521448);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = i2 | (q2.W(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(str2) ? 32 : 16;
        }
        if ((i4 & 19) != 18 || !q2.t()) {
            Modifier.Companion companion = i5 != 0 ? Modifier.f15489d : modifier2;
            if (ComposerKt.P()) {
                ComposerKt.Y(513521448, i4, -1, "com.hansecom.abt.ui.components.balance.Balance (Balance.kt:25)");
            }
            float f2 = (float) 4;
            Modifier a2 = ClipKt.a(companion, RoundedCornerShapeKt.d(Dp.m(f2)));
            AbtTheme abtTheme = AbtTheme.f38851a;
            float f3 = (float) 8;
            Modifier j2 = PaddingKt.j(BackgroundKt.b(a2, abtTheme.b(q2, 6).A(), (Shape) null, 2, (Object) null), Dp.m(f3), Dp.m(f2));
            MeasurePolicy b2 = RowKt.b(Arrangement.f3739a.n(Dp.m(f3)), Alignment.f15444a.i(), q2, 54);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, j2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a4);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, b2, companion2.c());
            Updater.g(b3, I, companion2.e());
            Function2 b4 = companion2.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a3))) {
                b3.N(Integer.valueOf(a3));
                b3.A(Integer.valueOf(a3), b4);
            }
            Updater.g(b3, e2, companion2.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            BoxKt.a(BackgroundKt.b(ClipKt.a(SizeKt.t(Modifier.f15489d, Dp.m(f3)), RoundedCornerShapeKt.f()), abtTheme.b(q2, 6).b(), (Shape) null, 2, (Object) null), q2, 0);
            Modifier modifier3 = companion;
            composer2 = q2;
            AbtTextKt.c(str, (Modifier) null, abtTheme.b(q2, 6).b(), 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).d(), composer2, (i4 >> 3) & 14, 0, 65530);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            modifier2 = modifier3;
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new a(modifier2, str, i2, i3));
        }
    }

    public static final Unit c(Modifier modifier, String str, int i2, int i3, Composer composer, int i4) {
        b(modifier, str, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
