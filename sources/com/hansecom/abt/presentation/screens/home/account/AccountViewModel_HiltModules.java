package com.hansecom.abt.presentation.screens.home.account;

import dagger.Module;

public final class AccountViewModel_HiltModules {

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
