package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    public Map D() {
        return M().D();
    }

    /* renamed from: Q */
    public abstract Table M();

    public void clear() {
        M().clear();
    }

    public boolean containsValue(Object obj) {
        return M().containsValue(obj);
    }

    public boolean equals(Object obj) {
        return obj == this || M().equals(obj);
    }

    public int hashCode() {
        return M().hashCode();
    }

    public Map o() {
        return M().o();
    }

    public int size() {
        return M().size();
    }

    public Collection values() {
        return M().values();
    }

    public Set z() {
        return M().z();
    }
}
