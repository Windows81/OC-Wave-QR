package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.FareMediaRepository", f = "FareMediaRepository.kt", l = {29}, m = "getFareMedia-gIAlu-s")
public final class FareMediaRepository$getFareMedia$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ FareMediaRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaRepository$getFareMedia$1(FareMediaRepository fareMediaRepository, Continuation continuation) {
        super(continuation);
        this.E = fareMediaRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object N = this.E.N((String) null, this);
        return N == IntrinsicsKt.f() ? N : Result.a(N);
    }
}
