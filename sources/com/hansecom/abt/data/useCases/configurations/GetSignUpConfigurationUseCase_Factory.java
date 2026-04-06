package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetSignUpConfigurationUseCase_Factory implements Factory<GetSignUpConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33889a;

    public static GetSignUpConfigurationUseCase b(Json json) {
        return new GetSignUpConfigurationUseCase(json);
    }

    /* renamed from: a */
    public GetSignUpConfigurationUseCase get() {
        return b((Json) this.f33889a.get());
    }
}
