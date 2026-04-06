package com.hansecom.abt.presentation.screens.home.trip;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.configurations.GetLinksConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class TripPlannerViewModel_Factory implements Factory<TripPlannerViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37503a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37504b;

    public static TripPlannerViewModel b(SavedStateHandle savedStateHandle, GetLinksConfigurationUseCase getLinksConfigurationUseCase) {
        return new TripPlannerViewModel(savedStateHandle, getLinksConfigurationUseCase);
    }

    /* renamed from: a */
    public TripPlannerViewModel get() {
        return b((SavedStateHandle) this.f37503a.get(), (GetLinksConfigurationUseCase) this.f37504b.get());
    }
}
