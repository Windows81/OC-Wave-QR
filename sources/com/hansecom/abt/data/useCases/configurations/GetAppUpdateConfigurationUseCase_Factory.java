package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetAppUpdateConfigurationUseCase_Factory implements Factory<GetAppUpdateConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33856a;

    public static GetAppUpdateConfigurationUseCase b(Json json) {
        return new GetAppUpdateConfigurationUseCase(json);
    }

    /* renamed from: a */
    public GetAppUpdateConfigurationUseCase get() {
        return b((Json) this.f33856a.get());
    }
}
