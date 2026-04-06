package com.hansecom.abt.data.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.repositories.AutoloadRepository", f = "AutoloadRepository.kt", l = {33}, m = "getAutoload-0E7RQCE")
public final class AutoloadRepository$getAutoload$1 extends ContinuationImpl {
    public long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ AutoloadRepository E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadRepository$getAutoload$1(AutoloadRepository autoloadRepository, Continuation continuation) {
        super(continuation);
        this.E = autoloadRepository;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        Object r2 = this.E.r((String) null, 0, this);
        return r2 == IntrinsicsKt.f() ? r2 : Result.a(r2);
    }
}
