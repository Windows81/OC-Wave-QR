package com.hansecom.abt.presentation.screens.auth.register;

import dagger.Module;

public final class RegisterViewModel_HiltModules {

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
