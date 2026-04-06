package com.google.android.gms.internal.measurement;

import java.util.Map;

final class zznk implements Comparable, Map.Entry {

    /* renamed from: A  reason: collision with root package name */
    public Object f25704A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzne f25705B;

    /* renamed from: z  reason: collision with root package name */
    public final Comparable f25706z;

    public zznk(zzne zzne, Map.Entry entry) {
        this(zzne, (Comparable) entry.getKey(), entry.getValue());
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zznk) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return d(this.f25706z, entry.getKey()) && d(this.f25704A, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f25706z;
    }

    public final Object getValue() {
        return this.f25704A;
    }

    public final int hashCode() {
        Comparable comparable = this.f25706z;
        int i2 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f25704A;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode ^ i2;
    }

    public final Object setValue(Object obj) {
        this.f25705B.s();
        Object obj2 = this.f25704A;
        this.f25704A = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25706z);
        String valueOf2 = String.valueOf(this.f25704A);
        return valueOf + "=" + valueOf2;
    }

    public zznk(zzne zzne, Comparable comparable, Object obj) {
        this.f25705B = zzne;
        this.f25706z = comparable;
        this.f25704A = obj;
    }
}
