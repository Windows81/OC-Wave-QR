package com.hansecom.abt.ui.components.historyItem;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.formatters.DateTimeFormaterKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HistorySectionKt {
    public static final void b(Modifier modifier, HistorySectionState historySectionState, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier2 = modifier;
        HistorySectionState historySectionState2 = historySectionState;
        int i4 = i2;
        Intrinsics.i(modifier2, "modifier");
        Intrinsics.i(historySectionState2, "state");
        Composer q2 = composer.q(-1322540538);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(modifier2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.W(historySectionState2) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1322540538, i3, -1, "com.hansecom.abt.ui.components.historyItem.HistorySection (HistorySection.kt:23)");
            }
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), q2, 0);
            int a3 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
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
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            String a5 = DateTimeFormaterKt.a(historySectionState.a(), q2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            Composer composer3 = q2;
            TextKt.j(a5, (Modifier) null, abtTheme.b(q2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(q2, 6).f(), composer3, 0, 0, 131066);
            composer2 = composer3;
            CardKt.c(PaddingKt.k(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), 0.0f, Dp.m((float) 16), 1, (Object) null), RoundedCornerShapeKt.d(Dp.m((float) 8)), CardColors.d(CardDefaults.f9356a.a(composer2, CardDefaults.f9357b), abtTheme.b(composer2, 6).A(), 0, 0, 0, 14, (Object) null), (CardElevation) null, (BorderStroke) null, ComposableLambdaKt.e(-965945570, true, new HistorySectionKt$HistorySection$1$1(historySectionState2), composer2, 54), composer2, 196614, 24);
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
            x2.a(new b(modifier2, historySectionState2, i4));
        }
    }

    public static final Unit c(Modifier modifier, HistorySectionState historySectionState, int i2, Composer composer, int i3) {
        b(modifier, historySectionState, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
