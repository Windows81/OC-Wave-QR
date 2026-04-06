package dagger.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class LazyClassKeyMap<V> implements Map<Class<?>, V> {

    /* renamed from: z  reason: collision with root package name */
    public final Map f39767z;

    public static class MapFactory<V> implements Factory<Map<Class<?>, V>> {

        /* renamed from: a  reason: collision with root package name */
        public Factory f39768a;

        /* renamed from: a */
        public Map get() {
            return LazyClassKeyMap.a((Map) this.f39768a.get());
        }
    }

    public static class MapProviderFactory<V> implements Factory<Map<Class<?>, Provider<V>>> {

        /* renamed from: a  reason: collision with root package name */
        public Factory f39769a;

        /* renamed from: a */
        public Map get() {
            return LazyClassKeyMap.a((Map) this.f39769a.get());
        }
    }

    public LazyClassKeyMap(Map map) {
        this.f39767z = map;
    }

    public static Map a(Map map) {
        return new LazyClassKeyMap(map);
    }

    /* renamed from: b */
    public Object put(Class cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f39767z.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean containsValue(Object obj) {
        return this.f39767z.containsValue(obj);
    }

    public Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    public Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f39767z.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    public boolean isEmpty() {
        return this.f39767z.isEmpty();
    }

    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    public int size() {
        return this.f39767z.size();
    }

    public Collection values() {
        return this.f39767z.values();
    }
}
