package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.components.paymentOptions.PaymentMethodItemKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$PaymentMethodSelectorKt$lambda2$1 implements Function3<PaymentMethodState, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$PaymentMethodSelectorKt$lambda2$1 f37797z = new ComposableSingletons$PaymentMethodSelectorKt$lambda2$1();

    public final void b(PaymentMethodState paymentMethodState, Composer composer, int i2) {
        Intrinsics.i(paymentMethodState, "it");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1784159711, i2, -1, "com.hansecom.abt.presentation.screens.payment.ComposableSingletons$PaymentMethodSelectorKt.lambda-2.<anonymous> (PaymentMethodSelector.kt:41)");
            }
            PaymentMethodItemKt.b(composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PaymentMethodState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
