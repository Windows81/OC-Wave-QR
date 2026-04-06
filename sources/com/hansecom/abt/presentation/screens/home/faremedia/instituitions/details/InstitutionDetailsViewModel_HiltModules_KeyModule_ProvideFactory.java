package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.InstitutionDetailsViewModel_HiltModules;
import dagger.internal.Factory;

public final class InstitutionDetailsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final InstitutionDetailsViewModel_HiltModules_KeyModule_ProvideFactory f36842a = new InstitutionDetailsViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return InstitutionDetailsViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
