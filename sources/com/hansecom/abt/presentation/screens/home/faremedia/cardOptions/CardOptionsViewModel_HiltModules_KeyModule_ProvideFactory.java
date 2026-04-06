package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsViewModel_HiltModules;
import dagger.internal.Factory;

public final class CardOptionsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final CardOptionsViewModel_HiltModules_KeyModule_ProvideFactory f36580a = new CardOptionsViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return CardOptionsViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
