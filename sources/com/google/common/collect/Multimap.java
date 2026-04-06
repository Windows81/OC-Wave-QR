package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Multimap<K, V> {
    Map E();

    boolean F(Object obj, Object obj2);

    void clear();

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    boolean equals(Object obj);

    Collection get(Object obj);

    Collection h(Object obj);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    Collection m();

    boolean put(Object obj, Object obj2);

    boolean remove(Object obj, Object obj2);

    int size();
}
