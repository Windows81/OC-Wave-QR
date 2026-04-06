package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class x implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.Action f34337z;

    public /* synthetic */ x(Login.Action action) {
        this.f34337z = action;
    }

    public final Object invoke(Object obj) {
        return LoginViewModel.I(this.f34337z, (Login.State) obj);
    }
}
