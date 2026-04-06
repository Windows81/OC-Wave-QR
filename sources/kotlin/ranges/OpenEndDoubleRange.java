package kotlin.ranges;

import kotlin.Metadata;

@Metadata
final class OpenEndDoubleRange implements OpenEndRange<Double> {

    /* renamed from: A  reason: collision with root package name */
    public final double f40969A;

    /* renamed from: z  reason: collision with root package name */
    public final double f40970z;

    /* renamed from: a */
    public Double h() {
        return Double.valueOf(this.f40969A);
    }

    /* renamed from: b */
    public Double e() {
        return Double.valueOf(this.f40970z);
    }

    public boolean c() {
        return this.f40970z >= this.f40969A;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OpenEndDoubleRange) {
            if (!c() || !((OpenEndDoubleRange) obj).c()) {
                OpenEndDoubleRange openEndDoubleRange = (OpenEndDoubleRange) obj;
                if (!(this.f40970z == openEndDoubleRange.f40970z && this.f40969A == openEndDoubleRange.f40969A)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Double.hashCode(this.f40970z) * 31) + Double.hashCode(this.f40969A);
    }

    public String toString() {
        return this.f40970z + "..<" + this.f40969A;
    }
}
