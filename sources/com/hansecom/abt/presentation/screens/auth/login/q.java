package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.Login;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class q implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f34333A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f34334z;

    public /* synthetic */ q(boolean z2, boolean z3) {
        this.f34334z = z2;
        this.f34333A = z3;
    }

    public final Object invoke(Object obj) {
        return LoginViewModel.M(this.f34334z, this.f34333A, (Login.State) obj);
    }
}
