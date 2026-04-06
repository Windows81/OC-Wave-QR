package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.InstitutionsViewModel_HiltModules;
import dagger.internal.Factory;

public final class InstitutionsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final InstitutionsViewModel_HiltModules_KeyModule_ProvideFactory f36788a = new InstitutionsViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return InstitutionsViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
