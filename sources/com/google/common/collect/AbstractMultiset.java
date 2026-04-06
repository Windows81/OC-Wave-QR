package com.google.common.collect;

import com.google.common.collect.Multisets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    /* renamed from: A  reason: collision with root package name */
    public transient Set f27988A;

    /* renamed from: z  reason: collision with root package name */
    public transient Set f27989z;

    public class ElementSet extends Multisets.ElementSet<E> {
        public ElementSet() {
        }

        public Iterator iterator() {
            return AbstractMultiset.this.i();
        }

        public Multiset m() {
            return AbstractMultiset.this;
        }
    }

    public class EntrySet extends Multisets.EntrySet<E> {
        public EntrySet() {
        }

        public Iterator iterator() {
            return AbstractMultiset.this.m();
        }

        public Multiset m() {
            return AbstractMultiset.this;
        }

        public int size() {
            return AbstractMultiset.this.h();
        }
    }

    public int N(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    public int T(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    public final boolean add(Object obj) {
        T(obj, 1);
        return true;
    }

    public final boolean addAll(Collection collection) {
        return Multisets.c(this, collection);
    }

    public boolean contains(Object obj) {
        return L0(obj) > 0;
    }

    public Set e() {
        return new ElementSet();
    }

    public Set entrySet() {
        Set set = this.f27988A;
        if (set != null) {
            return set;
        }
        Set g2 = g();
        this.f27988A = g2;
        return g2;
    }

    public final boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    public Set g() {
        return new EntrySet();
    }

    public abstract int h();

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Iterator i();

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public Set k() {
        Set set = this.f27989z;
        if (set != null) {
            return set;
        }
        Set e2 = e();
        this.f27989z = e2;
        return e2;
    }

    public abstract Iterator m();

    public int n0(Object obj, int i2) {
        return Multisets.m(this, obj, i2);
    }

    public final boolean remove(Object obj) {
        return N(obj, 1) > 0;
    }

    public final boolean removeAll(Collection collection) {
        return Multisets.k(this, collection);
    }

    public final boolean retainAll(Collection collection) {
        return Multisets.l(this, collection);
    }

    public boolean t0(Object obj, int i2, int i3) {
        return Multisets.n(this, obj, i2, i3);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
