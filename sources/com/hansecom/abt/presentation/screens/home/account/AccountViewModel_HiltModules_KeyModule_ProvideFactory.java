package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.presentation.screens.home.account.AccountViewModel_HiltModules;
import dagger.internal.Factory;

public final class AccountViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AccountViewModel_HiltModules_KeyModule_ProvideFactory f35074a = new AccountViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return AccountViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
