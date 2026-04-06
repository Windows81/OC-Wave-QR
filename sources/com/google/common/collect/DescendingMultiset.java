package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

@ElementTypesAreNonnullByDefault
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    /* renamed from: A  reason: collision with root package name */
    public transient NavigableSet f28073A;

    /* renamed from: B  reason: collision with root package name */
    public transient Set f28074B;

    /* renamed from: z  reason: collision with root package name */
    public transient Comparator f28075z;

    public SortedMultiset E0(Object obj, BoundType boundType) {
        return d0().S0(obj, boundType).e0();
    }

    public SortedMultiset S0(Object obj, BoundType boundType) {
        return d0().E0(obj, boundType).e0();
    }

    /* renamed from: Z */
    public Multiset Q() {
        return d0();
    }

    public Set a0() {
        return new Multisets.EntrySet<E>() {
            public Iterator iterator() {
                return DescendingMultiset.this.b0();
            }

            public Multiset m() {
                return DescendingMultiset.this;
            }

            public int size() {
                return DescendingMultiset.this.d0().entrySet().size();
            }
        };
    }

    public abstract Iterator b0();

    public Comparator comparator() {
        Comparator comparator = this.f28075z;
        if (comparator != null) {
            return comparator;
        }
        Ordering j2 = Ordering.a(d0().comparator()).j();
        this.f28075z = j2;
        return j2;
    }

    public abstract SortedMultiset d0();

    public SortedMultiset e0() {
        return d0();
    }

    public Set entrySet() {
        Set set = this.f28074B;
        if (set != null) {
            return set;
        }
        Set a0 = a0();
        this.f28074B = a0;
        return a0;
    }

    public Multiset.Entry firstEntry() {
        return d0().lastEntry();
    }

    public Iterator iterator() {
        return Multisets.i(this);
    }

    public Multiset.Entry lastEntry() {
        return d0().firstEntry();
    }

    public Multiset.Entry pollFirstEntry() {
        return d0().pollLastEntry();
    }

    public Multiset.Entry pollLastEntry() {
        return d0().pollFirstEntry();
    }

    public Object[] toArray() {
        return V();
    }

    public String toString() {
        return entrySet().toString();
    }

    public SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return d0().w1(obj2, boundType2, obj, boundType).e0();
    }

    public Object[] toArray(Object[] objArr) {
        return W(objArr);
    }

    public NavigableSet k() {
        NavigableSet navigableSet = this.f28073A;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f28073A = navigableElementSet;
        return navigableElementSet;
    }
}
