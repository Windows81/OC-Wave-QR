package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.GetAddPaymentMethodPageCyberSourceUseCase", f = "GetAddPaymentMethodPageCyberSourceUseCase.kt", l = {10}, m = "invoke-0E7RQCE")
public final class GetAddPaymentMethodPageCyberSourceUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetAddPaymentMethodPageCyberSourceUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAddPaymentMethodPageCyberSourceUseCase$invoke$1(GetAddPaymentMethodPageCyberSourceUseCase getAddPaymentMethodPageCyberSourceUseCase, Continuation continuation) {
        super(continuation);
        this.D = getAddPaymentMethodPageCyberSourceUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a((String) null, false, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
