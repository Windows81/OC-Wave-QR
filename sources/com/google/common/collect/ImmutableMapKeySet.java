package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

@ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableMap f28163B;

    public static class KeySetSerializedForm<K> implements Serializable {
    }

    public ImmutableMapKeySet(ImmutableMap immutableMap) {
        this.f28163B = immutableMap;
    }

    public boolean contains(Object obj) {
        return this.f28163B.containsKey(obj);
    }

    public Object get(int i2) {
        return ((Map.Entry) this.f28163B.entrySet().e().get(i2)).getKey();
    }

    public boolean n() {
        return true;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return this.f28163B.m();
    }

    public int size() {
        return this.f28163B.size();
    }
}
