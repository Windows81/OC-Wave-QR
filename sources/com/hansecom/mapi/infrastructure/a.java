package com.hansecom.mapi.infrastructure;

import okhttp3.logging.HttpLoggingInterceptor;

public final /* synthetic */ class a implements HttpLoggingInterceptor.Logger {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ApiClient f39164a;

    public /* synthetic */ a(ApiClient apiClient) {
        this.f39164a = apiClient;
    }

    public final void a(String str) {
        ApiClient$defaultClientBuilder$2.e(this.f39164a, str);
    }
}
