package com.hansecom.abt.data.useCases.paymentMethods;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.GetDefaultPaymentMethodUseCase", f = "GetDefaultPaymentMethodUseCase.kt", l = {17, 19, 22, 25}, m = "invoke-gIAlu-s")
public final class GetDefaultPaymentMethodUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ GetDefaultPaymentMethodUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDefaultPaymentMethodUseCase$invoke$1(GetDefaultPaymentMethodUseCase getDefaultPaymentMethodUseCase, Continuation continuation) {
        super(continuation);
        this.F = getDefaultPaymentMethodUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object c2 = this.F.c((List) null, this);
        return c2 == IntrinsicsKt.f() ? c2 : Result.a(c2);
    }
}
