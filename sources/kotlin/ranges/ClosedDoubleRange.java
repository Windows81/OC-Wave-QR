package kotlin.ranges;

import kotlin.Metadata;

@Metadata
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {

    /* renamed from: A  reason: collision with root package name */
    public final double f40949A;

    /* renamed from: z  reason: collision with root package name */
    public final double f40950z;

    public boolean a(double d2) {
        return d2 >= this.f40950z && d2 <= this.f40949A;
    }

    /* renamed from: b */
    public Double m() {
        return Double.valueOf(this.f40949A);
    }

    /* renamed from: c */
    public Double e() {
        return Double.valueOf(this.f40950z);
    }

    public boolean d(double d2, double d3) {
        return d2 <= d3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClosedDoubleRange) {
            if (!isEmpty() || !((ClosedDoubleRange) obj).isEmpty()) {
                ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
                if (!(this.f40950z == closedDoubleRange.f40950z && this.f40949A == closedDoubleRange.f40949A)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean g(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f40950z) * 31) + Double.hashCode(this.f40949A);
    }

    public /* bridge */ /* synthetic */ boolean i(Comparable comparable) {
        return a(((Number) comparable).doubleValue());
    }

    public boolean isEmpty() {
        return this.f40950z > this.f40949A;
    }

    public String toString() {
        return this.f40950z + ".." + this.f40949A;
    }
}
