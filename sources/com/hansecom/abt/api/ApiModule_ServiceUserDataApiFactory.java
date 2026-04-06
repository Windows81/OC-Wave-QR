package com.hansecom.abt.api;

import com.hansecom.mapi.apis.UserDataApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceUserDataApiFactory implements Factory<UserDataApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33106a;

    public static UserDataApi b(ApiClient apiClient) {
        return (UserDataApi) Preconditions.d(ApiModule.f33084a.o(apiClient));
    }

    /* renamed from: a */
    public UserDataApi get() {
        return b((ApiClient) this.f33106a.get());
    }
}
