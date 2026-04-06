package com.google.common.collect;

import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: z  reason: collision with root package name */
    public Object f27992z;

    public AbstractSequentialIterator(Object obj) {
        this.f27992z = obj;
    }

    public abstract Object b(Object obj);

    public final boolean hasNext() {
        return this.f27992z != null;
    }

    public final Object next() {
        Object obj = this.f27992z;
        if (obj != null) {
            this.f27992z = b(obj);
            return obj;
        }
        throw new NoSuchElementException();
    }
}
