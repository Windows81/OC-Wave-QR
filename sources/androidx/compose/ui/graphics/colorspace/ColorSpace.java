package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ColorSpace {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f16170d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f16171a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16172b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16173c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ColorSpace(String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, i2);
    }

    public final float[] a(float f2, float f3, float f4) {
        float[] fArr = new float[ColorModel.g(this.f16172b)];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        return b(fArr);
    }

    public abstract float[] b(float[] fArr);

    public final int c() {
        return ColorModel.g(this.f16172b);
    }

    public final int d() {
        return this.f16173c;
    }

    public abstract float e(int i2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f16173c == colorSpace.f16173c && Intrinsics.d(this.f16171a, colorSpace.f16171a)) {
            return ColorModel.f(this.f16172b, colorSpace.f16172b);
        }
        return false;
    }

    public abstract float f(int i2);

    public final long g() {
        return this.f16172b;
    }

    public final String h() {
        return this.f16171a;
    }

    public int hashCode() {
        return (((this.f16171a.hashCode() * 31) + ColorModel.h(this.f16172b)) * 31) + this.f16173c;
    }

    public boolean i() {
        return false;
    }

    public long j(float f2, float f3, float f4) {
        float[] k2 = k(f2, f3, f4);
        return (((long) Float.floatToRawIntBits(k2[0])) << 32) | (((long) Float.floatToRawIntBits(k2[1])) & 4294967295L);
    }

    public final float[] k(float f2, float f3, float f4) {
        return l(new float[]{f2, f3, f4});
    }

    public abstract float[] l(float[] fArr);

    public float m(float f2, float f3, float f4) {
        return k(f2, f3, f4)[2];
    }

    public long n(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] a2 = a(f2, f3, f4);
        return ColorKt.a(a2[0], a2[1], a2[2], f5, colorSpace);
    }

    public String toString() {
        return this.f16171a + " (id=" + this.f16173c + ", model=" + ColorModel.i(this.f16172b) + ')';
    }

    public ColorSpace(String str, long j2, int i2) {
        this.f16171a = str;
        this.f16172b = j2;
        this.f16173c = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
