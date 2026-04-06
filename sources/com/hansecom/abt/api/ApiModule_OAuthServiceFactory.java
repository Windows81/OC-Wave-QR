package com.hansecom.abt.api;

import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.hansecom.abt.api.oauth.OAuthService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ApiModule_OAuthServiceFactory implements Factory<OAuthService> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33092a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33093b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33094c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33095d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f33096e;

    public static OAuthService b(AppPropertiesHeaderInterceptor appPropertiesHeaderInterceptor, HttpLoggingInterceptor httpLoggingInterceptor, ChuckerInterceptor chuckerInterceptor, Json json, RealmPreferences realmPreferences) {
        return (OAuthService) Preconditions.d(ApiModule.f33084a.d(appPropertiesHeaderInterceptor, httpLoggingInterceptor, chuckerInterceptor, json, realmPreferences));
    }

    /* renamed from: a */
    public OAuthService get() {
        return b((AppPropertiesHeaderInterceptor) this.f33092a.get(), (HttpLoggingInterceptor) this.f33093b.get(), (ChuckerInterceptor) this.f33094c.get(), (Json) this.f33095d.get(), (RealmPreferences) this.f33096e.get());
    }
}
