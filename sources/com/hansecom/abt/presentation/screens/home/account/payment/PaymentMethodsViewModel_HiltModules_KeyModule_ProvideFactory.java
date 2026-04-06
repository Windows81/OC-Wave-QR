package com.hansecom.abt.presentation.screens.home.account.payment;

import com.hansecom.abt.presentation.screens.home.account.payment.PaymentMethodsViewModel_HiltModules;
import dagger.internal.Factory;

public final class PaymentMethodsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final PaymentMethodsViewModel_HiltModules_KeyModule_ProvideFactory f35531a = new PaymentMethodsViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return PaymentMethodsViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
