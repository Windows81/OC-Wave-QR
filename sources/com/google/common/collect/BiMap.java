package com.google.common.collect;

import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    BiMap q1();

    Set values();
}
