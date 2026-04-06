package com.google.common.collect;

import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
public interface SortedMapDifference<K, V> extends MapDifference<K, V> {
    SortedMap a();

    SortedMap b();

    SortedMap c();

    SortedMap d();
}
