package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalanceViewModel_HiltModules;
import dagger.internal.Factory;

public final class TransferBalanceViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final TransferBalanceViewModel_HiltModules_KeyModule_ProvideFactory f37332a = new TransferBalanceViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return TransferBalanceViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
