package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    public Map E() {
        return M().E();
    }

    public boolean F(Object obj, Object obj2) {
        return M().F(obj, obj2);
    }

    /* renamed from: Q */
    public abstract Multimap M();

    public void clear() {
        M().clear();
    }

    public boolean containsKey(Object obj) {
        return M().containsKey(obj);
    }

    public boolean equals(Object obj) {
        return obj == this || M().equals(obj);
    }

    public Collection get(Object obj) {
        return M().get(obj);
    }

    public Collection h(Object obj) {
        return M().h(obj);
    }

    public int hashCode() {
        return M().hashCode();
    }

    public boolean isEmpty() {
        return M().isEmpty();
    }

    public Set keySet() {
        return M().keySet();
    }

    public Collection m() {
        return M().m();
    }

    public boolean put(Object obj, Object obj2) {
        return M().put(obj, obj2);
    }

    public boolean remove(Object obj, Object obj2) {
        return M().remove(obj, obj2);
    }

    public int size() {
        return M().size();
    }
}
