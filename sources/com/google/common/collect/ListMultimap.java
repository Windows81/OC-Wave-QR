package com.google.common.collect;

import java.util.List;

@ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends Multimap<K, V> {
    List get(Object obj);

    List h(Object obj);
}
