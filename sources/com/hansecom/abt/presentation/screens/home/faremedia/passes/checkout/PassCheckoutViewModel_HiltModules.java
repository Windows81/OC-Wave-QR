package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import dagger.Module;

public final class PassCheckoutViewModel_HiltModules {

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
