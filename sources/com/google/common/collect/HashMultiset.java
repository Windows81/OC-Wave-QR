package com.google.common.collect;

import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class HashMultiset<E> extends AbstractMapBasedMultiset<E> {
    public HashMultiset(int i2) {
        super(i2);
    }

    public static HashMultiset p(int i2) {
        return new HashMultiset(i2);
    }

    public static HashMultiset q(Iterable iterable) {
        HashMultiset p2 = p(Multisets.h(iterable));
        Iterables.a(p2, iterable);
        return p2;
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    public ObjectCountHashMap o(int i2) {
        return new ObjectCountHashMap(i2);
    }
}
