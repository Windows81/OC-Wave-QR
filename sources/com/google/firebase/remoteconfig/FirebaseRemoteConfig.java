package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseRemoteConfig {

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f31196n = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final Context f31197a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f31198b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseABTesting f31199c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f31200d;

    /* renamed from: e  reason: collision with root package name */
    public final ConfigCacheClient f31201e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigCacheClient f31202f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigCacheClient f31203g;

    /* renamed from: h  reason: collision with root package name */
    public final ConfigFetchHandler f31204h;

    /* renamed from: i  reason: collision with root package name */
    public final ConfigGetParameterHandler f31205i;

    /* renamed from: j  reason: collision with root package name */
    public final ConfigMetadataClient f31206j;

    /* renamed from: k  reason: collision with root package name */
    public final FirebaseInstallationsApi f31207k;

    /* renamed from: l  reason: collision with root package name */
    public final ConfigRealtimeHandler f31208l;

    /* renamed from: m  reason: collision with root package name */
    public final RolloutsStateSubscriptionsHandler f31209m;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.f31197a = context;
        this.f31198b = firebaseApp;
        this.f31207k = firebaseInstallationsApi;
        this.f31199c = firebaseABTesting;
        this.f31200d = executor;
        this.f31201e = configCacheClient;
        this.f31202f = configCacheClient2;
        this.f31203g = configCacheClient3;
        this.f31204h = configFetchHandler;
        this.f31205i = configGetParameterHandler;
        this.f31206j = configMetadataClient;
        this.f31208l = configRealtimeHandler;
        this.f31209m = rolloutsStateSubscriptionsHandler;
    }

    public static List G(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static FirebaseRemoteConfig o() {
        return p(FirebaseApp.l());
    }

    public static FirebaseRemoteConfig p(FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.j(RemoteConfigComponent.class)).g();
    }

    public static boolean s(ConfigContainer configContainer, ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.h().equals(configContainer2.h());
    }

    public static /* synthetic */ FirebaseRemoteConfigInfo u(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.k();
    }

    public void A(Runnable runnable) {
        this.f31200d.execute(runnable);
    }

    public Task B(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return Tasks.c(this.f31200d, new b(this, firebaseRemoteConfigSettings));
    }

    public void C(boolean z2) {
        this.f31208l.e(z2);
    }

    public Task D(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) entry.getKey(), value.toString());
            }
        }
        return E(hashMap);
    }

    public final Task E(Map map) {
        try {
            return this.f31203g.k(ConfigContainer.l().b(map).a()).p(FirebaseExecutors.a(), new a());
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            return Tasks.e((Object) null);
        }
    }

    public void F() {
        this.f31202f.e();
        this.f31203g.e();
        this.f31201e.e();
    }

    public void H(JSONArray jSONArray) {
        if (this.f31199c != null) {
            try {
                this.f31199c.m(G(jSONArray));
            } catch (JSONException e2) {
                Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
            } catch (AbtException e3) {
                Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e3);
            }
        }
    }

    public Task h() {
        Task e2 = this.f31201e.e();
        Task e3 = this.f31202f.e();
        return Tasks.j(e2, e3).i(this.f31200d, new f(this, e2, e3));
    }

    public ConfigUpdateListenerRegistration i(ConfigUpdateListener configUpdateListener) {
        return this.f31208l.b(configUpdateListener);
    }

    public Task j() {
        Task e2 = this.f31202f.e();
        Task e3 = this.f31203g.e();
        Task e4 = this.f31201e.e();
        Task c2 = Tasks.c(this.f31200d, new c(this));
        return Tasks.j(e2, e3, e4, c2, this.f31207k.m(), this.f31207k.n(false)).h(this.f31200d, new d(c2));
    }

    public Task k() {
        return this.f31204h.i().p(FirebaseExecutors.a(), new g());
    }

    public Task l() {
        return k().p(this.f31200d, new e(this));
    }

    public Map m() {
        return this.f31205i.d();
    }

    public FirebaseRemoteConfigInfo n() {
        return this.f31206j.c();
    }

    public RolloutsStateSubscriptionsHandler q() {
        return this.f31209m;
    }

    public FirebaseRemoteConfigValue r(String str) {
        return this.f31205i.h(str);
    }

    public final /* synthetic */ Task t(Task task, Task task2, Task task3) {
        if (!task.n() || task.k() == null) {
            return Tasks.e(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.k();
        return (!task2.n() || s(configContainer, (ConfigContainer) task2.k())) ? this.f31202f.k(configContainer).h(this.f31200d, new h(this)) : Tasks.e(Boolean.FALSE);
    }

    public final /* synthetic */ Task w(Void voidR) {
        return h();
    }

    public final /* synthetic */ Void x(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f31206j.l(firebaseRemoteConfigSettings);
        return null;
    }

    public final boolean z(Task task) {
        if (!task.n()) {
            return false;
        }
        this.f31201e.d();
        ConfigContainer configContainer = (ConfigContainer) task.k();
        if (configContainer != null) {
            H(configContainer.e());
            this.f31209m.g(configContainer);
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }
}
