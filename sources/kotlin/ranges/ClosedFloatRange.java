package kotlin.ranges;

import kotlin.Metadata;

@Metadata
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {

    /* renamed from: A  reason: collision with root package name */
    public final float f40951A;

    /* renamed from: z  reason: collision with root package name */
    public final float f40952z;

    public ClosedFloatRange(float f2, float f3) {
        this.f40952z = f2;
        this.f40951A = f3;
    }

    public boolean a(float f2) {
        return f2 >= this.f40952z && f2 <= this.f40951A;
    }

    /* renamed from: b */
    public Float m() {
        return Float.valueOf(this.f40951A);
    }

    /* renamed from: c */
    public Float e() {
        return Float.valueOf(this.f40952z);
    }

    public boolean d(float f2, float f3) {
        return f2 <= f3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClosedFloatRange) {
            if (!isEmpty() || !((ClosedFloatRange) obj).isEmpty()) {
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
                if (!(this.f40952z == closedFloatRange.f40952z && this.f40951A == closedFloatRange.f40951A)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean g(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f40952z) * 31) + Float.hashCode(this.f40951A);
    }

    public /* bridge */ /* synthetic */ boolean i(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public boolean isEmpty() {
        return this.f40952z > this.f40951A;
    }

    public String toString() {
        return this.f40952z + ".." + this.f40951A;
    }
}
