package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.MultipleValueRepository", f = "MultipleValueRepository.kt", l = {34}, m = "get-gIAlu-s$suspendImpl")
public final class MultipleValueRepository$get$1<P, T> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ MultipleValueRepository D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleValueRepository$get$1(MultipleValueRepository multipleValueRepository, Continuation continuation) {
        super(continuation);
        this.D = multipleValueRepository;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object e2 = MultipleValueRepository.e(this.D, (Object) null, this);
        return e2 == IntrinsicsKt.f() ? e2 : Result.a(e2);
    }
}
