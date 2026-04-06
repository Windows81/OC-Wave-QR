package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f31596d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationInfo f31597a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineContext f31598b;

    /* renamed from: c  reason: collision with root package name */
    public final String f31599c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str) {
        Intrinsics.i(applicationInfo, "appInfo");
        Intrinsics.i(coroutineContext, "blockingDispatcher");
        Intrinsics.i(str, "baseUrl");
        this.f31597a = applicationInfo;
        this.f31598b = coroutineContext;
        this.f31599c = str;
    }

    public Object a(Map map, Function2 function2, Function2 function22, Continuation continuation) {
        Object g2 = BuildersKt.g(this.f31598b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, function2, function22, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }

    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f31599c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f31597a.b()).appendPath("settings").appendQueryParameter("build_version", this.f31597a.a().a()).appendQueryParameter("display_version", this.f31597a.a().f()).build().toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i2 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
