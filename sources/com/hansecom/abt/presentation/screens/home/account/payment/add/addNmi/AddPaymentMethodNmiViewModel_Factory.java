package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.CountriesRepository;
import com.hansecom.abt.data.repositories.generalData.StatesRepository;
import com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase;
import com.hansecom.abt.util.inputValidators.InputValidators;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AddPaymentMethodNmiViewModel_Factory implements Factory<AddPaymentMethodNmiViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35645a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35646b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35647c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35648d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f35649e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f35650f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f35651g;

    public static AddPaymentMethodNmiViewModel b(SavedStateHandle savedStateHandle, InputValidators inputValidators, AddPaymentMethodNmiUseCase addPaymentMethodNmiUseCase, UserRepository userRepository, CountriesRepository countriesRepository, StatesRepository statesRepository, RealmPreferences realmPreferences) {
        return new AddPaymentMethodNmiViewModel(savedStateHandle, inputValidators, addPaymentMethodNmiUseCase, userRepository, countriesRepository, statesRepository, realmPreferences);
    }

    /* renamed from: a */
    public AddPaymentMethodNmiViewModel get() {
        return b((SavedStateHandle) this.f35645a.get(), (InputValidators) this.f35646b.get(), (AddPaymentMethodNmiUseCase) this.f35647c.get(), (UserRepository) this.f35648d.get(), (CountriesRepository) this.f35649e.get(), (StatesRepository) this.f35650f.get(), (RealmPreferences) this.f35651g.get());
    }
}
