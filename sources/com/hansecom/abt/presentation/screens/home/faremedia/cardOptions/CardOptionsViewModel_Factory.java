package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.useCases.configurations.GetCardOptionsMenuConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CardOptionsViewModel_Factory implements Factory<CardOptionsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36577a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36578b;

    public static CardOptionsViewModel b(SavedStateHandle savedStateHandle, GetCardOptionsMenuConfigurationUseCase getCardOptionsMenuConfigurationUseCase) {
        return new CardOptionsViewModel(savedStateHandle, getCardOptionsMenuConfigurationUseCase);
    }

    /* renamed from: a */
    public CardOptionsViewModel get() {
        return b((SavedStateHandle) this.f36577a.get(), (GetCardOptionsMenuConfigurationUseCase) this.f36578b.get());
    }
}
