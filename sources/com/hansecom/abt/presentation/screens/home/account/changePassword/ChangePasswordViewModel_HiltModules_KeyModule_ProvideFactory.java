package com.hansecom.abt.presentation.screens.home.account.changePassword;

import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangePasswordViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ChangePasswordViewModel_HiltModules_KeyModule_ProvideFactory f35309a = new ChangePasswordViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ChangePasswordViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
