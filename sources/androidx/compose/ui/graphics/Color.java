package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Color {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f15975b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final long f15976c = ColorKt.d(4278190080L);

    /* renamed from: d  reason: collision with root package name */
    public static final long f15977d = ColorKt.d(4282664004L);

    /* renamed from: e  reason: collision with root package name */
    public static final long f15978e = ColorKt.d(4287137928L);

    /* renamed from: f  reason: collision with root package name */
    public static final long f15979f = ColorKt.d(4291611852L);

    /* renamed from: g  reason: collision with root package name */
    public static final long f15980g = ColorKt.d(4294967295L);

    /* renamed from: h  reason: collision with root package name */
    public static final long f15981h = ColorKt.d(4294901760L);

    /* renamed from: i  reason: collision with root package name */
    public static final long f15982i = ColorKt.d(4278255360L);

    /* renamed from: j  reason: collision with root package name */
    public static final long f15983j = ColorKt.d(4278190335L);

    /* renamed from: k  reason: collision with root package name */
    public static final long f15984k = ColorKt.d(4294967040L);

    /* renamed from: l  reason: collision with root package name */
    public static final long f15985l = ColorKt.d(4278255615L);

    /* renamed from: m  reason: collision with root package name */
    public static final long f15986m = ColorKt.d(4294902015L);

    /* renamed from: n  reason: collision with root package name */
    public static final long f15987n = ColorKt.b(0);

    /* renamed from: o  reason: collision with root package name */
    public static final long f15988o = ColorKt.a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f16176a.I());

    /* renamed from: a  reason: collision with root package name */
    public final long f15989a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Color.f15976c;
        }

        public final long b() {
            return Color.f15983j;
        }

        public final long c() {
            return Color.f15979f;
        }

        public final long d() {
            return Color.f15981h;
        }

        public final long e() {
            return Color.f15987n;
        }

        public final long f() {
            return Color.f15988o;
        }

        public final long g() {
            return Color.f15980g;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Color(long j2) {
        this.f15989a = j2;
    }

    public static final /* synthetic */ Color h(long j2) {
        return new Color(j2);
    }

    public static long i(long j2) {
        return j2;
    }

    public static final long j(long j2, ColorSpace colorSpace) {
        return ColorSpaceKt.i(q(j2), colorSpace, 0, 2, (Object) null).a(j2);
    }

    public static final long k(long j2, float f2, float f3, float f4, float f5) {
        return ColorKt.a(f3, f4, f5, f2, q(j2));
    }

    public static /* synthetic */ long l(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = o(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = s(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = r(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = p(j2);
        }
        return k(j2, f6, f7, f8, f5);
    }

    public static boolean m(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).v();
    }

    public static final boolean n(long j2, long j3) {
        return ULong.j(j2, j3);
    }

    public static final float o(long j2) {
        float c2;
        float f2;
        if (ULong.f(63 & j2) == 0) {
            c2 = (float) UnsignedKt.c(ULong.f(ULong.f(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            c2 = (float) UnsignedKt.c(ULong.f(ULong.f(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return c2 / f2;
    }

    public static final float p(long j2) {
        int i2;
        int i3;
        int i4;
        if (ULong.f(63 & j2) == 0) {
            return ((float) UnsignedKt.c(ULong.f(ULong.f(j2 >>> 32) & 255))) / 255.0f;
        }
        short f2 = (short) ((int) ULong.f(ULong.f(j2 >>> 16) & 65535));
        short s2 = 32768 & f2;
        int i5 = ((65535 & f2) >>> 10) & 31;
        short s3 = f2 & 1023;
        if (i5 != 0) {
            int i6 = s3 << 13;
            if (i5 == 31) {
                i4 = 255;
                if (i6 != 0) {
                    i6 |= 4194304;
                }
            } else {
                i4 = i5 + 112;
            }
            int i7 = i4;
            i2 = i6;
            i3 = i7;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - Float16Kt.f16012a;
            return s2 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (s2 << 16) | i2);
    }

    public static final ColorSpace q(long j2) {
        return ColorSpaces.f16176a.v()[(int) ULong.f(j2 & 63)];
    }

    public static final float r(long j2) {
        int i2;
        int i3;
        int i4;
        if (ULong.f(63 & j2) == 0) {
            return ((float) UnsignedKt.c(ULong.f(ULong.f(j2 >>> 40) & 255))) / 255.0f;
        }
        short f2 = (short) ((int) ULong.f(ULong.f(j2 >>> 32) & 65535));
        short s2 = 32768 & f2;
        int i5 = ((65535 & f2) >>> 10) & 31;
        short s3 = f2 & 1023;
        if (i5 != 0) {
            int i6 = s3 << 13;
            if (i5 == 31) {
                i4 = 255;
                if (i6 != 0) {
                    i6 |= 4194304;
                }
            } else {
                i4 = i5 + 112;
            }
            int i7 = i4;
            i2 = i6;
            i3 = i7;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - Float16Kt.f16012a;
            return s2 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (s2 << 16) | i2);
    }

    public static final float s(long j2) {
        int i2;
        int i3;
        int i4;
        if (ULong.f(63 & j2) == 0) {
            return ((float) UnsignedKt.c(ULong.f(ULong.f(j2 >>> 48) & 255))) / 255.0f;
        }
        short f2 = (short) ((int) ULong.f(ULong.f(j2 >>> 48) & 65535));
        short s2 = 32768 & f2;
        int i5 = ((65535 & f2) >>> 10) & 31;
        short s3 = f2 & 1023;
        if (i5 != 0) {
            int i6 = s3 << 13;
            if (i5 == 31) {
                i4 = 255;
                if (i6 != 0) {
                    i6 |= 4194304;
                }
            } else {
                i4 = i5 + 112;
            }
            int i7 = i4;
            i2 = i6;
            i3 = i7;
        } else if (s3 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s3 + 1056964608) - Float16Kt.f16012a;
            return s2 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (s2 << 16) | i2);
    }

    public static int t(long j2) {
        return ULong.k(j2);
    }

    public static String u(long j2) {
        return "Color(" + s(j2) + ", " + r(j2) + ", " + p(j2) + ", " + o(j2) + ", " + q(j2).h() + ')';
    }

    public boolean equals(Object obj) {
        return m(this.f15989a, obj);
    }

    public int hashCode() {
        return t(this.f15989a);
    }

    public String toString() {
        return u(this.f15989a);
    }

    public final /* synthetic */ long v() {
        return this.f15989a;
    }
}
