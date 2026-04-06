package androidx.core.util;

public final class SizeFCompat {

    /* renamed from: a  reason: collision with root package name */
    public final float f20170a;

    /* renamed from: b  reason: collision with root package name */
    public final float f20171b;

    public static final class Api21Impl {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeFCompat)) {
            return false;
        }
        SizeFCompat sizeFCompat = (SizeFCompat) obj;
        return sizeFCompat.f20170a == this.f20170a && sizeFCompat.f20171b == this.f20171b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f20170a) ^ Float.floatToIntBits(this.f20171b);
    }

    public String toString() {
        return this.f20170a + "x" + this.f20171b;
    }
}
