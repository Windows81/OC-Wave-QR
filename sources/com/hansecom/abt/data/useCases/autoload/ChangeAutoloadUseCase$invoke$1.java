package com.hansecom.abt.data.useCases.autoload;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase", f = "ChangeAutoloadUseCase.kt", l = {22, 31, 32, 33, 34}, m = "invoke-eH_QyT8")
public final class ChangeAutoloadUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ChangeAutoloadUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAutoloadUseCase$invoke$1(ChangeAutoloadUseCase changeAutoloadUseCase, Continuation continuation) {
        super(continuation);
        this.G = changeAutoloadUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, 0, false, (BigDecimal) null, (BigDecimal) null, 0, (Long) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
