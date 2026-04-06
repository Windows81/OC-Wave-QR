package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SessionEvents {

    /* renamed from: a  reason: collision with root package name */
    public static final SessionEvents f31533a = new SessionEvents();

    /* renamed from: b  reason: collision with root package name */
    public static final DataEncoder f31534b;

    static {
        DataEncoder i2 = new JsonDataEncoderBuilder().j(AutoSessionEventEncoder.f31443a).k(true).i();
        Intrinsics.h(i2, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f31534b = i2;
    }

    public final SessionEvent a(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map map, String str, String str2) {
        Map map2 = map;
        Intrinsics.i(firebaseApp, "firebaseApp");
        Intrinsics.i(sessionDetails, "sessionDetails");
        Intrinsics.i(sessionsSettings, "sessionsSettings");
        Intrinsics.i(map2, "subscribers");
        Intrinsics.i(str, "firebaseInstallationId");
        Intrinsics.i(str2, "firebaseAuthenticationToken");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new DataCollectionStatus(d((SessionSubscriber) map2.get(SessionSubscriber.Name.PERFORMANCE)), d((SessionSubscriber) map2.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.b()), str, str2), b(firebaseApp));
    }

    public final ApplicationInfo b(FirebaseApp firebaseApp) {
        Intrinsics.i(firebaseApp, "firebaseApp");
        Context k2 = firebaseApp.k();
        Intrinsics.h(k2, "firebaseApp.applicationContext");
        String packageName = k2.getPackageName();
        PackageInfo packageInfo = k2.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String c2 = firebaseApp.n().c();
        Intrinsics.h(c2, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        Intrinsics.h(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        Intrinsics.h(str2, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.h(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        Intrinsics.h(str5, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f31504a;
        Context k3 = firebaseApp.k();
        Intrinsics.h(k3, "firebaseApp.applicationContext");
        ProcessDetails d2 = processDetailsProvider.d(k3);
        Context k4 = firebaseApp.k();
        Intrinsics.h(k4, "firebaseApp.applicationContext");
        return new ApplicationInfo(c2, str, "2.0.3", str2, logEnvironment, new AndroidApplicationInfo(packageName, str4, valueOf, str5, d2, processDetailsProvider.c(k4)));
    }

    public final DataEncoder c() {
        return f31534b;
    }

    public final DataCollectionState d(SessionSubscriber sessionSubscriber) {
        return sessionSubscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber.a() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }
}
