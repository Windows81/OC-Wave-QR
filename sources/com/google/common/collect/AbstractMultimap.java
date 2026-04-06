package com.google.common.collect;

import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public transient Set f27983A;

    /* renamed from: B  reason: collision with root package name */
    public transient Collection f27984B;
    public transient Map C;

    /* renamed from: z  reason: collision with root package name */
    public transient Collection f27985z;

    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        public Multimap e() {
            return AbstractMultimap.this;
        }

        public Iterator iterator() {
            return AbstractMultimap.this.e();
        }
    }

    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public EntrySet(AbstractMultimap abstractMultimap) {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        public int hashCode() {
            return Sets.f(this);
        }
    }

    public class Values extends AbstractCollection<V> {
        public Values() {
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        public Iterator iterator() {
            return AbstractMultimap.this.f();
        }

        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    public Map E() {
        Map map = this.C;
        if (map != null) {
            return map;
        }
        Map a2 = a();
        this.C = a2;
        return a2;
    }

    public boolean F(Object obj, Object obj2) {
        Collection collection = (Collection) E().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public abstract Map a();

    public abstract Collection b();

    public abstract Set c();

    public boolean containsValue(Object obj) {
        for (Collection contains : E().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Collection d();

    public abstract Iterator e();

    public boolean equals(Object obj) {
        return Multimaps.c(this, obj);
    }

    public Iterator f() {
        return Maps.X(m().iterator());
    }

    public Collection g() {
        Collection collection = this.f27984B;
        if (collection != null) {
            return collection;
        }
        Collection d2 = d();
        this.f27984B = d2;
        return d2;
    }

    public int hashCode() {
        return E().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set keySet() {
        Set set = this.f27983A;
        if (set != null) {
            return set;
        }
        Set c2 = c();
        this.f27983A = c2;
        return c2;
    }

    public Collection m() {
        Collection collection = this.f27985z;
        if (collection != null) {
            return collection;
        }
        Collection b2 = b();
        this.f27985z = b2;
        return b2;
    }

    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) E().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return E().toString();
    }
}
