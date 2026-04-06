package com.google.common.collect;

import com.google.common.base.Predicate;

@ElementTypesAreNonnullByDefault
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    Predicate B();

    Multimap n();
}
