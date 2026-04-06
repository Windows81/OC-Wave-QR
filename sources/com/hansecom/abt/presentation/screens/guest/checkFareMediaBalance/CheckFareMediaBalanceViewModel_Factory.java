package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CheckFareMediaBalanceViewModel_Factory implements Factory<CheckFareMediaBalanceViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34726a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f34727b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f34728c;

    public static CheckFareMediaBalanceViewModel b(SavedStateHandle savedStateHandle, AppFeatures appFeatures, CheckFareMediaCardBalanceUseCase checkFareMediaCardBalanceUseCase) {
        return new CheckFareMediaBalanceViewModel(savedStateHandle, appFeatures, checkFareMediaCardBalanceUseCase);
    }

    /* renamed from: a */
    public CheckFareMediaBalanceViewModel get() {
        return b((SavedStateHandle) this.f34726a.get(), (AppFeatures) this.f34727b.get(), (CheckFareMediaCardBalanceUseCase) this.f34728c.get());
    }
}
