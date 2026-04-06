package com.hansecom.abt.data.repositories.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.base.MultipleValueRepository", f = "MultipleValueRepository.kt", l = {82}, m = "clearCache")
public final class MultipleValueRepository$clearCache$2 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ MultipleValueRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultipleValueRepository$clearCache$2(MultipleValueRepository multipleValueRepository, Continuation continuation) {
        super(continuation);
        this.E = multipleValueRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(this);
    }
}
