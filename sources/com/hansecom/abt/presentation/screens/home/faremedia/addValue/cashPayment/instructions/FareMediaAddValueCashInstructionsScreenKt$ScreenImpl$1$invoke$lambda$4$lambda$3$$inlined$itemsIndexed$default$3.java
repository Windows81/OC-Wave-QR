package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.ui.theme.AbtTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ List f36170A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f36171z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1$invoke$lambda$4$lambda$3$$inlined$itemsIndexed$default$3(List list, List list2) {
        super(4);
        this.f36171z = list;
        this.f36170A = list2;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        int i5 = i2;
        Composer composer2 = composer;
        if ((i3 & 6) == 0) {
            i4 = i3 | (composer2.W(lazyItemScope) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer2.i(i5) ? 32 : 16;
        }
        if (composer2.E((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            int intValue = ((Number) this.f36171z.get(i5)).intValue();
            composer2.X(1483559789);
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            MeasurePolicy a2 = ColumnKt.a(Arrangement.f3739a.b(), Alignment.f15444a.g(), composer2, 54);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, h2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
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
            Updater.g(b2, a2, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            FareMediaAddValueCashInstructionsScreenKt.g(String.valueOf(i5 + 1), composer2, 0);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 20)), composer2, 6);
            Modifier.Companion companion3 = companion;
            TextKt.j(StringResources_androidKt.b(intValue, composer2, 0), (Modifier) null, 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, TextAlign.h(TextAlign.f19080b.a()), 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(composer2, 6).c(), composer, 0, 0, 130046);
            composer.T();
            Composer composer3 = composer;
            composer3.X(-1337597830);
            if (i5 < this.f36170A.size() - 1) {
                SpacerKt.a(SizeKt.i(companion3, Dp.m((float) 48)), composer3, 6);
            }
            composer.M();
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        Composer composer4 = composer2;
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
