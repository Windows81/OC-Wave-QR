package com.hansecom.abt.data.useCases.passes;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.passes.PurchasePassUseCase", f = "PurchasePassUseCase.kt", l = {25, 31, 32, 33, 34, 36}, m = "invoke-hUnOzRk")
public final class PurchasePassUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ PurchasePassUseCase H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasePassUseCase$invoke$1(PurchasePassUseCase purchasePassUseCase, Continuation continuation) {
        super(continuation);
        this.H = purchasePassUseCase;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object a2 = this.H.a((String) null, (String) null, (Long) null, (Integer) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
