package com.hansecom.abt.data.useCases;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.CloseAccountUseCase", f = "CloseAccountUseCase.kt", l = {11}, m = "invoke-gIAlu-s")
public final class CloseAccountUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ CloseAccountUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseAccountUseCase$invoke$1(CloseAccountUseCase closeAccountUseCase, Continuation continuation) {
        super(continuation);
        this.D = closeAccountUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a((String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
