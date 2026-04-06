package com.google.common.collect;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.NavigableSet;

@ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {
    public transient UnmodifiableSortedMultiset C;

    public UnmodifiableSortedMultiset(SortedMultiset sortedMultiset) {
        super(sortedMultiset);
    }

    public SortedMultiset E0(Object obj, BoundType boundType) {
        return Multisets.o(Z().E0(obj, boundType));
    }

    public SortedMultiset S0(Object obj, BoundType boundType) {
        return Multisets.o(Z().S0(obj, boundType));
    }

    /* renamed from: b0 */
    public NavigableSet a0() {
        return Sets.p(Z().k());
    }

    public Comparator comparator() {
        return Z().comparator();
    }

    /* renamed from: d0 */
    public SortedMultiset Z() {
        return (SortedMultiset) super.Q();
    }

    public SortedMultiset e0() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.C;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(Z().e0());
        unmodifiableSortedMultiset2.C = this;
        this.C = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    public Multiset.Entry firstEntry() {
        return Z().firstEntry();
    }

    public Multiset.Entry lastEntry() {
        return Z().lastEntry();
    }

    public Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public SortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return Multisets.o(Z().w1(obj, boundType, obj2, boundType2));
    }

    public NavigableSet k() {
        return (NavigableSet) super.k();
    }
}
