package com.hansecom.abt.presentation.screens.main;

import com.hansecom.abt.presentation.screens.main.MainViewModel_HiltModules;
import dagger.internal.Factory;

public final class MainViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final MainViewModel_HiltModules_KeyModule_ProvideFactory f37593a = new MainViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return MainViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
