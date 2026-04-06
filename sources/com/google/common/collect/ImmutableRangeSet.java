package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final ImmutableRangeSet f28194A = new ImmutableRangeSet(ImmutableList.D());

    /* renamed from: B  reason: collision with root package name */
    public static final ImmutableRangeSet f28195B = new ImmutableRangeSet(ImmutableList.E(Range.a()));

    /* renamed from: z  reason: collision with root package name */
    public final transient ImmutableList f28196z;

    public final class AsSet extends ImmutableSortedSet<C> {
        public final DiscreteDomain D;
        public transient Integer E;

        public AsSet(DiscreteDomain discreteDomain) {
            super(Ordering.e());
            this.D = discreteDomain;
        }

        public ImmutableSortedSet P() {
            return new DescendingImmutableSortedSet(this);
        }

        /* renamed from: Q */
        public UnmodifiableIterator descendingIterator() {
            return new AbstractIterator<C>() {

                /* renamed from: B  reason: collision with root package name */
                public final Iterator f28199B;
                public Iterator C = Iterators.m();

                {
                    this.f28199B = ImmutableRangeSet.this.f28196z.K().iterator();
                }

                /* renamed from: e */
                public Comparable b() {
                    while (!this.C.hasNext()) {
                        if (!this.f28199B.hasNext()) {
                            return (Comparable) c();
                        }
                        this.C = ContiguousSet.j0((Range) this.f28199B.next(), AsSet.this.D).descendingIterator();
                    }
                    return (Comparable) this.C.next();
                }
            };
        }

        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.b((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        /* renamed from: k0 */
        public ImmutableSortedSet W(Comparable comparable, boolean z2) {
            return l0(Range.x(comparable, BoundType.f(z2)));
        }

        public ImmutableSortedSet l0(Range range) {
            return ImmutableRangeSet.this.k(range).f(this.D);
        }

        /* renamed from: m0 */
        public ImmutableSortedSet a0(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
            return (z2 || z3 || Range.f(comparable, comparable2) != 0) ? l0(Range.u(comparable, BoundType.f(z2), comparable2, BoundType.f(z3))) : ImmutableSortedSet.X();
        }

        public boolean n() {
            return ImmutableRangeSet.this.f28196z.n();
        }

        /* renamed from: o */
        public UnmodifiableIterator iterator() {
            return new AbstractIterator<C>() {

                /* renamed from: B  reason: collision with root package name */
                public final Iterator f28198B;
                public Iterator C = Iterators.m();

                {
                    this.f28198B = ImmutableRangeSet.this.f28196z.iterator();
                }

                /* renamed from: e */
                public Comparable b() {
                    while (!this.C.hasNext()) {
                        if (!this.f28198B.hasNext()) {
                            return (Comparable) c();
                        }
                        this.C = ContiguousSet.j0((Range) this.f28198B.next(), AsSet.this.D).iterator();
                    }
                    return (Comparable) this.C.next();
                }
            };
        }

        /* renamed from: p0 */
        public ImmutableSortedSet f0(Comparable comparable, boolean z2) {
            return l0(Range.i(comparable, BoundType.f(z2)));
        }

        public int size() {
            Integer num = this.E;
            if (num == null) {
                UnmodifiableIterator o2 = ImmutableRangeSet.this.f28196z.iterator();
                long j2 = 0;
                while (o2.hasNext()) {
                    j2 += (long) ContiguousSet.j0((Range) o2.next(), this.D).size();
                    if (j2 >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(Ints.k(j2));
                this.E = num;
            }
            return num.intValue();
        }

        public String toString() {
            return ImmutableRangeSet.this.f28196z.toString();
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
    }

    public static class Builder<C extends Comparable<?>> {
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {

        /* renamed from: B  reason: collision with root package name */
        public final boolean f28200B;
        public final boolean C;
        public final int D;
        public final /* synthetic */ ImmutableRangeSet E;

        /* renamed from: Q */
        public Range get(int i2) {
            Preconditions.o(i2, this.D);
            return Range.h(this.f28200B ? i2 == 0 ? Cut.h() : ((Range) this.E.f28196z.get(i2 - 1)).f28497A : ((Range) this.E.f28196z.get(i2)).f28497A, (!this.C || i2 != this.D + -1) ? ((Range) this.E.f28196z.get(i2 + (this.f28200B ^ true ? 1 : 0))).f28498z : Cut.d());
        }

        public boolean n() {
            return true;
        }

        public int size() {
            return this.D;
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.f28196z = immutableList;
    }

    public static ImmutableRangeSet i() {
        return f28194A;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return super.b(comparable);
    }

    public Range c(Comparable comparable) {
        int b2 = SortedLists.b(this.f28196z, Range.r(), Cut.j(comparable), Ordering.e(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (b2 == -1) {
            return null;
        }
        Range range = (Range) this.f28196z.get(b2);
        if (range.g(comparable)) {
            return range;
        }
        return null;
    }

    /* renamed from: e */
    public ImmutableSet a() {
        return this.f28196z.isEmpty() ? ImmutableSet.D() : new RegularImmutableSortedSet(this.f28196z, Range.v());
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableSortedSet f(DiscreteDomain discreteDomain) {
        Preconditions.q(discreteDomain);
        if (h()) {
            return ImmutableSortedSet.X();
        }
        Range e2 = j().e(discreteDomain);
        if (e2.l()) {
            if (!e2.m()) {
                try {
                    discreteDomain.b();
                } catch (NoSuchElementException unused) {
                    throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
                }
            }
            return new AsSet(discreteDomain);
        }
        throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
    }

    public final ImmutableList g(final Range range) {
        if (this.f28196z.isEmpty() || range.p()) {
            return ImmutableList.D();
        }
        if (range.j(j())) {
            return this.f28196z;
        }
        final int a2 = range.l() ? SortedLists.a(this.f28196z, Range.y(), range.f28498z, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        final int a3 = (range.m() ? SortedLists.a(this.f28196z, Range.r(), range.f28497A, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : this.f28196z.size()) - a2;
        return a3 == 0 ? ImmutableList.D() : new ImmutableList<Range<C>>() {
            /* renamed from: Q */
            public Range get(int i2) {
                Preconditions.o(i2, a3);
                return (i2 == 0 || i2 == a3 + -1) ? ((Range) ImmutableRangeSet.this.f28196z.get(i2 + a2)).n(range) : (Range) ImmutableRangeSet.this.f28196z.get(i2 + a2);
            }

            public boolean n() {
                return true;
            }

            public int size() {
                return a3;
            }
        };
    }

    public boolean h() {
        return this.f28196z.isEmpty();
    }

    public Range j() {
        if (!this.f28196z.isEmpty()) {
            Cut cut = ((Range) this.f28196z.get(0)).f28498z;
            ImmutableList immutableList = this.f28196z;
            return Range.h(cut, ((Range) immutableList.get(immutableList.size() - 1)).f28497A);
        }
        throw new NoSuchElementException();
    }

    public ImmutableRangeSet k(Range range) {
        if (!h()) {
            Range j2 = j();
            if (range.j(j2)) {
                return this;
            }
            if (range.o(j2)) {
                return new ImmutableRangeSet(g(range));
            }
        }
        return i();
    }
}
