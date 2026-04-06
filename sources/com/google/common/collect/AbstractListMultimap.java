package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    /* renamed from: C */
    public abstract List r();

    /* renamed from: D */
    public List v() {
        return Collections.emptyList();
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
        return Collections.unmodifiableList((List) collection);
    }

    public Collection z(Object obj, Collection collection) {
        return A(obj, (List) collection, (AbstractMapBasedMultimap.WrappedCollection) null);
    }

    public List get(Object obj) {
        return (List) super.get(obj);
    }

    public List h(Object obj) {
        return (List) super.h(obj);
    }
}
