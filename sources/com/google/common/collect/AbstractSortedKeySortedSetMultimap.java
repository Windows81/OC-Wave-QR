package com.google.common.collect;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    /* renamed from: J */
    public SortedMap E() {
        return (SortedMap) super.E();
    }

    /* renamed from: K */
    public SortedSet keySet() {
        return (SortedSet) super.keySet();
    }

    public Set c() {
        return u();
    }
}
