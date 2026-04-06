package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository", f = "UserRepository.kt", l = {87}, m = "delete-gIAlu-s")
public final class UserRepository$delete$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ UserRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$delete$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.D = userRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object N = this.D.N((String) null, this);
        return N == IntrinsicsKt.f() ? N : Result.a(N);
    }
}
