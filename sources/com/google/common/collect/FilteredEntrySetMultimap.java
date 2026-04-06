package com.google.common.collect;

import java.util.Set;

@ElementTypesAreNonnullByDefault
final class FilteredEntrySetMultimap<K, V> extends FilteredEntryMultimap<K, V> implements FilteredSetMultimap<K, V> {
    /* renamed from: p */
    public Set b() {
        return Sets.d(n().m(), B());
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

    public SetMultimap n() {
        return (SetMultimap) this.D;
    }
}
