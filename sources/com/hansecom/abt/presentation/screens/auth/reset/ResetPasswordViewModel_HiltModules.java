package com.hansecom.abt.presentation.screens.auth.reset;

import dagger.Module;

public final class ResetPasswordViewModel_HiltModules {

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
