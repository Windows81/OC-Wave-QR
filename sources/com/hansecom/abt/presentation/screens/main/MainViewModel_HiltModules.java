package com.hansecom.abt.presentation.screens.main;

import dagger.Module;

public final class MainViewModel_HiltModules {

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
