package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class CheckFareMediaBalanceScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckFareMediaBalance.State f34717z;

    public static final Unit f(CheckFareMediaBalance.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1943880658, i2, -1, "com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.Preview.<anonymous> (CheckFareMediaBalanceScreen.kt:186)");
            }
            CheckFareMediaBalance.State state = this.f34717z;
            composer.X(-417310982);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new c();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-417309126);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new d();
                composer.N(g3);
            }
            composer.M();
            CheckFareMediaBalanceScreenKt.f(state, function1, A2, (Function0) g3, composer, 3120);
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
