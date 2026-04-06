package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.InstitutionManager", f = "InstitutionManager.kt", l = {23}, m = "link-0E7RQCE")
public final class InstitutionManager$link$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ InstitutionManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionManager$link$1(InstitutionManager institutionManager, Continuation continuation) {
        super(continuation);
        this.D = institutionManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, 0, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
