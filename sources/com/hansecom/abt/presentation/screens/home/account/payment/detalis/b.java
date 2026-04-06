package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f35790A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f35791z;

    public /* synthetic */ b(PaymentMethodState.CreditCard creditCard, int i2) {
        this.f35791z = creditCard;
        this.f35790A = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PaymentMethodDetailsScreenKt.m(this.f35791z, this.f35790A, (Composer) obj, ((Integer) obj2).intValue());
    }
}
