package com.hansecom.abt.presentation.screens.home.account.changePassword;

import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class ChangePasswordScreenKt$ChangePasswordScreen$1$1 extends FunctionReferenceImpl implements Function1<ChangePassword.Action, Unit> {
    public ChangePasswordScreenKt$ChangePasswordScreen$1$1(Object obj) {
        super(1, obj, ChangePasswordViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((ChangePassword.Action) obj);
        return Unit.f40552a;
    }

    public final void v(ChangePassword.Action action) {
        Intrinsics.i(action, "p0");
        ((ChangePasswordViewModel) this.f40885A).k(action);
    }
}
