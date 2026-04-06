package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public final class zzad {

    /* renamed from: d  reason: collision with root package name */
    public static final ImmutableSet f25318d = ImmutableSet.F("_syn", "_err", "_el");

    /* renamed from: a  reason: collision with root package name */
    public String f25319a;

    /* renamed from: b  reason: collision with root package name */
    public long f25320b;

    /* renamed from: c  reason: collision with root package name */
    public Map f25321c;

    public zzad(String str, long j2, Map map) {
        this.f25319a = str;
        this.f25320b = j2;
        HashMap hashMap = new HashMap();
        this.f25321c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (!f25318d.contains(str) || !(obj2 instanceof Double)) ? str.startsWith("_") ? (!(obj instanceof String) && obj != null) ? obj : obj2 : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2 : Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f25320b;
    }

    public final Object b(String str) {
        if (this.f25321c.containsKey(str)) {
            return this.f25321c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new zzad(this.f25319a, this.f25320b, new HashMap(this.f25321c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f25321c.remove(str);
            return;
        }
        this.f25321c.put(str, c(str, this.f25321c.get(str), obj));
    }

    public final String e() {
        return this.f25319a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzad = (zzad) obj;
        if (this.f25320b == zzad.f25320b && this.f25319a.equals(zzad.f25319a)) {
            return this.f25321c.equals(zzad.f25321c);
        }
        return false;
    }

    public final void f(String str) {
        this.f25319a = str;
    }

    public final Map g() {
        return this.f25321c;
    }

    public final int hashCode() {
        long j2 = this.f25320b;
        return (((this.f25319a.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f25321c.hashCode();
    }

    public final String toString() {
        String str = this.f25319a;
        long j2 = this.f25320b;
        String valueOf = String.valueOf(this.f25321c);
        return "Event{name='" + str + "', timestamp=" + j2 + ", params=" + valueOf + "}";
    }
}
