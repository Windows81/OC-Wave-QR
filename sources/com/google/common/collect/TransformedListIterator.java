package com.google.common.collect;

import java.util.ListIterator;

@ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    public TransformedListIterator(ListIterator listIterator) {
        super(listIterator);
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator c() {
        return Iterators.d(this.f28609z);
    }

    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    public final int nextIndex() {
        return c().nextIndex();
    }

    public final Object previous() {
        return b(c().previous());
    }

    public final int previousIndex() {
        return c().previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
