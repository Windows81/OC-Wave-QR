package com.hansecom.abt.presentation.screens.auth.reset;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel", f = "ResetPasswordViewModel.kt", l = {37}, m = "resetPassword")
public final class ResetPasswordViewModel$resetPassword$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ ResetPasswordViewModel F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel$resetPassword$1(ResetPasswordViewModel resetPasswordViewModel, Continuation continuation) {
        super(continuation);
        this.F = resetPasswordViewModel;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.C((String) null, this);
    }
}
