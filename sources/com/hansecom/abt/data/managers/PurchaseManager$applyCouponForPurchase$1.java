package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager", f = "PurchaseManager.kt", l = {137}, m = "applyCouponForPurchase-BWLJW6A")
public final class PurchaseManager$applyCouponForPurchase$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PurchaseManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$applyCouponForPurchase$1(PurchaseManager purchaseManager, Continuation continuation) {
        super(continuation);
        this.D = purchaseManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object e2 = this.D.e((String) null, (String) null, (Integer) null, this);
        return e2 == IntrinsicsKt.f() ? e2 : Result.a(e2);
    }
}
