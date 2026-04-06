package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.GetMaxNumberOfCardPaymentMethodsUseCase", f = "GetMaxNumberOfCardPaymentMethodsUseCase.kt", l = {10}, m = "invoke-IoAF18A")
public final class GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetMaxNumberOfCardPaymentMethodsUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMaxNumberOfCardPaymentMethodsUseCase$invoke$1(GetMaxNumberOfCardPaymentMethodsUseCase getMaxNumberOfCardPaymentMethodsUseCase, Continuation continuation) {
        super(continuation);
        this.D = getMaxNumberOfCardPaymentMethodsUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a(this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
