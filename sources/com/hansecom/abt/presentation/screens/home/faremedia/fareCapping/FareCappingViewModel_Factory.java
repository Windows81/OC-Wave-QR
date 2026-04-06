package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.FareCappingRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareCappingViewModel_Factory implements Factory<FareCappingViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36742a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36743b;

    public static FareCappingViewModel b(SavedStateHandle savedStateHandle, FareCappingRepository fareCappingRepository) {
        return new FareCappingViewModel(savedStateHandle, fareCappingRepository);
    }

    /* renamed from: a */
    public FareCappingViewModel get() {
        return b((SavedStateHandle) this.f36742a.get(), (FareCappingRepository) this.f36743b.get());
    }
}
