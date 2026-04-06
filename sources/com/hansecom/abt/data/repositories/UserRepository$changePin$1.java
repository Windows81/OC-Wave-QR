package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository", f = "UserRepository.kt", l = {87}, m = "changePin-0E7RQCE")
public final class UserRepository$changePin$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ UserRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$changePin$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.D = userRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object M = this.D.M((String) null, (String) null, this);
        return M == IntrinsicsKt.f() ? M : Result.a(M);
    }
}
