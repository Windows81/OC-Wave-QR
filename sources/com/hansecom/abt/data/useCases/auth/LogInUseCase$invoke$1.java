package com.hansecom.abt.data.useCases.auth;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.LogInUseCase", f = "LogInUseCase.kt", l = {40, 26, 27}, m = "invoke-0E7RQCE")
public final class LogInUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ LogInUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogInUseCase$invoke$1(LogInUseCase logInUseCase, Continuation continuation) {
        super(continuation);
        this.G = logInUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object c2 = this.G.c((String) null, (String) null, this);
        return c2 == IntrinsicsKt.f() ? c2 : Result.a(c2);
    }
}
