package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class u implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.Action f34335z;

    public /* synthetic */ u(Login.Action action) {
        this.f34335z = action;
    }

    public final Object invoke(Object obj) {
        return LoginViewModel.F(this.f34335z, (Login.State) obj);
    }
}
