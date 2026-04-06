package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.presentation.screens.auth.register.Register;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class q implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Register.Action.UserInfoStep f34481z;

    public /* synthetic */ q(Register.Action.UserInfoStep userInfoStep) {
        this.f34481z = userInfoStep;
    }

    public final Object invoke(Object obj) {
        return RegisterViewModel.D0(this.f34481z, (Register.State) obj);
    }
}
