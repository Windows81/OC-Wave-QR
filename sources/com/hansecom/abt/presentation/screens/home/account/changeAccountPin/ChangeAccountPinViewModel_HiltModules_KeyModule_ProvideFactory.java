package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel_HiltModules;
import dagger.internal.Factory;

public final class ChangeAccountPinViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ChangeAccountPinViewModel_HiltModules_KeyModule_ProvideFactory f35255a = new ChangeAccountPinViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ChangeAccountPinViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
