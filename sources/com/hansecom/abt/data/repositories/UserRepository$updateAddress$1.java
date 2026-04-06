package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.UserAddress;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository", f = "UserRepository.kt", l = {87, 46, 46}, m = "updateAddress-gIAlu-s")
public final class UserRepository$updateAddress$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ UserRepository G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$updateAddress$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.G = userRepository;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object Q = this.G.Q((UserAddress) null, this);
        return Q == IntrinsicsKt.f() ? Q : Result.a(Q);
    }
}
