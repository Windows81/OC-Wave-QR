package com.google.common.collect;

import com.google.common.collect.Multiset;

@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset D;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.D = immutableSortedMultiset;
    }

    /* renamed from: A */
    public ImmutableSortedSet s() {
        return this.D.s().descendingSet();
    }

    /* renamed from: C */
    public ImmutableSortedMultiset E0(Object obj, BoundType boundType) {
        return this.D.S0(obj, boundType).e0();
    }

    /* renamed from: E */
    public ImmutableSortedMultiset S0(Object obj, BoundType boundType) {
        return this.D.E0(obj, boundType).e0();
    }

    public int L0(Object obj) {
        return this.D.L0(obj);
    }

    public Multiset.Entry firstEntry() {
        return this.D.lastEntry();
    }

    public Multiset.Entry lastEntry() {
        return this.D.firstEntry();
    }

    public boolean n() {
        return this.D.n();
    }

    public int size() {
        return this.D.size();
    }

    public Multiset.Entry v(int i2) {
        return (Multiset.Entry) this.D.entrySet().e().K().get(i2);
    }

    /* renamed from: z */
    public ImmutableSortedMultiset e0() {
        return this.D;
    }
}
