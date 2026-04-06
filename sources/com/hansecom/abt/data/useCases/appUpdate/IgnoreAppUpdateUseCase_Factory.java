package com.hansecom.abt.data.useCases.appUpdate;

import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class IgnoreAppUpdateUseCase_Factory implements Factory<IgnoreAppUpdateUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33788a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33789b;

    public static IgnoreAppUpdateUseCase b(GetAppUpdateConfigurationUseCase getAppUpdateConfigurationUseCase, AppPreferences appPreferences) {
        return new IgnoreAppUpdateUseCase(getAppUpdateConfigurationUseCase, appPreferences);
    }

    /* renamed from: a */
    public IgnoreAppUpdateUseCase get() {
        return b((GetAppUpdateConfigurationUseCase) this.f33788a.get(), (AppPreferences) this.f33789b.get());
    }
}
