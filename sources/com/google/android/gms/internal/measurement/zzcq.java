package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzcq implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final Map f25404a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set f25405b = new HashSet();

    public final Object a(String str, Object obj) {
        Object obj2 = this.f25404a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public final boolean contains(String str) {
        return this.f25404a.containsKey(str);
    }

    public final SharedPreferences.Editor edit() {
        return new zzcp(this);
    }

    public final Map getAll() {
        return this.f25404a;
    }

    public final boolean getBoolean(String str, boolean z2) {
        return ((Boolean) a(str, Boolean.valueOf(z2))).booleanValue();
    }

    public final float getFloat(String str, float f2) {
        return ((Float) a(str, Float.valueOf(f2))).floatValue();
    }

    public final int getInt(String str, int i2) {
        return ((Integer) a(str, Integer.valueOf(i2))).intValue();
    }

    public final long getLong(String str, long j2) {
        return ((Long) a(str, Long.valueOf(j2))).longValue();
    }

    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return (Set) a(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f25405b.add(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f25405b.remove(onSharedPreferenceChangeListener);
    }
}
