package com.hansecom.abt.presentation.screens.home.faremedia.createCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.CreateFareMediaCardUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaCreateCardViewModel_Factory implements Factory<FareMediaCreateCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36689a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36690b;

    public static FareMediaCreateCardViewModel b(SavedStateHandle savedStateHandle, CreateFareMediaCardUseCase createFareMediaCardUseCase) {
        return new FareMediaCreateCardViewModel(savedStateHandle, createFareMediaCardUseCase);
    }

    /* renamed from: a */
    public FareMediaCreateCardViewModel get() {
        return b((SavedStateHandle) this.f36689a.get(), (CreateFareMediaCardUseCase) this.f36690b.get());
    }
}
