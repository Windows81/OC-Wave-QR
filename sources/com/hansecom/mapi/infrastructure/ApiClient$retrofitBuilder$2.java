package com.hansecom.mapi.infrastructure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Metadata
public final class ApiClient$retrofitBuilder$2 extends Lambda implements Function0<Retrofit.Builder> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ApiClient f39133z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiClient$retrofitBuilder$2(ApiClient apiClient) {
        super(0);
        this.f39133z = apiClient;
    }

    /* renamed from: b */
    public final Retrofit.Builder invoke() {
        Retrofit.Builder c2 = new Retrofit.Builder().c(this.f39133z.f39120a);
        for (CallAdapter.Factory a2 : this.f39133z.f39123d) {
            c2.a(a2);
        }
        for (Converter.Factory b2 : this.f39133z.f39124e) {
            c2.b(b2);
        }
        return c2;
    }
}
