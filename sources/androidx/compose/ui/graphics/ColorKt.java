package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ColorKt {
    public static final long a(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ColorSpace colorSpace2 = colorSpace;
        float f6 = 1.0f;
        float f7 = 0.0f;
        if (colorSpace.i()) {
            float f8 = f5 < 0.0f ? 0.0f : f5;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i12 = ((int) ((f8 * 255.0f) + 0.5f)) << 24;
            float f9 = f2 < 0.0f ? 0.0f : f2;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i13 = i12 | (((int) ((f9 * 255.0f) + 0.5f)) << 16);
            float f10 = f3 < 0.0f ? 0.0f : f3;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            int i14 = i13 | (((int) ((f10 * 255.0f) + 0.5f)) << 8);
            if (f4 >= 0.0f) {
                f7 = f4;
            }
            if (f7 <= 1.0f) {
                f6 = f7;
            }
            return Color.i(ULong.f(ULong.f((long) (i14 | ((int) ((f6 * 255.0f) + 0.5f)))) << 32));
        }
        if (!(colorSpace.c() == 3)) {
            InlineClassHelperKt.a("Color only works with ColorSpaces with 3 components");
        }
        int d2 = colorSpace.d();
        if (!(d2 != -1)) {
            InlineClassHelperKt.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float f11 = colorSpace2.f(0);
        float e2 = colorSpace2.e(0);
        if (f2 >= f11) {
            f11 = f2;
        }
        if (f11 <= e2) {
            e2 = f11;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(e2);
        int i15 = floatToRawIntBits >>> 31;
        int i16 = (floatToRawIntBits >>> 23) & 255;
        int i17 = floatToRawIntBits & 8388607;
        int i18 = 512;
        int i19 = 31;
        if (i16 == 255) {
            i3 = i17 != 0 ? 512 : 0;
            i2 = 31;
            i4 = i3 | (i15 << 15) | (i2 << 10);
        } else {
            i2 = i16 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else if (i2 <= 0) {
                if (i2 >= -10) {
                    int i20 = (i17 | 8388608) >> (1 - i2);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i11 = i20 >> 13;
                } else {
                    i11 = 0;
                }
                i2 = 0;
            } else {
                int i21 = i17 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i21) + 1) | (i15 << 15);
                } else {
                    i3 = i21;
                }
            }
            i4 = i3 | (i15 << 15) | (i2 << 10);
        }
        short s2 = (short) i4;
        float f12 = colorSpace2.f(1);
        float e3 = colorSpace2.e(1);
        if (f3 >= f12) {
            f12 = f3;
        }
        if (f12 <= e3) {
            e3 = f12;
        }
        int floatToRawIntBits2 = Float.floatToRawIntBits(e3);
        int i22 = floatToRawIntBits2 >>> 31;
        int i23 = (floatToRawIntBits2 >>> 23) & 255;
        int i24 = floatToRawIntBits2 & 8388607;
        if (i23 == 255) {
            i6 = i24 != 0 ? 512 : 0;
            i5 = 31;
            i7 = i6 | (i22 << 15) | (i5 << 10);
        } else {
            i5 = i23 - 112;
            if (i5 >= 31) {
                i5 = 49;
                i6 = 0;
            } else if (i5 <= 0) {
                if (i5 >= -10) {
                    int i25 = (i24 | 8388608) >> (1 - i5);
                    if ((i25 & 4096) != 0) {
                        i25 += 8192;
                    }
                    i10 = i25 >> 13;
                } else {
                    i10 = 0;
                }
                i5 = 0;
            } else {
                int i26 = i24 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i7 = (((i5 << 10) | i26) + 1) | (i22 << 15);
                } else {
                    i6 = i26;
                }
            }
            i7 = i6 | (i22 << 15) | (i5 << 10);
        }
        short s3 = (short) i7;
        float f13 = colorSpace2.f(2);
        float e4 = colorSpace2.e(2);
        if (f4 >= f13) {
            f13 = f4;
        }
        if (f13 <= e4) {
            e4 = f13;
        }
        int floatToRawIntBits3 = Float.floatToRawIntBits(e4);
        int i27 = floatToRawIntBits3 >>> 31;
        int i28 = (floatToRawIntBits3 >>> 23) & 255;
        int i29 = 8388607 & floatToRawIntBits3;
        if (i28 == 255) {
            if (i29 == 0) {
                i18 = 0;
            }
            i8 = i18;
            i9 = (i27 << 15) | (i19 << 10) | i8;
        } else {
            int i30 = i28 - 112;
            if (i30 >= 31) {
                i19 = 49;
            } else {
                if (i30 > 0) {
                    int i31 = i29 >> 13;
                    if ((floatToRawIntBits3 & 4096) != 0) {
                        i9 = (((i30 << 10) | i31) + 1) | (i27 << 15);
                    } else {
                        i8 = i31;
                        i19 = i30;
                    }
                } else if (i30 >= -10) {
                    int i32 = (i29 | 8388608) >> (1 - i30);
                    if ((i32 & 4096) != 0) {
                        i32 += 8192;
                    }
                    i8 = i32 >> 13;
                    i19 = 0;
                } else {
                    i19 = 0;
                }
                i9 = (i27 << 15) | (i19 << 10) | i8;
            }
            i8 = 0;
            i9 = (i27 << 15) | (i19 << 10) | i8;
        }
        short s4 = (short) i9;
        if (f5 >= 0.0f) {
            f7 = f5;
        }
        if (f7 <= 1.0f) {
            f6 = f7;
        }
        return Color.i(ULong.f((((long) d2) & 63) | ((((long) ((int) ((f6 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16)));
    }

    public static final long b(int i2) {
        return Color.i(ULong.f(ULong.f((long) i2) << 32));
    }

    public static final long c(int i2, int i3, int i4, int i5) {
        return b(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long d(long j2) {
        return Color.i(ULong.f(j2 << 32));
    }

    public static /* synthetic */ long e(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return c(i2, i3, i4, i5);
    }

    public static final long f(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f6 = f5;
        if (colorSpace.i()) {
            return Color.i(ULong.f(ULong.f((long) ((((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32));
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 512;
        int i14 = 0;
        if (i11 == 255) {
            i3 = i12 != 0 ? 512 : 0;
            i2 = 31;
            i4 = i3 | (i10 << 15) | (i2 << 10);
        } else {
            i2 = i11 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i15 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i15) + 1) | (i10 << 15);
                } else {
                    i3 = i15;
                }
            } else if (i2 >= -10) {
                int i16 = (i12 | 8388608) >> (1 - i2);
                if ((i16 & 4096) != 0) {
                    i16 += 8192;
                }
                i3 = i16 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
            i4 = i3 | (i10 << 15) | (i2 << 10);
        }
        short s2 = (short) i4;
        int floatToRawIntBits2 = Float.floatToRawIntBits(f3);
        int i17 = floatToRawIntBits2 >>> 31;
        int i18 = (floatToRawIntBits2 >>> 23) & 255;
        int i19 = floatToRawIntBits2 & 8388607;
        if (i18 == 255) {
            i6 = i19 != 0 ? 512 : 0;
            i5 = 31;
            i7 = i6 | (i17 << 15) | (i5 << 10);
        } else {
            i5 = i18 - 112;
            if (i5 >= 31) {
                i6 = 0;
                i5 = 49;
            } else if (i5 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits2 & 4096) != 0) {
                    i7 = (((i5 << 10) | i20) + 1) | (i17 << 15);
                } else {
                    i6 = i20;
                }
            } else if (i5 >= -10) {
                int i21 = (i19 | 8388608) >> (1 - i5);
                if ((i21 & 4096) != 0) {
                    i21 += 8192;
                }
                i6 = i21 >> 13;
                i5 = 0;
            } else {
                i6 = 0;
                i5 = 0;
            }
            i7 = i6 | (i17 << 15) | (i5 << 10);
        }
        short s3 = (short) i7;
        int floatToRawIntBits3 = Float.floatToRawIntBits(f4);
        int i22 = floatToRawIntBits3 >>> 31;
        int i23 = (floatToRawIntBits3 >>> 23) & 255;
        int i24 = 8388607 & floatToRawIntBits3;
        if (i23 == 255) {
            if (i24 == 0) {
                i13 = 0;
            }
            i14 = i13;
            i8 = 31;
            i9 = (i22 << 15) | (i8 << 10) | i14;
        } else {
            i8 = i23 - 112;
            if (i8 >= 31) {
                i8 = 49;
            } else if (i8 > 0) {
                i14 = i24 >> 13;
                if ((floatToRawIntBits3 & 4096) != 0) {
                    i9 = (((i8 << 10) | i14) + 1) | (i22 << 15);
                }
            } else if (i8 >= -10) {
                int i25 = (i24 | 8388608) >> (1 - i8);
                if ((i25 & 4096) != 0) {
                    i25 += 8192;
                }
                i8 = 0;
                i14 = i25 >> 13;
            } else {
                i8 = 0;
            }
            i9 = (i22 << 15) | (i8 << 10) | i14;
        }
        return Color.i(ULong.f(((((long) s3) & 65535) << 32) | ((((long) s2) & 65535) << 48) | ((((long) ((short) i9)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) colorSpace.d()) & 63)));
    }

    public static final long g(long j2, long j3) {
        long j4 = Color.j(j2, Color.q(j3));
        float o2 = Color.o(j3);
        float o3 = Color.o(j4);
        float f2 = 1.0f - o3;
        float f3 = (o2 * f2) + o3;
        float f4 = 0.0f;
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        float s2 = i2 == 0 ? 0.0f : ((Color.s(j4) * o3) + ((Color.s(j3) * o2) * f2)) / f3;
        float r2 = i2 == 0 ? 0.0f : ((Color.r(j4) * o3) + ((Color.r(j3) * o2) * f2)) / f3;
        float p2 = Color.p(j4);
        float p3 = Color.p(j3);
        if (i2 != 0) {
            f4 = ((p2 * o3) + ((p3 * o2) * f2)) / f3;
        }
        return f(s2, r2, f4, f3, Color.q(j3));
    }

    public static final long h(long j2, long j3, float f2) {
        ColorSpace D = ColorSpaces.f16176a.D();
        long j4 = Color.j(j2, D);
        long j5 = Color.j(j3, D);
        float o2 = Color.o(j4);
        float s2 = Color.s(j4);
        float r2 = Color.r(j4);
        float p2 = Color.p(j4);
        float o3 = Color.o(j5);
        float s3 = Color.s(j5);
        float r3 = Color.r(j5);
        float p3 = Color.p(j5);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.j(f(MathHelpersKt.b(s2, s3, f2), MathHelpersKt.b(r2, r3, f2), MathHelpersKt.b(p2, p3, f2), MathHelpersKt.b(o2, o3, f2), D), Color.q(j3));
    }

    public static final float i(long j2) {
        ColorSpace q2 = Color.q(j2);
        if (!ColorModel.f(q2.g(), ColorModel.f16164b.b())) {
            InlineClassHelperKt.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.i(q2.g()));
        }
        Intrinsics.g(q2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction A2 = ((Rgb) q2).A();
        float a2 = (float) ((A2.a((double) Color.s(j2)) * 0.2126d) + (A2.a((double) Color.r(j2)) * 0.7152d) + (A2.a((double) Color.p(j2)) * 0.0722d));
        if (a2 < 0.0f) {
            a2 = 0.0f;
        }
        if (a2 > 1.0f) {
            return 1.0f;
        }
        return a2;
    }

    public static final int j(long j2) {
        return (int) ULong.f(Color.j(j2, ColorSpaces.f16176a.G()) >>> 32);
    }
}
