package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel_HiltModules;
import dagger.internal.Factory;

public final class AccountInformationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AccountInformationViewModel_HiltModules_KeyModule_ProvideFactory f35460a = new AccountInformationViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return AccountInformationViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
