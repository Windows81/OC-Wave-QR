package com.hansecom.abt;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata
public final class RemoteConfigSetup {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f33076c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f33077d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static volatile RemoteConfigSetup f33078e;

    /* renamed from: a  reason: collision with root package name */
    public final CompletableDeferred f33079a;

    /* renamed from: b  reason: collision with root package name */
    public final CoroutineScope f33080b;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.RemoteConfigSetup$1", f = "RemoteConfigSetup.kt", l = {46, 50, 51, 52}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.RemoteConfigSetup$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object D;
        public int E;
        public final /* synthetic */ RemoteConfigSetup F;

        {
            this.F = r1;
        }

        public static final Unit C(FirebaseRemoteConfigSettings.Builder builder) {
            builder.e(60);
            return Unit.f40552a;
        }

        /* renamed from: B */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.F, context, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0104 A[Catch:{ all -> 0x001d }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0118 A[Catch:{ all -> 0x001d }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0119 A[Catch:{ all -> 0x001d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.E
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0042
                if (r1 == r5) goto L_0x003a
                if (r1 == r4) goto L_0x0031
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r0 = r11.D
                com.google.firebase.remoteconfig.FirebaseRemoteConfig r0 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r0
                kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x001d }
                goto L_0x011a
            L_0x001d:
                r12 = move-exception
                goto L_0x014b
            L_0x0020:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0028:
                java.lang.Object r1 = r11.D
                com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r1
                kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x001d }
                goto L_0x0105
            L_0x0031:
                java.lang.Object r1 = r11.D
                com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r1
                kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x001d }
                goto L_0x00f1
            L_0x003a:
                java.lang.Object r1 = r11.D
                com.google.firebase.remoteconfig.FirebaseRemoteConfig r1 = (com.google.firebase.remoteconfig.FirebaseRemoteConfig) r1
                kotlin.ResultKt.b(r12)     // Catch:{ all -> 0x001d }
                goto L_0x0069
            L_0x0042:
                kotlin.ResultKt.b(r12)
                com.google.firebase.ktx.Firebase r12 = com.google.firebase.ktx.Firebase.f30878a     // Catch:{ all -> 0x001d }
                com.google.firebase.remoteconfig.FirebaseRemoteConfig r12 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.a(r12)     // Catch:{ all -> 0x001d }
                com.hansecom.abt.d r1 = new com.hansecom.abt.d     // Catch:{ all -> 0x001d }
                r1.<init>()     // Catch:{ all -> 0x001d }
                com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings r1 = com.google.firebase.remoteconfig.ktx.RemoteConfigKt.b(r1)     // Catch:{ all -> 0x001d }
                com.google.android.gms.tasks.Task r1 = r12.B(r1)     // Catch:{ all -> 0x001d }
                java.lang.String r6 = "setConfigSettingsAsync(...)"
                kotlin.jvm.internal.Intrinsics.h(r1, r6)     // Catch:{ all -> 0x001d }
                r11.D = r12     // Catch:{ all -> 0x001d }
                r11.E = r5     // Catch:{ all -> 0x001d }
                java.lang.Object r1 = kotlinx.coroutines.tasks.TasksKt.a(r1, r11)     // Catch:{ all -> 0x001d }
                if (r1 != r0) goto L_0x0068
                return r0
            L_0x0068:
                r1 = r12
            L_0x0069:
                kotlin.enums.EnumEntries r12 = com.hansecom.abt.data.config.RemoteConfig.h()     // Catch:{ all -> 0x001d }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x001d }
                r6.<init>()     // Catch:{ all -> 0x001d }
                java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x001d }
            L_0x0076:
                boolean r7 = r12.hasNext()     // Catch:{ all -> 0x001d }
                if (r7 == 0) goto L_0x008d
                java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x001d }
                r8 = r7
                com.hansecom.abt.data.config.RemoteConfig r8 = (com.hansecom.abt.data.config.RemoteConfig) r8     // Catch:{ all -> 0x001d }
                java.lang.Integer r8 = r8.f()     // Catch:{ all -> 0x001d }
                if (r8 == 0) goto L_0x0076
                r6.add(r7)     // Catch:{ all -> 0x001d }
                goto L_0x0076
            L_0x008d:
                com.hansecom.abt.RemoteConfigSetup r12 = r11.F     // Catch:{ all -> 0x001d }
                android.content.Context r7 = r9     // Catch:{ all -> 0x001d }
                r8 = 10
                int r8 = kotlin.collections.CollectionsKt.x(r6, r8)     // Catch:{ all -> 0x001d }
                int r8 = kotlin.collections.MapsKt.e(r8)     // Catch:{ all -> 0x001d }
                r9 = 16
                int r8 = kotlin.ranges.RangesKt.e(r8, r9)     // Catch:{ all -> 0x001d }
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x001d }
                r9.<init>(r8)     // Catch:{ all -> 0x001d }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x001d }
            L_0x00aa:
                boolean r8 = r6.hasNext()     // Catch:{ all -> 0x001d }
                if (r8 == 0) goto L_0x00d9
                java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x001d }
                com.hansecom.abt.data.config.RemoteConfig r8 = (com.hansecom.abt.data.config.RemoteConfig) r8     // Catch:{ all -> 0x001d }
                java.lang.String r10 = r8.j()     // Catch:{ all -> 0x001d }
                java.lang.Integer r8 = r8.f()     // Catch:{ all -> 0x001d }
                kotlin.jvm.internal.Intrinsics.f(r8)     // Catch:{ all -> 0x001d }
                int r8 = r8.intValue()     // Catch:{ all -> 0x001d }
                java.lang.String r8 = r12.f(r7, r8)     // Catch:{ all -> 0x001d }
                kotlin.Pair r8 = kotlin.TuplesKt.a(r10, r8)     // Catch:{ all -> 0x001d }
                java.lang.Object r10 = r8.e()     // Catch:{ all -> 0x001d }
                java.lang.Object r8 = r8.f()     // Catch:{ all -> 0x001d }
                r9.put(r10, r8)     // Catch:{ all -> 0x001d }
                goto L_0x00aa
            L_0x00d9:
                java.util.Map r12 = kotlin.collections.MapsKt.s(r9)     // Catch:{ all -> 0x001d }
                com.google.android.gms.tasks.Task r12 = r1.D(r12)     // Catch:{ all -> 0x001d }
                java.lang.String r6 = "setDefaultsAsync(...)"
                kotlin.jvm.internal.Intrinsics.h(r12, r6)     // Catch:{ all -> 0x001d }
                r11.D = r1     // Catch:{ all -> 0x001d }
                r11.E = r4     // Catch:{ all -> 0x001d }
                java.lang.Object r12 = kotlinx.coroutines.tasks.TasksKt.a(r12, r11)     // Catch:{ all -> 0x001d }
                if (r12 != r0) goto L_0x00f1
                return r0
            L_0x00f1:
                com.google.android.gms.tasks.Task r12 = r1.j()     // Catch:{ all -> 0x001d }
                java.lang.String r4 = "ensureInitialized(...)"
                kotlin.jvm.internal.Intrinsics.h(r12, r4)     // Catch:{ all -> 0x001d }
                r11.D = r1     // Catch:{ all -> 0x001d }
                r11.E = r3     // Catch:{ all -> 0x001d }
                java.lang.Object r12 = kotlinx.coroutines.tasks.TasksKt.a(r12, r11)     // Catch:{ all -> 0x001d }
                if (r12 != r0) goto L_0x0105
                return r0
            L_0x0105:
                com.google.android.gms.tasks.Task r12 = r1.l()     // Catch:{ all -> 0x001d }
                java.lang.String r3 = "fetchAndActivate(...)"
                kotlin.jvm.internal.Intrinsics.h(r12, r3)     // Catch:{ all -> 0x001d }
                r11.D = r1     // Catch:{ all -> 0x001d }
                r11.E = r2     // Catch:{ all -> 0x001d }
                java.lang.Object r12 = kotlinx.coroutines.tasks.TasksKt.a(r12, r11)     // Catch:{ all -> 0x001d }
                if (r12 != r0) goto L_0x0119
                return r0
            L_0x0119:
                r0 = r1
            L_0x011a:
                timber.log.Timber$Forest r12 = timber.log.Timber.f44337a     // Catch:{ all -> 0x001d }
                java.lang.String r1 = "Firebase remote config activated: fetchTimeMillis=%d, lastFetchStatus=%d"
                com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo r2 = r0.n()     // Catch:{ all -> 0x001d }
                long r2 = r2.b()     // Catch:{ all -> 0x001d }
                java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)     // Catch:{ all -> 0x001d }
                com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo r0 = r0.n()     // Catch:{ all -> 0x001d }
                int r0 = r0.a()     // Catch:{ all -> 0x001d }
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.c(r0)     // Catch:{ all -> 0x001d }
                java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch:{ all -> 0x001d }
                r12.i(r1, r0)     // Catch:{ all -> 0x001d }
                com.hansecom.abt.RemoteConfigSetup r12 = r11.F     // Catch:{ all -> 0x001d }
                kotlinx.coroutines.CompletableDeferred r12 = r12.f33079a     // Catch:{ all -> 0x001d }
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r5)     // Catch:{ all -> 0x001d }
                r12.c0(r0)     // Catch:{ all -> 0x001d }
                goto L_0x0162
            L_0x014b:
                timber.log.Timber$Forest r0 = timber.log.Timber.f44337a
                java.lang.String r1 = "Firebase remote config failed"
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.d(r12, r1, r3)
                com.hansecom.abt.RemoteConfigSetup r12 = r11.F
                kotlinx.coroutines.CompletableDeferred r12 = r12.f33079a
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r2)
                r12.c0(r0)
            L_0x0162:
                kotlin.Unit r12 = kotlin.Unit.f40552a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.RemoteConfigSetup.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteConfigSetup a() {
            RemoteConfigSetup b2 = RemoteConfigSetup.f33078e;
            if (b2 != null) {
                return b2;
            }
            throw new IllegalStateException("RemoteConfigSetup is not initialized");
        }

        public final void b(Context context) {
            Intrinsics.i(context, "context");
            if (RemoteConfigSetup.f33078e == null) {
                synchronized (this) {
                    try {
                        if (RemoteConfigSetup.f33078e == null) {
                            RemoteConfigSetup.f33078e = new RemoteConfigSetup(context, (DefaultConstructorMarker) null);
                        }
                        Unit unit = Unit.f40552a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ RemoteConfigSetup(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    public final Object e(Continuation continuation) {
        return this.f33079a.G(continuation);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(android.content.Context r2, int r3) {
        /*
            r1 = this;
            android.content.res.Resources r2 = r2.getResources()
            java.io.InputStream r2 = r2.openRawResource(r3)
            java.lang.String r3 = "openRawResource(...)"
            kotlin.jvm.internal.Intrinsics.h(r2, r3)
            java.nio.charset.Charset r3 = kotlin.text.Charsets.f41118b
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r3)
            java.lang.String r3 = kotlin.io.TextStreamsKt.c(r2)     // Catch:{ all -> 0x0024 }
            r0 = 0
            kotlin.io.CloseableKt.a(r2, r0)
            return r3
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            kotlin.io.CloseableKt.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.RemoteConfigSetup.f(android.content.Context, int):java.lang.String");
    }

    public RemoteConfigSetup(final Context context) {
        this.f33079a = CompletableDeferredKt.b((Job) null, 1, (Object) null);
        CoroutineScope a2 = CoroutineScopeKt.a(Dispatchers.c());
        this.f33080b = a2;
        Job unused = BuildersKt__Builders_commonKt.d(a2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }
}
