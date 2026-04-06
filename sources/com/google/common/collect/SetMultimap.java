package com.google.common.collect;

import java.util.Set;

@ElementTypesAreNonnullByDefault
public interface SetMultimap<K, V> extends Multimap<K, V> {
    Set get(Object obj);

    Set h(Object obj);

    Set m();
}
