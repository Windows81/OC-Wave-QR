package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RolloutsStateFactory {

    /* renamed from: a  reason: collision with root package name */
    public ConfigCacheClient f31396a;

    /* renamed from: b  reason: collision with root package name */
    public ConfigCacheClient f31397b;

    public RolloutsStateFactory(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.f31396a = configCacheClient;
        this.f31397b = configCacheClient2;
    }

    public static RolloutsStateFactory a(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new RolloutsStateFactory(configCacheClient, configCacheClient2);
    }

    public static String d(ConfigCacheClient configCacheClient, String str) {
        ConfigContainer f2 = configCacheClient.f();
        if (f2 == null) {
            return null;
        }
        try {
            return f2.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public RolloutsState b(ConfigContainer configContainer) {
        JSONArray j2 = configContainer.j();
        long k2 = configContainer.k();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < j2.length()) {
            try {
                JSONObject jSONObject = j2.getJSONObject(i2);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[]{string, jSONArray}));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k2).a());
                i2++;
            } catch (JSONException e2) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", (Throwable) e2);
            }
        }
        return RolloutsState.a(hashSet);
    }

    public final String c(String str) {
        String d2 = d(this.f31396a, str);
        if (d2 != null) {
            return d2;
        }
        String d3 = d(this.f31397b, str);
        return d3 != null ? d3 : "";
    }
}
