package com.hansecom.abt.data.useCases.configurations;

import com.hansecom.abt.data.config.menu.AccountMenuConfigConverter;
import com.hansecom.abt.data.preferences.LockPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAccountMenuConfigurationUseCase_Factory implements Factory<GetAccountMenuConfigurationUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33852a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33853b;

    public static GetAccountMenuConfigurationUseCase b(AccountMenuConfigConverter accountMenuConfigConverter, LockPreferences lockPreferences) {
        return new GetAccountMenuConfigurationUseCase(accountMenuConfigConverter, lockPreferences);
    }

    /* renamed from: a */
    public GetAccountMenuConfigurationUseCase get() {
        return b((AccountMenuConfigConverter) this.f33852a.get(), (LockPreferences) this.f33853b.get());
    }
}
