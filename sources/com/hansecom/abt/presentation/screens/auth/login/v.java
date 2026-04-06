package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Login.Action f34336z;

    public /* synthetic */ v(Login.Action action) {
        this.f34336z = action;
    }

    public final Object invoke(Object obj) {
        return LoginViewModel.G(this.f34336z, (Login.State) obj);
    }
}
