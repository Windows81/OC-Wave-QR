package com.hansecom.abt.presentation.screens.home.account.payment;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel", f = "PaymentMethodsViewModel.kt", l = {83}, m = "loadPaymentMethods")
public final class PaymentMethodsViewModel$loadPaymentMethods$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ PaymentMethodsViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel$loadPaymentMethods$1(PaymentMethodsViewModel paymentMethodsViewModel, Continuation continuation) {
        super(continuation);
        this.E = paymentMethodsViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.K(this);
    }
}
