package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class RealmMap<K, V> implements Map<K, V>, ManageableObject, Freezable<RealmMap<K, V>> {

    /* renamed from: z  reason: collision with root package name */
    public final MapStrategy f40020z;

    public static class ManagedMapStrategy<K, V> extends MapStrategy<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final ManagedMapManager f40021z;

        public Object b(Object obj, Object obj2) {
            return this.f40021z.put(obj, obj2);
        }

        public void clear() {
            this.f40021z.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f40021z.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f40021z.containsValue(obj);
        }

        public Set entrySet() {
            return this.f40021z.entrySet();
        }

        public Object get(Object obj) {
            return this.f40021z.get(obj);
        }

        public boolean isEmpty() {
            return this.f40021z.isEmpty();
        }

        public Set keySet() {
            return this.f40021z.keySet();
        }

        public void putAll(Map map) {
            this.f40021z.putAll(map);
        }

        public Object remove(Object obj) {
            return this.f40021z.remove(obj);
        }

        public int size() {
            return this.f40021z.size();
        }

        public Collection values() {
            return this.f40021z.values();
        }
    }

    public static abstract class MapStrategy<K, V> implements Map<K, V>, ManageableObject, Freezable<RealmMap<K, V>> {
        public void a(Object obj) {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed.");
            } else if (obj.getClass() == String.class) {
                String str = (String) obj;
                if (str.contains(".") || str.contains("$")) {
                    throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                }
            }
        }

        public abstract Object b(Object obj, Object obj2);

        public Object put(Object obj, Object obj2) {
            a(obj);
            return b(obj, obj2);
        }
    }

    public static class UnmanagedMapStrategy<K, V> extends MapStrategy<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Map f40022z;

        public Object b(Object obj, Object obj2) {
            return this.f40022z.put(obj, obj2);
        }

        public void clear() {
            this.f40022z.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f40022z.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f40022z.containsValue(obj);
        }

        public Set entrySet() {
            return this.f40022z.entrySet();
        }

        public Object get(Object obj) {
            return this.f40022z.get(obj);
        }

        public boolean isEmpty() {
            return this.f40022z.isEmpty();
        }

        public Set keySet() {
            return this.f40022z.keySet();
        }

        public void putAll(Map map) {
            this.f40022z.putAll(map);
        }

        public Object remove(Object obj) {
            return this.f40022z.remove(obj);
        }

        public int size() {
            return this.f40022z.size();
        }

        public Collection values() {
            return this.f40022z.values();
        }
    }

    public void clear() {
        this.f40020z.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f40020z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f40020z.containsValue(obj);
    }

    public Set entrySet() {
        return this.f40020z.entrySet();
    }

    public Object get(Object obj) {
        return this.f40020z.get(obj);
    }

    public boolean isEmpty() {
        return this.f40020z.isEmpty();
    }

    public Set keySet() {
        return this.f40020z.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.f40020z.put(obj, obj2);
    }

    public void putAll(Map map) {
        this.f40020z.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f40020z.remove(obj);
    }

    public int size() {
        return this.f40020z.size();
    }

    public Collection values() {
        return this.f40020z.values();
    }
}
