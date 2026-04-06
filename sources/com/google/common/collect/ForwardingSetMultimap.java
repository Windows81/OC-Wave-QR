package com.google.common.collect;

import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V> {
    /* renamed from: R */
    public abstract SetMultimap Q();

    public Set get(Object obj) {
        return Q().get(obj);
    }

    public Set h(Object obj) {
        return Q().h(obj);
    }

    public Set m() {
        return Q().m();
    }
}
