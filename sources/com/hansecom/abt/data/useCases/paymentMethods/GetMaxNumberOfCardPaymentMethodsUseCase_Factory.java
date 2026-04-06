package com.hansecom.abt.data.useCases.paymentMethods;

import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetMaxNumberOfCardPaymentMethodsUseCase_Factory implements Factory<GetMaxNumberOfCardPaymentMethodsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34053a;

    public static GetMaxNumberOfCardPaymentMethodsUseCase b(EnvironmentConfigurationRepository environmentConfigurationRepository) {
        return new GetMaxNumberOfCardPaymentMethodsUseCase(environmentConfigurationRepository);
    }

    /* renamed from: a */
    public GetMaxNumberOfCardPaymentMethodsUseCase get() {
        return b((EnvironmentConfigurationRepository) this.f34053a.get());
    }
}
