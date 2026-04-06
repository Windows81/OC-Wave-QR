package com.hansecom.abt.data.useCases.appUpdate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.appUpdate.GetAppUpdateUseCase", f = "GetAppUpdateUseCase.kt", l = {20}, m = "invoke")
public final class GetAppUpdateUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ GetAppUpdateUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAppUpdateUseCase$invoke$1(GetAppUpdateUseCase getAppUpdateUseCase, Continuation continuation) {
        super(continuation);
        this.G = getAppUpdateUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(this);
    }
}
