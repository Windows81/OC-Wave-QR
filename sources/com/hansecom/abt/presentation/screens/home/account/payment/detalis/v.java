package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.CreditCard f35810z;

    public /* synthetic */ v(PaymentMethodState.CreditCard creditCard) {
        this.f35810z = creditCard;
    }

    public final Object invoke(Object obj) {
        return PaymentMethodDetailsViewModel.O(this.f35810z, (PaymentMethodDetails.State) obj);
    }
}
