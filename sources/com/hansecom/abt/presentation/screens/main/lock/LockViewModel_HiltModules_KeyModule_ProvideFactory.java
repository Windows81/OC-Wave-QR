package com.hansecom.abt.presentation.screens.main.lock;

import com.hansecom.abt.presentation.screens.main.lock.LockViewModel_HiltModules;
import dagger.internal.Factory;

public final class LockViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final LockViewModel_HiltModules_KeyModule_ProvideFactory f37679a = new LockViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return LockViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
