package com.hansecom.abt.presentation.screens.home.faremedia.lockCard;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.fareMedia.LockFareMediaCardUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class FareMediaLockCardViewModel_Factory implements Factory<FareMediaLockCardViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36961a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36962b;

    public static FareMediaLockCardViewModel b(SavedStateHandle savedStateHandle, LockFareMediaCardUseCase lockFareMediaCardUseCase) {
        return new FareMediaLockCardViewModel(savedStateHandle, lockFareMediaCardUseCase);
    }

    /* renamed from: a */
    public FareMediaLockCardViewModel get() {
        return b((SavedStateHandle) this.f36961a.get(), (LockFareMediaCardUseCase) this.f36962b.get());
    }
}
