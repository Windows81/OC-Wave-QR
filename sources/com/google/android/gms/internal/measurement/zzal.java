package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class zzal implements zzak, zzaq {

    /* renamed from: A  reason: collision with root package name */
    public final Map f25332A = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final String f25333z;

    public zzal(String str) {
        this.f25333z = str;
    }

    public abstract zzaq a(zzh zzh, List list);

    public final String b() {
        return this.f25333z;
    }

    public zzaq c() {
        return this;
    }

    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzal = (zzal) obj;
        String str = this.f25333z;
        if (str != null) {
            return str.equals(zzal.f25333z);
        }
        return false;
    }

    public final Double g() {
        return Double.valueOf(Double.NaN);
    }

    public final String h() {
        return this.f25333z;
    }

    public int hashCode() {
        String str = this.f25333z;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Iterator i() {
        return zzan.b(this.f25332A);
    }

    public final zzaq m(String str) {
        return this.f25332A.containsKey(str) ? (zzaq) this.f25332A.get(str) : zzaq.f25336m;
    }

    public final boolean n(String str) {
        return this.f25332A.containsKey(str);
    }

    public final zzaq o(String str, zzh zzh, List list) {
        return "toString".equals(str) ? new zzas(this.f25333z) : zzan.a(this, new zzas(str), zzh, list);
    }

    public final void p(String str, zzaq zzaq) {
        if (zzaq == null) {
            this.f25332A.remove(str);
        } else {
            this.f25332A.put(str, zzaq);
        }
    }
}
