package com.hansecom.abt.presentation.screens.home;

import com.hansecom.abt.presentation.screens.home.HomeViewModel_HiltModules;
import dagger.internal.Factory;

public final class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final HomeViewModel_HiltModules_KeyModule_ProvideFactory f35006a = new HomeViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return HomeViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
