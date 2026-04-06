package com.hansecom.abt.data.useCases.institution;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.institution.UnlinkInstitutionUseCase", f = "UnlinkInstitutionUseCase.kt", l = {17, 19, 20, 21, 22, 23, 24}, m = "invoke-0E7RQCE")
public final class UnlinkInstitutionUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ UnlinkInstitutionUseCase G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnlinkInstitutionUseCase$invoke$1(UnlinkInstitutionUseCase unlinkInstitutionUseCase, Continuation continuation) {
        super(continuation);
        this.G = unlinkInstitutionUseCase;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object a2 = this.G.a((String) null, 0, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
