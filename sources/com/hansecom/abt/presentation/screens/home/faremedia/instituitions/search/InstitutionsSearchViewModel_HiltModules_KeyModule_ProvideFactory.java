package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearchViewModel_HiltModules;
import dagger.internal.Factory;

public final class InstitutionsSearchViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final InstitutionsSearchViewModel_HiltModules_KeyModule_ProvideFactory f36888a = new InstitutionsSearchViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return InstitutionsSearchViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
