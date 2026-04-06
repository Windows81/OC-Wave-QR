package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaRemoveCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaRemoveCardViewModel_HiltModules_KeyModule_ProvideFactory f37247a = new FareMediaRemoveCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaRemoveCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
