package com.hansecom.mapi.infrastructure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;

@Metadata
public final class ApiClient$clientBuilder$2 extends Lambda implements Function0<OkHttpClient.Builder> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ApiClient f39131z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiClient$clientBuilder$2(ApiClient apiClient) {
        super(0);
        this.f39131z = apiClient;
    }

    /* renamed from: b */
    public final OkHttpClient.Builder invoke() {
        OkHttpClient.Builder g2 = this.f39131z.f39121b;
        return g2 == null ? this.f39131z.k() : g2;
    }
}
