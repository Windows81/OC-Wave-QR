package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.presentation.screens.auth.login.LoginViewModel_HiltModules;
import dagger.internal.Factory;

public final class LoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final LoginViewModel_HiltModules_KeyModule_ProvideFactory f34313a = new LoginViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return LoginViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
