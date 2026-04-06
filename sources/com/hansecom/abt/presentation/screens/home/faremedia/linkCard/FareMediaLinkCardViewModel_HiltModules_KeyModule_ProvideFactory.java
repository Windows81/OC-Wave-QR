package com.hansecom.abt.presentation.screens.home.faremedia.linkCard;

import com.hansecom.abt.presentation.screens.home.faremedia.linkCard.FareMediaLinkCardViewModel_HiltModules;
import dagger.internal.Factory;

public final class FareMediaLinkCardViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final FareMediaLinkCardViewModel_HiltModules_KeyModule_ProvideFactory f36931a = new FareMediaLinkCardViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return FareMediaLinkCardViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
