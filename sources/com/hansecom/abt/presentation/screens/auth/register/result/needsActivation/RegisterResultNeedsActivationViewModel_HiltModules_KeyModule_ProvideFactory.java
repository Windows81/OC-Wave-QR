package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel_HiltModules;
import dagger.internal.Factory;

public final class RegisterResultNeedsActivationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final RegisterResultNeedsActivationViewModel_HiltModules_KeyModule_ProvideFactory f34562a = new RegisterResultNeedsActivationViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return RegisterResultNeedsActivationViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
