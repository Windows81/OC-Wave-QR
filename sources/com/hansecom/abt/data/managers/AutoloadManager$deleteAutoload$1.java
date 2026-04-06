package com.hansecom.abt.data.managers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.AutoloadManager", f = "AutoloadManager.kt", l = {81}, m = "deleteAutoload-0E7RQCE")
public final class AutoloadManager$deleteAutoload$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AutoloadManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadManager$deleteAutoload$1(AutoloadManager autoloadManager, Continuation continuation) {
        super(continuation);
        this.D = autoloadManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object d2 = this.D.d((String) null, 0, this);
        return d2 == IntrinsicsKt.f() ? d2 : Result.a(d2);
    }
}
