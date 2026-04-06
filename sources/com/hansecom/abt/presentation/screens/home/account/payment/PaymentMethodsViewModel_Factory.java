package com.hansecom.abt.presentation.screens.home.account.payment;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.PaymentMethodsRepository;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class PaymentMethodsViewModel_Factory implements Factory<PaymentMethodsViewModel> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f35526a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f35527b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f35528c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f35529d;

    public static PaymentMethodsViewModel b(SavedStateHandle savedStateHandle, PaymentMethodsRepository paymentMethodsRepository, EnvironmentConfigurationRepository environmentConfigurationRepository, UserRepository userRepository) {
        return new PaymentMethodsViewModel(savedStateHandle, paymentMethodsRepository, environmentConfigurationRepository, userRepository);
    }

    /* renamed from: a */
    public PaymentMethodsViewModel get() {
        return b((SavedStateHandle) this.f35526a.get(), (PaymentMethodsRepository) this.f35527b.get(), (EnvironmentConfigurationRepository) this.f35528c.get(), (UserRepository) this.f35529d.get());
    }
}
