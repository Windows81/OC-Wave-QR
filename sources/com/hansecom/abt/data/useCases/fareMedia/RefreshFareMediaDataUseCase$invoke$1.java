package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase", f = "RefreshFareMediaDataUseCase.kt", l = {16}, m = "invoke-gIAlu-s")
public final class RefreshFareMediaDataUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ RefreshFareMediaDataUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshFareMediaDataUseCase$invoke$1(RefreshFareMediaDataUseCase refreshFareMediaDataUseCase, Continuation continuation) {
        super(continuation);
        this.D = refreshFareMediaDataUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object d2 = this.D.d((String) null, this);
        return d2 == IntrinsicsKt.f() ? d2 : Result.a(d2);
    }
}
