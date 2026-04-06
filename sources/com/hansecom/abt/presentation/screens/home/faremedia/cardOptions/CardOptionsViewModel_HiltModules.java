package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import dagger.Module;

public final class CardOptionsViewModel_HiltModules {

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
