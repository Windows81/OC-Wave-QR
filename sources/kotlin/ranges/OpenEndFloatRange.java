package kotlin.ranges;

import kotlin.Metadata;

@Metadata
final class OpenEndFloatRange implements OpenEndRange<Float> {

    /* renamed from: A  reason: collision with root package name */
    public final float f40971A;

    /* renamed from: z  reason: collision with root package name */
    public final float f40972z;

    /* renamed from: a */
    public Float h() {
        return Float.valueOf(this.f40971A);
    }

    /* renamed from: b */
    public Float e() {
        return Float.valueOf(this.f40972z);
    }

    public boolean c() {
        return this.f40972z >= this.f40971A;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OpenEndFloatRange) {
            if (!c() || !((OpenEndFloatRange) obj).c()) {
                OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) obj;
                if (!(this.f40972z == openEndFloatRange.f40972z && this.f40971A == openEndFloatRange.f40971A)) {
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
        return (Float.hashCode(this.f40972z) * 31) + Float.hashCode(this.f40971A);
    }

    public String toString() {
        return this.f40972z + "..<" + this.f40971A;
    }
}
