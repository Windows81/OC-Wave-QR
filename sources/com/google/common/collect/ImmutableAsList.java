package com.google.common.collect;

import java.io.Serializable;

@ElementTypesAreNonnullByDefault
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    public static class SerializedForm implements Serializable {
    }

    public abstract ImmutableCollection Q();

    public boolean contains(Object obj) {
        return Q().contains(obj);
    }

    public boolean isEmpty() {
        return Q().isEmpty();
    }

    public boolean n() {
        return Q().n();
    }

    public int size() {
        return Q().size();
    }
}
