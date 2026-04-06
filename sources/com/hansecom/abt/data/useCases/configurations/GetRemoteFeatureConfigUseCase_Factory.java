package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetRemoteFeatureConfigUseCase_Factory implements Factory<GetRemoteFeatureConfigUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33886a;

    public static GetRemoteFeatureConfigUseCase b(Json json) {
        return new GetRemoteFeatureConfigUseCase(json);
    }

    /* renamed from: a */
    public GetRemoteFeatureConfigUseCase get() {
        return b((Json) this.f33886a.get());
    }
}
