package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    public Map E() {
        return super.E();
    }

    /* renamed from: G */
    public abstract SortedSet r();

    /* renamed from: H */
    public SortedSet v() {
        return y(r());
    }

    /* renamed from: I */
    public SortedSet y(Collection collection) {
        return collection instanceof NavigableSet ? Sets.p((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    public Collection z(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null) : new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, (AbstractMapBasedMultimap.WrappedCollection) null);
    }

    public SortedSet get(Object obj) {
        return (SortedSet) super.get(obj);
    }

    public SortedSet h(Object obj) {
        return (SortedSet) super.h(obj);
    }
}
