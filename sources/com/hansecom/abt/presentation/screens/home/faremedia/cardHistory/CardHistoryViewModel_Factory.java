package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class CardHistoryViewModel_Factory implements Factory<CardHistoryViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f36399a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f36400b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f36401c;

    public static CardHistoryViewModel b(SavedStateHandle savedStateHandle, CardHistoryRepository cardHistoryRepository, FareMediaRepository fareMediaRepository) {
        return new CardHistoryViewModel(savedStateHandle, cardHistoryRepository, fareMediaRepository);
    }

    /* renamed from: a */
    public CardHistoryViewModel get() {
        return b((SavedStateHandle) this.f36399a.get(), (CardHistoryRepository) this.f36400b.get(), (FareMediaRepository) this.f36401c.get());
    }
}
