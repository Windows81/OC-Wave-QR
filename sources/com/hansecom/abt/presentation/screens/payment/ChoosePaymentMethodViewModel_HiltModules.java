package com.hansecom.abt.presentation.screens.payment;

import dagger.Module;

public final class ChoosePaymentMethodViewModel_HiltModules {

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
