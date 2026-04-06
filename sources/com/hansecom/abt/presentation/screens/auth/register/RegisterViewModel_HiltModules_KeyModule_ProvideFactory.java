package com.hansecom.abt.presentation.screens.auth.register;

import com.hansecom.abt.presentation.screens.auth.register.RegisterViewModel_HiltModules;
import dagger.internal.Factory;

public final class RegisterViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final RegisterViewModel_HiltModules_KeyModule_ProvideFactory f34426a = new RegisterViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return RegisterViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
