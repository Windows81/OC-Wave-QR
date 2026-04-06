package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    /* renamed from: C */
    public abstract Set r();

    /* renamed from: D */
    public Set v() {
        return Collections.emptySet();
    }

    public Map E() {
        return super.E();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public Collection y(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    public Collection z(Object obj, Collection collection) {
        return new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
    }

    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    public Set h(Object obj) {
        return (Set) super.h(obj);
    }

    public Set m() {
        return (Set) super.m();
    }
}
