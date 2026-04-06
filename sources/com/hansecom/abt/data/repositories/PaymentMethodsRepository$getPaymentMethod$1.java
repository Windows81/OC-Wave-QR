package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository", f = "PaymentMethodsRepository.kt", l = {38}, m = "getPaymentMethod-gIAlu-s")
public final class PaymentMethodsRepository$getPaymentMethod$1 extends ContinuationImpl {
    public long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ PaymentMethodsRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$getPaymentMethod$1(PaymentMethodsRepository paymentMethodsRepository, Continuation continuation) {
        super(continuation);
        this.E = paymentMethodsRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object O = this.E.O(0, this);
        return O == IntrinsicsKt.f() ? O : Result.a(O);
    }
}
