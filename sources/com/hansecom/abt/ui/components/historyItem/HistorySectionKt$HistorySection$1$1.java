package com.hansecom.abt.ui.components.historyItem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HistorySectionKt$HistorySection$1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HistorySectionState f38421z;

    public HistorySectionKt$HistorySection$1$1(HistorySectionState historySectionState) {
        this.f38421z = historySectionState;
    }

    public final void b(ColumnScope columnScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(columnScope, "$this$Card");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-965945570, i3, -1, "com.hansecom.abt.ui.components.historyItem.HistorySection.<anonymous>.<anonymous> (HistorySection.kt:37)");
            }
            float f2 = (float) 16;
            Modifier j2 = PaddingKt.j(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), Dp.m((float) 20), Dp.m(f2));
            HistorySectionState historySectionState = this.f38421z;
            int i4 = 0;
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.g(), Alignment.f15444a.k(), composer2, 0);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, j2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            composer2.X(-1558805698);
            for (Object next : historySectionState.b()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.w();
                }
                HistoryItemKt.b(PaddingKt.k(Modifier.f15489d, 0.0f, Dp.m(f2), 1, (Object) null), (HistoryItemState) next, composer2, 6);
                composer2.X(-1558800477);
                if (i4 != CollectionsKt.o(historySectionState.b())) {
                    DividerKt.e((Modifier) null, 0.0f, AbtTheme.f38851a.b(composer2, 6).u(), composer, 0, 3);
                }
                composer.M();
                i4 = i5;
            }
            composer.M();
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
