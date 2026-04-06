package com.hansecom.abt.ui.theme.typography;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata
public final class AbtTypographyPreviewKt {
    public static final void b(String str, TextStyle textStyle, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        TextStyle textStyle2 = textStyle;
        Composer q2 = composer.q(131581601);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(textStyle2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(131581601, i3, -1, "com.hansecom.abt.ui.theme.typography.TextStylePreview (AbtTypographyPreview.kt:20)");
            }
            int d2 = MathKt.d(TextUnit.h(textStyle.l()));
            int d3 = MathKt.d(TextUnit.h(textStyle.s()));
            FontWeight o2 = textStyle.o();
            Integer valueOf = o2 != null ? Integer.valueOf(o2.y()) : null;
            Modifier.Companion companion = Modifier.f15489d;
            Modifier k2 = PaddingKt.k(companion, 0.0f, Dp.m((float) 4), 1, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, k2);
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
            Composer b2 = Updater.b(q2);
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            TextKt.j(str2 + " " + d2 + "/" + d3 + "/" + valueOf, (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).g(), q2, 0, 0, 131070);
            composer2 = q2;
            TextKt.j("The quick brown fox jumps over the lazy dog", BackgroundKt.b(companion, Color.f15975b.c(), (Shape) null, 2, (Object) null), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 1, 0, (Function1) null, textStyle, composer2, 54, (29360128 & (i3 << 18)) | 27648, 106492);
            composer2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new b(str2, textStyle, i2));
        }
    }

    public static final Unit c(String str, TextStyle textStyle, int i2, Composer composer, int i3) {
        b(str, textStyle, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
