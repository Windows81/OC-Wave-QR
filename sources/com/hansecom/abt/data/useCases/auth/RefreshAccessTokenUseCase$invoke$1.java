package com.hansecom.abt.data.useCases.auth;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase", f = "RefreshAccessTokenUseCase.kt", l = {34, 22}, m = "invoke-IoAF18A")
public final class RefreshAccessTokenUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ RefreshAccessTokenUseCase E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshAccessTokenUseCase$invoke$1(RefreshAccessTokenUseCase refreshAccessTokenUseCase, Continuation continuation) {
        super(continuation);
        this.E = refreshAccessTokenUseCase;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object d2 = this.E.d(this);
        return d2 == IntrinsicsKt.f() ? d2 : Result.a(d2);
    }
}
