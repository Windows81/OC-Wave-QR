package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.UnlockFareMediaCardUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaUnlockCardViewModel_Factory implements Factory<FareMediaUnlockCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37378a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37379b;

    public static FareMediaUnlockCardViewModel b(SavedStateHandle savedStateHandle, UnlockFareMediaCardUseCase unlockFareMediaCardUseCase) {
        return new FareMediaUnlockCardViewModel(savedStateHandle, unlockFareMediaCardUseCase);
    }

    /* renamed from: a */
    public FareMediaUnlockCardViewModel get() {
        return b((SavedStateHandle) this.f37378a.get(), (UnlockFareMediaCardUseCase) this.f37379b.get());
    }
}
