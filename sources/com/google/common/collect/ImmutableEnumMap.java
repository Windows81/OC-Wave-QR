package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;

@ElementTypesAreNonnullByDefault
final class ImmutableEnumMap<K extends Enum<K>, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
    public final transient EnumMap D;

    public static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable {
    }

    public boolean containsKey(Object obj) {
        return this.D.containsKey(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableEnumMap) {
            obj = ((ImmutableEnumMap) obj).D;
        }
        return this.D.equals(obj);
    }

    public Object get(Object obj) {
        return this.D.get(obj);
    }

    public boolean k() {
        return false;
    }

    public UnmodifiableIterator m() {
        return Iterators.K(this.D.keySet().iterator());
    }

    public UnmodifiableIterator r() {
        return Maps.S(this.D.entrySet().iterator());
    }

    public int size() {
        return this.D.size();
    }
}
