package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class ConfigRealtimeHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Set f31319a;

    /* renamed from: b  reason: collision with root package name */
    public final ConfigRealtimeHttpClient f31320b;

    /* renamed from: c  reason: collision with root package name */
    public final ConfigFetchHandler f31321c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseApp f31322d;

    /* renamed from: e  reason: collision with root package name */
    public final FirebaseInstallationsApi f31323e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigCacheClient f31324f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f31325g;

    /* renamed from: h  reason: collision with root package name */
    public final String f31326h;

    /* renamed from: i  reason: collision with root package name */
    public final ConfigMetadataClient f31327i;

    /* renamed from: j  reason: collision with root package name */
    public final ScheduledExecutorService f31328j;

    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {

        /* renamed from: a  reason: collision with root package name */
        public final ConfigUpdateListener f31329a;

        public ConfigUpdateListenerRegistrationInternal(ConfigUpdateListener configUpdateListener) {
            this.f31329a = configUpdateListener;
        }

        public void remove() {
            ConfigRealtimeHandler.this.d(this.f31329a);
        }
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f31319a = linkedHashSet;
        this.f31320b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configMetadataClient, scheduledExecutorService);
        this.f31322d = firebaseApp;
        this.f31321c = configFetchHandler;
        this.f31323e = firebaseInstallationsApi;
        this.f31324f = configCacheClient;
        this.f31325g = context;
        this.f31326h = str;
        this.f31327i = configMetadataClient;
        this.f31328j = scheduledExecutorService;
    }

    public synchronized ConfigUpdateListenerRegistration b(ConfigUpdateListener configUpdateListener) {
        this.f31319a.add(configUpdateListener);
        c();
        return new ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    public final synchronized void c() {
        if (!this.f31319a.isEmpty()) {
            this.f31320b.C();
        }
    }

    public final synchronized void d(ConfigUpdateListener configUpdateListener) {
        this.f31319a.remove(configUpdateListener);
    }

    public synchronized void e(boolean z2) {
        this.f31320b.z(z2);
        if (!z2) {
            c();
        }
    }
}
