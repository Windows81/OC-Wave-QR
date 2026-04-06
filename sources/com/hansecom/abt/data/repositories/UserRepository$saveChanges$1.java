package com.hansecom.abt.data.repositories;

import com.hansecom.mapi.models.User;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.UserRepository", f = "UserRepository.kt", l = {87, 37, 38, 40}, m = "saveChanges-gIAlu-s")
public final class UserRepository$saveChanges$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ UserRepository F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$saveChanges$1(UserRepository userRepository, Continuation continuation) {
        super(continuation);
        this.F = userRepository;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object P = this.F.P((User) null, this);
        return P == IntrinsicsKt.f() ? P : Result.a(P);
    }
}
