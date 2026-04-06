package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.menu.MenuConfigConverter;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetGuestMenuConfigurationUseCase_Factory implements Factory<GetGuestMenuConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33873a;

    public static GetGuestMenuConfigurationUseCase b(MenuConfigConverter menuConfigConverter) {
        return new GetGuestMenuConfigurationUseCase(menuConfigConverter);
    }

    /* renamed from: a */
    public GetGuestMenuConfigurationUseCase get() {
        return b((MenuConfigConverter) this.f33873a.get());
    }
}
