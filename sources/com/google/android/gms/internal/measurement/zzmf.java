package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzmf<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public static final zzmf f25655A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f25656z = true;

    static {
        zzmf zzmf = new zzmf();
        f25655A = zzmf;
        zzmf.f25656z = false;
    }

    public zzmf() {
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return zzle.d((byte[]) obj);
        }
        if (!(obj instanceof zzlh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static zzmf c() {
        return f25655A;
    }

    public final void clear() {
        i();
        super.clear();
    }

    public final void e(zzmf zzmf) {
        i();
        if (!zzmf.isEmpty()) {
            putAll(zzmf);
        }
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmf.equals(java.lang.Object):boolean");
    }

    public final zzmf f() {
        return isEmpty() ? new zzmf() : new zzmf(this);
    }

    public final void g() {
        this.f25656z = false;
    }

    public final boolean h() {
        return this.f25656z;
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i2;
    }

    public final void i() {
        if (!this.f25656z) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object put(Object obj, Object obj2) {
        i();
        zzle.e(obj);
        zzle.e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        i();
        for (Object next : map.keySet()) {
            zzle.e(next);
            zzle.e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    public zzmf(Map map) {
        super(map);
    }
}
