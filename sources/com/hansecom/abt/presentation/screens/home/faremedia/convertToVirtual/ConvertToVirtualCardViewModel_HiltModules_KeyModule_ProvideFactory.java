package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

import com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ConvertToVirtualCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class ConvertToVirtualCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ConvertToVirtualCardViewModel_HiltModules_KeyModule_ProvideFactory f36662a = new ConvertToVirtualCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return ConvertToVirtualCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
