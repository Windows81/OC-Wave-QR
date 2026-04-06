package com.hansecom.abt.api;

import com.hansecom.mapi.apis.AutoloadsApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceAutoloadsApiFactory implements Factory<AutoloadsApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33099a;

    public static AutoloadsApi b(ApiClient apiClient) {
        return (AutoloadsApi) Preconditions.d(ApiModule.f33084a.h(apiClient));
    }

    /* renamed from: a */
    public AutoloadsApi get() {
        return b((ApiClient) this.f33099a.get());
    }
}
