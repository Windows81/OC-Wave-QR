package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f28609z;

    public TransformedIterator(Iterator it) {
        this.f28609z = (Iterator) Preconditions.q(it);
    }

    public abstract Object b(Object obj);

    public final boolean hasNext() {
        return this.f28609z.hasNext();
    }

    public final Object next() {
        return b(this.f28609z.next());
    }

    public final void remove() {
        this.f28609z.remove();
    }
}
