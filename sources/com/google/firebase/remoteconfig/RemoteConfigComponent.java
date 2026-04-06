package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.compose.animation.core.h;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {

    /* renamed from: j  reason: collision with root package name */
    public static final Clock f31220j = DefaultClock.d();

    /* renamed from: k  reason: collision with root package name */
    public static final Random f31221k = new Random();

    /* renamed from: l  reason: collision with root package name */
    public static final Map f31222l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f31223a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f31224b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f31225c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseApp f31226d;

    /* renamed from: e  reason: collision with root package name */
    public final FirebaseInstallationsApi f31227e;

    /* renamed from: f  reason: collision with root package name */
    public final FirebaseABTesting f31228f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f31229g;

    /* renamed from: h  reason: collision with root package name */
    public final String f31230h;

    /* renamed from: i  reason: collision with root package name */
    public Map f31231i;

    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference f31232a = new AtomicReference();

        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f31232a;
            if (atomicReference.get() == null) {
                GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
                if (h.a(atomicReference, (Object) null, globalBackgroundListener)) {
                    BackgroundDetector.c(application);
                    BackgroundDetector.b().a(globalBackgroundListener);
                }
            }
        }

        public void a(boolean z2) {
            RemoteConfigComponent.r(z2);
        }
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    public static ConfigMetadataClient k(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    public static Personalization l(FirebaseApp firebaseApp, String str, Provider provider) {
        if (!p(firebaseApp) || !str.equals("firebase")) {
            return null;
        }
        return new Personalization(provider);
    }

    public static boolean o(FirebaseApp firebaseApp, String str) {
        return str.equals("firebase") && p(firebaseApp);
    }

    public static boolean p(FirebaseApp firebaseApp) {
        return firebaseApp.m().equals("[DEFAULT]");
    }

    public static /* synthetic */ AnalyticsConnector q() {
        return null;
    }

    public static synchronized void r(boolean z2) {
        synchronized (RemoteConfigComponent.class) {
            for (FirebaseRemoteConfig C : f31222l.values()) {
                C.C(z2);
            }
        }
    }

    public void a(String str, RolloutsStateSubscriber rolloutsStateSubscriber) {
        e(str).q().h(rolloutsStateSubscriber);
    }

    public synchronized FirebaseRemoteConfig d(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        FirebaseRemoteConfig firebaseRemoteConfig;
        String str2 = str;
        synchronized (this) {
            try {
                if (!this.f31223a.containsKey(str2)) {
                    Context context = this.f31224b;
                    FirebaseABTesting firebaseABTesting2 = o(firebaseApp, str) ? firebaseABTesting : null;
                    FirebaseRemoteConfig firebaseRemoteConfig2 = r10;
                    FirebaseRemoteConfig firebaseRemoteConfig3 = new FirebaseRemoteConfig(context, firebaseApp, firebaseInstallationsApi, firebaseABTesting2, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient, m(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.f31224b, str, configMetadataClient), rolloutsStateSubscriptionsHandler);
                    firebaseRemoteConfig2.F();
                    this.f31223a.put(str2, firebaseRemoteConfig2);
                    f31222l.put(str2, firebaseRemoteConfig2);
                }
                firebaseRemoteConfig = (FirebaseRemoteConfig) this.f31223a.get(str2);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return firebaseRemoteConfig;
    }

    public synchronized FirebaseRemoteConfig e(String str) {
        ConfigCacheClient f2;
        ConfigCacheClient f3;
        ConfigCacheClient f4;
        ConfigMetadataClient k2;
        ConfigGetParameterHandler j2;
        String str2;
        try {
            f2 = f(str, "fetch");
            f3 = f(str, "activate");
            f4 = f(str, "defaults");
            k2 = k(this.f31224b, this.f31230h, str);
            j2 = j(f3, f4);
            Personalization l2 = l(this.f31226d, str, this.f31229g);
            if (l2 != null) {
                j2.b(new i(l2));
            }
            str2 = str;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return d(this.f31226d, str2, this.f31227e, this.f31228f, this.f31225c, f2, f3, f4, h(str, f2, k2), j2, k2, n(f3, f4));
    }

    public final ConfigCacheClient f(String str, String str2) {
        return ConfigCacheClient.h(this.f31225c, ConfigStorageClient.c(this.f31224b, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f31230h, str, str2})));
    }

    public FirebaseRemoteConfig g() {
        return e("firebase");
    }

    public synchronized ConfigFetchHandler h(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider provider;
        try {
            firebaseInstallationsApi = this.f31227e;
            if (p(this.f31226d)) {
                provider = this.f31229g;
            } else {
                new k
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v2 ? I:com.google.firebase.remoteconfig.k) =  call: com.google.firebase.remoteconfig.k.<init>():void type: CONSTRUCTOR in method: com.google.firebase.remoteconfig.RemoteConfigComponent.h(java.lang.String, com.google.firebase.remoteconfig.internal.ConfigCacheClient, com.google.firebase.remoteconfig.internal.ConfigMetadataClient):com.google.firebase.remoteconfig.internal.ConfigFetchHandler, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 43 more
                    */
                /*
                    this = this;
                    monitor-enter(r11)
                    com.google.firebase.remoteconfig.internal.ConfigFetchHandler r10 = new com.google.firebase.remoteconfig.internal.ConfigFetchHandler     // Catch:{ all -> 0x0011 }
                    com.google.firebase.installations.FirebaseInstallationsApi r1 = r11.f31227e     // Catch:{ all -> 0x0011 }
                    com.google.firebase.FirebaseApp r0 = r11.f31226d     // Catch:{ all -> 0x0011 }
                    boolean r0 = p(r0)     // Catch:{ all -> 0x0011 }
                    if (r0 == 0) goto L_0x0013
                    com.google.firebase.inject.Provider r0 = r11.f31229g     // Catch:{ all -> 0x0011 }
                L_0x000f:
                    r2 = r0
                    goto L_0x0019
                L_0x0011:
                    r12 = move-exception
                    goto L_0x0037
                L_0x0013:
                    com.google.firebase.remoteconfig.k r0 = new com.google.firebase.remoteconfig.k     // Catch:{ all -> 0x0011 }
                    r0.<init>()     // Catch:{ all -> 0x0011 }
                    goto L_0x000f
                L_0x0019:
                    java.util.concurrent.ScheduledExecutorService r3 = r11.f31225c     // Catch:{ all -> 0x0011 }
                    com.google.android.gms.common.util.Clock r4 = f31220j     // Catch:{ all -> 0x0011 }
                    java.util.Random r5 = f31221k     // Catch:{ all -> 0x0011 }
                    com.google.firebase.FirebaseApp r0 = r11.f31226d     // Catch:{ all -> 0x0011 }
                    com.google.firebase.FirebaseOptions r0 = r0.n()     // Catch:{ all -> 0x0011 }
                    java.lang.String r0 = r0.b()     // Catch:{ all -> 0x0011 }
                    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient r7 = r11.i(r0, r12, r14)     // Catch:{ all -> 0x0011 }
                    java.util.Map r9 = r11.f31231i     // Catch:{ all -> 0x0011 }
                    r0 = r10
                    r6 = r13
                    r8 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0011 }
                    monitor-exit(r11)
                    return r10
                L_0x0037:
                    monitor-exit(r11)     // Catch:{ all -> 0x0011 }
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.RemoteConfigComponent.h(java.lang.String, com.google.firebase.remoteconfig.internal.ConfigCacheClient, com.google.firebase.remoteconfig.internal.ConfigMetadataClient):com.google.firebase.remoteconfig.internal.ConfigFetchHandler");
            }

            public ConfigFetchHttpClient i(String str, String str2, ConfigMetadataClient configMetadataClient) {
                return new ConfigFetchHttpClient(this.f31224b, this.f31226d.n().c(), str, str2, configMetadataClient.b(), configMetadataClient.b());
            }

            public final ConfigGetParameterHandler j(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
                return new ConfigGetParameterHandler(this.f31225c, configCacheClient, configCacheClient2);
            }

            public synchronized ConfigRealtimeHandler m(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient) {
                ConfigRealtimeHandler configRealtimeHandler;
                synchronized (this) {
                    configRealtimeHandler = new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configMetadataClient, this.f31225c);
                }
                return configRealtimeHandler;
            }

            public final RolloutsStateSubscriptionsHandler n(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
                return new RolloutsStateSubscriptionsHandler(configCacheClient, RolloutsStateFactory.a(configCacheClient, configCacheClient2), this.f31225c);
            }

            public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider, boolean z2) {
                this.f31223a = new HashMap();
                this.f31231i = new HashMap();
                this.f31224b = context;
                this.f31225c = scheduledExecutorService;
                this.f31226d = firebaseApp;
                this.f31227e = firebaseInstallationsApi;
                this.f31228f = firebaseABTesting;
                this.f31229g = provider;
                this.f31230h = firebaseApp.n().c();
                GlobalBackgroundListener.c(context);
                if (z2) {
                    Tasks.c(scheduledExecutorService, new j(this));
                }
            }
        }
