package com.hansecom.abt.presentation.screens.home.barcode;

import com.hansecom.abt.presentation.screens.home.barcode.BarcodeDisplayViewModel_HiltModules;
import dagger.internal.Factory;

public final class BarcodeDisplayViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final BarcodeDisplayViewModel_HiltModules_KeyModule_ProvideFactory f35853a = new BarcodeDisplayViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return BarcodeDisplayViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
