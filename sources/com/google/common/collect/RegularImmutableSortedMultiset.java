package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final long[] H = {0};
    public static final ImmutableSortedMultiset I = new RegularImmutableSortedMultiset(Ordering.e());
    public final transient RegularImmutableSortedSet D;
    public final transient long[] E;
    public final transient int F;
    public final transient int G;

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.D = ImmutableSortedSet.S(comparator);
        this.E = H;
        this.F = 0;
        this.G = 0;
    }

    /* renamed from: A */
    public ImmutableSortedSet s() {
        return this.D;
    }

    /* renamed from: C */
    public ImmutableSortedMultiset E0(Object obj, BoundType boundType) {
        return H(0, this.D.k0(obj, Preconditions.q(boundType) == BoundType.CLOSED));
    }

    /* renamed from: E */
    public ImmutableSortedMultiset S0(Object obj, BoundType boundType) {
        return H(this.D.l0(obj, Preconditions.q(boundType) == BoundType.CLOSED), this.G);
    }

    public final int F(int i2) {
        long[] jArr = this.E;
        int i3 = this.F;
        return (int) (jArr[(i3 + i2) + 1] - jArr[i3 + i2]);
    }

    public ImmutableSortedMultiset H(int i2, int i3) {
        Preconditions.v(i2, i3, this.G);
        return i2 == i3 ? ImmutableSortedMultiset.B(comparator()) : (i2 == 0 && i3 == this.G) ? this : new RegularImmutableSortedMultiset(this.D.j0(i2, i3), this.E, this.F + i2, i3 - i2);
    }

    public int L0(Object obj) {
        int indexOf = this.D.indexOf(obj);
        if (indexOf >= 0) {
            return F(indexOf);
        }
        return 0;
    }

    public Multiset.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return v(0);
    }

    public Multiset.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return v(this.G - 1);
    }

    public boolean n() {
        return this.F > 0 || this.G < this.E.length - 1;
    }

    public int size() {
        long[] jArr = this.E;
        int i2 = this.F;
        return Ints.k(jArr[this.G + i2] - jArr[i2]);
    }

    public Multiset.Entry v(int i2) {
        return Multisets.g(this.D.e().get(i2), F(i2));
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i2, int i3) {
        this.D = regularImmutableSortedSet;
        this.E = jArr;
        this.F = i2;
        this.G = i3;
    }
}
