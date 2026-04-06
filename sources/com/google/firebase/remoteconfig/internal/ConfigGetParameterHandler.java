package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class ConfigGetParameterHandler {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f31302e = Charset.forName("UTF-8");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f31303f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f31304g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a  reason: collision with root package name */
    public final Set f31305a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f31306b;

    /* renamed from: c  reason: collision with root package name */
    public final ConfigCacheClient f31307c;

    /* renamed from: d  reason: collision with root package name */
    public final ConfigCacheClient f31308d;

    public ConfigGetParameterHandler(Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f31306b = executor;
        this.f31307c = configCacheClient;
        this.f31308d = configCacheClient2;
    }

    public static ConfigContainer e(ConfigCacheClient configCacheClient) {
        return configCacheClient.f();
    }

    public static Set f(ConfigCacheClient configCacheClient) {
        HashSet hashSet = new HashSet();
        ConfigContainer e2 = e(configCacheClient);
        if (e2 == null) {
            return hashSet;
        }
        Iterator<String> keys = e2.g().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String g(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer e2 = e(configCacheClient);
        if (e2 == null) {
            return null;
        }
        try {
            return e2.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void j(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    public void b(BiConsumer biConsumer) {
        synchronized (this.f31305a) {
            this.f31305a.add(biConsumer);
        }
    }

    public final void c(String str, ConfigContainer configContainer) {
        if (configContainer != null) {
            synchronized (this.f31305a) {
                try {
                    for (BiConsumer jVar : this.f31305a) {
                        this.f31306b.execute(new j(jVar, str, configContainer));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Map d() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(f(this.f31307c));
        hashSet.addAll(f(this.f31308d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, h(str));
        }
        return hashMap;
    }

    public FirebaseRemoteConfigValue h(String str) {
        String g2 = g(this.f31307c, str);
        if (g2 != null) {
            c(str, e(this.f31307c));
            return new FirebaseRemoteConfigValueImpl(g2, 2);
        }
        String g3 = g(this.f31308d, str);
        if (g3 != null) {
            return new FirebaseRemoteConfigValueImpl(g3, 1);
        }
        j(str, "FirebaseRemoteConfigValue");
        return new FirebaseRemoteConfigValueImpl("", 0);
    }
}
