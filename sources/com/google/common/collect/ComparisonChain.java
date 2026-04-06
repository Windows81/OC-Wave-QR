package com.google.common.collect;

@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {

    /* renamed from: a  reason: collision with root package name */
    public static final ComparisonChain f28052a = new ComparisonChain() {
        public ComparisonChain d(Comparable comparable, Comparable comparable2) {
            return g(comparable.compareTo(comparable2));
        }

        public int e() {
            return 0;
        }

        public ComparisonChain g(int i2) {
            return i2 < 0 ? ComparisonChain.f28053b : i2 > 0 ? ComparisonChain.f28054c : ComparisonChain.f28052a;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final ComparisonChain f28053b = new InactiveComparisonChain(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final ComparisonChain f28054c = new InactiveComparisonChain(1);

    public static final class InactiveComparisonChain extends ComparisonChain {

        /* renamed from: d  reason: collision with root package name */
        public final int f28055d;

        public InactiveComparisonChain(int i2) {
            super();
            this.f28055d = i2;
        }

        public ComparisonChain d(Comparable comparable, Comparable comparable2) {
            return this;
        }

        public int e() {
            return this.f28055d;
        }
    }

    public static ComparisonChain f() {
        return f28052a;
    }

    public abstract ComparisonChain d(Comparable comparable, Comparable comparable2);

    public abstract int e();

    public ComparisonChain() {
    }
}
