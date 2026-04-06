package io.realm;

import io.realm.internal.OsSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class SetIterator<E> implements Iterator<E> {

    /* renamed from: A  reason: collision with root package name */
    public final BaseRealm f40072A;

    /* renamed from: B  reason: collision with root package name */
    public int f40073B = -1;

    /* renamed from: z  reason: collision with root package name */
    public final OsSet f40074z;

    public SetIterator(OsSet osSet, BaseRealm baseRealm) {
        this.f40074z = osSet;
        this.f40072A = baseRealm;
    }

    public Object b(int i2) {
        return this.f40074z.H(i2);
    }

    public boolean hasNext() {
        return ((long) (this.f40073B + 1)) < this.f40074z.a0();
    }

    public Object next() {
        this.f40073B++;
        long a0 = this.f40074z.a0();
        int i2 = this.f40073B;
        if (((long) i2) < a0) {
            return b(i2);
        }
        throw new NoSuchElementException("Cannot access index " + this.f40073B + " when size is " + a0 + ". Remember to check hasNext() before using next().");
    }
}
