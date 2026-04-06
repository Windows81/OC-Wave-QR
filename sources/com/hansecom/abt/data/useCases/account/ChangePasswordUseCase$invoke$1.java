package com.hansecom.abt.data.useCases.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.ChangePasswordUseCase", f = "ChangePasswordUseCase.kt", l = {27}, m = "invoke-0E7RQCE")
public final class ChangePasswordUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ ChangePasswordUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangePasswordUseCase$invoke$1(ChangePasswordUseCase changePasswordUseCase, Continuation continuation) {
        super(continuation);
        this.D = changePasswordUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, (String) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
