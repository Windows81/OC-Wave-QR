package com.google.common.graph;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public volatile transient CacheEntry f28785c;

    /* renamed from: d  reason: collision with root package name */
    public volatile transient CacheEntry f28786d;

    public static final class CacheEntry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f28787a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f28788b;

        public CacheEntry(Object obj, Object obj2) {
            this.f28787a = obj;
            this.f28788b = obj2;
        }
    }

    public Object d(Object obj) {
        Preconditions.q(obj);
        Object e2 = e(obj);
        if (e2 != null) {
            return e2;
        }
        Object f2 = f(obj);
        if (f2 != null) {
            i(obj, f2);
        }
        return f2;
    }

    public Object e(Object obj) {
        Object e2 = super.e(obj);
        if (e2 != null) {
            return e2;
        }
        CacheEntry cacheEntry = this.f28785c;
        if (cacheEntry != null && cacheEntry.f28787a == obj) {
            return cacheEntry.f28788b;
        }
        CacheEntry cacheEntry2 = this.f28786d;
        if (cacheEntry2 == null || cacheEntry2.f28787a != obj) {
            return null;
        }
        h(cacheEntry2);
        return cacheEntry2.f28788b;
    }

    public final void h(CacheEntry cacheEntry) {
        this.f28786d = this.f28785c;
        this.f28785c = cacheEntry;
    }

    public final void i(Object obj, Object obj2) {
        h(new CacheEntry(obj, obj2));
    }
}
