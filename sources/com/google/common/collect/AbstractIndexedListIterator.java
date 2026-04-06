package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* renamed from: A  reason: collision with root package name */
    public int f27953A;

    /* renamed from: z  reason: collision with root package name */
    public final int f27954z;

    public AbstractIndexedListIterator(int i2) {
        this(i2, 0);
    }

    public abstract Object b(int i2);

    public final boolean hasNext() {
        return this.f27953A < this.f27954z;
    }

    public final boolean hasPrevious() {
        return this.f27953A > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.f27953A;
            this.f27953A = i2 + 1;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f27953A;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f27953A - 1;
            this.f27953A = i2;
            return b(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f27953A - 1;
    }

    public AbstractIndexedListIterator(int i2, int i3) {
        Preconditions.t(i3, i2);
        this.f27954z = i2;
        this.f27953A = i3;
    }
}
