package com.hansecom.abt.data.useCases.autoload;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase", f = "DeleteAutoloadUseCase.kt", l = {16, 20, 21, 22, 23}, m = "invoke-0E7RQCE")
public final class DeleteAutoloadUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ DeleteAutoloadUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteAutoloadUseCase$invoke$1(DeleteAutoloadUseCase deleteAutoloadUseCase, Continuation continuation) {
        super(continuation);
        this.G = deleteAutoloadUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, 0, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
