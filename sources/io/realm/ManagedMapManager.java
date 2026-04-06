package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import io.realm.internal.ObservableMap;
import io.realm.internal.ObserverPairList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class ManagedMapManager<K, V> implements Map<K, V>, ManageableObject, Freezable<RealmMap<K, V>>, ObservableMap {

    /* renamed from: A  reason: collision with root package name */
    public final ObserverPairList f39900A;

    /* renamed from: z  reason: collision with root package name */
    public final MapValueOperator f39901z;

    public abstract MapChangeSet a(long j2);

    public abstract boolean b(Object obj);

    public boolean c(Object obj, Class cls) {
        return obj == null || obj.getClass() == cls;
    }

    public void clear() {
        this.f39901z.a();
    }

    public boolean containsKey(Object obj) {
        return b(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f39901z.c(obj);
    }

    public abstract void e(Map map);

    public abstract Set entrySet();

    public boolean isEmpty() {
        return this.f39901z.g();
    }

    public Set keySet() {
        return this.f39901z.h();
    }

    public void notifyChangeListeners(long j2) {
        MapChangeSetImpl mapChangeSetImpl = new MapChangeSetImpl(a(j2));
        if (!mapChangeSetImpl.isEmpty()) {
            this.f39900A.c(new ObservableMap.Callback(mapChangeSetImpl));
        }
    }

    public abstract Object put(Object obj, Object obj2);

    public void putAll(Map map) {
        e(map);
        this.f39901z.j(map);
    }

    public Object remove(Object obj) {
        if (obj != null) {
            Object f2 = this.f39901z.f(obj);
            this.f39901z.k(obj);
            return f2;
        }
        throw new NullPointerException("Null keys are not allowed.");
    }

    public int size() {
        return this.f39901z.l();
    }

    public Collection values() {
        return this.f39901z.m();
    }
}
