package com.hansecom.abt.presentation.screens.home.account.changePassword;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel", f = "ChangePasswordViewModel.kt", l = {95}, m = "save")
public final class ChangePasswordViewModel$save$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ChangePasswordViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangePasswordViewModel$save$1(ChangePasswordViewModel changePasswordViewModel, Continuation continuation) {
        super(continuation);
        this.E = changePasswordViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.Q(this);
    }
}
