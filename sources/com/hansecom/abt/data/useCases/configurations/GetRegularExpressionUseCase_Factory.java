package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetRegularExpressionUseCase_Factory implements Factory<GetRegularExpressionUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33883a;

    public static GetRegularExpressionUseCase b(Json json) {
        return new GetRegularExpressionUseCase(json);
    }

    /* renamed from: a */
    public GetRegularExpressionUseCase get() {
        return b((Json) this.f33883a.get());
    }
}
