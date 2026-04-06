package com.google.common.collect;

import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    /* renamed from: Q */
    public abstract Iterator M();

    public boolean hasNext() {
        return M().hasNext();
    }

    public Object next() {
        return M().next();
    }

    public void remove() {
        M().remove();
    }
}
