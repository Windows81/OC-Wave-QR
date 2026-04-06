package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel_HiltModules;
import dagger.internal.Factory;

public final class HelpRequestViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final HelpRequestViewModel_HiltModules_KeyModule_ProvideFactory f34882a = new HelpRequestViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return HelpRequestViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
