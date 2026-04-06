package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PaymentMethodsManager", f = "PaymentMethodsManager.kt", l = {60}, m = "getCyberSourceFormWebPage-0E7RQCE")
public final class PaymentMethodsManager$getCyberSourceFormWebPage$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PaymentMethodsManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsManager$getCyberSourceFormWebPage$1(PaymentMethodsManager paymentMethodsManager, Continuation continuation) {
        super(continuation);
        this.D = paymentMethodsManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object c2 = this.D.c(false, (String) null, this);
        return c2 == IntrinsicsKt.f() ? c2 : Result.a(c2);
    }
}
