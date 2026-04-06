package com.hansecom.abt.presentation.screens.home.account.changePassword;

import dagger.Module;

public final class ChangePasswordViewModel_HiltModules {

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
