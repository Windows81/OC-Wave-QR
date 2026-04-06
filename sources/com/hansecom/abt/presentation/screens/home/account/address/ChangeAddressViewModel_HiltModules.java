package com.hansecom.abt.presentation.screens.home.account.address;

import dagger.Module;

public final class ChangeAddressViewModel_HiltModules {

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
