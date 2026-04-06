package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.addInstituiton.AddInstitutionViewModel_HiltModules;
import dagger.internal.Factory;

public final class AddInstitutionViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AddInstitutionViewModel_HiltModules_KeyModule_ProvideFactory f36809a = new AddInstitutionViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return AddInstitutionViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
