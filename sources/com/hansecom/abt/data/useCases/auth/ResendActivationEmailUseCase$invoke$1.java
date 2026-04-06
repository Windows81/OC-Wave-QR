package com.hansecom.abt.data.useCases.auth;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase", f = "ResendActivationEmailUseCase.kt", l = {18}, m = "invoke-gIAlu-s")
public final class ResendActivationEmailUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ ResendActivationEmailUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResendActivationEmailUseCase$invoke$1(ResendActivationEmailUseCase resendActivationEmailUseCase, Continuation continuation) {
        super(continuation);
        this.D = resendActivationEmailUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
