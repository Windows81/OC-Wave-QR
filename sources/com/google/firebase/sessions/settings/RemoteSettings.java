package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class RemoteSettings implements SettingsProvider {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f31588g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f31589a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseInstallationsApi f31590b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f31591c;

    /* renamed from: d  reason: collision with root package name */
    public final CrashlyticsSettingsFetcher f31592d;

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f31593e;

    /* renamed from: f  reason: collision with root package name */
    public final Mutex f31594f = MutexKt.b(false, 1, (Object) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RemoteSettings(CoroutineContext coroutineContext, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, DataStore dataStore) {
        Intrinsics.i(coroutineContext, "backgroundDispatcher");
        Intrinsics.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.i(applicationInfo, "appInfo");
        Intrinsics.i(crashlyticsSettingsFetcher, "configsFetcher");
        Intrinsics.i(dataStore, "dataStore");
        this.f31589a = coroutineContext;
        this.f31590b = firebaseInstallationsApi;
        this.f31591c = applicationInfo;
        this.f31592d = crashlyticsSettingsFetcher;
        this.f31593e = LazyKt.b(new RemoteSettings$settingsCache$2(dataStore));
    }

    public Boolean a() {
        return f().h();
    }

    public Duration b() {
        Integer f2 = f().f();
        if (f2 == null) {
            return null;
        }
        Duration.Companion companion = Duration.f41206A;
        return Duration.l(DurationKt.s(f2.intValue(), DurationUnit.SECONDS));
    }

    public Double c() {
        return f().g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3 A[SYNTHETIC, Splitter:B:41:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5 A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 3
            r4 = 1
            java.lang.String r5 = "SessionConfigFetcher"
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x0053
            if (r2 == r6) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r0 = r0.C
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.b(r14)     // Catch:{ all -> 0x0037 }
            goto L_0x014e
        L_0x0037:
            r14 = move-exception
            goto L_0x0156
        L_0x003a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0042:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.C
            com.google.firebase.sessions.settings.RemoteSettings r4 = (com.google.firebase.sessions.settings.RemoteSettings) r4
            kotlin.ResultKt.b(r14)     // Catch:{ all -> 0x004f }
            goto L_0x00b7
        L_0x004f:
            r14 = move-exception
            r0 = r2
            goto L_0x0156
        L_0x0053:
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r4 = r0.C
            com.google.firebase.sessions.settings.RemoteSettings r4 = (com.google.firebase.sessions.settings.RemoteSettings) r4
            kotlin.ResultKt.b(r14)
            r14 = r2
            goto L_0x0088
        L_0x0060:
            kotlin.ResultKt.b(r14)
            kotlinx.coroutines.sync.Mutex r14 = r13.f31594f
            boolean r14 = r14.b()
            if (r14 != 0) goto L_0x0078
            com.google.firebase.sessions.settings.SettingsCache r14 = r13.f()
            boolean r14 = r14.d()
            if (r14 != 0) goto L_0x0078
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0078:
            kotlinx.coroutines.sync.Mutex r14 = r13.f31594f
            r0.C = r13
            r0.D = r14
            r0.G = r4
            java.lang.Object r2 = r14.d(r7, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r4 = r13
        L_0x0088:
            com.google.firebase.sessions.settings.SettingsCache r2 = r4.f()     // Catch:{ all -> 0x009d }
            boolean r2 = r2.d()     // Catch:{ all -> 0x009d }
            if (r2 != 0) goto L_0x00a3
            java.lang.String r0 = "Remote settings cache not expired. Using cached values."
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x009d }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x009d }
            r14.e(r7)
            return r0
        L_0x009d:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L_0x0156
        L_0x00a3:
            com.google.firebase.sessions.InstallationId$Companion r2 = com.google.firebase.sessions.InstallationId.f31494c     // Catch:{ all -> 0x009d }
            com.google.firebase.installations.FirebaseInstallationsApi r8 = r4.f31590b     // Catch:{ all -> 0x009d }
            r0.C = r4     // Catch:{ all -> 0x009d }
            r0.D = r14     // Catch:{ all -> 0x009d }
            r0.G = r6     // Catch:{ all -> 0x009d }
            java.lang.Object r2 = r2.a(r8, r0)     // Catch:{ all -> 0x009d }
            if (r2 != r1) goto L_0x00b4
            return r1
        L_0x00b4:
            r12 = r2
            r2 = r14
            r14 = r12
        L_0x00b7:
            com.google.firebase.sessions.InstallationId r14 = (com.google.firebase.sessions.InstallationId) r14     // Catch:{ all -> 0x004f }
            java.lang.String r14 = r14.b()     // Catch:{ all -> 0x004f }
            java.lang.String r8 = ""
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r14, r8)     // Catch:{ all -> 0x004f }
            if (r8 == 0) goto L_0x00d0
            java.lang.String r14 = "Error getting Firebase Installation ID. Skipping this Session Event."
            android.util.Log.w(r5, r14)     // Catch:{ all -> 0x004f }
            kotlin.Unit r14 = kotlin.Unit.f40552a     // Catch:{ all -> 0x004f }
            r2.e(r7)
            return r14
        L_0x00d0:
            java.lang.String r8 = "X-Crashlytics-Installation-ID"
            kotlin.Pair r14 = kotlin.TuplesKt.a(r8, r14)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.StringCompanionObject r9 = kotlin.jvm.internal.StringCompanionObject.f40914a     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "%s/%s"
            java.lang.String r10 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x004f }
            java.lang.String r11 = android.os.Build.MODEL     // Catch:{ all -> 0x004f }
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}     // Catch:{ all -> 0x004f }
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r10, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = java.lang.String.format(r9, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "format(format, *args)"
            kotlin.jvm.internal.Intrinsics.h(r6, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r4.g(r6)     // Catch:{ all -> 0x004f }
            kotlin.Pair r6 = kotlin.TuplesKt.a(r8, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r9 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "INCREMENTAL"
            kotlin.jvm.internal.Intrinsics.h(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = r4.g(r9)     // Catch:{ all -> 0x004f }
            kotlin.Pair r8 = kotlin.TuplesKt.a(r8, r9)     // Catch:{ all -> 0x004f }
            java.lang.String r9 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r10 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x004f }
            java.lang.String r11 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.h(r10, r11)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = r4.g(r10)     // Catch:{ all -> 0x004f }
            kotlin.Pair r9 = kotlin.TuplesKt.a(r9, r10)     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "X-Crashlytics-API-Client-Version"
            com.google.firebase.sessions.ApplicationInfo r11 = r4.f31591c     // Catch:{ all -> 0x004f }
            java.lang.String r11 = r11.f()     // Catch:{ all -> 0x004f }
            kotlin.Pair r10 = kotlin.TuplesKt.a(r10, r11)     // Catch:{ all -> 0x004f }
            kotlin.Pair[] r14 = new kotlin.Pair[]{r14, r6, r8, r9, r10}     // Catch:{ all -> 0x004f }
            java.util.Map r14 = kotlin.collections.MapsKt.k(r14)     // Catch:{ all -> 0x004f }
            java.lang.String r6 = "Fetching settings from server."
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x004f }
            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r5 = r4.f31592d     // Catch:{ all -> 0x004f }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r6 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1     // Catch:{ all -> 0x004f }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x004f }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r4 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2     // Catch:{ all -> 0x004f }
            r4.<init>(r7)     // Catch:{ all -> 0x004f }
            r0.C = r2     // Catch:{ all -> 0x004f }
            r0.D = r7     // Catch:{ all -> 0x004f }
            r0.G = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r14 = r5.a(r14, r6, r4, r0)     // Catch:{ all -> 0x004f }
            if (r14 != r1) goto L_0x014d
            return r1
        L_0x014d:
            r0 = r2
        L_0x014e:
            kotlin.Unit r14 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0037 }
            r0.e(r7)
            kotlin.Unit r14 = kotlin.Unit.f40552a
            return r14
        L_0x0156:
            r0.e(r7)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final SettingsCache f() {
        return (SettingsCache) this.f31593e.getValue();
    }

    public final String g(String str) {
        return new Regex("/").e(str, "");
    }
}
