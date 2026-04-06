package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel_HiltModules;
import dagger.internal.Factory;

public final class CardInformationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final CardInformationViewModel_HiltModules_KeyModule_ProvideFactory f36443a = new CardInformationViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return CardInformationViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
