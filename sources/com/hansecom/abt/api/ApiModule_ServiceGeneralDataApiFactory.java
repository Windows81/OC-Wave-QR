package com.hansecom.abt.api;

import com.hansecom.mapi.apis.GeneralDataApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceGeneralDataApiFactory implements Factory<GeneralDataApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33102a;

    public static GeneralDataApi b(ApiClient apiClient) {
        return (GeneralDataApi) Preconditions.d(ApiModule.f33084a.k(apiClient));
    }

    /* renamed from: a */
    public GeneralDataApi get() {
        return b((ApiClient) this.f33102a.get());
    }
}
