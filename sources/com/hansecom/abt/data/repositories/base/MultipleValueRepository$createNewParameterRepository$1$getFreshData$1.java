package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.MultipleValueRepository$createNewParameterRepository$1", f = "MultipleValueRepository.kt", l = {108}, m = "getFreshData-IoAF18A")
public final class MultipleValueRepository$createNewParameterRepository$1$getFreshData$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ MultipleValueRepository$createNewParameterRepository$1 D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleValueRepository$createNewParameterRepository$1$getFreshData$1(MultipleValueRepository$createNewParameterRepository$1 multipleValueRepository$createNewParameterRepository$1, Continuation continuation) {
        super(continuation);
        this.D = multipleValueRepository$createNewParameterRepository$1;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object q2 = this.D.q(this);
        return q2 == IntrinsicsKt.f() ? q2 : Result.a(q2);
    }
}
