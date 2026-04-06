package com.hansecom.abt.data.managers;

import com.google.android.gms.wallet.PaymentData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager", f = "PurchaseManager.kt", l = {137}, m = "purchasePassWithGooglePay-yxL6bBk")
public final class PurchaseManager$purchasePassWithGooglePay$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PurchaseManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$purchasePassWithGooglePay$1(PurchaseManager purchaseManager, Continuation continuation) {
        super(continuation);
        this.D = purchaseManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object h2 = this.D.h((String) null, (PaymentData) null, (Integer) null, (String) null, this);
        return h2 == IntrinsicsKt.f() ? h2 : Result.a(h2);
    }
}
