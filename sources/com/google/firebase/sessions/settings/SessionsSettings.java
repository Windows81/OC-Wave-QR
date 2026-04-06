package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class SessionsSettings {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f31605c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final ReadOnlyProperty f31606d = PreferenceDataStoreDelegateKt.b(SessionDataStoreConfigs.f31505a.b(), new ReplaceFileCorruptionHandler(SessionsSettings$Companion$dataStore$2.f31610z), (Function1) null, (CoroutineScope) null, 12, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final SettingsProvider f31607a;

    /* renamed from: b  reason: collision with root package name */
    public final SettingsProvider f31608b;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f31609a = {Reflection.j(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DataStore b(Context context) {
            return (DataStore) SessionsSettings.f31606d.a(context, f31609a[0]);
        }

        public final SessionsSettings c() {
            Object j2 = FirebaseKt.a(Firebase.f29632a).j(SessionsSettings.class);
            Intrinsics.h(j2, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) j2;
        }

        public Companion() {
        }
    }

    public SessionsSettings(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        Intrinsics.i(settingsProvider, "localOverrideSettings");
        Intrinsics.i(settingsProvider2, "remoteSettings");
        this.f31607a = settingsProvider;
        this.f31608b = settingsProvider2;
    }

    public final double b() {
        Double c2 = this.f31607a.c();
        if (c2 != null) {
            double doubleValue = c2.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c3 = this.f31608b.c();
        if (c3 == null) {
            return 1.0d;
        }
        double doubleValue2 = c3.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        Duration b2 = this.f31607a.b();
        if (b2 != null) {
            long a0 = b2.a0();
            if (f(a0)) {
                return a0;
            }
        }
        Duration b3 = this.f31608b.b();
        if (b3 != null) {
            long a02 = b3.a0();
            if (f(a02)) {
                return a02;
            }
        }
        Duration.Companion companion = Duration.f41206A;
        return DurationKt.s(30, DurationUnit.MINUTES);
    }

    public final boolean d() {
        Boolean a2 = this.f31607a.a();
        if (a2 != null) {
            return a2.booleanValue();
        }
        Boolean a3 = this.f31608b.a();
        if (a3 != null) {
            return a3.booleanValue();
        }
        return true;
    }

    public final boolean e(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final boolean f(long j2) {
        return Duration.T(j2) && Duration.N(j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.C
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.ResultKt.b(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.ResultKt.b(r6)
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.f31607a
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.f31608b
            r2 = 0
            r0.C = r2
            r0.F = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, (String) null, 4, (DefaultConstructorMarker) null), f31605c.b(context)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionsSettings(com.google.firebase.FirebaseApp r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.CoroutineContext r10, com.google.firebase.installations.FirebaseInstallationsApi r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            android.content.Context r2 = r8.k()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.Intrinsics.h(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.f31533a
            com.google.firebase.sessions.ApplicationInfo r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(com.google.firebase.FirebaseApp, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, com.google.firebase.installations.FirebaseInstallationsApi):void");
    }
}
