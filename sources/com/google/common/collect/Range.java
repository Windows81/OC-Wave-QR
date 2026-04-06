package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;

@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {

    /* renamed from: B  reason: collision with root package name */
    public static final Range f28496B = new Range(Cut.h(), Cut.d());

    /* renamed from: A  reason: collision with root package name */
    public final Cut f28497A;

    /* renamed from: z  reason: collision with root package name */
    public final Cut f28498z;

    /* renamed from: com.google.common.collect.Range$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28499a = r0
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28499a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.BoundType r1 = com.google.common.collect.BoundType.CLOSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Range.AnonymousClass1.<clinit>():void");
        }
    }

    public static class LowerBoundFn implements Function<Range, Cut> {

        /* renamed from: z  reason: collision with root package name */
        public static final LowerBoundFn f28500z = new LowerBoundFn();

        /* renamed from: a */
        public Cut apply(Range range) {
            return range.f28498z;
        }
    }

    public static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* renamed from: z  reason: collision with root package name */
        public static final Ordering f28501z = new RangeLexOrdering();

        /* renamed from: k */
        public int compare(Range range, Range range2) {
            return ComparisonChain.f().d(range.f28498z, range2.f28498z).d(range.f28497A, range2.f28497A).e();
        }
    }

    public static class UpperBoundFn implements Function<Range, Cut> {

        /* renamed from: z  reason: collision with root package name */
        public static final UpperBoundFn f28502z = new UpperBoundFn();

        /* renamed from: a */
        public Cut apply(Range range) {
            return range.f28497A;
        }
    }

    public Range(Cut cut, Cut cut2) {
        this.f28498z = (Cut) Preconditions.q(cut);
        this.f28497A = (Cut) Preconditions.q(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.d() || cut2 == Cut.h()) {
            String valueOf = String.valueOf(w(cut, cut2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    public static Range a() {
        return f28496B;
    }

    public static Range c(Comparable comparable) {
        return h(Cut.j(comparable), Cut.d());
    }

    public static Range d(Comparable comparable) {
        return h(Cut.h(), Cut.f(comparable));
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static Range h(Cut cut, Cut cut2) {
        return new Range(cut, cut2);
    }

    public static Range i(Comparable comparable, BoundType boundType) {
        int i2 = AnonymousClass1.f28499a[boundType.ordinal()];
        if (i2 == 1) {
            return k(comparable);
        }
        if (i2 == 2) {
            return c(comparable);
        }
        throw new AssertionError();
    }

    public static Range k(Comparable comparable) {
        return h(Cut.f(comparable), Cut.d());
    }

    public static Range q(Comparable comparable) {
        return h(Cut.h(), Cut.j(comparable));
    }

    public static Function r() {
        return LowerBoundFn.f28500z;
    }

    public static Range u(Comparable comparable, BoundType boundType, Comparable comparable2, BoundType boundType2) {
        Preconditions.q(boundType);
        Preconditions.q(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return h(boundType == boundType3 ? Cut.f(comparable) : Cut.j(comparable), boundType2 == boundType3 ? Cut.j(comparable2) : Cut.f(comparable2));
    }

    public static Ordering v() {
        return RangeLexOrdering.f28501z;
    }

    public static String w(Cut cut, Cut cut2) {
        StringBuilder sb = new StringBuilder(16);
        cut.m(sb);
        sb.append("..");
        cut2.n(sb);
        return sb.toString();
    }

    public static Range x(Comparable comparable, BoundType boundType) {
        int i2 = AnonymousClass1.f28499a[boundType.ordinal()];
        if (i2 == 1) {
            return q(comparable);
        }
        if (i2 == 2) {
            return d(comparable);
        }
        throw new AssertionError();
    }

    public static Function y() {
        return UpperBoundFn.f28502z;
    }

    public Comparable A() {
        return this.f28497A.o();
    }

    /* renamed from: b */
    public boolean apply(Comparable comparable) {
        return g(comparable);
    }

    public Range e(DiscreteDomain discreteDomain) {
        Preconditions.q(discreteDomain);
        Cut k2 = this.f28498z.k(discreteDomain);
        Cut k3 = this.f28497A.k(discreteDomain);
        return (k2 == this.f28498z && k3 == this.f28497A) ? this : h(k2, k3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.f28498z.equals(range.f28498z) && this.f28497A.equals(range.f28497A);
    }

    public boolean g(Comparable comparable) {
        Preconditions.q(comparable);
        return this.f28498z.r(comparable) && !this.f28497A.r(comparable);
    }

    public int hashCode() {
        return (this.f28498z.hashCode() * 31) + this.f28497A.hashCode();
    }

    public boolean j(Range range) {
        return this.f28498z.compareTo(range.f28498z) <= 0 && this.f28497A.compareTo(range.f28497A) >= 0;
    }

    public boolean l() {
        return this.f28498z != Cut.h();
    }

    public boolean m() {
        return this.f28497A != Cut.d();
    }

    public Range n(Range range) {
        int l2 = this.f28498z.compareTo(range.f28498z);
        int l3 = this.f28497A.compareTo(range.f28497A);
        if (l2 >= 0 && l3 <= 0) {
            return this;
        }
        if (l2 <= 0 && l3 >= 0) {
            return range;
        }
        Cut cut = l2 >= 0 ? this.f28498z : range.f28498z;
        Cut cut2 = l3 <= 0 ? this.f28497A : range.f28497A;
        Preconditions.l(cut.compareTo(cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return h(cut, cut2);
    }

    public boolean o(Range range) {
        return this.f28498z.compareTo(range.f28497A) <= 0 && range.f28498z.compareTo(this.f28497A) <= 0;
    }

    public boolean p() {
        return this.f28498z.equals(this.f28497A);
    }

    public BoundType s() {
        return this.f28498z.x();
    }

    public Comparable t() {
        return this.f28498z.o();
    }

    public String toString() {
        return w(this.f28498z, this.f28497A);
    }

    public BoundType z() {
        return this.f28497A.y();
    }
}
