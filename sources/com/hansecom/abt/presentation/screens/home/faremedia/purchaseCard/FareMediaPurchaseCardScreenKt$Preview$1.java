package com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.FareMediaPurchaseCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class FareMediaPurchaseCardScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaPurchaseCard.State f37184z;

    public static final Unit f(FareMediaPurchaseCard.Action action) {
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
                ComposerKt.Y(1574988921, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.purchaseCard.Preview.<anonymous> (FareMediaPurchaseCardScreen.kt:339)");
            }
            FareMediaPurchaseCard.State state = this.f37184z;
            composer.X(-258779430);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new c();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-258777350);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new d();
                composer.N(g3);
            }
            composer.M();
            FareMediaPurchaseCardScreenKt.f(state, function1, A2, (Function0) g3, composer, 3120);
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
