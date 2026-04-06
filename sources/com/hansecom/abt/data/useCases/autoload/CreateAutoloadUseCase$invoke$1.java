package com.hansecom.abt.data.useCases.autoload;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase", f = "CreateAutoloadUseCase.kt", l = {20, 27, 28, 29, 30}, m = "invoke-hUnOzRk")
public final class CreateAutoloadUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ CreateAutoloadUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAutoloadUseCase$invoke$1(CreateAutoloadUseCase createAutoloadUseCase, Continuation continuation) {
        super(continuation);
        this.G = createAutoloadUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, (BigDecimal) null, (BigDecimal) null, 0, (Long) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
