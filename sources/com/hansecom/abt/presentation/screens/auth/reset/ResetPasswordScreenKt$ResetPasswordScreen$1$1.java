package com.hansecom.abt.presentation.screens.auth.reset;

import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ResetPasswordScreenKt$ResetPasswordScreen$1$1 extends FunctionReferenceImpl implements Function1<ResetPassword.Action, Unit> {
    public ResetPasswordScreenKt$ResetPasswordScreen$1$1(Object obj) {
        super(1, obj, ResetPasswordViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ResetPassword.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ResetPassword.Action action) {
        Intrinsics.i(action, "p0");
        ((ResetPasswordViewModel) this.f40885A).k(action);
    }
}
