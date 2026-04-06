package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckoutViewModel_HiltModules;
import dagger.internal.Factory;

public final class PassCheckoutViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final PassCheckoutViewModel_HiltModules_KeyModule_ProvideFactory f37131a = new PassCheckoutViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return PassCheckoutViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
