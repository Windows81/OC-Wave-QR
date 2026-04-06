package com.hansecom.abt.presentation.screens.helpRequest;

import dagger.Module;

public final class HelpRequestViewModel_HiltModules {

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
