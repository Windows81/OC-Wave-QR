package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager", f = "PurchaseManager.kt", l = {137}, m = "applyCouponForAddValue-0E7RQCE")
public final class PurchaseManager$applyCouponForAddValue$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PurchaseManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$applyCouponForAddValue$1(PurchaseManager purchaseManager, Continuation continuation) {
        super(continuation);
        this.D = purchaseManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object d2 = this.D.d((BigDecimal) null, (String) null, this);
        return d2 == IntrinsicsKt.f() ? d2 : Result.a(d2);
    }
}
