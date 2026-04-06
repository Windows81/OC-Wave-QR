package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import com.hansecom.abt.presentation.screens.home.more.guidedTour.GuidedTourViewModel_HiltModules;
import dagger.internal.Factory;

public final class GuidedTourViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final GuidedTourViewModel_HiltModules_KeyModule_ProvideFactory f37455a = new GuidedTourViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return GuidedTourViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
