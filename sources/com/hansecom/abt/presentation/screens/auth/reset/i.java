package com.hansecom.abt.presentation.screens.auth.reset;

import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResetPassword.Action f34627z;

    public /* synthetic */ i(ResetPassword.Action action) {
        this.f34627z = action;
    }

    public final Object invoke(Object obj) {
        return ResetPasswordViewModel.B(this.f34627z, (ResetPassword.State) obj);
    }
}
