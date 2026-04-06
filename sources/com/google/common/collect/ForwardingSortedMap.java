package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
    }

    /* renamed from: S */
    public abstract SortedMap Q();

    public Comparator comparator() {
        return Q().comparator();
    }

    public Object firstKey() {
        return Q().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return Q().headMap(obj);
    }

    public Object lastKey() {
        return Q().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return Q().subMap(obj, obj2);
    }

    public SortedMap tailMap(Object obj) {
        return Q().tailMap(obj);
    }
}
