package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.FareCappingRepository", f = "FareCappingRepository.kt", l = {42}, m = "get-gIAlu-s")
public final class FareCappingRepository$get$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ FareCappingRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingRepository$get$1(FareCappingRepository fareCappingRepository, Continuation continuation) {
        super(continuation);
        this.E = fareCappingRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object s2 = this.E.s((String) null, this);
        return s2 == IntrinsicsKt.f() ? s2 : Result.a(s2);
    }
}
