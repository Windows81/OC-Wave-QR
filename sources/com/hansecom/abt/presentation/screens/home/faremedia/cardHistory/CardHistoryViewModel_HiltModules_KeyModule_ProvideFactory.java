package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel_HiltModules;
import dagger.internal.Factory;

public final class CardHistoryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final CardHistoryViewModel_HiltModules_KeyModule_ProvideFactory f36403a = new CardHistoryViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return CardHistoryViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
