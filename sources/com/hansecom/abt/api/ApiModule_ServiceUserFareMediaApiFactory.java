package com.hansecom.abt.api;

import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceUserFareMediaApiFactory implements Factory<UserFareMediaApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33107a;

    public static UserFareMediaApi b(ApiClient apiClient) {
        return (UserFareMediaApi) Preconditions.d(ApiModule.f33084a.p(apiClient));
    }

    /* renamed from: a */
    public UserFareMediaApi get() {
        return b((ApiClient) this.f33107a.get());
    }
}
