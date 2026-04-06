package com.hansecom.abt.presentation.screens.home.account.address;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.CountriesRepository;
import com.hansecom.abt.data.useCases.account.ChangeAddressUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ChangeAddressViewModel_Factory implements Factory<ChangeAddressViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35144a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35145b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35146c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35147d;

    public static ChangeAddressViewModel b(SavedStateHandle savedStateHandle, UserRepository userRepository, ChangeAddressUseCase changeAddressUseCase, CountriesRepository countriesRepository) {
        return new ChangeAddressViewModel(savedStateHandle, userRepository, changeAddressUseCase, countriesRepository);
    }

    /* renamed from: a */
    public ChangeAddressViewModel get() {
        return b((SavedStateHandle) this.f35144a.get(), (UserRepository) this.f35145b.get(), (ChangeAddressUseCase) this.f35146c.get(), (CountriesRepository) this.f35147d.get());
    }
}
