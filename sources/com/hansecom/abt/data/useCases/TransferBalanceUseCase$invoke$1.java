package com.hansecom.abt.data.useCases;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.TransferBalanceUseCase", f = "TransferBalanceUseCase.kt", l = {20, 25, 26, 27, 28, 29, 30}, m = "invoke-BWLJW6A")
public final class TransferBalanceUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ TransferBalanceUseCase H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferBalanceUseCase$invoke$1(TransferBalanceUseCase transferBalanceUseCase, Continuation continuation) {
        super(continuation);
        this.H = transferBalanceUseCase;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object a2 = this.H.a((String) null, (String) null, (BigDecimal) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
