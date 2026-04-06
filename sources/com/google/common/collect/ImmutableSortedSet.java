package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, SortedIterable<E> {

    /* renamed from: B  reason: collision with root package name */
    public final transient Comparator f28217B;
    public transient ImmutableSortedSet C;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {

        /* renamed from: f  reason: collision with root package name */
        public final Comparator f28218f;

        /* renamed from: m */
        public Builder i(Object obj) {
            super.e(obj);
            return this;
        }

        /* renamed from: n */
        public Builder j(Iterator it) {
            super.j(it);
            return this;
        }

        /* renamed from: o */
        public ImmutableSortedSet l() {
            ImmutableSortedSet K = ImmutableSortedSet.K(this.f28218f, this.f28138b, this.f28137a);
            this.f28138b = K.size();
            this.f28139c = true;
            return K;
        }
    }

    public static class SerializedForm<E> implements Serializable {
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.f28217B = comparator;
    }

    public static ImmutableSortedSet K(Comparator comparator, int i2, Object... objArr) {
        if (i2 == 0) {
            return S(comparator);
        }
        ObjectArrays.c(objArr, i2);
        Arrays.sort(objArr, 0, i2, comparator);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (comparator.compare(obj, objArr[i3 - 1]) != 0) {
                objArr[i3] = obj;
                i3++;
            }
        }
        Arrays.fill(objArr, i3, i2, (Object) null);
        if (i3 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i3);
        }
        return new RegularImmutableSortedSet(ImmutableList.q(objArr, i3), comparator);
    }

    public static ImmutableSortedSet L(Comparator comparator, Iterable iterable) {
        Preconditions.q(comparator);
        if (SortedIterables.b(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.n()) {
                return immutableSortedSet;
            }
        }
        Object[] n2 = Iterables.n(iterable);
        return K(comparator, n2.length, n2);
    }

    public static ImmutableSortedSet M(Comparator comparator, Collection collection) {
        return L(comparator, collection);
    }

    public static RegularImmutableSortedSet S(Comparator comparator) {
        return Ordering.e().equals(comparator) ? RegularImmutableSortedSet.E : new RegularImmutableSortedSet(ImmutableList.D(), comparator);
    }

    public static ImmutableSortedSet X() {
        return RegularImmutableSortedSet.E;
    }

    public static int i0(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    public abstract ImmutableSortedSet P();

    /* renamed from: Q */
    public abstract UnmodifiableIterator descendingIterator();

    /* renamed from: R */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.C;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet P = P();
        this.C = P;
        P.C = this;
        return P;
    }

    /* renamed from: U */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    /* renamed from: V */
    public ImmutableSortedSet headSet(Object obj, boolean z2) {
        return W(Preconditions.q(obj), z2);
    }

    public abstract ImmutableSortedSet W(Object obj, boolean z2);

    /* renamed from: Y */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* renamed from: Z */
    public ImmutableSortedSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        Preconditions.q(obj);
        Preconditions.q(obj2);
        Preconditions.d(this.f28217B.compare(obj, obj2) <= 0);
        return a0(obj, z2, obj2, z3);
    }

    public abstract ImmutableSortedSet a0(Object obj, boolean z2, Object obj2, boolean z3);

    /* renamed from: b0 */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public Object ceiling(Object obj) {
        return Iterables.h(tailSet(obj, true), (Object) null);
    }

    public Comparator comparator() {
        return this.f28217B;
    }

    /* renamed from: d0 */
    public ImmutableSortedSet tailSet(Object obj, boolean z2) {
        return f0(Preconditions.q(obj), z2);
    }

    public abstract ImmutableSortedSet f0(Object obj, boolean z2);

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return Iterators.u(headSet(obj, true).descendingIterator(), (Object) null);
    }

    public int h0(Object obj, Object obj2) {
        return i0(this.f28217B, obj, obj2);
    }

    public Object higher(Object obj) {
        return Iterables.h(tailSet(obj, false), (Object) null);
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return Iterators.u(headSet(obj, false).descendingIterator(), (Object) null);
    }

    /* renamed from: o */
    public abstract UnmodifiableIterator iterator();

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
