package com.hansecom.abt.ui.components.checkout;

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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.CurrencyValueFormater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class CheckoutSummaryKt {
    public static final void c(ImmutableList immutableList, Composer composer, int i2) {
        int i3;
        Intrinsics.i(immutableList, "items");
        Composer q2 = composer.q(172934194);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(immutableList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(172934194, i3, -1, "com.hansecom.abt.ui.components.checkout.CheckoutSummary (CheckoutSummary.kt:24)");
            }
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m((float) 8));
            Modifier.Companion companion = Modifier.f15489d;
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), q2, 6);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
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
            q2.X(329742948);
            int i4 = 0;
            for (Object next : immutableList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.w();
                }
                e((CheckoutItem) next, i4 == CollectionsKt.o(immutableList), q2, 0);
                i4 = i5;
            }
            q2.M();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(immutableList, i2));
        }
    }

    public static final Unit d(ImmutableList immutableList, int i2, Composer composer, int i3) {
        c(immutableList, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void e(CheckoutItem checkoutItem, boolean z2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        TextStyle b2;
        long v2;
        CheckoutItem checkoutItem2 = checkoutItem;
        boolean z3 = z2;
        int i4 = i2;
        Composer q2 = composer.q(-1025531703);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(checkoutItem2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.d(z3) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1025531703, i3, -1, "com.hansecom.abt.ui.components.checkout.RowWithAmount (CheckoutSummary.kt:45)");
            }
            AbtTheme abtTheme = AbtTheme.f38851a;
            TextStyle b3 = abtTheme.d(q2, 6).b();
            long q3 = abtTheme.b(q2, 6).q();
            if (z3) {
                q2.X(-649885802);
                b2 = abtTheme.d(q2, 6).a();
            } else {
                q2.X(-649884780);
                b2 = abtTheme.d(q2, 6).b();
            }
            q2.M();
            TextStyle textStyle = b2;
            if (checkoutItem.a().compareTo(BigDecimal.ZERO) >= 0) {
                q2.X(-649881703);
                v2 = abtTheme.b(q2, 6).q();
            } else {
                q2.X(-649880552);
                v2 = abtTheme.b(q2, 6).v();
            }
            q2.M();
            long j2 = v2;
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy b4 = RowKt.b(Arrangement.f3739a.f(), Alignment.f15444a.l(), q2, 0);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, h2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b5 = Updater.b(q2);
            Updater.g(b5, b4, companion2.c());
            Updater.g(b5, I, companion2.e());
            Function2 b6 = companion2.b();
            if (b5.n() || !Intrinsics.d(b5.g(), Integer.valueOf(a2))) {
                b5.N(Integer.valueOf(a2));
                b5.A(Integer.valueOf(a2), b6);
            }
            Updater.g(b5, e2, companion2.d());
            Composer composer3 = q2;
            TextKt.j(checkoutItem.b(), RowScope.c(RowScopeInstance.f4150a, companion, 1.0f, false, 2, (Object) null), q3, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, b3, composer3, 0, 0, 131064);
            Composer composer4 = composer3;
            SpacerKt.a(SizeKt.y(companion, Dp.m((float) 16)), composer4, 6);
            composer2 = composer4;
            TextKt.j(CurrencyValueFormater.c(CurrencyValueFormater.f39045a, checkoutItem.a(), false, 2, (Object) null), (Modifier) null, j2, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, textStyle, composer2, 0, 0, 131066);
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
            x2.a(new b(checkoutItem2, z3, i4));
        }
    }

    public static final Unit f(CheckoutItem checkoutItem, boolean z2, int i2, Composer composer, int i3) {
        e(checkoutItem, z2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
