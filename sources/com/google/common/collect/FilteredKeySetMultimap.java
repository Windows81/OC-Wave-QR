package com.google.common.collect;

import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class FilteredKeySetMultimap<K, V> extends FilteredKeyMultimap<K, V> implements FilteredSetMultimap<K, V> {

    public class EntrySet extends FilteredKeyMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        public EntrySet(FilteredKeySetMultimap filteredKeySetMultimap) {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        public int hashCode() {
            return Sets.f(this);
        }
    }

    /* renamed from: j */
    public Set b() {
        return new EntrySet(this);
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
