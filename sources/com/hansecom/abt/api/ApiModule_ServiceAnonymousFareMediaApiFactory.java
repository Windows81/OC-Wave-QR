package com.hansecom.abt.api;

import com.hansecom.mapi.apis.AnonymousFareMediaApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceAnonymousFareMediaApiFactory implements Factory<AnonymousFareMediaApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33098a;

    public static AnonymousFareMediaApi b(ApiClient apiClient) {
        return (AnonymousFareMediaApi) Preconditions.d(ApiModule.f33084a.g(apiClient));
    }

    /* renamed from: a */
    public AnonymousFareMediaApi get() {
        return b((ApiClient) this.f33098a.get());
    }
}
