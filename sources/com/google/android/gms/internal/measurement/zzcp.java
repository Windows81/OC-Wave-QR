package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzcp implements SharedPreferences.Editor {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25400a;

    /* renamed from: b  reason: collision with root package name */
    public Set f25401b;

    /* renamed from: c  reason: collision with root package name */
    public Map f25402c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzcq f25403d;

    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f25402c.put(str, obj);
        } else {
            remove(str);
        }
    }

    public final void apply() {
        commit();
    }

    public final SharedPreferences.Editor clear() {
        this.f25400a = true;
        return this;
    }

    public final boolean commit() {
        if (this.f25400a) {
            this.f25403d.f25404a.clear();
        }
        this.f25403d.f25404a.keySet().removeAll(this.f25401b);
        for (Map.Entry entry : this.f25402c.entrySet()) {
            this.f25403d.f25404a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f25403d.f25405b) {
            UnmodifiableIterator e2 = Sets.o(this.f25401b, this.f25402c.keySet()).iterator();
            while (e2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f25403d, (String) e2.next());
            }
        }
        return this.f25400a || !this.f25401b.isEmpty() || !this.f25402c.isEmpty();
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z2) {
        a(str, Boolean.valueOf(z2));
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f2) {
        a(str, Float.valueOf(f2));
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i2) {
        a(str, Integer.valueOf(i2));
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j2) {
        a(str, Long.valueOf(j2));
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        this.f25401b.add(str);
        return this;
    }

    public zzcp(zzcq zzcq) {
        this.f25403d = zzcq;
        this.f25400a = false;
        this.f25401b = new HashSet();
        this.f25402c = new HashMap();
    }
}
