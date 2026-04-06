package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.BaseRepository", f = "BaseRepository.kt", l = {68}, m = "get-IoAF18A$suspendImpl")
public final class BaseRepository$get$1<T> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ BaseRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseRepository$get$1(BaseRepository baseRepository, Continuation continuation) {
        super(continuation);
        this.D = baseRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object j2 = BaseRepository.j(this.D, this);
        return j2 == IntrinsicsKt.f() ? j2 : Result.a(j2);
    }
}
