package com.hansecom.abt.data.useCases.appUpdate;

import com.hansecom.abt.AppInfo;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.data.useCases.configurations.GetAppUpdateConfigurationUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GetAppUpdateUseCase_Factory implements Factory<GetAppUpdateUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33783a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33784b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33785c;

    public static GetAppUpdateUseCase b(AppInfo appInfo, GetAppUpdateConfigurationUseCase getAppUpdateConfigurationUseCase, AppPreferences appPreferences) {
        return new GetAppUpdateUseCase(appInfo, getAppUpdateConfigurationUseCase, appPreferences);
    }

    /* renamed from: a */
    public GetAppUpdateUseCase get() {
        return b((AppInfo) this.f33783a.get(), (GetAppUpdateConfigurationUseCase) this.f33784b.get(), (AppPreferences) this.f33785c.get());
    }
}
