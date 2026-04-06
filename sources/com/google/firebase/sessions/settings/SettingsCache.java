package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class SettingsCache {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f31611c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Preferences.Key f31612d = PreferencesKeys.a("firebase_sessions_enabled");

    /* renamed from: e  reason: collision with root package name */
    public static final Preferences.Key f31613e = PreferencesKeys.c("firebase_sessions_sampling_rate");

    /* renamed from: f  reason: collision with root package name */
    public static final Preferences.Key f31614f = PreferencesKeys.e("firebase_sessions_restart_timeout");

    /* renamed from: g  reason: collision with root package name */
    public static final Preferences.Key f31615g = PreferencesKeys.e("firebase_sessions_cache_duration");

    /* renamed from: h  reason: collision with root package name */
    public static final Preferences.Key f31616h = PreferencesKeys.f("firebase_sessions_cache_updated_time");

    /* renamed from: a  reason: collision with root package name */
    public final DataStore f31617a;

    /* renamed from: b  reason: collision with root package name */
    public SessionConfigs f31618b;

    @Metadata
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;
        public final /* synthetic */ SettingsCache F;

        {
            this.F = r1;
        }

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.F, continuation);
        }

        public final Object x(Object obj) {
            SettingsCache settingsCache;
            Object f2 = IntrinsicsKt.f();
            int i2 = this.E;
            if (i2 == 0) {
                ResultKt.b(obj);
                SettingsCache settingsCache2 = this.F;
                Flow data = settingsCache2.f31617a.getData();
                this.D = settingsCache2;
                this.E = 1;
                Object D2 = FlowKt.D(data, this);
                if (D2 == f2) {
                    return f2;
                }
                settingsCache = settingsCache2;
                obj = D2;
            } else if (i2 == 1) {
                settingsCache = (SettingsCache) this.D;
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsCache.m(((Preferences) obj).d());
            return Unit.f40552a;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SettingsCache(DataStore dataStore) {
        Intrinsics.i(dataStore, "dataStore");
        this.f31617a = dataStore;
        Object unused = BuildersKt__BuildersKt.b((CoroutineContext) null, new AnonymousClass1(this, (Continuation) null), 1, (Object) null);
    }

    public final boolean d() {
        SessionConfigs sessionConfigs = this.f31618b;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.y("sessionConfigs");
            sessionConfigs = null;
        }
        Long b2 = sessionConfigs.b();
        SessionConfigs sessionConfigs3 = this.f31618b;
        if (sessionConfigs3 == null) {
            Intrinsics.y("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer a2 = sessionConfigs2.a();
        return b2 == null || a2 == null || (System.currentTimeMillis() - b2.longValue()) / ((long) 1000) >= ((long) a2.intValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.b(r6)     // Catch:{ IOException -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            kotlin.ResultKt.b(r6)
            androidx.datastore.core.DataStore r6 = r5.f31617a     // Catch:{ IOException -> 0x0029 }
            com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.E = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.a(r6, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0047:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove config values: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "SettingsCache"
            android.util.Log.w(r0, r6)
        L_0x005d:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Integer f() {
        SessionConfigs sessionConfigs = this.f31618b;
        if (sessionConfigs == null) {
            Intrinsics.y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.d();
    }

    public final Double g() {
        SessionConfigs sessionConfigs = this.f31618b;
        if (sessionConfigs == null) {
            Intrinsics.y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.e();
    }

    public final Boolean h() {
        SessionConfigs sessionConfigs = this.f31618b;
        if (sessionConfigs == null) {
            Intrinsics.y("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.b(r8)     // Catch:{ IOException -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f31617a     // Catch:{ IOException -> 0x0029 }
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.E = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.a(r8, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0047:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L_0x005d:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.i(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object j(Double d2, Continuation continuation) {
        Object i2 = i(f31613e, d2, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public final Object k(Integer num, Continuation continuation) {
        Object i2 = i(f31615g, num, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public final Object l(Long l2, Continuation continuation) {
        Object i2 = i(f31616h, l2, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public final void m(Preferences preferences) {
        this.f31618b = new SessionConfigs((Boolean) preferences.b(f31612d), (Double) preferences.b(f31613e), (Integer) preferences.b(f31614f), (Integer) preferences.b(f31615g), (Long) preferences.b(f31616h));
    }

    public final Object n(Integer num, Continuation continuation) {
        Object i2 = i(f31614f, num, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }

    public final Object o(Boolean bool, Continuation continuation) {
        Object i2 = i(f31612d, bool, continuation);
        return i2 == IntrinsicsKt.f() ? i2 : Unit.f40552a;
    }
}
