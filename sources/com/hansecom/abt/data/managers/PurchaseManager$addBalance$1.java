package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.PurchaseManager", f = "PurchaseManager.kt", l = {137}, m = "addBalance-yxL6bBk")
public final class PurchaseManager$addBalance$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ PurchaseManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseManager$addBalance$1(PurchaseManager purchaseManager, Continuation continuation) {
        super(continuation);
        this.D = purchaseManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, (BigDecimal) null, 0, (String) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
