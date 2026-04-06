package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final AndroidLogger logger = AndroidLogger.e();
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final DeviceCacheManager cache;
    private final Executor executor;
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;

    private RemoteConfigManager() {
        this(DeviceCacheManager.e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), (FirebaseRemoteConfig) null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        StartupTime startupTime = (StartupTime) FirebaseApp.l().j(StartupTime.class);
        return startupTime != null ? startupTime.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(str);
        if (firebaseRemoteConfigValue.b() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", firebaseRemoteConfigValue.d(), str);
        return firebaseRemoteConfigValue;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j2) {
        return j2 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j2) {
        return j2 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.l().f(this.executor, new b(this)).e(this.executor, new c(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return Optional.a();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.e(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return Optional.a();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return Optional.a();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.e(Double.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return Optional.a();
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return Optional.a();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.e(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return Optional.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r5, T r6) {
        /*
            r4 = this;
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r0 = r4.getRemoteConfigValue(r5)
            if (r0 == 0) goto L_0x0068
            boolean r1 = r6 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0014
            boolean r1 = r0.e()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
        L_0x0012:
            r6 = r5
            goto L_0x0068
        L_0x0014:
            boolean r1 = r6 instanceof java.lang.Double     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0021
            double r1 = r0.c()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Double r5 = java.lang.Double.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x0021:
            boolean r1 = r6 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 != 0) goto L_0x0046
            boolean r1 = r6 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x002a
            goto L_0x0046
        L_0x002a:
            boolean r1 = r6 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r1 == 0) goto L_0x0033
            java.lang.String r5 = r0.d()     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x0033:
            java.lang.String r1 = r0.d()     // Catch:{ IllegalArgumentException -> 0x004f }
            com.google.firebase.perf.logging.AndroidLogger r2 = logger     // Catch:{ IllegalArgumentException -> 0x0044 }
            java.lang.String r3 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ IllegalArgumentException -> 0x0044 }
            r2.b(r3, r6)     // Catch:{ IllegalArgumentException -> 0x0044 }
            r6 = r1
            goto L_0x0068
        L_0x0044:
            r6 = r1
            goto L_0x004f
        L_0x0046:
            long r1 = r0.a()     // Catch:{ IllegalArgumentException -> 0x004f }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x004f }
            goto L_0x0012
        L_0x004f:
            java.lang.String r1 = r0.d()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0068
            com.google.firebase.perf.logging.AndroidLogger r1 = logger
            java.lang.String r0 = r0.d()
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "Could not parse value: '%s' for key: '%s'."
            r1.b(r0, r5)
        L_0x0068:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return Optional.a();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? Optional.e(remoteConfigValue.d()) : Optional.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Provider<RemoteConfigComponent> provider;
        RemoteConfigComponent remoteConfigComponent;
        if (!(this.firebaseRemoteConfig != null || (provider = this.firebaseRemoteConfigProvider) == null || (remoteConfigComponent = (RemoteConfigComponent) provider.get()) == null)) {
            this.firebaseRemoteConfig = remoteConfigComponent.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.firebaseRemoteConfig;
        return firebaseRemoteConfig2 == null || firebaseRemoteConfig2.n().a() == 1 || this.firebaseRemoteConfig.n().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(Provider<RemoteConfigComponent> provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    public void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        ConfigurationConstants.ExperimentTTID e2 = ConfigurationConstants.ExperimentTTID.e();
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(e2.c());
        if (firebaseRemoteConfigValue != null) {
            try {
                this.cache.m(e2.a(), firebaseRemoteConfigValue.e());
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.a("ExperimentTTID remote config flag does not exist.");
        }
    }

    public RemoteConfigManager(DeviceCacheManager deviceCacheManager, Executor executor2, FirebaseRemoteConfig firebaseRemoteConfig2, long j2, long j3) {
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = deviceCacheManager;
        this.executor = executor2;
        this.firebaseRemoteConfig = firebaseRemoteConfig2;
        if (firebaseRemoteConfig2 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig2.m());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j3;
        this.appStartConfigFetchDelayInMs = j2;
    }
}
