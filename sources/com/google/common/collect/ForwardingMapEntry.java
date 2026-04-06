package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Map;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    /* renamed from: Q */
    public abstract Map.Entry M();

    public boolean R(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Objects.a(getKey(), entry.getKey()) && Objects.a(getValue(), entry.getValue());
    }

    public boolean equals(Object obj) {
        return M().equals(obj);
    }

    public Object getKey() {
        return M().getKey();
    }

    public Object getValue() {
        return M().getValue();
    }

    public int hashCode() {
        return M().hashCode();
    }

    public Object setValue(Object obj) {
        return M().setValue(obj);
    }
}
