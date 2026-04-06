package com.hansecom.abt.api;

import android.content.Context;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import com.hansecom.abt.api.oauth.OAuthAuthenticator;
import com.hansecom.abt.api.oauth.OAuthInterceptor;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.mapi.apis.AnonymousFareMediaApi;
import com.hansecom.mapi.apis.AutoloadsApi;
import com.hansecom.mapi.apis.ConfigurationApi;
import com.hansecom.mapi.apis.FeedbackApi;
import com.hansecom.mapi.apis.GeneralDataApi;
import com.hansecom.mapi.apis.InstitutionsApi;
import com.hansecom.mapi.apis.PurchaseOperationsApi;
import com.hansecom.mapi.apis.SigningApi;
import com.hansecom.mapi.apis.UserDataApi;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.infrastructure.ApiClient;
import dagger.Module;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory;
import timber.log.Timber;

@Metadata
@Module
public final class ApiModule {

    /* renamed from: a  reason: collision with root package name */
    public static final ApiModule f33084a = new ApiModule();

    public static final void f(String str) {
        Intrinsics.i(str, "message");
        Timber.f44337a.i(str, new Object[0]);
    }

    public final ApiClient b(AppPropertiesHeaderInterceptor appPropertiesHeaderInterceptor, HttpLoggingInterceptor httpLoggingInterceptor, OAuthInterceptor oAuthInterceptor, OAuthAuthenticator oAuthAuthenticator, ChuckerInterceptor chuckerInterceptor, RealmPreferences realmPreferences) {
        Intrinsics.i(appPropertiesHeaderInterceptor, "appPropertiesHeaderInterceptor");
        Intrinsics.i(httpLoggingInterceptor, "loggingInterceptor");
        Intrinsics.i(oAuthInterceptor, "oAuthInterceptor");
        Intrinsics.i(oAuthAuthenticator, "oAuthAuthenticator");
        Intrinsics.i(chuckerInterceptor, "chuckerInterceptor");
        Intrinsics.i(realmPreferences, "realmPreferences");
        OkHttpClient.Builder B2 = new OkHttpClient().B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new ApiClient(realmPreferences.l().f(), B2.H(30, timeUnit).I(60, timeUnit).a(chuckerInterceptor).a(appPropertiesHeaderInterceptor).a(oAuthInterceptor).a(httpLoggingInterceptor).b(oAuthAuthenticator), (Call.Factory) null, (List) null, (List) null, 28, (DefaultConstructorMarker) null);
    }

    public final ChuckerInterceptor c(Context context) {
        Intrinsics.i(context, "context");
        return new ChuckerInterceptor.Builder(context).a();
    }

    public final OAuthService d(AppPropertiesHeaderInterceptor appPropertiesHeaderInterceptor, HttpLoggingInterceptor httpLoggingInterceptor, ChuckerInterceptor chuckerInterceptor, Json json, RealmPreferences realmPreferences) {
        Intrinsics.i(appPropertiesHeaderInterceptor, "appPropertiesHeaderInterceptor");
        Intrinsics.i(httpLoggingInterceptor, "loggingInterceptor");
        Intrinsics.i(chuckerInterceptor, "chuckerInterceptor");
        Intrinsics.i(json, "json");
        Intrinsics.i(realmPreferences, "realmPreferences");
        OkHttpClient.Builder B2 = new OkHttpClient().B();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Object b2 = new Retrofit.Builder().c(realmPreferences.l().n()).g(B2.H(30, timeUnit).I(60, timeUnit).a(chuckerInterceptor).a(appPropertiesHeaderInterceptor).a(httpLoggingInterceptor).c()).b(KotlinSerializationConverterFactory.a(json, MediaType.f42680e.a("application/json; charset=UTF8"))).e().b(OAuthService.class);
        Intrinsics.h(b2, "create(...)");
        return (OAuthService) b2;
    }

    public final HttpLoggingInterceptor e() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a());
        httpLoggingInterceptor.b(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    public final AnonymousFareMediaApi g(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (AnonymousFareMediaApi) apiClient.h(AnonymousFareMediaApi.class);
    }

    public final AutoloadsApi h(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (AutoloadsApi) apiClient.h(AutoloadsApi.class);
    }

    public final ConfigurationApi i(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (ConfigurationApi) apiClient.h(ConfigurationApi.class);
    }

    public final FeedbackApi j(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (FeedbackApi) apiClient.h(FeedbackApi.class);
    }

    public final GeneralDataApi k(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (GeneralDataApi) apiClient.h(GeneralDataApi.class);
    }

    public final InstitutionsApi l(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (InstitutionsApi) apiClient.h(InstitutionsApi.class);
    }

    public final PurchaseOperationsApi m(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (PurchaseOperationsApi) apiClient.h(PurchaseOperationsApi.class);
    }

    public final SigningApi n(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (SigningApi) apiClient.h(SigningApi.class);
    }

    public final UserDataApi o(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (UserDataApi) apiClient.h(UserDataApi.class);
    }

    public final UserFareMediaApi p(ApiClient apiClient) {
        Intrinsics.i(apiClient, "api");
        return (UserFareMediaApi) apiClient.h(UserFareMediaApi.class);
    }
}
