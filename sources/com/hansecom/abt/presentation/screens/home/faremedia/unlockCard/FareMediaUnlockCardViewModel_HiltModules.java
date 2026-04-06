package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import dagger.Module;

public final class FareMediaUnlockCardViewModel_HiltModules {

    @Module
    public static abstract class BindsModule {
    }

    @Module
    public static final class KeyModule {
        public static boolean a() {
            return true;
        }
    }
}
