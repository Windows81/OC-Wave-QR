package com.hansecom.abt.presentation.screens.home.account.changePassword;

import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class s implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordViewModel f35334A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChangePassword.Action f35335z;

    public /* synthetic */ s(ChangePassword.Action action, ChangePasswordViewModel changePasswordViewModel) {
        this.f35335z = action;
        this.f35334A = changePasswordViewModel;
    }

    public final Object invoke(Object obj) {
        return ChangePasswordViewModel.J(this.f35335z, this.f35334A, (ChangePassword.State) obj);
    }
}
