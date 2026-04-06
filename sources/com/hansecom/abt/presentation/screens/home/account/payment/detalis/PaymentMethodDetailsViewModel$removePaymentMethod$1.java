package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel", f = "PaymentMethodDetailsViewModel.kt", l = {101}, m = "removePaymentMethod")
public final class PaymentMethodDetailsViewModel$removePaymentMethod$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ PaymentMethodDetailsViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsViewModel$removePaymentMethod$1(PaymentMethodDetailsViewModel paymentMethodDetailsViewModel, Continuation continuation) {
        super(continuation);
        this.E = paymentMethodDetailsViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.S(this);
    }
}
