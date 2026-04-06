package com.hansecom.abt.presentation.screens.guest;

import com.hansecom.abt.presentation.screens.guest.GuestViewModel_HiltModules;
import dagger.internal.Factory;

public final class GuestViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final GuestViewModel_HiltModules_KeyModule_ProvideFactory f34708a = new GuestViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return GuestViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
