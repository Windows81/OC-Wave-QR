package com.hansecom.abt.data.useCases;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.AddBalanceUseCase", f = "AddBalanceUseCase.kt", l = {22, 28, 29, 30, 31, 32}, m = "invoke-yxL6bBk")
public final class AddBalanceUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public long F;
    public /* synthetic */ Object G;
    public final /* synthetic */ AddBalanceUseCase H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddBalanceUseCase$invoke$1(AddBalanceUseCase addBalanceUseCase, Continuation continuation) {
        super(continuation);
        this.H = addBalanceUseCase;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object a2 = this.H.a((String) null, (BigDecimal) null, 0, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
