package com.hansecom.abt.presentation.screens.main.debugMenu;

import com.hansecom.abt.presentation.screens.main.debugMenu.DebugMenuViewModel_HiltModules;
import dagger.internal.Factory;

public final class DebugMenuViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final DebugMenuViewModel_HiltModules_KeyModule_ProvideFactory f37635a = new DebugMenuViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return DebugMenuViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
