package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel", f = "RegisterResultNeedsActivationViewModel.kt", l = {36}, m = "resendEmail")
public final class RegisterResultNeedsActivationViewModel$resendEmail$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ RegisterResultNeedsActivationViewModel E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterResultNeedsActivationViewModel$resendEmail$1(RegisterResultNeedsActivationViewModel registerResultNeedsActivationViewModel, Continuation continuation) {
        super(continuation);
        this.E = registerResultNeedsActivationViewModel;
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.z(this);
    }
}
