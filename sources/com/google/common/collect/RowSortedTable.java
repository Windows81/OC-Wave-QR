package com.google.common.collect;

import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
public interface RowSortedTable<R, C, V> extends Table<R, C, V> {
    SortedMap o();
}
