package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.AutoloadManager", f = "AutoloadManager.kt", l = {81}, m = "changeAutoload-eH_QyT8")
public final class AutoloadManager$changeAutoload$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AutoloadManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadManager$changeAutoload$1(AutoloadManager autoloadManager, Continuation continuation) {
        super(continuation);
        this.D = autoloadManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object b2 = this.D.b((String) null, 0, false, (BigDecimal) null, (BigDecimal) null, 0, (Long) null, this);
        return b2 == IntrinsicsKt.f() ? b2 : Result.a(b2);
    }
}
