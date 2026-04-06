package com.google.common.collect;

import java.util.Comparator;

@ElementTypesAreNonnullByDefault
interface SortedIterable<T> extends Iterable<T> {
    Comparator comparator();
}
