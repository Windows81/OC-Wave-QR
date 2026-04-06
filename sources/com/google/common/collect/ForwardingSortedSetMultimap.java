package com.google.common.collect;

import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    /* renamed from: S */
    public abstract SortedSetMultimap R();

    public SortedSet get(Object obj) {
        return R().get(obj);
    }

    public SortedSet h(Object obj) {
        return R().h(obj);
    }
}
