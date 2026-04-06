package com.hansecom.abt.presentation.screens.auth.reset.success;

import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel_HiltModules;
import dagger.internal.Factory;

public final class ResetPasswordSuccessViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ResetPasswordSuccessViewModel_HiltModules_KeyModule_ProvideFactory f34645a = new ResetPasswordSuccessViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ResetPasswordSuccessViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
