package com.hansecom.abt.api;

import com.hansecom.mapi.apis.FeedbackApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class ApiModule_ServiceFeedbackApiFactory implements Factory<FeedbackApi> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33101a;

    public static FeedbackApi b(ApiClient apiClient) {
        return (FeedbackApi) Preconditions.d(ApiModule.f33084a.j(apiClient));
    }

    /* renamed from: a */
    public FeedbackApi get() {
        return b((ApiClient) this.f33101a.get());
    }
}
