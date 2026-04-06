package com.hansecom.abt.presentation.screens.guest;

import dagger.Module;

public final class GuestViewModel_HiltModules {

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
