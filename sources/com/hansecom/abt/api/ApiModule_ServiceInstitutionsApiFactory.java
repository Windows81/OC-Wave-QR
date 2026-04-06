package com.hansecom.abt.api;

import com.hansecom.mapi.apis.InstitutionsApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceInstitutionsApiFactory implements Factory<InstitutionsApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33103a;

    public static InstitutionsApi b(ApiClient apiClient) {
        return (InstitutionsApi) Preconditions.d(ApiModule.f33084a.l(apiClient));
    }

    /* renamed from: a */
    public InstitutionsApi get() {
        return b((ApiClient) this.f33103a.get());
    }
}
