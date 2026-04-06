package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class AddPaymentMethodCyberSourceScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodCyberSource.State f35554z;

    public static final Unit g(AddPaymentMethodCyberSource.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2110850226, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.Preview.<anonymous> (AddPaymentMethodCyberSourceScreen.kt:318)");
            }
            AddPaymentMethodCyberSource.State state = this.f35554z;
            composer.X(95259642);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new h();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(95261658);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new i();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(95262618);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new j();
                composer.N(g4);
            }
            composer.M();
            AddPaymentMethodCyberSourceScreenKt.o(state, function1, A2, function0, (Function0) g4, composer, 27696);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
