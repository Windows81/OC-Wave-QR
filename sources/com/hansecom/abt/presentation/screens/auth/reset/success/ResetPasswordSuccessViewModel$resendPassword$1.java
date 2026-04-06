package com.hansecom.abt.presentation.screens.auth.reset.success;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel", f = "ResetPasswordSuccessViewModel.kt", l = {32}, m = "resendPassword")
public final class ResetPasswordSuccessViewModel$resendPassword$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ResetPasswordSuccessViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordSuccessViewModel$resendPassword$1(ResetPasswordSuccessViewModel resetPasswordSuccessViewModel, Continuation continuation) {
        super(continuation);
        this.F = resetPasswordSuccessViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.z((String) null, this);
    }
}
