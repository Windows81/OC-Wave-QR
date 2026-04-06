package com.hansecom.abt.presentation.screens.auth.welcome;

import com.hansecom.abt.presentation.screens.auth.welcome.WelcomeViewModel_HiltModules;
import dagger.internal.Factory;

public final class WelcomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final WelcomeViewModel_HiltModules_KeyModule_ProvideFactory f34671a = new WelcomeViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return WelcomeViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
