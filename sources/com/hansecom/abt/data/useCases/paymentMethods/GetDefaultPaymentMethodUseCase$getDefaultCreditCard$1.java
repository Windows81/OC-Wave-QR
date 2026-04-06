package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase", f = "GetDefaultPaymentMethodUseCase.kt", l = {35}, m = "getDefaultCreditCard-IoAF18A")
public final class GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetDefaultPaymentMethodUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDefaultPaymentMethodUseCase$getDefaultCreditCard$1(GetDefaultPaymentMethodUseCase getDefaultPaymentMethodUseCase, Continuation continuation) {
        super(continuation);
        this.D = getDefaultPaymentMethodUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.b(this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
