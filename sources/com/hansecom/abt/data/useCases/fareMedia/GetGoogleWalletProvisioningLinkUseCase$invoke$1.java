package com.hansecom.abt.data.useCases.fareMedia;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase", f = "GetGoogleWalletProvisioningLinkUseCase.kt", l = {12}, m = "invoke-gIAlu-s")
public final class GetGoogleWalletProvisioningLinkUseCase$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GetGoogleWalletProvisioningLinkUseCase D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGoogleWalletProvisioningLinkUseCase$invoke$1(GetGoogleWalletProvisioningLinkUseCase getGoogleWalletProvisioningLinkUseCase, Continuation continuation) {
        super(continuation);
        this.D = getGoogleWalletProvisioningLinkUseCase;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        Object a2 = this.D.a((String) null, this);
        return a2 == IntrinsicsKt.f() ? a2 : Result.a(a2);
    }
}
