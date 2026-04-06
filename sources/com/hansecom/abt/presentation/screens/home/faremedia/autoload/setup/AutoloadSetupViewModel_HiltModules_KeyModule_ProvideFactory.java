package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel_HiltModules;
import dagger.internal.Factory;

public final class AutoloadSetupViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AutoloadSetupViewModel_HiltModules_KeyModule_ProvideFactory f36329a = new AutoloadSetupViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return AutoloadSetupViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
