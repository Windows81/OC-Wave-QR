package com.google.common.cache;

@ElementTypesAreNonnullByDefault
public interface RemovalListener<K, V> {
    void d(RemovalNotification removalNotification);
}
