package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository", f = "UserRepository.kt", l = {87}, m = "resetPassword-gIAlu-s")
public final class UserRepository$resetPassword$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ UserRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$resetPassword$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.D = userRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object O = this.D.O((String) null, this);
        return O == IntrinsicsKt.f() ? O : Result.a(O);
    }
}
