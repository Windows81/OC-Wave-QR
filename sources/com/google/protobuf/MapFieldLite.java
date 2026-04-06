package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public static final MapFieldLite f32222A;

    /* renamed from: z  reason: collision with root package name */
    public boolean f32223z = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f32222A = mapFieldLite;
        mapFieldLite.k();
    }

    public MapFieldLite() {
    }

    public static int b(Map map) {
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i2 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i2;
    }

    public static int c(Object obj) {
        if (obj instanceof byte[]) {
            return Internal.d((byte[]) obj);
        }
        if (!(obj instanceof Internal.EnumLite)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static void e(Map map) {
        for (Object next : map.keySet()) {
            Internal.a(next);
            Internal.a(map.get(next));
        }
    }

    public static MapFieldLite f() {
        return f32222A;
    }

    public static boolean h(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(java.util.Map r4, java.util.Map r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = h(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.i(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        g();
        super.clear();
    }

    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public final void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        return b(this);
    }

    public boolean j() {
        return this.f32223z;
    }

    public void k() {
        this.f32223z = false;
    }

    public void n(MapFieldLite mapFieldLite) {
        g();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    public MapFieldLite o() {
        return isEmpty() ? new MapFieldLite() : new MapFieldLite(this);
    }

    public Object put(Object obj, Object obj2) {
        g();
        Internal.a(obj);
        Internal.a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        g();
        e(map);
        super.putAll(map);
    }

    public Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    public MapFieldLite(Map map) {
        super(map);
    }
}
