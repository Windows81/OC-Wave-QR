package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingConcurrentMap<K, V> extends ForwardingMap<K, V> implements ConcurrentMap<K, V> {
    /* renamed from: S */
    public abstract ConcurrentMap Q();

    public Object putIfAbsent(Object obj, Object obj2) {
        return Q().putIfAbsent(obj, obj2);
    }

    public boolean remove(Object obj, Object obj2) {
        return Q().remove(obj, obj2);
    }

    public Object replace(Object obj, Object obj2) {
        return Q().replace(obj, obj2);
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        return Q().replace(obj, obj2, obj3);
    }
}
