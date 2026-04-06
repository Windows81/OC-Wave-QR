package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public interface SortedMultiset<E> extends SortedMultisetBridge<E>, SortedIterable<E> {
    SortedMultiset E0(Object obj, BoundType boundType);

    SortedMultiset S0(Object obj, BoundType boundType);

    Comparator comparator();

    SortedMultiset e0();

    Set entrySet();

    Multiset.Entry firstEntry();

    NavigableSet k();

    Multiset.Entry lastEntry();

    Multiset.Entry pollFirstEntry();

    Multiset.Entry pollLastEntry();

    SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2);
}
