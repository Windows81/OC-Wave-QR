package com.hansecom.abt.presentation.screens.home.more;

import dagger.Module;

public final class MoreViewModel_HiltModules {

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
