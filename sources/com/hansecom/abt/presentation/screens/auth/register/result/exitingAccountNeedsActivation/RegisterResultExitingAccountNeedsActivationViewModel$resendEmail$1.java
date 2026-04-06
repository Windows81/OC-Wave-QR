package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivationViewModel", f = "RegisterResultExitingAccountNeedsActivationViewModel.kt", l = {36}, m = "resendEmail")
public final class RegisterResultExitingAccountNeedsActivationViewModel$resendEmail$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ RegisterResultExitingAccountNeedsActivationViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterResultExitingAccountNeedsActivationViewModel$resendEmail$1(RegisterResultExitingAccountNeedsActivationViewModel registerResultExitingAccountNeedsActivationViewModel, Continuation continuation) {
        super(continuation);
        this.E = registerResultExitingAccountNeedsActivationViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.z(this);
    }
}
