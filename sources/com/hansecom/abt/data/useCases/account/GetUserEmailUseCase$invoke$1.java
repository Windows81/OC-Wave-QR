package com.hansecom.abt.data.useCases.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.GetUserEmailUseCase", f = "GetUserEmailUseCase.kt", l = {11}, m = "invoke-IoAF18A")
public final class GetUserEmailUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetUserEmailUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetUserEmailUseCase$invoke$1(GetUserEmailUseCase getUserEmailUseCase, Continuation continuation) {
        super(continuation);
        this.D = getUserEmailUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a(this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
