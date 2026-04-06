package com.google.common.collect;

import java.util.ListIterator;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    /* renamed from: R */
    public abstract ListIterator Q();

    public void add(Object obj) {
        Q().add(obj);
    }

    public boolean hasPrevious() {
        return Q().hasPrevious();
    }

    public int nextIndex() {
        return Q().nextIndex();
    }

    public Object previous() {
        return Q().previous();
    }

    public int previousIndex() {
        return Q().previousIndex();
    }

    public void set(Object obj) {
        Q().set(obj);
    }
}
