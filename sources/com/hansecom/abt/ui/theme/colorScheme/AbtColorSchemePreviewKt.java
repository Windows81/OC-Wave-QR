package com.hansecom.abt.ui.theme.colorScheme;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import com.hansecom.abt.ui.theme.AbtTheme;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata
public final class AbtColorSchemePreviewKt {
    public static final void b(String str, long j2, Object[] objArr, Composer composer, int i2) {
        int i3;
        Object[] objArr2 = objArr;
        Composer q2 = composer.q(234662631);
        if ((i2 & 6) == 0) {
            i3 = i2 | (q2.W(str) ? 4 : 2);
        } else {
            String str2 = str;
            i3 = i2;
        }
        long j3 = j2;
        if ((i2 & 48) == 0) {
            i3 |= q2.j(j3) ? 32 : 16;
        }
        q2.r(1330627396, Integer.valueOf(objArr2.length));
        int length = objArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            i3 |= q2.l(objArr2[i4]) ? 256 : 0;
        }
        q2.Q();
        if ((i3 & 896) == 0) {
            i3 |= 128;
        }
        int i5 = i3;
        if ((i5 & 147) != 146 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(234662631, i5, -1, "com.hansecom.abt.ui.theme.colorScheme.ColorBox (AbtColorSchemePreview.kt:90)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion2.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a4 = companion3.a();
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
            Updater.g(b2, a2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion3.d());
            int i6 = i5;
            TextKt.j(str, ColumnScopeInstance.f3815a.b(companion, companion2.k()), Color.f15975b.a(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.b()), 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).d(), q2, (i5 & 14) | 384, 0, 130040);
            Color color = null;
            Modifier b4 = BackgroundKt.b(SizeKt.i(SizeKt.h(companion, 0.0f, 1, (Object) null), Dp.m((float) 60)), j2, (Shape) null, 2, (Object) null);
            MeasurePolicy b5 = RowKt.b(arrangement.e(), companion2.i(), q2, 54);
            int a5 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, b4);
            Function0 a6 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a6);
            } else {
                q2.K();
            }
            Composer b6 = Updater.b(q2);
            Updater.g(b6, b5, companion3.c());
            Updater.g(b6, I2, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a5))) {
                b6.N(Integer.valueOf(a5));
                b6.A(Integer.valueOf(a5), b7);
            }
            Updater.g(b6, e3, companion3.d());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4150a;
            q2.X(-2018027096);
            int length2 = objArr2.length;
            int i7 = 0;
            while (i7 < length2) {
                Object obj = objArr2[i7];
                Modifier.Companion companion4 = Modifier.f15489d;
                float f2 = (float) 8;
                Modifier a7 = ClipKt.a(companion4, RoundedCornerShapeKt.d(Dp.m(f2)));
                Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.ui.graphics.Color");
                Color color2 = (Color) obj;
                Modifier i8 = PaddingKt.i(BackgroundKt.b(a7, color2.v(), (Shape) null, 2, (Object) null), Dp.m(f2));
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
                int a8 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, i8);
                ComposeUiNode.Companion companion5 = ComposeUiNode.f17222h;
                Function0 a9 = companion5.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a9);
                } else {
                    q2.K();
                }
                Composer b8 = Updater.b(q2);
                Updater.g(b8, g3, companion5.c());
                Updater.g(b8, I3, companion5.e());
                Function2 b9 = companion5.b();
                if (b8.n() || !Intrinsics.d(b8.g(), Integer.valueOf(a8))) {
                    b8.N(Integer.valueOf(a8));
                    b8.A(Integer.valueOf(a8), b9);
                }
                Updater.g(b8, e4, companion5.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                TextKt.j(e(color2.v()), companion4, j2, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(q2, 6).d(), q2, ((i6 << 3) & 896) | 48, 0, 131064);
                q2.T();
                i7++;
                color = color;
            }
            Color color3 = color;
            q2.M();
            String e5 = e(j2);
            TextStyle d2 = AbtTheme.f38851a.d(q2, 6).d();
            Object o0 = ArraysKt.o0(objArr2, 0);
            Color color4 = o0 instanceof Color ? (Color) o0 : color3;
            TextKt.j(e5, Modifier.f15489d, color4 != null ? color4.v() : Color.f15975b.a(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, d2, q2, 48, 0, 131064);
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(str, j2, objArr, i2));
        }
    }

    public static final Unit c(String str, long j2, Object[] objArr, int i2, Composer composer, int i3) {
        b(str, j2, Arrays.copyOf(objArr, objArr.length), composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final String e(long j2) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f40914a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(ColorKt.j(j2) & 16777215)}, 1));
        Intrinsics.h(format, "format(...)");
        return format;
    }
}
