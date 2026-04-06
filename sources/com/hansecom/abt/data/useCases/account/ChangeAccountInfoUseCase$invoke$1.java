package com.hansecom.abt.data.useCases.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase", f = "ChangeAccountInfoUseCase.kt", l = {12, 19}, m = "invoke-BWLJW6A")
public final class ChangeAccountInfoUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ChangeAccountInfoUseCase H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAccountInfoUseCase$invoke$1(ChangeAccountInfoUseCase changeAccountInfoUseCase, Continuation continuation) {
        super(continuation);
        this.H = changeAccountInfoUseCase;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object a2 = this.H.a((String) null, (String) null, (String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
