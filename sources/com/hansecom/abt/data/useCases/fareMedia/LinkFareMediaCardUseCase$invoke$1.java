package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.LinkFareMediaCardUseCase", f = "LinkFareMediaCardUseCase.kt", l = {21, 22, 23}, m = "invoke-BWLJW6A")
public final class LinkFareMediaCardUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ LinkFareMediaCardUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkFareMediaCardUseCase$invoke$1(LinkFareMediaCardUseCase linkFareMediaCardUseCase, Continuation continuation) {
        super(continuation);
        this.F = linkFareMediaCardUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object a2 = this.F.a((String) null, (String) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
