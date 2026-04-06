package com.hansecom.abt.presentation.screens.payment;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel", f = "ChoosePaymentMethodViewModel.kt", l = {123}, m = "loadFareMediaPaymentMethods")
public final class ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ChoosePaymentMethodViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChoosePaymentMethodViewModel$loadFareMediaPaymentMethods$1(ChoosePaymentMethodViewModel choosePaymentMethodViewModel, Continuation continuation) {
        super(continuation);
        this.E = choosePaymentMethodViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.R(this);
    }
}
