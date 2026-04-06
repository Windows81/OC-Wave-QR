package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GuidedTourViewModel_Factory implements Factory<GuidedTourViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37452a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37453b;

    public static GuidedTourViewModel b(SavedStateHandle savedStateHandle, Json json) {
        return new GuidedTourViewModel(savedStateHandle, json);
    }

    /* renamed from: a */
    public GuidedTourViewModel get() {
        return b((SavedStateHandle) this.f37452a.get(), (Json) this.f37453b.get());
    }
}
