package com.hansecom.abt.data.useCases.autoload;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.autoload.GetAutoloadConfigurationsUseCase", f = "GetAutoloadConfigurationsUseCase.kt", l = {16}, m = "invoke-gIAlu-s")
public final class GetAutoloadConfigurationsUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ GetAutoloadConfigurationsUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetAutoloadConfigurationsUseCase$invoke$1(GetAutoloadConfigurationsUseCase getAutoloadConfigurationsUseCase, Continuation continuation) {
        super(continuation);
        this.E = getAutoloadConfigurationsUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object a2 = this.E.a((String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
