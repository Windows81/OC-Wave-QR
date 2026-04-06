package com.google.common.cache;

@ElementTypesAreNonnullByDefault
public interface Weigher<K, V> {
    int d(Object obj, Object obj2);
}
