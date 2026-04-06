package com.hansecom.abt.api;

import com.hansecom.mapi.apis.PurchaseOperationsApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServicePurchaseOperationsApiFactory implements Factory<PurchaseOperationsApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33104a;

    public static PurchaseOperationsApi b(ApiClient apiClient) {
        return (PurchaseOperationsApi) Preconditions.d(ApiModule.f33084a.m(apiClient));
    }

    /* renamed from: a */
    public PurchaseOperationsApi get() {
        return b((ApiClient) this.f33104a.get());
    }
}
