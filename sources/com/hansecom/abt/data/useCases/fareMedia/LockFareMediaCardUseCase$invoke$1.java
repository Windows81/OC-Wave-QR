package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.LockFareMediaCardUseCase", f = "LockFareMediaCardUseCase.kt", l = {15, 16, 17}, m = "invoke-gIAlu-s")
public final class LockFareMediaCardUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ LockFareMediaCardUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockFareMediaCardUseCase$invoke$1(LockFareMediaCardUseCase lockFareMediaCardUseCase, Continuation continuation) {
        super(continuation);
        this.F = lockFareMediaCardUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object a2 = this.F.a((String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
