package com.hansecom.abt.api;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ApiModule_OkHttpLoggingFactory implements Factory<HttpLoggingInterceptor> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ApiModule_OkHttpLoggingFactory f33097a = new ApiModule_OkHttpLoggingFactory();
    }

    public static HttpLoggingInterceptor b() {
        return (HttpLoggingInterceptor) Preconditions.d(ApiModule.f33084a.e());
    }

    /* renamed from: a */
    public HttpLoggingInterceptor get() {
        return b();
    }
}
