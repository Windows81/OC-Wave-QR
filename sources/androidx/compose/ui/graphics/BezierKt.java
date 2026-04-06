package androidx.compose.ui.graphics;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata
public final class BezierKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15923a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.graphics.PathSegment$Type[] r0 = androidx.compose.ui.graphics.PathSegment.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Move     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Line     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Quadratic     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Cubic     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Conic     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Close     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.PathSegment.Type.Done     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f15923a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.WhenMappings.<clinit>():void");
        }
    }

    public static final long b(float f2, float f3, float f4, float f5, float[] fArr, int i2) {
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        float f8 = (f5 - f4) * 3.0f;
        int o2 = o(f6, f7, f8, fArr, i2);
        float f9 = (f7 - f6) * 2.0f;
        int a2 = o2 + q((-f9) / (((f8 - f7) * 2.0f) - f9), fArr, i2 + o2);
        float min = Math.min(f2, f5);
        float max = Math.max(f2, f5);
        for (int i3 = 0; i3 < a2; i3++) {
            float f10 = f(f2, f3, f4, f5, fArr[i3]);
            min = Math.min(min, f10);
            max = Math.max(max, f10);
        }
        return FloatFloatPair.a(min, max);
    }

    public static final long c(PathSegment pathSegment, float[] fArr, int i2) {
        int k2 = k(pathSegment, true, fArr, i2);
        float min = Math.min(pathSegment.a()[0], p(pathSegment));
        float max = Math.max(pathSegment.a()[0], p(pathSegment));
        for (int i3 = 0; i3 < k2; i3++) {
            float i4 = i(pathSegment, fArr[i3]);
            min = Math.min(min, i4);
            max = Math.max(max, i4);
        }
        return FloatFloatPair.a(min, max);
    }

    public static /* synthetic */ long d(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return c(pathSegment, fArr, i2);
    }

    public static final float e(float f2, float f3, float f4) {
        return ((((((f2 - f3) + 0.33333334f) * f4) + (f3 - (2.0f * f2))) * f4) + f2) * 3.0f * f4;
    }

    public static final float f(float f2, float f3, float f4, float f5, float f6) {
        return (((((((f5 + ((f3 - f4) * 3.0f)) - f2) * f6) + (((f4 - (2.0f * f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }

    public static final float g(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static final float h(float f2, float f3, float f4, float f5) {
        return (((((f4 - (f3 * 2.0f)) + f2) * f5) + ((f3 - f2) * 2.0f)) * f5) + f2;
    }

    public static final float i(PathSegment pathSegment, float f2) {
        float[] a2 = pathSegment.a();
        int i2 = WhenMappings.f15923a[pathSegment.b().ordinal()];
        if (i2 == 1) {
            return a2[0];
        }
        if (i2 == 2) {
            return g(a2[0], a2[2], f2);
        }
        if (i2 == 3) {
            return h(a2[0], a2[2], a2[4], f2);
        }
        if (i2 != 4) {
            return Float.NaN;
        }
        return f(a2[0], a2[2], a2[4], a2[6], f2);
    }

    public static final float j(PathSegment pathSegment, float f2) {
        float[] a2 = pathSegment.a();
        int i2 = WhenMappings.f15923a[pathSegment.b().ordinal()];
        if (i2 == 1) {
            return a2[1];
        }
        if (i2 == 2) {
            return g(a2[1], a2[3], f2);
        }
        if (i2 == 3) {
            return h(a2[1], a2[3], a2[5], f2);
        }
        if (i2 != 4) {
            return Float.NaN;
        }
        return f(a2[1], a2[3], a2[5], a2[7], f2);
    }

    public static final int k(PathSegment pathSegment, boolean z2, float[] fArr, int i2) {
        int i3 = !z2;
        float[] a2 = pathSegment.a();
        int i4 = WhenMappings.f15923a[pathSegment.b().ordinal()];
        if (i4 == 3) {
            float f2 = (float) 2;
            float f3 = a2[i3 + 2];
            float f4 = (f3 - a2[i3]) * f2;
            return q((-f4) / ((f2 * (a2[i3 + 4] - f3)) - f4), fArr, i2);
        } else if (i4 != 4) {
            return 0;
        } else {
            float f5 = a2[i3 + 2];
            float f6 = (f5 - a2[i3]) * 3.0f;
            float f7 = a2[i3 + 4];
            float f8 = (f7 - f5) * 3.0f;
            float f9 = (a2[i3 + 6] - f7) * 3.0f;
            int o2 = o(f6, f8, f9, fArr, i2);
            float f10 = (f8 - f6) * 2.0f;
            return q((-f10) / (((f9 - f8) * 2.0f) - f10), fArr, i2 + o2) + o2;
        }
    }

    public static final float l(float f2, float f3, float f4, float f5) {
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        double d2 = (double) f6;
        double d3 = ((d2 - (((double) f7) * 2.0d)) + ((double) f8)) * 3.0d;
        double d4 = ((double) (f7 - f6)) * 3.0d;
        double d5 = ((double) (-f6)) + (((double) (f7 - f8)) * 3.0d) + ((double) f5);
        float f9 = 1.0f;
        float f10 = 0.0f;
        if (Math.abs(d5 - 0.0d) >= 1.0E-7d) {
            double d6 = d3 / d5;
            double d7 = d4 / d5;
            double d8 = d2 / d5;
            double d9 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
            double d10 = (((((2.0d * d6) * d6) * d6) - ((9.0d * d6) * d7)) + (d8 * 27.0d)) / 54.0d;
            double d11 = d9 * d9 * d9;
            double d12 = (d10 * d10) + d11;
            double d13 = d6 / 3.0d;
            int i2 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
            if (i2 < 0) {
                double sqrt = Math.sqrt(-d11);
                double d14 = (-d10) / sqrt;
                if (d14 < -1.0d) {
                    d14 = -1.0d;
                }
                if (d14 > 1.0d) {
                    d14 = 1.0d;
                }
                double acos = Math.acos(d14);
                double a2 = (double) (MathHelpersKt.a((float) sqrt) * 2.0f);
                float cos = (float) ((Math.cos(acos / 3.0d) * a2) - d13);
                float f11 = cos < 0.0f ? 0.0f : cos;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - cos) > 1.05E-6f) {
                    f11 = Float.NaN;
                }
                if (!Float.isNaN(f11)) {
                    return f11;
                }
                float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * a2) - d13);
                float f12 = cos2 < 0.0f ? 0.0f : cos2;
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                if (Math.abs(f12 - cos2) > 1.05E-6f) {
                    f12 = Float.NaN;
                }
                if (!Float.isNaN(f12)) {
                    return f12;
                }
                float cos3 = (float) ((a2 * Math.cos((acos + 12.566370614359172d) / 3.0d)) - d13);
                if (cos3 >= 0.0f) {
                    f10 = cos3;
                }
                if (f10 <= 1.0f) {
                    f9 = f10;
                }
                if (Math.abs(f9 - cos3) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f9;
            } else if (i2 == 0) {
                float f13 = -MathHelpersKt.a((float) d10);
                float f14 = (float) d13;
                float f15 = (2.0f * f13) - f14;
                float f16 = f15 < 0.0f ? 0.0f : f15;
                if (f16 > 1.0f) {
                    f16 = 1.0f;
                }
                if (Math.abs(f16 - f15) > 1.05E-6f) {
                    f16 = Float.NaN;
                }
                if (!Float.isNaN(f16)) {
                    return f16;
                }
                float f17 = (-f13) - f14;
                if (f17 >= 0.0f) {
                    f10 = f17;
                }
                if (f10 <= 1.0f) {
                    f9 = f10;
                }
                if (Math.abs(f9 - f17) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f9;
            } else {
                double sqrt2 = Math.sqrt(d12);
                float a3 = (float) (((double) (MathHelpersKt.a((float) ((-d10) + sqrt2)) - MathHelpersKt.a((float) (d10 + sqrt2)))) - d13);
                if (a3 >= 0.0f) {
                    f10 = a3;
                }
                if (f10 <= 1.0f) {
                    f9 = f10;
                }
                if (Math.abs(f9 - a3) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f9;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            double sqrt3 = Math.sqrt((d4 * d4) - ((4.0d * d3) * d2));
            double d15 = d3 * 2.0d;
            float f18 = (float) ((sqrt3 - d4) / d15);
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > 1.05E-6f) {
                f19 = Float.NaN;
            }
            if (!Float.isNaN(f19)) {
                return f19;
            }
            float f20 = (float) (((-d4) - sqrt3) / d15);
            if (f20 >= 0.0f) {
                f10 = f20;
            }
            if (f10 <= 1.0f) {
                f9 = f10;
            }
            if (Math.abs(f9 - f20) > 1.05E-6f) {
                return Float.NaN;
            }
            return f9;
        } else if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
            return Float.NaN;
        } else {
            float f21 = (float) ((-d2) / d4);
            if (f21 >= 0.0f) {
                f10 = f21;
            }
            if (f10 <= 1.0f) {
                f9 = f10;
            }
            if (Math.abs(f9 - f21) > 1.05E-6f) {
                return Float.NaN;
            }
            return f9;
        }
    }

    public static final float m(float f2, float f3, float f4) {
        double d2 = (double) f2;
        double d3 = (double) f3;
        double d4 = (double) f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        float f5 = 1.0f;
        float f6 = 0.0f;
        if (d6 != 0.0d) {
            double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
            double d8 = (-d2) + d3;
            float f7 = (float) ((-(d7 + d8)) / d6);
            float f8 = f7 < 0.0f ? 0.0f : f7;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            if (Math.abs(f8 - f7) > 1.05E-6f) {
                f8 = Float.NaN;
            }
            if (!Float.isNaN(f8)) {
                return f8;
            }
            float f9 = (float) ((d7 - d8) / d6);
            if (f9 >= 0.0f) {
                f6 = f9;
            }
            if (f6 <= 1.0f) {
                f5 = f6;
            }
            if (Math.abs(f5 - f9) > 1.05E-6f) {
                return Float.NaN;
            }
            return f5;
        } else if (d3 == d4) {
            return Float.NaN;
        } else {
            float f10 = (float) ((d5 - d4) / (d5 - (d4 * 2.0d)));
            if (f10 >= 0.0f) {
                f6 = f10;
            }
            if (f6 <= 1.0f) {
                f5 = f6;
            }
            if (Math.abs(f5 - f10) > 1.05E-6f) {
                return Float.NaN;
            }
            return f5;
        }
    }

    public static final float n(PathSegment pathSegment, float f2) {
        float[] a2 = pathSegment.a();
        switch (WhenMappings.f15923a[pathSegment.b().ordinal()]) {
            case 1:
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            case 2:
                float f3 = a2[0] - f2;
                float f4 = (-f3) / ((a2[2] - f2) - f3);
                float f5 = 0.0f;
                if (f4 >= 0.0f) {
                    f5 = f4;
                }
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                if (Math.abs(f5 - f4) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f5;
            case 3:
                return m(a2[0] - f2, a2[2] - f2, a2[4] - f2);
            case 4:
                return l(a2[0] - f2, a2[2] - f2, a2[4] - f2, a2[6] - f2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int o(float f2, float f3, float f4, float[] fArr, int i2) {
        float[] fArr2 = fArr;
        int i3 = i2;
        double d2 = (double) f2;
        double d3 = (double) f3;
        double d4 = (double) f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        if (d6 != 0.0d) {
            double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
            double d8 = (-d2) + d3;
            int q2 = q((float) ((-(d7 + d8)) / d6), fArr2, i3);
            int q3 = q2 + q((float) ((d7 - d8) / d6), fArr2, i3 + q2);
            if (q3 > 1) {
                float f5 = fArr2[i3];
                int i4 = i3 + 1;
                float f6 = fArr2[i4];
                if (f5 > f6) {
                    fArr2[i3] = f6;
                    fArr2[i4] = f5;
                } else if (f5 == f6) {
                    return q3 - 1;
                }
            }
            return q3;
        } else if (d3 == d4) {
            return 0;
        } else {
            return q((float) ((d5 - d4) / (d5 - (d4 * 2.0d))), fArr2, i3);
        }
    }

    public static final float p(PathSegment pathSegment) {
        float[] a2 = pathSegment.a();
        int i2 = WhenMappings.f15923a[pathSegment.b().ordinal()];
        char c2 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    c2 = 6;
                } else if (i2 != 5) {
                    c2 = 0;
                }
            }
            c2 = 4;
        }
        return a2[c2];
    }

    public static final int q(float f2, float[] fArr, int i2) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return Float.isNaN(f3) ^ true ? 1 : 0;
    }
}
