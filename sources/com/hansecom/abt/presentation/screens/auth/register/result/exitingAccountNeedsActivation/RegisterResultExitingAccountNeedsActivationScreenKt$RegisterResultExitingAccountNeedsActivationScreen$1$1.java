package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation;

import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccountNeedsActivation.RegisterResultExitingAccountNeedsActivation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class RegisterResultExitingAccountNeedsActivationScreenKt$RegisterResultExitingAccountNeedsActivationScreen$1$1 extends FunctionReferenceImpl implements Function1<RegisterResultExitingAccountNeedsActivation.Action, Unit> {
    public RegisterResultExitingAccountNeedsActivationScreenKt$RegisterResultExitingAccountNeedsActivationScreen$1$1(Object obj) {
        super(1, obj, RegisterResultExitingAccountNeedsActivationViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((RegisterResultExitingAccountNeedsActivation.Action) obj);
        return Unit.f40552a;
    }

    public final void v(RegisterResultExitingAccountNeedsActivation.Action action) {
        Intrinsics.i(action, "p0");
        ((RegisterResultExitingAccountNeedsActivationViewModel) this.f40885A).k(action);
    }
}
