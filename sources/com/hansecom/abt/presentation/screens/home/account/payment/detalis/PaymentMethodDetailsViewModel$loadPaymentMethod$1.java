package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel", f = "PaymentMethodDetailsViewModel.kt", l = {60, 61}, m = "loadPaymentMethod")
public final class PaymentMethodDetailsViewModel$loadPaymentMethod$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PaymentMethodDetailsViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodDetailsViewModel$loadPaymentMethod$1(PaymentMethodDetailsViewModel paymentMethodDetailsViewModel, Continuation continuation) {
        super(continuation);
        this.F = paymentMethodDetailsViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.L(0, this);
    }
}
