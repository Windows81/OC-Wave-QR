package com.hansecom.abt.data.useCases.passes;

import com.google.android.gms.wallet.PaymentData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.passes.PurchasePassWithGooglePayUseCase", f = "PurchasePassWithGooglePayUseCase.kt", l = {27, 33, 34, 35, 36, 37}, m = "invoke-hUnOzRk")
public final class PurchasePassWithGooglePayUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ PurchasePassWithGooglePayUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PurchasePassWithGooglePayUseCase$invoke$1(PurchasePassWithGooglePayUseCase purchasePassWithGooglePayUseCase, Continuation continuation) {
        super(continuation);
        this.G = purchasePassWithGooglePayUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, (String) null, (PaymentData) null, (Integer) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
