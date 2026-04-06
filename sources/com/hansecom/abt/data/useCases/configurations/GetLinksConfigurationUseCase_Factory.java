package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetLinksConfigurationUseCase_Factory implements Factory<GetLinksConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33876a;

    public static GetLinksConfigurationUseCase b(Json json) {
        return new GetLinksConfigurationUseCase(json);
    }

    /* renamed from: a */
    public GetLinksConfigurationUseCase get() {
        return b((Json) this.f33876a.get());
    }
}
