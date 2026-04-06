package com.hansecom.abt.ui.components.passCard;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.hansecom.abt.ui.SampleStates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.passCard.ComposableSingletons$PassOfferCardKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$PassOfferCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PassOfferCardKt$lambda1$1 f38598z = new ComposableSingletons$PassOfferCardKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(42862228, i2, -1, "com.hansecom.abt.ui.components.passCard.ComposableSingletons$PassOfferCardKt.lambda-1.<anonymous> (PassOfferCard.kt:141)");
            }
            float f2 = (float) 16;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Modifier i3 = PaddingKt.i(Modifier.f15489d, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), composer, 6);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, i3);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
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
            SampleStates sampleStates = SampleStates.f37859a;
            PassOfferCardState k2 = sampleStates.k();
            composer.X(-343459273);
            Object g2 = composer.g();
            Composer.Companion companion2 = Composer.f14567a;
            if (g2 == companion2.a()) {
                g2 = new r();
                composer.N(g2);
            }
            composer.M();
            PassOfferCardKt.e(k2, (Modifier) null, "Add", (Function0) g2, composer, 3456, 2);
            PassOfferCardState f3 = sampleStates.f();
            composer.X(-343453833);
            Object g3 = composer.g();
            if (g3 == companion2.a()) {
                g3 = new s();
                composer.N(g3);
            }
            composer.M();
            PassOfferCardKt.e(f3, (Modifier) null, "Add", (Function0) g3, composer, 3456, 2);
            PassOfferCardKt.i(sampleStates.k(), (Modifier) null, composer, 0, 2);
            PassOfferCardKt.i(sampleStates.f(), (Modifier) null, composer, 0, 2);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
