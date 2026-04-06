package com.hansecom.abt.api;

import com.hansecom.mapi.apis.SigningApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceSigningApiFactory implements Factory<SigningApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33105a;

    public static SigningApi b(ApiClient apiClient) {
        return (SigningApi) Preconditions.d(ApiModule.f33084a.n(apiClient));
    }

    /* renamed from: a */
    public SigningApi get() {
        return b((ApiClient) this.f33105a.get());
    }
}
