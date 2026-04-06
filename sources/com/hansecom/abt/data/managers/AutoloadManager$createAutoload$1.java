package com.hansecom.abt.data.managers;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.managers.AutoloadManager", f = "AutoloadManager.kt", l = {81}, m = "createAutoload-hUnOzRk")
public final class AutoloadManager$createAutoload$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ AutoloadManager D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadManager$createAutoload$1(AutoloadManager autoloadManager, Continuation continuation) {
        super(continuation);
        this.D = autoloadManager;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object c2 = this.D.c((String) null, (BigDecimal) null, (BigDecimal) null, 0, (Long) null, this);
        return c2 == IntrinsicsKt.f() ? c2 : Result.a(c2);
    }
}
