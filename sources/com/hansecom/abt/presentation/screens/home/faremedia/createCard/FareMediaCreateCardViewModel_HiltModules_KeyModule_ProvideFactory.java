package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import com.hansecom.abt.presentation.screens.home.faremedia.createCard.FareMediaCreateCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaCreateCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaCreateCardViewModel_HiltModules_KeyModule_ProvideFactory f36692a = new FareMediaCreateCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaCreateCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
