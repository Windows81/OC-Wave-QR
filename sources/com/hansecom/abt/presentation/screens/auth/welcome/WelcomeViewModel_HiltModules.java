package com.hansecom.abt.presentation.screens.auth.welcome;

import dagger.Module;

public final class WelcomeViewModel_HiltModules {

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
