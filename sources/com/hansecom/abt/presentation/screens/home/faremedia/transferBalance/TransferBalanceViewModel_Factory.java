package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.FareMediaConfigRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.TransferBalanceUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class TransferBalanceViewModel_Factory implements Factory<TransferBalanceViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37327a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37328b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f37329c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f37330d;

    public static TransferBalanceViewModel b(SavedStateHandle savedStateHandle, FareMediaRepository fareMediaRepository, TransferBalanceUseCase transferBalanceUseCase, FareMediaConfigRepository fareMediaConfigRepository) {
        return new TransferBalanceViewModel(savedStateHandle, fareMediaRepository, transferBalanceUseCase, fareMediaConfigRepository);
    }

    /* renamed from: a */
    public TransferBalanceViewModel get() {
        return b((SavedStateHandle) this.f37327a.get(), (FareMediaRepository) this.f37328b.get(), (TransferBalanceUseCase) this.f37329c.get(), (FareMediaConfigRepository) this.f37330d.get());
    }
}
