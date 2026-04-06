package com.hansecom.abt.presentation.screens.auth.reset;

import com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel_HiltModules;
import dagger.internal.Factory;

public final class ResetPasswordViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ResetPasswordViewModel_HiltModules_KeyModule_ProvideFactory f34615a = new ResetPasswordViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ResetPasswordViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
