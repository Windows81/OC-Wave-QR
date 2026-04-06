package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.math.IntMath;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements SortedMultiset<E> {
    public transient ImmutableSortedMultiset C;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* renamed from: d  reason: collision with root package name */
        public final Comparator f28212d;

        /* renamed from: e  reason: collision with root package name */
        public Object[] f28213e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f28214f;

        /* renamed from: g  reason: collision with root package name */
        public int f28215g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f28216h;

        /* renamed from: j */
        public Builder e(Object obj) {
            return g(obj, 1);
        }

        /* renamed from: k */
        public Builder f(Iterable iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry entry : ((Multiset) iterable).entrySet()) {
                    g(entry.a(), entry.getCount());
                }
            } else {
                for (Object j2 : iterable) {
                    e(j2);
                }
            }
            return this;
        }

        /* renamed from: l */
        public Builder g(Object obj, int i2) {
            Preconditions.q(obj);
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0) {
                return this;
            }
            p();
            Object[] objArr = this.f28213e;
            int i3 = this.f28215g;
            objArr[i3] = obj;
            this.f28214f[i3] = i2;
            this.f28215g = i3 + 1;
            return this;
        }

        /* renamed from: m */
        public ImmutableSortedMultiset h() {
            o();
            int i2 = this.f28215g;
            if (i2 == 0) {
                return ImmutableSortedMultiset.B(this.f28212d);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.K(this.f28212d, i2, this.f28213e);
            long[] jArr = new long[(this.f28215g + 1)];
            int i3 = 0;
            while (i3 < this.f28215g) {
                int i4 = i3 + 1;
                jArr[i4] = jArr[i3] + ((long) this.f28214f[i3]);
                i3 = i4;
            }
            this.f28216h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f28215g);
        }

        public final void n(boolean z2) {
            int i2 = this.f28215g;
            if (i2 != 0) {
                Object[] copyOf = Arrays.copyOf(this.f28213e, i2);
                Arrays.sort(copyOf, this.f28212d);
                int i3 = 1;
                for (int i4 = 1; i4 < copyOf.length; i4++) {
                    if (this.f28212d.compare(copyOf[i3 - 1], copyOf[i4]) < 0) {
                        copyOf[i3] = copyOf[i4];
                        i3++;
                    }
                }
                Arrays.fill(copyOf, i3, this.f28215g, (Object) null);
                if (z2) {
                    int i5 = i3 * 4;
                    int i6 = this.f28215g;
                    if (i5 > i6 * 3) {
                        copyOf = Arrays.copyOf(copyOf, IntMath.i(i6, (i6 / 2) + 1));
                    }
                }
                int[] iArr = new int[copyOf.length];
                for (int i7 = 0; i7 < this.f28215g; i7++) {
                    int binarySearch = Arrays.binarySearch(copyOf, 0, i3, this.f28213e[i7], this.f28212d);
                    int i8 = this.f28214f[i7];
                    if (i8 >= 0) {
                        iArr[binarySearch] = iArr[binarySearch] + i8;
                    } else {
                        iArr[binarySearch] = ~i8;
                    }
                }
                this.f28213e = copyOf;
                this.f28214f = iArr;
                this.f28215g = i3;
            }
        }

        public final void o() {
            n(false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f28215g;
                if (i2 < i4) {
                    int[] iArr = this.f28214f;
                    int i5 = iArr[i2];
                    if (i5 > 0) {
                        Object[] objArr = this.f28213e;
                        objArr[i3] = objArr[i2];
                        iArr[i3] = i5;
                        i3++;
                    }
                    i2++;
                } else {
                    Arrays.fill(this.f28213e, i3, i4, (Object) null);
                    Arrays.fill(this.f28214f, i3, this.f28215g, 0);
                    this.f28215g = i3;
                    return;
                }
            }
        }

        public final void p() {
            int i2 = this.f28215g;
            Object[] objArr = this.f28213e;
            if (i2 == objArr.length) {
                n(true);
            } else if (this.f28216h) {
                this.f28213e = Arrays.copyOf(objArr, objArr.length);
            }
            this.f28216h = false;
        }
    }

    public static final class SerializedForm<E> implements Serializable {
    }

    public static ImmutableSortedMultiset B(Comparator comparator) {
        return Ordering.e().equals(comparator) ? RegularImmutableSortedMultiset.I : new RegularImmutableSortedMultiset(comparator);
    }

    /* renamed from: A */
    public abstract ImmutableSortedSet s();

    /* renamed from: C */
    public abstract ImmutableSortedMultiset E0(Object obj, BoundType boundType);

    /* renamed from: D */
    public ImmutableSortedMultiset w1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        Preconditions.l(comparator().compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return S0(obj, boundType).E0(obj2, boundType2);
    }

    /* renamed from: E */
    public abstract ImmutableSortedMultiset S0(Object obj, BoundType boundType);

    public final Comparator comparator() {
        return s().comparator();
    }

    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: z */
    public ImmutableSortedMultiset e0() {
        ImmutableSortedMultiset immutableSortedMultiset = this.C;
        if (immutableSortedMultiset == null) {
            immutableSortedMultiset = isEmpty() ? B(Ordering.a(comparator()).j()) : new DescendingImmutableSortedMultiset(this);
            this.C = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }
}
