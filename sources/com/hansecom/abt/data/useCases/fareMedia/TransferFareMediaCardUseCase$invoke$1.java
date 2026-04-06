package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase", f = "TransferFareMediaCardUseCase.kt", l = {14, 16, 17}, m = "invoke-IoAF18A")
public final class TransferFareMediaCardUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ TransferFareMediaCardUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferFareMediaCardUseCase$invoke$1(TransferFareMediaCardUseCase transferFareMediaCardUseCase, Continuation continuation) {
        super(continuation);
        this.F = transferFareMediaCardUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object a2 = this.F.a(this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
