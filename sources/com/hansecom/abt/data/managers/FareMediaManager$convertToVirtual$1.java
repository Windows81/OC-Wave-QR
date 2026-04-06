package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.FareMediaManager", f = "FareMediaManager.kt", l = {174}, m = "convertToVirtual-gIAlu-s")
public final class FareMediaManager$convertToVirtual$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ FareMediaManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaManager$convertToVirtual$1(FareMediaManager fareMediaManager, Continuation continuation) {
        super(continuation);
        this.D = fareMediaManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object d2 = this.D.d((String) null, this);
        return d2 == IntrinsicsKt.f() ? d2 : Result.a(d2);
    }
}
