package com.google.common.collect;

import java.util.SortedSet;

@ElementTypesAreNonnullByDefault
public interface SortedSetMultimap<K, V> extends SetMultimap<K, V> {
    SortedSet get(Object obj);

    SortedSet h(Object obj);
}
