package com.hansecom.abt.presentation.screens.home.trip;

import com.hansecom.abt.presentation.screens.home.trip.TripPlannerViewModel_HiltModules;
import dagger.internal.Factory;

public final class TripPlannerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final TripPlannerViewModel_HiltModules_KeyModule_ProvideFactory f37506a = new TripPlannerViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static boolean b() {
        return TripPlannerViewModel_HiltModules.KeyModule.a();
    }

    /* renamed from: a */
    public Boolean get() {
        return Boolean.valueOf(b());
    }
}
