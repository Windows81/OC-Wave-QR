package com.hansecom.abt.presentation.screens.main.debugMenu;

import dagger.Module;

public final class DebugMenuViewModel_HiltModules {

    @Module
    public static abstract class BindsModule {
    }

    @Module
    public static final class KeyModule {
        public static boolean a() {
            return true;
        }
    }
}
