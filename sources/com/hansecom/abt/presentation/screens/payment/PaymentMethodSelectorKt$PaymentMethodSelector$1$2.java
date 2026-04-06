package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PaymentMethodSelectorKt$PaymentMethodSelector$1$2 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState f37817A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f37818z;

    public PaymentMethodSelectorKt$PaymentMethodSelector$1$2(Function3 function3, PaymentMethodState paymentMethodState) {
        this.f37818z = function3;
        this.f37817A = paymentMethodState;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1279311125, i2, -1, "com.hansecom.abt.presentation.screens.payment.PaymentMethodSelector.<anonymous>.<anonymous> (PaymentMethodSelector.kt:51)");
            }
            Function3 function3 = this.f37818z;
            if (function3 != null) {
                function3.d(this.f37817A, composer, 0);
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
