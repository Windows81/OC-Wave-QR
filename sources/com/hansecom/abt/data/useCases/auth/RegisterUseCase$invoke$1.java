package com.hansecom.abt.data.useCases.auth;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.auth.RegisterUseCase", f = "RegisterUseCase.kt", l = {75}, m = "invoke-eH_QyT8")
public final class RegisterUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ RegisterUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterUseCase$invoke$1(RegisterUseCase registerUseCase, Continuation continuation) {
        super(continuation);
        this.D = registerUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
