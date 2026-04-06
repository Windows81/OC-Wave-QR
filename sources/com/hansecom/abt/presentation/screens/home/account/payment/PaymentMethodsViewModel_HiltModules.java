package com.hansecom.abt.presentation.screens.home.account.payment;

import dagger.Module;

public final class PaymentMethodsViewModel_HiltModules {

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
