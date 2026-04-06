package com.hansecom.abt.presentation.screens.home.trip;

import dagger.Module;

public final class TripPlannerViewModel_HiltModules {

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
