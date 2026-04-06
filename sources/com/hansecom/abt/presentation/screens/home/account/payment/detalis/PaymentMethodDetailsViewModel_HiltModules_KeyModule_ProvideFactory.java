package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetailsViewModel_HiltModules;
import dagger.internal.Factory;

public final class PaymentMethodDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final PaymentMethodDetailsViewModel_HiltModules_KeyModule_ProvideFactory f35785a = new PaymentMethodDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return PaymentMethodDetailsViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
