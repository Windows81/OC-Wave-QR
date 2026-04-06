package org.bson.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.bson.assertions.Assertions;

final class ComputingMap<K, V> implements Map<K, V>, Function<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public final Function f44067A;

    /* renamed from: z  reason: collision with root package name */
    public final ConcurrentMap f44068z;

    public ComputingMap(ConcurrentMap concurrentMap, Function function) {
        this.f44068z = (ConcurrentMap) Assertions.d("map", concurrentMap);
        this.f44067A = (Function) Assertions.d("function", function);
    }

    public static Map a(Function function) {
        return new ComputingMap(CopyOnWriteMap.i(), function);
    }

    public Object apply(Object obj) {
        return get(obj);
    }

    public void clear() {
        this.f44068z.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f44068z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f44068z.containsValue(obj);
    }

    public Set entrySet() {
        return this.f44068z.entrySet();
    }

    public boolean equals(Object obj) {
        return this.f44068z.equals(obj);
    }

    public Object get(Object obj) {
        while (true) {
            Object obj2 = this.f44068z.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object apply = this.f44067A.apply(obj);
            if (apply == null) {
                return null;
            }
            this.f44068z.putIfAbsent(obj, apply);
        }
    }

    public int hashCode() {
        return this.f44068z.hashCode();
    }

    public boolean isEmpty() {
        return this.f44068z.isEmpty();
    }

    public Set keySet() {
        return this.f44068z.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.f44068z.put(obj, obj2);
    }

    public void putAll(Map map) {
        this.f44068z.putAll(map);
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        return this.f44068z.putIfAbsent(obj, obj2);
    }

    public boolean remove(Object obj, Object obj2) {
        return this.f44068z.remove(obj, obj2);
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        return this.f44068z.replace(obj, obj2, obj3);
    }

    public int size() {
        return this.f44068z.size();
    }

    public Collection values() {
        return this.f44068z.values();
    }

    public Object remove(Object obj) {
        return this.f44068z.remove(obj);
    }

    public Object replace(Object obj, Object obj2) {
        return this.f44068z.replace(obj, obj2);
    }
}
