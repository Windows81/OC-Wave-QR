package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPassesViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaPassesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaPassesViewModel_HiltModules_KeyModule_ProvideFactory f37012a = new FareMediaPassesViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaPassesViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
