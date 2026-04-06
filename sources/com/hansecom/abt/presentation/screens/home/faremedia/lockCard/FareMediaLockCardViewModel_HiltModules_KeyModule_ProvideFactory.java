package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import com.hansecom.abt.presentation.screens.home.faremedia.lockCard.FareMediaLockCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaLockCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaLockCardViewModel_HiltModules_KeyModule_ProvideFactory f36964a = new FareMediaLockCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaLockCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
