package com.hansecom.abt.presentation.screens.main.lock;

import dagger.Module;

public final class LockViewModel_HiltModules {

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
