package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel_HiltModules;
import dagger.internal.Factory;

public final class CheckFareMediaBalanceViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final CheckFareMediaBalanceViewModel_HiltModules_KeyModule_ProvideFactory f34730a = new CheckFareMediaBalanceViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return CheckFareMediaBalanceViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
