package com.lokalise.sdk.api;

import android.os.Build;
import com.lokalise.sdk.Lokalise;
import com.lokalise.sdk.api.Params;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata
public final class SdkOkHttpClient {
    public OkHttpClient okHttpClient;

    @Metadata
    public final class HeadersInterceptor implements Interceptor {
        private final String userAgent;

        public HeadersInterceptor() {
            Lokalise lokalise = Lokalise.INSTANCE;
            String packageName$sdk_release = lokalise.getPackageName$sdk_release();
            String appVersion$sdk_release = lokalise.getAppVersion$sdk_release();
            String appLanguage$sdk_release = lokalise.getAppLanguage$sdk_release();
            String str = Build.MODEL;
            String str2 = Build.DEVICE;
            String str3 = Build.VERSION.RELEASE;
            int i2 = Build.VERSION.SDK_INT;
            this.userAgent = "Lokalise SDK; 237; Android; " + packageName$sdk_release + "; " + appVersion$sdk_release + "; " + appLanguage$sdk_release + "; " + str + " (" + str2 + "); " + str3 + " (" + i2 + ");";
        }

        public Response intercept(Interceptor.Chain chain) {
            Intrinsics.i(chain, "chain");
            Request m2 = chain.m();
            SdkOkHttpClient sdkOkHttpClient = SdkOkHttpClient.this;
            Intrinsics.h(m2, "request");
            if (sdkOkHttpClient.ifFirstRequestProceeded(m2)) {
                Headers.Builder i2 = m2.f().i();
                Lokalise lokalise = Lokalise.INSTANCE;
                i2.a(Params.Headers.SDK_TOKEN, lokalise.getSdkToken$sdk_release());
                i2.a(Params.Headers.PROJECT_ID, lokalise.getProjectId$sdk_release());
                i2.a(Params.Headers.PRE_RELEASE, String.valueOf(Lokalise.isPreRelease() ? 1 : 0));
                i2.a(Params.Headers.CURRENT_BUNDLE, String.valueOf(Lokalise.getCurrentBundleId()));
                i2.a(Params.Headers.LANGUAGE, lokalise.getAppLanguage$sdk_release());
                i2.a(Params.Headers.REGION, lokalise.getAppCountry$sdk_release());
                i2.a(Params.Headers.APP_LANGUAGE, lokalise.getAppLangId$sdk_release());
                i2.a(Params.Headers.DEVICE_LANGUAGE, lokalise.getDeviceLangId$sdk_release());
                i2.a(Params.Headers.SDK_BUILD, lokalise.getAndroidSDKVersion$sdk_release());
                i2.a(Params.Headers.APP_BUILD, lokalise.getAppVersion$sdk_release());
                i2.a(Params.Headers.UID, Lokalise.getUserUUID());
                i2.e(Params.Headers.USER_AGENT, this.userAgent);
                Response b2 = chain.b(m2.i().e(i2.f()).b());
                Intrinsics.h(b2, "chain.proceed(request.ne…headers(headers).build())");
                return b2;
            }
            Response b3 = chain.b(m2);
            Intrinsics.h(b3, "chain.proceed(request)");
            return b3;
        }
    }

    @Metadata
    public final class TimeoutInterceptor implements Interceptor {
        public TimeoutInterceptor() {
        }

        private final Pair<Integer, Integer> calculateTimeout(boolean z2) {
            return z2 ? new Pair<>(Integer.valueOf(Params.Timeout.CONNECT_LONG), Integer.valueOf(Params.Timeout.READ_LONG)) : new Pair<>(Integer.valueOf(Params.Timeout.CONNECT_SHORT), Integer.valueOf(Params.Timeout.READ_SHORT));
        }

        public Response intercept(Interceptor.Chain chain) {
            Intrinsics.i(chain, "chain");
            Request m2 = chain.m();
            SdkOkHttpClient sdkOkHttpClient = SdkOkHttpClient.this;
            Intrinsics.h(m2, "request");
            Pair<Integer, Integer> calculateTimeout = calculateTimeout(!sdkOkHttpClient.ifFirstRequestProceeded(m2));
            Request b2 = m2.i().g(Params.Headers.ATTEMPTS).b();
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.API;
            HttpUrl k2 = m2.k();
            Object e2 = calculateTimeout.e();
            Object f2 = calculateTimeout.f();
            logger.printDebug(logType, "Proceed " + k2 + " with timeouts: connect – " + e2 + "; read – " + f2);
            int intValue = ((Number) calculateTimeout.e()).intValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Interceptor.Chain d2 = chain.a(intValue, timeUnit).d(((Number) calculateTimeout.f()).intValue(), timeUnit);
            Intrinsics.h(d2, "chain.run {\n            …          )\n            }");
            Response b3 = d2.b(b2);
            Intrinsics.h(b3, "newChain.proceed(newRequest)");
            return b3;
        }
    }

    public SdkOkHttpClient() {
        try {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.a(new HeadersInterceptor());
            builder.a(new TimeoutInterceptor());
            OkHttpClient c2 = builder.c();
            Intrinsics.h(c2, "Builder().run {\n        …    build()\n            }");
            setOkHttpClient(c2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final boolean ifFirstRequestProceeded(Request request) {
        String d2 = request.k().d();
        Intrinsics.h(d2, "url().encodedPath()");
        return StringsKt.z(d2, Params.Api.PLATFORM, false);
    }

    public final OkHttpClient getOkHttpClient() {
        OkHttpClient okHttpClient2 = this.okHttpClient;
        if (okHttpClient2 != null) {
            return okHttpClient2;
        }
        Intrinsics.y("okHttpClient");
        return null;
    }

    public final void setOkHttpClient(OkHttpClient okHttpClient2) {
        Intrinsics.i(okHttpClient2, "<set-?>");
        this.okHttpClient = okHttpClient2;
    }
}
