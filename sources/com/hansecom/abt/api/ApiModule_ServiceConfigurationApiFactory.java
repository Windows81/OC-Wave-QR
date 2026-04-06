package com.hansecom.abt.api;

import com.hansecom.mapi.apis.ConfigurationApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceConfigurationApiFactory implements Factory<ConfigurationApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33100a;

    public static ConfigurationApi b(ApiClient apiClient) {
        return (ConfigurationApi) Preconditions.d(ApiModule.f33084a.i(apiClient));
    }

    /* renamed from: a */
    public ConfigurationApi get() {
        return b((ApiClient) this.f33100a.get());
    }
}
