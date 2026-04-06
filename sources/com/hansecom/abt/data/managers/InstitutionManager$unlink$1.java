package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.InstitutionManager", f = "InstitutionManager.kt", l = {23}, m = "unlink-0E7RQCE")
public final class InstitutionManager$unlink$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ InstitutionManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionManager$unlink$1(InstitutionManager institutionManager, Continuation continuation) {
        super(continuation);
        this.D = institutionManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object c2 = this.D.c((String) null, 0, this);
        return c2 == IntrinsicsKt.f() ? c2 : Result.a(c2);
    }
}
