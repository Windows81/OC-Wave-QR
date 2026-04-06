package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigContainer {

    /* renamed from: h  reason: collision with root package name */
    public static final Date f31262h = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f31263a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f31264b;

    /* renamed from: c  reason: collision with root package name */
    public Date f31265c;

    /* renamed from: d  reason: collision with root package name */
    public JSONArray f31266d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f31267e;

    /* renamed from: f  reason: collision with root package name */
    public long f31268f;

    /* renamed from: g  reason: collision with root package name */
    public JSONArray f31269g;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f31270a;

        /* renamed from: b  reason: collision with root package name */
        public Date f31271b;

        /* renamed from: c  reason: collision with root package name */
        public JSONArray f31272c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f31273d;

        /* renamed from: e  reason: collision with root package name */
        public long f31274e;

        /* renamed from: f  reason: collision with root package name */
        public JSONArray f31275f;

        public ConfigContainer a() {
            return new ConfigContainer(this.f31270a, this.f31271b, this.f31272c, this.f31273d, this.f31274e, this.f31275f);
        }

        public Builder b(Map map) {
            this.f31270a = new JSONObject(map);
            return this;
        }

        public Builder c(JSONObject jSONObject) {
            try {
                this.f31270a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder d(JSONArray jSONArray) {
            try {
                this.f31272c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder e(Date date) {
            this.f31271b = date;
            return this;
        }

        public Builder f(JSONObject jSONObject) {
            try {
                this.f31273d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder g(JSONArray jSONArray) {
            try {
                this.f31275f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder h(long j2) {
            this.f31274e = j2;
            return this;
        }

        public Builder() {
            this.f31270a = new JSONObject();
            this.f31271b = ConfigContainer.f31262h;
            this.f31272c = new JSONArray();
            this.f31273d = new JSONObject();
            this.f31274e = 0;
            this.f31275f = new JSONArray();
        }
    }

    public static ConfigContainer b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    public static ConfigContainer d(JSONObject jSONObject) {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static Builder l() {
        return new Builder();
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < j().length(); i2++) {
            JSONObject jSONObject = j().getJSONObject(i2);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string3 = jSONArray.getString(i3);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    public JSONArray e() {
        return this.f31266d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigContainer)) {
            return false;
        }
        return this.f31263a.toString().equals(((ConfigContainer) obj).toString());
    }

    public Set f(ConfigContainer configContainer) {
        JSONObject g2 = d(configContainer.f31263a).g();
        Map c2 = c();
        Map c3 = configContainer.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!configContainer.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(configContainer.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !configContainer.i().has(next)) || (!i().has(next) && configContainer.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && configContainer.i().has(next) && !i().getJSONObject(next).toString().equals(configContainer.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (c2.containsKey(next) != c3.containsKey(next)) {
                hashSet.add(next);
            } else if (!c2.containsKey(next) || !c3.containsKey(next) || ((Map) c2.get(next)).equals(c3.get(next))) {
                g2.remove(next);
            } else {
                hashSet.add(next);
            }
        }
        Iterator<String> keys2 = g2.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f31264b;
    }

    public Date h() {
        return this.f31265c;
    }

    public int hashCode() {
        return this.f31263a.hashCode();
    }

    public JSONObject i() {
        return this.f31267e;
    }

    public JSONArray j() {
        return this.f31269g;
    }

    public long k() {
        return this.f31268f;
    }

    public String toString() {
        return this.f31263a.toString();
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j2, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j2);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f31264b = jSONObject;
        this.f31265c = date;
        this.f31266d = jSONArray;
        this.f31267e = jSONObject2;
        this.f31268f = j2;
        this.f31269g = jSONArray2;
        this.f31263a = jSONObject3;
    }
}
