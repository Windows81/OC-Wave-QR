package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Rect {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f15860e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Rect f15861f = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f15862a;

    /* renamed from: b  reason: collision with root package name */
    public final float f15863b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15864c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15865d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rect a() {
            return Rect.f15861f;
        }

        public Companion() {
        }
    }

    public Rect(float f2, float f3, float f4, float f5) {
        this.f15862a = f2;
        this.f15863b = f3;
        this.f15864c = f4;
        this.f15865d = f5;
    }

    public static /* synthetic */ Rect h(Rect rect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = rect.f15862a;
        }
        if ((i2 & 2) != 0) {
            f3 = rect.f15863b;
        }
        if ((i2 & 4) != 0) {
            f4 = rect.f15864c;
        }
        if ((i2 & 8) != 0) {
            f5 = rect.f15865d;
        }
        return rect.g(f2, f3, f4, f5);
    }

    public final Rect A(float f2, float f3) {
        return new Rect(this.f15862a + f2, this.f15863b + f3, this.f15864c + f2, this.f15865d + f3);
    }

    public final Rect B(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new Rect(this.f15862a + Float.intBitsToFloat(i2), this.f15863b + Float.intBitsToFloat(i3), this.f15864c + Float.intBitsToFloat(i2), this.f15865d + Float.intBitsToFloat(i3));
    }

    public final float b() {
        return this.f15862a;
    }

    public final float c() {
        return this.f15863b;
    }

    public final float d() {
        return this.f15864c;
    }

    public final float e() {
        return this.f15865d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.f15862a, rect.f15862a) == 0 && Float.compare(this.f15863b, rect.f15863b) == 0 && Float.compare(this.f15864c, rect.f15864c) == 0 && Float.compare(this.f15865d, rect.f15865d) == 0;
    }

    public final boolean f(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        boolean z2 = false;
        boolean z3 = (intBitsToFloat >= this.f15862a) & (intBitsToFloat < this.f15864c) & (intBitsToFloat2 >= this.f15863b);
        if (intBitsToFloat2 < this.f15865d) {
            z2 = true;
        }
        return z3 & z2;
    }

    public final Rect g(float f2, float f3, float f4, float f5) {
        return new Rect(f2, f3, f4, f5);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f15862a) * 31) + Float.hashCode(this.f15863b)) * 31) + Float.hashCode(this.f15864c)) * 31) + Float.hashCode(this.f15865d);
    }

    public final float i() {
        return this.f15865d;
    }

    public final long j() {
        float p2 = this.f15862a + ((p() - o()) / 2.0f);
        float f2 = this.f15865d;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(p2);
        return Offset.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final long k() {
        float f2 = this.f15862a;
        float f3 = this.f15865d;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final long l() {
        float f2 = this.f15864c;
        float f3 = this.f15865d;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final long m() {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f15862a + ((p() - o()) / 2.0f));
        return Offset.e((((long) Float.floatToRawIntBits(this.f15863b + ((i() - r()) / 2.0f))) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final float n() {
        return i() - r();
    }

    public final float o() {
        return this.f15862a;
    }

    public final float p() {
        return this.f15864c;
    }

    public final long q() {
        float p2 = p() - o();
        float i2 = i() - r();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(p2);
        return Size.d((((long) Float.floatToRawIntBits(i2)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final float r() {
        return this.f15863b;
    }

    public final long s() {
        float p2 = this.f15862a + ((p() - o()) / 2.0f);
        float f2 = this.f15863b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(p2);
        return Offset.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final long t() {
        float f2 = this.f15862a;
        float f3 = this.f15863b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.a(this.f15862a, 1) + ", " + GeometryUtilsKt.a(this.f15863b, 1) + ", " + GeometryUtilsKt.a(this.f15864c, 1) + ", " + GeometryUtilsKt.a(this.f15865d, 1) + ')';
    }

    public final long u() {
        float f2 = this.f15864c;
        float f3 = this.f15863b;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return Offset.e((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public final float v() {
        return p() - o();
    }

    public final Rect w(float f2, float f3, float f4, float f5) {
        return new Rect(Math.max(this.f15862a, f2), Math.max(this.f15863b, f3), Math.min(this.f15864c, f4), Math.min(this.f15865d, f5));
    }

    public final Rect x(Rect rect) {
        return new Rect(Math.max(this.f15862a, rect.f15862a), Math.max(this.f15863b, rect.f15863b), Math.min(this.f15864c, rect.f15864c), Math.min(this.f15865d, rect.f15865d));
    }

    public final boolean y() {
        boolean z2 = false;
        boolean z3 = this.f15862a >= this.f15864c;
        if (this.f15863b >= this.f15865d) {
            z2 = true;
        }
        return z3 | z2;
    }

    public final boolean z(Rect rect) {
        boolean z2 = false;
        boolean z3 = (this.f15862a < rect.f15864c) & (rect.f15862a < this.f15864c) & (this.f15863b < rect.f15865d);
        if (rect.f15863b < this.f15865d) {
            z2 = true;
        }
        return z3 & z2;
    }
}
