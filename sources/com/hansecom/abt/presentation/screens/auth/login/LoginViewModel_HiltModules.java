package com.hansecom.abt.presentation.screens.auth.login;

import dagger.Module;

public final class LoginViewModel_HiltModules {

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
