package com.google.common.collect;

import java.util.List;

@ElementTypesAreNonnullByDefault
final class FilteredKeyListMultimap<K, V> extends FilteredKeyMultimap<K, V> implements ListMultimap<K, V> {
    /* renamed from: j */
    public ListMultimap n() {
        return (ListMultimap) super.n();
    }

    public List get(Object obj) {
        return (List) super.get(obj);
    }

    public List h(Object obj) {
        return (List) super.h(obj);
    }
}
