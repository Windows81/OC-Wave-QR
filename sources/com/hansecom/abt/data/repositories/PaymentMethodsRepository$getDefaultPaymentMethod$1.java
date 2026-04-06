package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository", f = "PaymentMethodsRepository.kt", l = {32}, m = "getDefaultPaymentMethod-IoAF18A")
public final class PaymentMethodsRepository$getDefaultPaymentMethod$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PaymentMethodsRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$getDefaultPaymentMethod$1(PaymentMethodsRepository paymentMethodsRepository, Continuation continuation) {
        super(continuation);
        this.D = paymentMethodsRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object N = this.D.N(this);
        return N == IntrinsicsKt.f() ? N : Result.a(N);
    }
}
