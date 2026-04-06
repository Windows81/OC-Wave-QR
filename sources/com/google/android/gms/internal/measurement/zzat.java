package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzat implements zzaq {

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f25346A;

    /* renamed from: z  reason: collision with root package name */
    public final String f25347z;

    public zzat(String str, List list) {
        this.f25347z = str;
        ArrayList arrayList = new ArrayList();
        this.f25346A = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f25347z;
    }

    public final ArrayList b() {
        return this.f25346A;
    }

    public final zzaq c() {
        return this;
    }

    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        zzat zzat = (zzat) obj;
        String str = this.f25347z;
        if (str == null ? zzat.f25347z != null : !str.equals(zzat.f25347z)) {
            return false;
        }
        ArrayList arrayList = this.f25346A;
        ArrayList arrayList2 = zzat.f25346A;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final Double g() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f25347z;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f25346A;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return hashCode + i2;
    }

    public final Iterator i() {
        return null;
    }

    public final zzaq o(String str, zzh zzh, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
