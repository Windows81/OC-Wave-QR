package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import dagger.Module;

public final class RegisterResultNeedsActivationViewModel_HiltModules {

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
