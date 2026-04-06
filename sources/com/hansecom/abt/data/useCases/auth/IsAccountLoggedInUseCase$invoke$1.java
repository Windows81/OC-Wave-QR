package com.hansecom.abt.data.useCases.auth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase", f = "IsAccountLoggedInUseCase.kt", l = {10}, m = "invoke")
public final class IsAccountLoggedInUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ IsAccountLoggedInUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IsAccountLoggedInUseCase$invoke$1(IsAccountLoggedInUseCase isAccountLoggedInUseCase, Continuation continuation) {
        super(continuation);
        this.D = isAccountLoggedInUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(this);
    }
}
