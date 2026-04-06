package com.hansecom.abt.data.useCases;

import com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetEnvironmentConfigurationUseCase_Factory implements Factory<GetEnvironmentConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33731a;

    public static GetEnvironmentConfigurationUseCase b(EnvironmentConfigurationRepository environmentConfigurationRepository) {
        return new GetEnvironmentConfigurationUseCase(environmentConfigurationRepository);
    }

    /* renamed from: a */
    public GetEnvironmentConfigurationUseCase get() {
        return b((EnvironmentConfigurationRepository) this.f33731a.get());
    }
}
