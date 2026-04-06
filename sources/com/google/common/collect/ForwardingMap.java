package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    public abstract class StandardEntrySet extends Maps.EntrySet<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ForwardingMap f28107z;

        public Map m() {
            return this.f28107z;
        }
    }

    public class StandardKeySet extends Maps.KeySet<K, V> {
    }

    public class StandardValues extends Maps.Values<K, V> {
    }

    /* renamed from: Q */
    public abstract Map M();

    public String R() {
        return Maps.K(this);
    }

    public void clear() {
        M().clear();
    }

    public boolean containsKey(Object obj) {
        return M().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return M().containsValue(obj);
    }

    public Set entrySet() {
        return M().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || M().equals(obj);
    }

    public Object get(Object obj) {
        return M().get(obj);
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

    public Object put(Object obj, Object obj2) {
        return M().put(obj, obj2);
    }

    public void putAll(Map map) {
        M().putAll(map);
    }

    public Object remove(Object obj) {
        return M().remove(obj);
    }

    public int size() {
        return M().size();
    }

    public Collection values() {
        return M().values();
    }
}
