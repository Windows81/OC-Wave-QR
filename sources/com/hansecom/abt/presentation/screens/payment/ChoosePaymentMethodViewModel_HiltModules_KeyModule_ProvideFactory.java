package com.hansecom.abt.presentation.screens.payment;

import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethodViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChoosePaymentMethodViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ChoosePaymentMethodViewModel_HiltModules_KeyModule_ProvideFactory f37780a = new ChoosePaymentMethodViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ChoosePaymentMethodViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
