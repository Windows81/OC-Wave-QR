package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.UnlinkFareMediaCardUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaRemoveCardViewModel_Factory implements Factory<FareMediaRemoveCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37244a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37245b;

    public static FareMediaRemoveCardViewModel b(SavedStateHandle savedStateHandle, UnlinkFareMediaCardUseCase unlinkFareMediaCardUseCase) {
        return new FareMediaRemoveCardViewModel(savedStateHandle, unlinkFareMediaCardUseCase);
    }

    /* renamed from: a */
    public FareMediaRemoveCardViewModel get() {
        return b((SavedStateHandle) this.f37244a.get(), (UnlinkFareMediaCardUseCase) this.f37245b.get());
    }
}
