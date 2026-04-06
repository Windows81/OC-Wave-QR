package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import dagger.Module;

public final class GuidedTourViewModel_HiltModules {

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
