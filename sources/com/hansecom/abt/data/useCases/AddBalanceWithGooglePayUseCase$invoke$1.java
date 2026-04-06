package com.hansecom.abt.data.useCases;

import com.google.android.gms.wallet.PaymentData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase", f = "AddBalanceWithGooglePayUseCase.kt", l = {25, 31, 32, 33, 34, 35}, m = "invoke-yxL6bBk")
public final class AddBalanceWithGooglePayUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ AddBalanceWithGooglePayUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddBalanceWithGooglePayUseCase$invoke$1(AddBalanceWithGooglePayUseCase addBalanceWithGooglePayUseCase, Continuation continuation) {
        super(continuation);
        this.G = addBalanceWithGooglePayUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, (BigDecimal) null, (PaymentData) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
