package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.menu.MenuConfigConverter;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetMoreMenuConfigurationUseCase_Factory implements Factory<GetMoreMenuConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33880a;

    public static GetMoreMenuConfigurationUseCase b(MenuConfigConverter menuConfigConverter) {
        return new GetMoreMenuConfigurationUseCase(menuConfigConverter);
    }

    /* renamed from: a */
    public GetMoreMenuConfigurationUseCase get() {
        return b((MenuConfigConverter) this.f33880a.get());
    }
}
