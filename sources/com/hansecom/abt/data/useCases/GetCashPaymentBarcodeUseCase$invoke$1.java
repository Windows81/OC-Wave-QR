package com.hansecom.abt.data.useCases;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.GetCashPaymentBarcodeUseCase", f = "GetCashPaymentBarcodeUseCase.kt", l = {23}, m = "invoke-bMdYcbs")
public final class GetCashPaymentBarcodeUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetCashPaymentBarcodeUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetCashPaymentBarcodeUseCase$invoke$1(GetCashPaymentBarcodeUseCase getCashPaymentBarcodeUseCase, Continuation continuation) {
        super(continuation);
        this.D = getCashPaymentBarcodeUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, 0, 0, 0, 0, (Bitmap.Config) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
