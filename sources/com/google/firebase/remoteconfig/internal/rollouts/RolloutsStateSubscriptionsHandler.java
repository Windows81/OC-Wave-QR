package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p.a;
import p.b;
import p.c;

public class RolloutsStateSubscriptionsHandler {

    /* renamed from: a  reason: collision with root package name */
    public ConfigCacheClient f31398a;

    /* renamed from: b  reason: collision with root package name */
    public RolloutsStateFactory f31399b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f31400c;

    /* renamed from: d  reason: collision with root package name */
    public Set f31401d = Collections.newSetFromMap(new ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(ConfigCacheClient configCacheClient, RolloutsStateFactory rolloutsStateFactory, Executor executor) {
        this.f31398a = configCacheClient;
        this.f31399b = rolloutsStateFactory;
        this.f31400c = executor;
    }

    public final /* synthetic */ void f(Task task, RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        try {
            ConfigContainer configContainer2 = (ConfigContainer) task.k();
            if (configContainer2 != null) {
                this.f31400c.execute(new c(rolloutsStateSubscriber, this.f31399b.b(configContainer2)));
            }
        } catch (FirebaseRemoteConfigException e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    public void g(ConfigContainer configContainer) {
        try {
            RolloutsState b2 = this.f31399b.b(configContainer);
            for (RolloutsStateSubscriber bVar : this.f31401d) {
                this.f31400c.execute(new b(bVar, b2));
            }
        } catch (FirebaseRemoteConfigException e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e2);
        }
    }

    public void h(RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.f31401d.add(rolloutsStateSubscriber);
        Task e2 = this.f31398a.e();
        e2.f(this.f31400c, new a(this, e2, rolloutsStateSubscriber));
    }
}
