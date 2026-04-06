package com.hansecom.mapi.infrastructure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata
public final class ApiClient$defaultClientBuilder$2 extends Lambda implements Function0<OkHttpClient.Builder> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ApiClient f39132z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiClient$defaultClientBuilder$2(ApiClient apiClient) {
        super(0);
        this.f39132z = apiClient;
    }

    public static final void e(ApiClient apiClient, String str) {
        Intrinsics.i(apiClient, "this$0");
        Intrinsics.i(str, "message");
        Function1 l2 = apiClient.l();
        if (l2 != null) {
            l2.invoke(str);
        }
    }

    /* renamed from: c */
    public final OkHttpClient.Builder invoke() {
        OkHttpClient.Builder B2 = new OkHttpClient().B();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a(this.f39132z));
        httpLoggingInterceptor.b(HttpLoggingInterceptor.Level.BODY);
        return B2.a(httpLoggingInterceptor);
    }
}
