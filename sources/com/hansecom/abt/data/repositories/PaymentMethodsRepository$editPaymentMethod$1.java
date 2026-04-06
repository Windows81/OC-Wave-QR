package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.PaymentMethodsRepository", f = "PaymentMethodsRepository.kt", l = {77, 67, 69}, m = "editPaymentMethod-BWLJW6A")
public final class PaymentMethodsRepository$editPaymentMethod$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ PaymentMethodsRepository G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepository$editPaymentMethod$1(PaymentMethodsRepository paymentMethodsRepository, Continuation continuation) {
        super(continuation);
        this.G = paymentMethodsRepository;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object M = this.G.M(0, (String) null, false, this);
        return M == IntrinsicsKt.f() ? M : Result.a(M);
    }
}
