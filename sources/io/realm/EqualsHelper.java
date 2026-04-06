package io.realm;

import java.util.Map;

abstract class EqualsHelper<K, V> {
    public abstract boolean a(Object obj, Object obj2);

    public boolean b(Map.Entry entry, Map.Entry entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return a(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}
