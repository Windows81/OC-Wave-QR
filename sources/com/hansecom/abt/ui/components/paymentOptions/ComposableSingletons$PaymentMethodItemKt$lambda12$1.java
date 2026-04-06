package com.hansecom.abt.ui.components.paymentOptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.SampleStates;
import com.hansecom.abt.ui.stateMocks.FareMediaSelectorStateMocksKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt$lambda-12$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodItemKt$lambda12$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodItemKt$lambda12$1 f38675z = new ComposableSingletons$PaymentMethodItemKt$lambda12$1();

    /* access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit s() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit t() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit u() {
        return Unit.f40552a;
    }

    public final void i(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1185796372, i3, -1, "com.hansecom.abt.ui.components.paymentOptions.ComposableSingletons$PaymentMethodItemKt.lambda-12.<anonymous> (PaymentMethodItem.kt:295)");
            }
            float f2 = (float) 16;
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(Dp.m(f2));
            Modifier.Companion companion = Modifier.f15489d;
            Modifier i4 = PaddingKt.i(companion, Dp.m(f2));
            MeasurePolicy a2 = ColumnKt.a(n2, Alignment.f15444a.k(), composer2, 6);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, i4);
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
            PaymentMethodItem paymentMethodItem = PaymentMethodItem.f38685a;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            SampleStates sampleStates = SampleStates.f37859a;
            PaymentMethodState.CreditCard creditCard = (PaymentMethodState.CreditCard) sampleStates.l().get(0);
            composer2.X(-821920381);
            Object g2 = composer.g();
            Composer.Companion companion3 = Composer.f14567a;
            if (g2 == companion3.a()) {
                g2 = new a();
                composer2.N(g2);
            }
            composer.M();
            paymentMethodItem.r(creditCard, h2, (Function0) g2, (Function2) null, composer, 25008, 8);
            Modifier h3 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            PaymentMethodState.CreditCard creditCard2 = (PaymentMethodState.CreditCard) sampleStates.l().get(1);
            composer2.X(-821912093);
            Object g3 = composer.g();
            if (g3 == companion3.a()) {
                g3 = new b();
                composer2.N(g3);
            }
            composer.M();
            ComposableSingletons$PaymentMethodItemKt composableSingletons$PaymentMethodItemKt = ComposableSingletons$PaymentMethodItemKt.f38659a;
            paymentMethodItem.r(creditCard2, h3, (Function0) g3, composableSingletons$PaymentMethodItemKt.i(), composer, 28080, 0);
            Modifier h4 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            composer2.X(-821905885);
            Object g4 = composer.g();
            if (g4 == companion3.a()) {
                g4 = new c();
                composer2.N(g4);
            }
            composer.M();
            paymentMethodItem.n(h4, (Function0) g4, composableSingletons$PaymentMethodItemKt.j(), composer, 3510, 0);
            Modifier h5 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            composer2.X(-821899517);
            Object g5 = composer.g();
            if (g5 == companion3.a()) {
                g5 = new d();
                composer2.N(g5);
            }
            composer.M();
            paymentMethodItem.v(h5, (Function0) g5, composableSingletons$PaymentMethodItemKt.k(), composer, 3510, 0);
            Modifier a5 = TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "payment_method_select_fare_media");
            PaymentMethodState.FareMedia.Companion companion4 = PaymentMethodState.FareMedia.E;
            PaymentMethodState.FareMedia a6 = FareMediaSelectorStateMocksKt.a(companion4);
            composer2.X(-821891773);
            Object g6 = composer.g();
            if (g6 == companion3.a()) {
                g6 = new e();
                composer2.N(g6);
            }
            composer.M();
            paymentMethodItem.t(a5, a6, (Function0) g6, true, composableSingletons$PaymentMethodItemKt.b(), composer, 224646, 0);
            Modifier a7 = TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "payment_method_select_fare_media");
            PaymentMethodState.FareMedia a8 = FareMediaSelectorStateMocksKt.a(companion4);
            composer2.X(-821879101);
            Object g7 = composer.g();
            if (g7 == companion3.a()) {
                g7 = new f();
                composer2.N(g7);
            }
            composer.M();
            paymentMethodItem.t(a7, a8, (Function0) g7, false, composableSingletons$PaymentMethodItemKt.c(), composer, 224646, 0);
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
        i((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
