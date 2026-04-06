package com.hansecom.abt.data.useCases.passes;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.passes.PurchasePassWithFareMediaUseCase", f = "PurchasePassWithFareMediaUseCase.kt", l = {23, 30, 31, 32, 33}, m = "invoke-hUnOzRk")
public final class PurchasePassWithFareMediaUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ PurchasePassWithFareMediaUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasePassWithFareMediaUseCase$invoke$1(PurchasePassWithFareMediaUseCase purchasePassWithFareMediaUseCase, Continuation continuation) {
        super(continuation);
        this.G = purchasePassWithFareMediaUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, (String) null, (Long) null, (Integer) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
