package com.hansecom.abt.data.useCases;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.ClearUserCacheUseCase", f = "ClearUserCacheUseCase.kt", l = {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 45, 46}, m = "invoke")
public final class ClearUserCacheUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ClearUserCacheUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearUserCacheUseCase$invoke$1(ClearUserCacheUseCase clearUserCacheUseCase, Continuation continuation) {
        super(continuation);
        this.E = clearUserCacheUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(this);
    }
}
