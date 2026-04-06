package com.hansecom.abt.presentation.screens.home.more;

import com.hansecom.abt.presentation.screens.home.more.MoreViewModel_HiltModules;
import dagger.internal.Factory;

public final class MoreViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final MoreViewModel_HiltModules_KeyModule_ProvideFactory f37440a = new MoreViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return MoreViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
