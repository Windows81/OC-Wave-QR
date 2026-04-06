package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zznp extends AbstractSet {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzne f25710z;

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f25710z.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f25710z.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f25710z.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new zznn(this.f25710z);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f25710z.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f25710z.size();
    }

    public zznp(zzne zzne) {
        this.f25710z = zzne;
    }
}
