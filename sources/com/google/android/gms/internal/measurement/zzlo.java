package com.google.android.gms.internal.measurement;

import java.util.Map;

final class zzlo<K> implements Map.Entry<K, Object> {

    /* renamed from: z  reason: collision with root package name */
    public Map.Entry f25640z;

    public final zzlp a() {
        return (zzlp) this.f25640z.getValue();
    }

    public final Object getKey() {
        return this.f25640z.getKey();
    }

    public final Object getValue() {
        if (((zzlp) this.f25640z.getValue()) == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzml) {
            return ((zzlp) this.f25640z.getValue()).b((zzml) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public zzlo(Map.Entry entry) {
        this.f25640z = entry;
    }
}
