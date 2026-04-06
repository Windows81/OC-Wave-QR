package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel_HiltModules;
import dagger.internal.Factory;

public final class AutoloadViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final AutoloadViewModel_HiltModules_KeyModule_ProvideFactory f36256a = new AutoloadViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return AutoloadViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
