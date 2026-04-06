package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.GetCreditCardPaymentMethodsUseCase", f = "GetCreditCardPaymentMethodsUseCase.kt", l = {11}, m = "invoke-IoAF18A")
public final class GetCreditCardPaymentMethodsUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetCreditCardPaymentMethodsUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetCreditCardPaymentMethodsUseCase$invoke$1(GetCreditCardPaymentMethodsUseCase getCreditCardPaymentMethodsUseCase, Continuation continuation) {
        super(continuation);
        this.D = getCreditCardPaymentMethodsUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a(this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
