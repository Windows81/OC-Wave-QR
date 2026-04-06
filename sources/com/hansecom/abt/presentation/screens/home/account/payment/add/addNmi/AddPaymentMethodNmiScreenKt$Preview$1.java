package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class AddPaymentMethodNmiScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State f35620z;

    public static final Unit i(AddPaymentMethodNmi.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

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

    public final void h(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-376144398, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.Preview.<anonymous> (AddPaymentMethodNmiScreen.kt:448)");
            }
            AddPaymentMethodNmi.State state = this.f35620z;
            composer.X(617941488);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new C0492q();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(617943504);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new r();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(617944464);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new C0493s();
                composer.N(g4);
            }
            Function0 function02 = (Function0) g4;
            composer.M();
            composer.X(617945520);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new C0494t();
                composer.N(g5);
            }
            Function0 function03 = (Function0) g5;
            composer.M();
            composer.X(617946512);
            Object g6 = composer.g();
            if (g6 == companion.a()) {
                g6 = new u();
                composer.N(g6);
            }
            composer.M();
            AddPaymentMethodNmiScreenKt.G(state, function1, A2, function0, function02, function03, (Function0) g6, composer, 1797168);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        h((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
