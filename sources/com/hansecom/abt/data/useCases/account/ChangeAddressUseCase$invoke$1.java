package com.hansecom.abt.data.useCases.account;

import com.hansecom.mapi.models.UserAddress;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.account.ChangeAddressUseCase", f = "ChangeAddressUseCase.kt", l = {13, 16, 17}, m = "invoke-gIAlu-s")
public final class ChangeAddressUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ChangeAddressUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeAddressUseCase$invoke$1(ChangeAddressUseCase changeAddressUseCase, Continuation continuation) {
        super(continuation);
        this.F = changeAddressUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        Object a2 = this.F.a((UserAddress) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
