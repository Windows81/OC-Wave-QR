package com.hansecom.abt.api;

import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.hansecom.abt.api.oauth.OAuthAuthenticator;
import com.hansecom.abt.api.oauth.OAuthInterceptor;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ApiModule_ApiClientFactory implements Factory<ApiClient> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33085a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33086b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33087c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33088d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f33089e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f33090f;

    public static ApiClient a(AppPropertiesHeaderInterceptor appPropertiesHeaderInterceptor, HttpLoggingInterceptor httpLoggingInterceptor, OAuthInterceptor oAuthInterceptor, OAuthAuthenticator oAuthAuthenticator, ChuckerInterceptor chuckerInterceptor, RealmPreferences realmPreferences) {
        return (ApiClient) Preconditions.d(ApiModule.f33084a.b(appPropertiesHeaderInterceptor, httpLoggingInterceptor, oAuthInterceptor, oAuthAuthenticator, chuckerInterceptor, realmPreferences));
    }

    /* renamed from: b */
    public ApiClient get() {
        return a((AppPropertiesHeaderInterceptor) this.f33085a.get(), (HttpLoggingInterceptor) this.f33086b.get(), (OAuthInterceptor) this.f33087c.get(), (OAuthAuthenticator) this.f33088d.get(), (ChuckerInterceptor) this.f33089e.get(), (RealmPreferences) this.f33090f.get());
    }
}
