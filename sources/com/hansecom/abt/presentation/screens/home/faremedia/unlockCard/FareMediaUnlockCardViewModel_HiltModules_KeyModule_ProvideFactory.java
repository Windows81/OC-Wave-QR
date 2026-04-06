package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaUnlockCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaUnlockCardViewModel_HiltModules_KeyModule_ProvideFactory f37381a = new FareMediaUnlockCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaUnlockCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
