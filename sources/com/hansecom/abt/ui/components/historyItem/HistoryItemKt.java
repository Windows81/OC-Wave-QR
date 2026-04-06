package com.hansecom.abt.ui.components.historyItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import com.hansecom.abt.util.formatters.DateTimeFormaterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class HistoryItemKt {
    public static final void b(Modifier modifier, HistoryItemState historyItemState, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composer3;
        Modifier modifier2 = modifier;
        HistoryItemState historyItemState2 = historyItemState;
        int i4 = i2;
        Intrinsics.i(modifier2, "modifier");
        Intrinsics.i(historyItemState2, "state");
        Composer q2 = composer.q(-282089172);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(historyItemState2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-282089172, i3, -1, "com.hansecom.abt.ui.components.historyItem.HistoryItem (HistoryItem.kt:23)");
            }
            Arrangement arrangement = Arrangement.f3739a;
            Arrangement.Vertical g2 = arrangement.g();
            Alignment.Companion companion = Alignment.f15444a;
            MeasurePolicy a2 = ColumnKt.a(g2, companion.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier2);
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
            String c2 = DateTimeFormaterKt.c(historyItemState.e(), q2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            AbtTheme abtTheme2 = abtTheme;
            Composer composer4 = q2;
            TextKt.j(c2, (Modifier) null, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).d(), composer4, 0, 0, 131066);
            Modifier.Companion companion3 = Modifier.f15489d;
            Composer composer5 = composer4;
            SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 8)), composer5, 6);
            MeasurePolicy b4 = RowKt.b(arrangement.f(), companion.i(), composer5, 48);
            int a5 = ComposablesKt.a(composer5, 0);
            CompositionLocalMap I2 = composer5.I();
            Modifier e3 = ComposedModifierKt.e(composer5, companion3);
            Function0 a6 = companion2.a();
            if (composer5.v() == null) {
                ComposablesKt.d();
            }
            composer5.s();
            if (composer5.n()) {
                composer5.y(a6);
            } else {
                composer5.K();
            }
            Composer b5 = Updater.b(composer5);
            Updater.g(b5, b4, companion2.c());
            Updater.g(b5, I2, companion2.e());
            Function2 b6 = companion2.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a5))) {
                b5.N(Integer.valueOf(a5));
                b5.A(Integer.valueOf(a5), b6);
            }
            Updater.g(b5, e3, companion2.d());
            Modifier c3 = RowScope.c(RowScopeInstance.f4150a, companion3, 1.0f, false, 2, (Object) null);
            MeasurePolicy a7 = ColumnKt.a(arrangement.g(), companion.k(), composer5, 0);
            int a8 = ComposablesKt.a(composer5, 0);
            CompositionLocalMap I3 = composer5.I();
            Modifier e4 = ComposedModifierKt.e(composer5, c3);
            Function0 a9 = companion2.a();
            if (composer5.v() == null) {
                ComposablesKt.d();
            }
            composer5.s();
            if (composer5.n()) {
                composer5.y(a9);
            } else {
                composer5.K();
            }
            Composer b7 = Updater.b(composer5);
            Updater.g(b7, a7, companion2.c());
            Updater.g(b7, I3, companion2.e());
            Function2 b8 = companion2.b();
            if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a8))) {
                b7.N(Integer.valueOf(a8));
                b7.A(Integer.valueOf(a8), b8);
            }
            Updater.g(b7, e4, companion2.d());
            AbtTheme abtTheme3 = abtTheme2;
            Composer composer6 = composer5;
            Modifier.Companion companion4 = companion3;
            Composer composer7 = composer6;
            TextKt.j(historyItemState.f(), (Modifier) null, abtTheme3.b(composer5, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer5, 6).a(), composer7, 0, 0, 131066);
            Composer composer8 = composer6;
            SpacerKt.a(SizeKt.i(companion4, Dp.m((float) 4)), composer8, 6);
            TextKt.j(historyItemState.a(), (Modifier) null, abtTheme3.b(composer8, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer8, 6).b(), composer7, 0, 0, 131066);
            Composer composer9 = composer6;
            composer9.X(1545071443);
            if (StringsKt.l0(historyItemState.b()) || StringsKt.l0(historyItemState.d())) {
                composer3 = composer9;
            } else {
                String b9 = StringResources_androidKt.b(R.string.s1, composer9, 0);
                String b10 = historyItemState.b();
                String d2 = historyItemState.d();
                composer3 = composer9;
                TextKt.j("(" + b9 + " (" + b10 + ", " + d2 + ")", (Modifier) null, abtTheme3.b(composer9, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer9, 6).b(), composer3, 0, 0, 131066);
            }
            composer3.M();
            composer3.T();
            Composer composer10 = composer3;
            SpacerKt.a(SizeKt.y(companion4, Dp.m((float) 32)), composer10, 6);
            composer2 = composer10;
            TextKt.j(CurrencyValueFormater.c(CurrencyValueFormater.f39045a, historyItemState.c(), false, 2, (Object) null), (Modifier) null, abtTheme3.b(composer10, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme3.d(composer10, 6).a(), composer2, 0, 0, 131066);
            composer2.T();
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
            x2.a(new a(modifier2, historyItemState2, i4));
        }
    }

    public static final Unit c(Modifier modifier, HistoryItemState historyItemState, int i2, Composer composer, int i3) {
        b(modifier, historyItemState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
