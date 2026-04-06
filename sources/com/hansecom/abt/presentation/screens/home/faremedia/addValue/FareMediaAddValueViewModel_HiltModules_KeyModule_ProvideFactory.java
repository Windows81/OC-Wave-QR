package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaAddValueViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaAddValueViewModel_HiltModules_KeyModule_ProvideFactory f36108a = new FareMediaAddValueViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaAddValueViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
