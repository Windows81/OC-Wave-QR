package com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount;

import com.hansecom.abt.presentation.screens.auth.register.result.exitingAccount.RegisterResultExitingAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class RegisterResultExitingAccountScreenKt$RegisterResultExitingAccountScreen$1$1 extends FunctionReferenceImpl implements Function1<RegisterResultExitingAccount.Action, Unit> {
    public RegisterResultExitingAccountScreenKt$RegisterResultExitingAccountScreen$1$1(Object obj) {
        super(1, obj, RegisterResultExitingAccountViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((RegisterResultExitingAccount.Action) obj);
        return Unit.f40552a;
    }

    public final void v(RegisterResultExitingAccount.Action action) {
        Intrinsics.i(action, "p0");
        ((RegisterResultExitingAccountViewModel) this.f40885A).k(action);
    }
}
