package com.google.common.collect;

import java.util.Queue;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    /* renamed from: Z */
    public abstract Queue Q();

    public Object element() {
        return Q().element();
    }

    public boolean offer(Object obj) {
        return Q().offer(obj);
    }

    public Object peek() {
        return Q().peek();
    }

    public Object poll() {
        return Q().poll();
    }

    public Object remove() {
        return Q().remove();
    }
}
