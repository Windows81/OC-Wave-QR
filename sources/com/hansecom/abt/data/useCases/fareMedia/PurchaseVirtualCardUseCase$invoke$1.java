package com.hansecom.abt.data.useCases.fareMedia;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.PurchaseVirtualCardUseCase", f = "PurchaseVirtualCardUseCase.kt", l = {21, 27, 28}, m = "invoke-yxL6bBk")
public final class PurchaseVirtualCardUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PurchaseVirtualCardUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchaseVirtualCardUseCase$invoke$1(PurchaseVirtualCardUseCase purchaseVirtualCardUseCase, Continuation continuation) {
        super(continuation);
        this.F = purchaseVirtualCardUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object a2 = this.F.a((String) null, (Integer) null, (Long) null, (BigDecimal) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
