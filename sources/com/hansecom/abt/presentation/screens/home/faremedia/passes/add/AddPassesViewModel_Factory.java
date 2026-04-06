package com.hansecom.abt.presentation.screens.home.faremedia.passes.add;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddPassesViewModel_Factory implements Factory<AddPassesViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f37049a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f37050b;

    public static AddPassesViewModel b(SavedStateHandle savedStateHandle, FareMediaPassesToOfferRepository fareMediaPassesToOfferRepository) {
        return new AddPassesViewModel(savedStateHandle, fareMediaPassesToOfferRepository);
    }

    /* renamed from: a */
    public AddPassesViewModel get() {
        return b((SavedStateHandle) this.f37049a.get(), (FareMediaPassesToOfferRepository) this.f37050b.get());
    }
}
