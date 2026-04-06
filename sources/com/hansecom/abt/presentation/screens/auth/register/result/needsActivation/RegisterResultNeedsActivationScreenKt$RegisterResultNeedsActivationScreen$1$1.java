package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class RegisterResultNeedsActivationScreenKt$RegisterResultNeedsActivationScreen$1$1 extends FunctionReferenceImpl implements Function1<RegisterResultNeedsActivation.Action, Unit> {
    public RegisterResultNeedsActivationScreenKt$RegisterResultNeedsActivationScreen$1$1(Object obj) {
        super(1, obj, RegisterResultNeedsActivationViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((RegisterResultNeedsActivation.Action) obj);
        return Unit.f40552a;
    }

    public final void v(RegisterResultNeedsActivation.Action action) {
        Intrinsics.i(action, "p0");
        ((RegisterResultNeedsActivationViewModel) this.f40885A).k(action);
    }
}
