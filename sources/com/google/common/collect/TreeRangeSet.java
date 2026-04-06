package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public transient Set f28649A;

    /* renamed from: z  reason: collision with root package name */
    public final NavigableMap f28650z;

    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {

        /* renamed from: z  reason: collision with root package name */
        public final Collection f28651z;

        public AsRanges(TreeRangeSet treeRangeSet, Collection collection) {
            this.f28651z = collection;
        }

        /* renamed from: Q */
        public Collection M() {
            return this.f28651z;
        }

        public boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        public int hashCode() {
            return Sets.f(this);
        }
    }

    public final class Complement extends TreeRangeSet<C> {
    }

    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: A  reason: collision with root package name */
        public final NavigableMap f28652A;

        /* renamed from: B  reason: collision with root package name */
        public final Range f28653B;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableMap f28654z;

        public ComplementRangesByLowerBound(NavigableMap navigableMap, Range range) {
            this.f28654z = navigableMap;
            this.f28652A = new RangesByUpperBound(navigableMap);
            this.f28653B = range;
        }

        public Iterator a() {
            Collection collection;
            Cut cut;
            if (this.f28653B.l()) {
                collection = this.f28652A.tailMap((Cut) this.f28653B.t(), this.f28653B.s() == BoundType.CLOSED).values();
            } else {
                collection = this.f28652A.values();
            }
            PeekingIterator B2 = Iterators.B(collection.iterator());
            if (this.f28653B.g(Cut.h()) && (!B2.hasNext() || ((Range) B2.peek()).f28498z != Cut.h())) {
                cut = Cut.h();
            } else if (!B2.hasNext()) {
                return Iterators.m();
            } else {
                cut = ((Range) B2.next()).f28497A;
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(cut, B2) {

                /* renamed from: B  reason: collision with root package name */
                public Cut f28655B;
                public final /* synthetic */ Cut C;
                public final /* synthetic */ PeekingIterator D;

                {
                    this.C = r2;
                    this.D = r3;
                    this.f28655B = r2;
                }

                /* renamed from: e */
                public Map.Entry b() {
                    Range range;
                    if (ComplementRangesByLowerBound.this.f28653B.f28497A.r(this.f28655B) || this.f28655B == Cut.d()) {
                        return (Map.Entry) c();
                    }
                    if (this.D.hasNext()) {
                        Range range2 = (Range) this.D.next();
                        range = Range.h(this.f28655B, range2.f28498z);
                        this.f28655B = range2.f28497A;
                    } else {
                        range = Range.h(this.f28655B, Cut.d());
                        this.f28655B = Cut.d();
                    }
                    return Maps.t(range.f28498z, range);
                }
            };
        }

        public Iterator b() {
            Cut cut;
            PeekingIterator B2 = Iterators.B(this.f28652A.headMap(this.f28653B.m() ? (Cut) this.f28653B.A() : Cut.d(), this.f28653B.m() && this.f28653B.z() == BoundType.CLOSED).descendingMap().values().iterator());
            if (B2.hasNext()) {
                cut = ((Range) B2.peek()).f28497A == Cut.d() ? ((Range) B2.next()).f28498z : (Cut) this.f28654z.higherKey(((Range) B2.peek()).f28497A);
            } else if (!this.f28653B.g(Cut.h()) || this.f28654z.containsKey(Cut.h())) {
                return Iterators.m();
            } else {
                cut = (Cut) this.f28654z.higherKey(Cut.h());
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>((Cut) MoreObjects.a(cut, Cut.d()), B2) {

                /* renamed from: B  reason: collision with root package name */
                public Cut f28656B;
                public final /* synthetic */ Cut C;
                public final /* synthetic */ PeekingIterator D;

                {
                    this.C = r2;
                    this.D = r3;
                    this.f28656B = r2;
                }

                /* renamed from: e */
                public Map.Entry b() {
                    if (this.f28656B == Cut.h()) {
                        return (Map.Entry) c();
                    }
                    if (this.D.hasNext()) {
                        Range range = (Range) this.D.next();
                        Range h2 = Range.h(range.f28497A, this.f28656B);
                        this.f28656B = range.f28498z;
                        if (ComplementRangesByLowerBound.this.f28653B.f28498z.r(h2.f28498z)) {
                            return Maps.t(h2.f28498z, h2);
                        }
                    } else if (ComplementRangesByLowerBound.this.f28653B.f28498z.r(Cut.h())) {
                        Range h3 = Range.h(Cut.h(), this.f28656B);
                        this.f28656B = Cut.h();
                        return Maps.t(Cut.h(), h3);
                    }
                    return (Map.Entry) c();
                }
            };
        }

        public Comparator comparator() {
            return Ordering.e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: e */
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    Map.Entry firstEntry = tailMap(cut, true).firstEntry();
                    if (firstEntry != null && ((Cut) firstEntry.getKey()).equals(cut)) {
                        return (Range) firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: f */
        public NavigableMap headMap(Cut cut, boolean z2) {
            return h(Range.x(cut, BoundType.f(z2)));
        }

        /* renamed from: g */
        public NavigableMap subMap(Cut cut, boolean z2, Cut cut2, boolean z3) {
            return h(Range.u(cut, BoundType.f(z2), cut2, BoundType.f(z3)));
        }

        public final NavigableMap h(Range range) {
            if (!this.f28653B.o(range)) {
                return ImmutableSortedMap.C();
            }
            return new ComplementRangesByLowerBound(this.f28654z, range.n(this.f28653B));
        }

        /* renamed from: i */
        public NavigableMap tailMap(Cut cut, boolean z2) {
            return h(Range.i(cut, BoundType.f(z2)));
        }

        public int size() {
            return Iterators.H(a());
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {

        /* renamed from: B  reason: collision with root package name */
        public final Range f28661B;
        public final /* synthetic */ TreeRangeSet C;

        public Range c(Comparable comparable) {
            Range c2;
            if (this.f28661B.g(comparable) && (c2 = this.C.c(comparable)) != null) {
                return c2.n(this.f28661B);
            }
            return null;
        }
    }

    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: A  reason: collision with root package name */
        public final Range f28662A;

        /* renamed from: B  reason: collision with root package name */
        public final NavigableMap f28663B;
        public final NavigableMap C;

        /* renamed from: z  reason: collision with root package name */
        public final Range f28664z;

        public SubRangeSetRangesByLowerBound(Range range, Range range2, NavigableMap navigableMap) {
            this.f28664z = (Range) Preconditions.q(range);
            this.f28662A = (Range) Preconditions.q(range2);
            this.f28663B = (NavigableMap) Preconditions.q(navigableMap);
            this.C = new RangesByUpperBound(navigableMap);
        }

        private NavigableMap i(Range range) {
            return !range.o(this.f28664z) ? ImmutableSortedMap.C() : new SubRangeSetRangesByLowerBound(this.f28664z.n(range), this.f28662A, this.f28663B);
        }

        public Iterator a() {
            final Iterator it;
            if (this.f28662A.p()) {
                return Iterators.m();
            }
            if (this.f28664z.f28497A.r(this.f28662A.f28498z)) {
                return Iterators.m();
            }
            boolean z2 = false;
            if (this.f28664z.f28498z.r(this.f28662A.f28498z)) {
                it = this.C.tailMap(this.f28662A.f28498z, false).values().iterator();
            } else {
                NavigableMap navigableMap = this.f28663B;
                Cut cut = (Cut) this.f28664z.f28498z.o();
                if (this.f28664z.s() == BoundType.CLOSED) {
                    z2 = true;
                }
                it = navigableMap.tailMap(cut, z2).values().iterator();
            }
            final Cut cut2 = (Cut) Ordering.e().d(this.f28664z.f28497A, Cut.j(this.f28662A.f28497A));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* renamed from: e */
                public Map.Entry b() {
                    if (!it.hasNext()) {
                        return (Map.Entry) c();
                    }
                    Range range = (Range) it.next();
                    if (cut2.r(range.f28498z)) {
                        return (Map.Entry) c();
                    }
                    Range n2 = range.n(SubRangeSetRangesByLowerBound.this.f28662A);
                    return Maps.t(n2.f28498z, n2);
                }
            };
        }

        public Iterator b() {
            if (this.f28662A.p()) {
                return Iterators.m();
            }
            Cut cut = (Cut) Ordering.e().d(this.f28664z.f28497A, Cut.j(this.f28662A.f28497A));
            final Iterator it = this.f28663B.headMap((Cut) cut.o(), cut.y() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* renamed from: e */
                public Map.Entry b() {
                    if (!it.hasNext()) {
                        return (Map.Entry) c();
                    }
                    Range range = (Range) it.next();
                    if (SubRangeSetRangesByLowerBound.this.f28662A.f28498z.compareTo(range.f28497A) >= 0) {
                        return (Map.Entry) c();
                    }
                    Range n2 = range.n(SubRangeSetRangesByLowerBound.this.f28662A);
                    return SubRangeSetRangesByLowerBound.this.f28664z.g(n2.f28498z) ? Maps.t(n2.f28498z, n2) : (Map.Entry) c();
                }
            };
        }

        public Comparator comparator() {
            return Ordering.e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: f */
        public Range get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f28664z.g(cut) && cut.compareTo(this.f28662A.f28498z) >= 0) {
                        if (cut.compareTo(this.f28662A.f28497A) < 0) {
                            if (cut.equals(this.f28662A.f28498z)) {
                                Range range = (Range) Maps.Y(this.f28663B.floorEntry(cut));
                                if (range != null && range.f28497A.compareTo(this.f28662A.f28498z) > 0) {
                                    return range.n(this.f28662A);
                                }
                            } else {
                                Range range2 = (Range) this.f28663B.get(cut);
                                if (range2 != null) {
                                    return range2.n(this.f28662A);
                                }
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: g */
        public NavigableMap headMap(Cut cut, boolean z2) {
            return i(Range.x(cut, BoundType.f(z2)));
        }

        /* renamed from: h */
        public NavigableMap subMap(Cut cut, boolean z2, Cut cut2, boolean z3) {
            return i(Range.u(cut, BoundType.f(z2), cut2, BoundType.f(z3)));
        }

        /* renamed from: j */
        public NavigableMap tailMap(Cut cut, boolean z2) {
            return i(Range.i(cut, BoundType.f(z2)));
        }

        public int size() {
            return Iterators.H(a());
        }
    }

    public Set a() {
        Set set = this.f28649A;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this, this.f28650z.values());
        this.f28649A = asRanges;
        return asRanges;
    }

    public Range c(Comparable comparable) {
        Preconditions.q(comparable);
        Map.Entry floorEntry = this.f28650z.floorEntry(Cut.j(comparable));
        if (floorEntry == null || !((Range) floorEntry.getValue()).g(comparable)) {
            return null;
        }
        return (Range) floorEntry.getValue();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* renamed from: A  reason: collision with root package name */
        public final Range f28657A;

        /* renamed from: z  reason: collision with root package name */
        public final NavigableMap f28658z;

        public RangesByUpperBound(NavigableMap navigableMap) {
            this.f28658z = navigableMap;
            this.f28657A = Range.a();
        }

        private NavigableMap h(Range range) {
            return range.o(this.f28657A) ? new RangesByUpperBound(this.f28658z, range.n(this.f28657A)) : ImmutableSortedMap.C();
        }

        public Iterator a() {
            final Iterator it;
            if (!this.f28657A.l()) {
                it = this.f28658z.values().iterator();
            } else {
                Map.Entry lowerEntry = this.f28658z.lowerEntry((Cut) this.f28657A.t());
                it = lowerEntry == null ? this.f28658z.values().iterator() : this.f28657A.f28498z.r(((Range) lowerEntry.getValue()).f28497A) ? this.f28658z.tailMap((Cut) lowerEntry.getKey(), true).values().iterator() : this.f28658z.tailMap((Cut) this.f28657A.t(), true).values().iterator();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* renamed from: e */
                public Map.Entry b() {
                    if (!it.hasNext()) {
                        return (Map.Entry) c();
                    }
                    Range range = (Range) it.next();
                    return RangesByUpperBound.this.f28657A.f28497A.r(range.f28497A) ? (Map.Entry) c() : Maps.t(range.f28497A, range);
                }
            };
        }

        public Iterator b() {
            final PeekingIterator B2 = Iterators.B((this.f28657A.m() ? this.f28658z.headMap((Cut) this.f28657A.A(), false).descendingMap().values() : this.f28658z.descendingMap().values()).iterator());
            if (B2.hasNext() && this.f28657A.f28497A.r(((Range) B2.peek()).f28497A)) {
                B2.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>() {
                /* renamed from: e */
                public Map.Entry b() {
                    if (!B2.hasNext()) {
                        return (Map.Entry) c();
                    }
                    Range range = (Range) B2.next();
                    return RangesByUpperBound.this.f28657A.f28498z.r(range.f28497A) ? Maps.t(range.f28497A, range) : (Map.Entry) c();
                }
            };
        }

        public Comparator comparator() {
            return Ordering.e();
        }

        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        /* renamed from: e */
        public Range get(Object obj) {
            Map.Entry lowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f28657A.g(cut) && (lowerEntry = this.f28658z.lowerEntry(cut)) != null && ((Range) lowerEntry.getValue()).f28497A.equals(cut)) {
                        return (Range) lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        /* renamed from: f */
        public NavigableMap headMap(Cut cut, boolean z2) {
            return h(Range.x(cut, BoundType.f(z2)));
        }

        /* renamed from: g */
        public NavigableMap subMap(Cut cut, boolean z2, Cut cut2, boolean z3) {
            return h(Range.u(cut, BoundType.f(z2), cut2, BoundType.f(z3)));
        }

        /* renamed from: i */
        public NavigableMap tailMap(Cut cut, boolean z2) {
            return h(Range.i(cut, BoundType.f(z2)));
        }

        public boolean isEmpty() {
            return this.f28657A.equals(Range.a()) ? this.f28658z.isEmpty() : !a().hasNext();
        }

        public int size() {
            return this.f28657A.equals(Range.a()) ? this.f28658z.size() : Iterators.H(a());
        }

        public RangesByUpperBound(NavigableMap navigableMap, Range range) {
            this.f28658z = navigableMap;
            this.f28657A = range;
        }
    }
}
