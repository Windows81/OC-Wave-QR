package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import dagger.Module;

public final class AutoloadViewModel_HiltModules {

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
