package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzaf implements zzak, zzaq, Iterable<zzaq> {

    /* renamed from: A  reason: collision with root package name */
    public final Map f25324A;

    /* renamed from: z  reason: collision with root package name */
    public final SortedMap f25325z;

    public zzaf() {
        this.f25325z = new TreeMap();
        this.f25324A = new TreeMap();
    }

    public final void A(int i2) {
        int intValue = ((Integer) this.f25325z.lastKey()).intValue();
        if (i2 <= intValue && i2 >= 0) {
            this.f25325z.remove(Integer.valueOf(i2));
            if (i2 == intValue) {
                int i3 = i2 - 1;
                if (!this.f25325z.containsKey(Integer.valueOf(i3)) && i3 >= 0) {
                    this.f25325z.put(Integer.valueOf(i3), zzaq.f25336m);
                    return;
                }
                return;
            }
            while (true) {
                i2++;
                if (i2 <= ((Integer) this.f25325z.lastKey()).intValue()) {
                    zzaq zzaq = (zzaq) this.f25325z.get(Integer.valueOf(i2));
                    if (zzaq != null) {
                        this.f25325z.put(Integer.valueOf(i2 - 1), zzaq);
                        this.f25325z.remove(Integer.valueOf(i2));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void B(int i2, zzaq zzaq) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i2);
        } else if (zzaq == null) {
            this.f25325z.remove(Integer.valueOf(i2));
        } else {
            this.f25325z.put(Integer.valueOf(i2), zzaq);
        }
    }

    public final boolean C(int i2) {
        if (i2 >= 0 && i2 <= ((Integer) this.f25325z.lastKey()).intValue()) {
            return this.f25325z.containsKey(Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i2);
    }

    public final Iterator D() {
        return this.f25325z.keySet().iterator();
    }

    public final List E() {
        ArrayList arrayList = new ArrayList(w());
        for (int i2 = 0; i2 < w(); i2++) {
            arrayList.add(s(i2));
        }
        return arrayList;
    }

    public final void F() {
        this.f25325z.clear();
    }

    public final zzaq c() {
        zzaf zzaf = new zzaf();
        for (Map.Entry entry : this.f25325z.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzaf.f25325z.put((Integer) entry.getKey(), (zzaq) entry.getValue());
            } else {
                zzaf.f25325z.put((Integer) entry.getKey(), ((zzaq) entry.getValue()).c());
            }
        }
        return zzaf;
    }

    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        if (w() != zzaf.w()) {
            return false;
        }
        if (this.f25325z.isEmpty()) {
            return zzaf.f25325z.isEmpty();
        }
        for (int intValue = ((Integer) this.f25325z.firstKey()).intValue(); intValue <= ((Integer) this.f25325z.lastKey()).intValue(); intValue++) {
            if (!s(intValue).equals(zzaf.s(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final Double g() {
        return this.f25325z.size() == 1 ? s(0).g() : this.f25325z.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final String h() {
        return toString();
    }

    public final int hashCode() {
        return this.f25325z.hashCode() * 31;
    }

    public final Iterator i() {
        return new zzae(this, this.f25325z.keySet().iterator(), this.f25324A.keySet().iterator());
    }

    public final Iterator iterator() {
        return new zzah(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzaq) r2.f25324A.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq m(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.zzai r3 = new com.google.android.gms.internal.measurement.zzai
            int r0 = r2.w()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.n(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f25324A
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzaq r3 = (com.google.android.gms.internal.measurement.zzaq) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.zzaq r3 = com.google.android.gms.internal.measurement.zzaq.f25336m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaf.m(java.lang.String):com.google.android.gms.internal.measurement.zzaq");
    }

    public final boolean n(String str) {
        return "length".equals(str) || this.f25324A.containsKey(str);
    }

    public final zzaq o(String str, zzh zzh, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbe.d(str, this, zzh, list) : zzan.a(this, new zzas(str), zzh, list);
    }

    public final void p(String str, zzaq zzaq) {
        if (zzaq == null) {
            this.f25324A.remove(str);
        } else {
            this.f25324A.put(str, zzaq);
        }
    }

    public final int q() {
        return this.f25325z.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzaq) r1.f25325z.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzaq s(int r2) {
        /*
            r1 = this;
            int r0 = r1.w()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.C(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f25325z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzaq r2 = (com.google.android.gms.internal.measurement.zzaq) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.zzaq r2 = com.google.android.gms.internal.measurement.zzaq.f25336m
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaf.s(int):com.google.android.gms.internal.measurement.zzaq");
    }

    public final String toString() {
        return z(",");
    }

    public final void u(int i2, zzaq zzaq) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i2);
        } else if (i2 >= w()) {
            B(i2, zzaq);
        } else {
            for (int intValue = ((Integer) this.f25325z.lastKey()).intValue(); intValue >= i2; intValue--) {
                zzaq zzaq2 = (zzaq) this.f25325z.get(Integer.valueOf(intValue));
                if (zzaq2 != null) {
                    B(intValue + 1, zzaq2);
                    this.f25325z.remove(Integer.valueOf(intValue));
                }
            }
            B(i2, zzaq);
        }
    }

    public final void v(zzaq zzaq) {
        B(w(), zzaq);
    }

    public final int w() {
        if (this.f25325z.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f25325z.lastKey()).intValue() + 1;
    }

    public final String z(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f25325z.isEmpty()) {
            for (int i2 = 0; i2 < w(); i2++) {
                zzaq s2 = s(i2);
                sb.append(str);
                if (!(s2 instanceof zzax) && !(s2 instanceof zzao)) {
                    sb.append(s2.h());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public zzaf(List list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                B(i2, (zzaq) list.get(i2));
            }
        }
    }

    public zzaf(zzaq... zzaqArr) {
        this(Arrays.asList(zzaqArr));
    }
}
