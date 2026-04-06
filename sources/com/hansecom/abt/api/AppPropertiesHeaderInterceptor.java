package com.hansecom.abt.api;

import android.os.Build;
import com.hansecom.abt.AppInfo;
import com.hansecom.abt.util.StringExtKt;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Singleton
@Metadata
public final class AppPropertiesHeaderInterceptor implements Interceptor {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f33109c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final AppInfo f33110a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33111b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AppPropertiesHeaderInterceptor(RealmPreferences realmPreferences, AppInfo appInfo) {
        Intrinsics.i(realmPreferences, "realmPreferences");
        Intrinsics.i(appInfo, "appInfo");
        this.f33110a = appInfo;
        this.f33111b = realmPreferences.l().o();
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        Request.Builder i2 = chain.m().i();
        i2.a("appId", this.f33111b);
        i2.a("app-version", this.f33110a.a());
        i2.a("app-platform", "Android");
        i2.a("app-platform-version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MODEL;
        Intrinsics.h(str, "MODEL");
        i2.a("device-type", StringExtKt.d(str));
        return chain.b(i2.b());
    }
}
