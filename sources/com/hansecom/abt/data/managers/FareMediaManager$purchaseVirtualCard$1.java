package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager", f = "FareMediaManager.kt", l = {174}, m = "purchaseVirtualCard-yxL6bBk")
public final class FareMediaManager$purchaseVirtualCard$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ FareMediaManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$purchaseVirtualCard$1(FareMediaManager fareMediaManager, Continuation continuation) {
        super(continuation);
        this.D = fareMediaManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object l2 = this.D.l((String) null, (Integer) null, (Long) null, (BigDecimal) null, this);
        return l2 == IntrinsicsKt.f() ? l2 : Result.a(l2);
    }
}
