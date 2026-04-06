package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaViewModel_HiltModules_KeyModule_ProvideFactory f36003a = new FareMediaViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
