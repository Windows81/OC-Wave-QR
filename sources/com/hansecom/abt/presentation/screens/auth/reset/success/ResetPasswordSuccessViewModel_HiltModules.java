package com.hansecom.abt.presentation.screens.auth.reset.success;

import dagger.Module;

public final class ResetPasswordSuccessViewModel_HiltModules {

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
