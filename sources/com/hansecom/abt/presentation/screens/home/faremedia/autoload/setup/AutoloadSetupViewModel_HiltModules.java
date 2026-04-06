package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import dagger.Module;

public final class AutoloadSetupViewModel_HiltModules {

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
