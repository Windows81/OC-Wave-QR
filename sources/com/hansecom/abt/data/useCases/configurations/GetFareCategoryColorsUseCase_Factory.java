package com.hansecom.abt.data.useCases.configurations;

import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class GetFareCategoryColorsUseCase_Factory implements Factory<GetFareCategoryColorsUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33871a;

    public static GetFareCategoryColorsUseCase b(Json json) {
        return new GetFareCategoryColorsUseCase(json);
    }

    /* renamed from: a */
    public GetFareCategoryColorsUseCase get() {
        return b((Json) this.f33871a.get());
    }
}
