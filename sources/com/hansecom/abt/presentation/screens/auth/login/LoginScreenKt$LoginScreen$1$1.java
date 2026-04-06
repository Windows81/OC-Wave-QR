package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public /* synthetic */ class LoginScreenKt$LoginScreen$1$1 extends FunctionReferenceImpl implements Function1<Login.Action, Unit> {
    public LoginScreenKt$LoginScreen$1$1(Object obj) {
        super(1, obj, LoginViewModel.class, "action", "action(Ljava/lang/Object;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Login.Action) obj);
        return Unit.f40552a;
    }

    public final void v(Login.Action action) {
        Intrinsics.i(action, "p0");
        ((LoginViewModel) this.f40885A).k(action);
    }
}
