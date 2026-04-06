package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final Map f28780a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient Map.Entry f28781b;

    public final boolean c(Object obj) {
        return e(obj) != null || this.f28780a.containsKey(obj);
    }

    public Object d(Object obj) {
        Preconditions.q(obj);
        Object e2 = e(obj);
        return e2 == null ? f(obj) : e2;
    }

    public Object e(Object obj) {
        Map.Entry entry = this.f28781b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    public final Object f(Object obj) {
        Preconditions.q(obj);
        return this.f28780a.get(obj);
    }

    public final Set g() {
        return new AbstractSet<K>() {
            public boolean contains(Object obj) {
                return MapIteratorCache.this.c(obj);
            }

            /* renamed from: e */
            public UnmodifiableIterator iterator() {
                final Iterator it = MapIteratorCache.this.f28780a.entrySet().iterator();
                return new UnmodifiableIterator<K>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Object next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry unused = MapIteratorCache.this.f28781b = entry;
                        return entry.getKey();
                    }
                };
            }

            public int size() {
                return MapIteratorCache.this.f28780a.size();
            }
        };
    }
}
