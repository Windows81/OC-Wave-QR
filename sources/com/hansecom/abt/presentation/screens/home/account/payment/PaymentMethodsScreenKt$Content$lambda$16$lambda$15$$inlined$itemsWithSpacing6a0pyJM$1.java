package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsScreenKt$Content$lambda$16$lambda$15$$inlined$itemsWithSpacing-6a0pyJM$1  reason: invalid class name */
public final class PaymentMethodsScreenKt$Content$lambda$16$lambda$15$$inlined$itemsWithSpacing6a0pyJM$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f35503A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35504B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f35505z;

    public PaymentMethodsScreenKt$Content$lambda$16$lambda$15$$inlined$itemsWithSpacing6a0pyJM$1(List list, float f2, Function1 function1) {
        this.f35505z = list;
        this.f35503A = f2;
        this.f35504B = function1;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        Intrinsics.i(lazyItemScope, "$this$items");
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        if ((i4 & 147) != 146 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1395388335, i4, -1, "com.hansecom.abt.util.itemsWithSpacing.<anonymous> (LazyListExt.kt:22)");
            }
            PaymentMethodState.CreditCard creditCard = (PaymentMethodState.CreditCard) this.f35505z.get(i2);
            composer.X(32113769);
            PaymentMethodItem paymentMethodItem = PaymentMethodItem.f38685a;
            Modifier.Companion companion = Modifier.f15489d;
            Modifier a2 = TestTagKt.a(companion, "payment_method");
            composer.X(-2077169603);
            boolean W = composer.W(this.f35504B) | composer.W(creditCard);
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new PaymentMethodsScreenKt$Content$1$1$3$1$1(this.f35504B, creditCard);
                composer.N(g2);
            }
            composer.M();
            paymentMethodItem.r(creditCard, a2, (Function0) g2, ComposableSingletons$PaymentMethodsScreenKt.f35488a.b(), composer, 27696, 0);
            composer.M();
            if (i2 < CollectionsKt.o(this.f35505z)) {
                SpacerKt.a(SizeKt.t(companion, this.f35503A), composer, 0);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
