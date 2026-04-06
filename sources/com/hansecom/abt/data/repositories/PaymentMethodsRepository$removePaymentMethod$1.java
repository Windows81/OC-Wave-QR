package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository", f = "PaymentMethodsRepository.kt", l = {77, 49, 48, 51}, m = "removePaymentMethod-gIAlu-s")
public final class PaymentMethodsRepository$removePaymentMethod$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public long F;
    public /* synthetic */ Object G;
    public final /* synthetic */ PaymentMethodsRepository H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$removePaymentMethod$1(PaymentMethodsRepository paymentMethodsRepository, Continuation continuation) {
        super(continuation);
        this.H = paymentMethodsRepository;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object P = this.H.P(0, this);
        return P == IntrinsicsKt.f() ? P : Result.a(P);
    }
}
