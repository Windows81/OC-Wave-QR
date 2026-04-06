package com.lokalise.sdk.api;

import com.google.gson.GsonBuilder;
import com.lokalise.sdk.api.Params;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata
public final class RetrofitInitImpl implements RetrofitInit {
    private final SdkEndpoints api;

    public RetrofitInitImpl(SdkOkHttpClient sdkOkHttpClient) {
        Intrinsics.i(sdkOkHttpClient, "appHttpClient");
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.d().e();
        Object b2 = new Retrofit.Builder().c(Params.Api.INSTANCE.getHOSTNAME()).b(GsonConverterFactory.f(gsonBuilder.b())).g(sdkOkHttpClient.getOkHttpClient()).e().b(SdkEndpoints.class);
        Intrinsics.h(b2, "retrofit.create(SdkEndpoints::class.java)");
        this.api = (SdkEndpoints) b2;
    }

    public SdkEndpoints getApi() {
        return this.api;
    }
}
