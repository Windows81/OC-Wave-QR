package com.google.common.collect;

import java.util.List;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    /* renamed from: R */
    public abstract ListMultimap Q();

    public List get(Object obj) {
        return Q().get(obj);
    }

    public List h(Object obj) {
        return Q().h(obj);
    }
}
