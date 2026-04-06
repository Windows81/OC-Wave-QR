package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final Object f28140A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f28141z;

    public ImmutableEntry(Object obj, Object obj2) {
        this.f28141z = obj;
        this.f28140A = obj2;
    }

    public final Object getKey() {
        return this.f28141z;
    }

    public final Object getValue() {
        return this.f28140A;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
