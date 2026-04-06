package com.google.common.cache;

import com.google.common.base.Function;

@ElementTypesAreNonnullByDefault
public interface LoadingCache<K, V> extends Cache<K, V>, Function<K, V> {
    Object apply(Object obj);

    Object get(Object obj);
}
