package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCappingViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareCappingViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareCappingViewModel_HiltModules_KeyModule_ProvideFactory f36745a = new FareCappingViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareCappingViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
