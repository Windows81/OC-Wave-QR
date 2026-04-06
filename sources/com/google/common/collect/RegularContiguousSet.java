package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public final Range E;

    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    public RegularContiguousSet(Range range, DiscreteDomain discreteDomain) {
        super(discreteDomain);
        this.E = range;
    }

    public static boolean A0(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && Range.f(comparable, comparable2) == 0;
    }

    public ImmutableList B() {
        return this.D.f28077z ? new ImmutableAsList<C>() {
            /* renamed from: R */
            public ImmutableSortedSet Q() {
                return RegularContiguousSet.this;
            }

            /* renamed from: S */
            public Comparable get(int i2) {
                Preconditions.o(i2, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return regularContiguousSet.D.e(regularContiguousSet.first(), (long) i2);
            }
        } : super.B();
    }

    /* renamed from: B0 */
    public Comparable first() {
        Comparable t2 = this.E.f28498z.t(this.D);
        Objects.requireNonNull(t2);
        return t2;
    }

    public final ContiguousSet C0(Range range) {
        return this.E.o(range) ? ContiguousSet.j0(this.E.n(range), this.D) : new EmptyContiguousSet(this.D);
    }

    /* renamed from: D0 */
    public Comparable last() {
        Comparable p2 = this.E.f28497A.p(this.D);
        Objects.requireNonNull(p2);
        return p2;
    }

    public Range F0(BoundType boundType, BoundType boundType2) {
        return Range.h(this.E.f28498z.z(boundType, this.D), this.E.f28497A.A(boundType2, this.D));
    }

    /* renamed from: Q */
    public UnmodifiableIterator descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) {

            /* renamed from: A  reason: collision with root package name */
            public final Comparable f28505A;

            {
                this.f28505A = RegularContiguousSet.this.first();
            }

            /* renamed from: c */
            public Comparable b(Comparable comparable) {
                if (RegularContiguousSet.A0(comparable, this.f28505A)) {
                    return null;
                }
                return RegularContiguousSet.this.D.f(comparable);
            }
        };
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.E.g((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection collection) {
        return Collections2.b(this, collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.D.equals(regularContiguousSet.D)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return Sets.f(this);
    }

    public boolean isEmpty() {
        return false;
    }

    /* renamed from: m0 */
    public ContiguousSet W(Comparable comparable, boolean z2) {
        return C0(Range.x(comparable, BoundType.f(z2)));
    }

    public boolean n() {
        return false;
    }

    /* renamed from: o */
    public UnmodifiableIterator iterator() {
        return new AbstractSequentialIterator<C>(first()) {

            /* renamed from: A  reason: collision with root package name */
            public final Comparable f28503A;

            {
                this.f28503A = RegularContiguousSet.this.last();
            }

            /* renamed from: c */
            public Comparable b(Comparable comparable) {
                if (RegularContiguousSet.A0(comparable, this.f28503A)) {
                    return null;
                }
                return RegularContiguousSet.this.D.d(comparable);
            }
        };
    }

    public Range p0() {
        BoundType boundType = BoundType.CLOSED;
        return F0(boundType, boundType);
    }

    public int size() {
        long a2 = this.D.a(first(), last());
        if (a2 >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a2) + 1;
    }

    /* renamed from: u0 */
    public ContiguousSet a0(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
        return (comparable.compareTo(comparable2) != 0 || z2 || z3) ? C0(Range.u(comparable, BoundType.f(z2), comparable2, BoundType.f(z3))) : new EmptyContiguousSet(this.D);
    }

    /* renamed from: y0 */
    public ContiguousSet f0(Comparable comparable, boolean z2) {
        return C0(Range.i(comparable, BoundType.f(z2)));
    }
}
