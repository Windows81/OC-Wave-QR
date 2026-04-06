package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class Rgb extends ColorSpace {

    /* renamed from: t  reason: collision with root package name */
    public static final Companion f16236t = new Companion((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final DoubleFunction f16237u = new i();

    /* renamed from: e  reason: collision with root package name */
    public final WhitePoint f16238e;

    /* renamed from: f  reason: collision with root package name */
    public final float f16239f;

    /* renamed from: g  reason: collision with root package name */
    public final float f16240g;

    /* renamed from: h  reason: collision with root package name */
    public final TransferParameters f16241h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f16242i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f16243j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f16244k;

    /* renamed from: l  reason: collision with root package name */
    public final DoubleFunction f16245l;

    /* renamed from: m  reason: collision with root package name */
    public final Function1 f16246m;

    /* renamed from: n  reason: collision with root package name */
    public final DoubleFunction f16247n;

    /* renamed from: o  reason: collision with root package name */
    public final DoubleFunction f16248o;

    /* renamed from: p  reason: collision with root package name */
    public final Function1 f16249p;

    /* renamed from: q  reason: collision with root package name */
    public final DoubleFunction f16250q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f16251r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f16252s;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final double A(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.o(d2, transferParameters.a(), transferParameters.b(), transferParameters.c(), transferParameters.d(), transferParameters.g());
        }

        public static final double B(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.p(d2, transferParameters.a(), transferParameters.b(), transferParameters.c(), transferParameters.d(), transferParameters.e(), transferParameters.f(), transferParameters.g());
        }

        public static final double t(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f16176a.J(transferParameters, d2);
        }

        public static final double u(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f16176a.L(transferParameters, d2);
        }

        public static final double v(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.q(d2, transferParameters.a(), transferParameters.b(), transferParameters.c(), transferParameters.d(), transferParameters.g());
        }

        public static final double w(TransferParameters transferParameters, double d2) {
            return ColorSpaceKt.r(d2, transferParameters.a(), transferParameters.b(), transferParameters.c(), transferParameters.d(), transferParameters.e(), transferParameters.f(), transferParameters.g());
        }

        public static final double y(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f16176a.K(transferParameters, d2);
        }

        public static final double z(TransferParameters transferParameters, double d2) {
            return ColorSpaces.f16176a.M(transferParameters, d2);
        }

        public final boolean C(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, int i2) {
            if (i2 == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.f16176a;
            if (!ColorSpaceKt.g(fArr, colorSpaces.H()) || !ColorSpaceKt.f(whitePoint, Illuminant.f16213a.e()) || f2 != 0.0f || f3 != 1.0f) {
                return false;
            }
            Rgb G = colorSpaces.G();
            for (double d2 = 0.0d; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                if (!p(d2, doubleFunction, G.F()) || !p(d2, doubleFunction2, G.B())) {
                    return false;
                }
            }
            return true;
        }

        public final boolean D(float[] fArr, float f2, float f3) {
            float o2 = o(fArr);
            ColorSpaces colorSpaces = ColorSpaces.f16176a;
            return (o2 / o(colorSpaces.C()) > 0.9f && r(fArr, colorSpaces.H())) || (f2 < 0.0f && f3 > 1.0f);
        }

        public final float[] E(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = f2 + f3 + fArr[2];
                fArr2[0] = f2 / f4;
                fArr2[1] = f3 / f4;
                float f5 = fArr[3];
                float f6 = fArr[4];
                float f7 = f5 + f6 + fArr[5];
                fArr2[2] = f5 / f7;
                fArr2[3] = f6 / f7;
                float f8 = fArr[6];
                float f9 = fArr[7];
                float f10 = f8 + f9 + fArr[8];
                fArr2[4] = f8 / f10;
                fArr2[5] = f9 / f10;
            } else {
                ArraysKt.n(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public final float o(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float f8 = ((((((f2 * f5) + (f3 * f6)) + (f4 * f7)) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            return f8 < 0.0f ? -f8 : f8;
        }

        public final boolean p(double d2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.a(d2) - doubleFunction2.a(d2)) <= 0.001d;
        }

        public final float[] q(float[] fArr, WhitePoint whitePoint) {
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float a2 = whitePoint.a();
            float b2 = whitePoint.b();
            float f8 = (float) 1;
            float f9 = (f8 - f2) / f3;
            float f10 = f2 / f3;
            float f11 = (f4 / f5) - f10;
            float f12 = (a2 / b2) - f10;
            float f13 = ((f8 - f4) / f5) - f9;
            float f14 = (f6 / f7) - f10;
            float f15 = (((((f8 - a2) / b2) - f9) * f11) - (f12 * f13)) / (((((f8 - f6) / f7) - f9) * f11) - (f13 * f14));
            float f16 = (f12 - (f14 * f15)) / f11;
            float f17 = (1.0f - f16) - f15;
            float f18 = f17 / f3;
            float f19 = f16 / f5;
            float f20 = f15 / f7;
            return new float[]{f18 * f2, f17, f18 * ((1.0f - f2) - f3), f19 * f4, f16, f19 * ((1.0f - f4) - f5), f20 * f6, f15, f20 * ((1.0f - f6) - f7)};
        }

        public final boolean r(float[] fArr, float[] fArr2) {
            float f2 = fArr[0];
            float f3 = fArr2[0];
            float f4 = fArr[1];
            float f5 = fArr2[1];
            float f6 = fArr[2];
            float f7 = fArr2[2];
            float f8 = fArr[3];
            float f9 = fArr2[3];
            float f10 = fArr[4];
            float f11 = fArr2[4];
            float f12 = fArr[5];
            float f13 = fArr2[5];
            float[] fArr3 = {f2 - f3, f4 - f5, f6 - f7, f8 - f9, f10 - f11, f12 - f13};
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            if (((f5 - f13) * f14) - ((f3 - f11) * f15) < 0.0f || ((f3 - f7) * f15) - ((f5 - f9) * f14) < 0.0f) {
                return false;
            }
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            if (((f9 - f5) * f16) - ((f7 - f3) * f17) < 0.0f || ((f7 - f11) * f17) - ((f9 - f13) * f16) < 0.0f) {
                return false;
            }
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            return ((f13 - f9) * f18) - ((f11 - f7) * f19) >= 0.0f && ((f11 - f3) * f19) - ((f13 - f5) * f18) >= 0.0f;
        }

        public final DoubleFunction s(TransferParameters transferParameters) {
            return transferParameters.h() ? new l(transferParameters) : transferParameters.i() ? new m(transferParameters) : (transferParameters.e() == 0.0d && transferParameters.f() == 0.0d) ? new n(transferParameters) : new o(transferParameters);
        }

        public final DoubleFunction x(TransferParameters transferParameters) {
            return transferParameters.h() ? new p(transferParameters) : transferParameters.i() ? new q(transferParameters) : (transferParameters.e() == 0.0d && transferParameters.f() == 0.0d) ? new r(transferParameters) : new s(transferParameters);
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.f16164b.b(), i2, (DefaultConstructorMarker) null);
        float[] fArr3 = fArr;
        WhitePoint whitePoint2 = whitePoint;
        float[] fArr4 = fArr2;
        float f4 = f2;
        float f5 = f3;
        this.f16238e = whitePoint2;
        this.f16239f = f4;
        this.f16240g = f5;
        this.f16241h = transferParameters;
        this.f16245l = doubleFunction;
        this.f16246m = new Rgb$oetf$1(this);
        this.f16247n = new g(this);
        this.f16248o = doubleFunction2;
        this.f16249p = new Rgb$eotf$1(this);
        this.f16250q = new h(this);
        if (fArr3.length != 6 && fArr3.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f4 < f5) {
            Companion companion = f16236t;
            float[] n2 = companion.E(fArr3);
            this.f16242i = n2;
            if (fArr4 == null) {
                this.f16243j = companion.q(n2, whitePoint2);
            } else if (fArr4.length == 9) {
                this.f16243j = fArr4;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr4.length);
            }
            this.f16244k = ColorSpaceKt.k(this.f16243j);
            this.f16251r = companion.D(n2, f4, f5);
            this.f16252s = companion.C(n2, whitePoint, doubleFunction, doubleFunction2, f2, f3, i2);
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f4 + ", max=" + f5 + "; min must be strictly < max");
        }
    }

    public static final double K(Rgb rgb, double d2) {
        return RangesKt.m(rgb.f16245l.a(d2), (double) rgb.f16239f, (double) rgb.f16240g);
    }

    public static final double t(double d2) {
        return d2;
    }

    public static final double u(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, 1.0d / d2);
    }

    public static final double v(double d2, double d3) {
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return Math.pow(d3, d2);
    }

    public static final double y(Rgb rgb, double d2) {
        return rgb.f16248o.a(RangesKt.m(d2, (double) rgb.f16239f, (double) rgb.f16240g));
    }

    public final DoubleFunction A() {
        return this.f16250q;
    }

    public final DoubleFunction B() {
        return this.f16248o;
    }

    public final float[] C() {
        return this.f16244k;
    }

    public final Function1 D() {
        return this.f16246m;
    }

    public final DoubleFunction E() {
        return this.f16247n;
    }

    public final DoubleFunction F() {
        return this.f16245l;
    }

    public final float[] G() {
        return this.f16242i;
    }

    public final TransferParameters H() {
        return this.f16241h;
    }

    public final float[] I() {
        return this.f16243j;
    }

    public final WhitePoint J() {
        return this.f16238e;
    }

    public float[] b(float[] fArr) {
        ColorSpaceKt.n(this.f16244k, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f16247n.a((double) fArr[0]);
        fArr[1] = (float) this.f16247n.a((double) fArr[1]);
        fArr[2] = (float) this.f16247n.a((double) fArr[2]);
        return fArr;
    }

    public float e(int i2) {
        return this.f16240g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f16239f, this.f16239f) != 0 || Float.compare(rgb.f16240g, this.f16240g) != 0 || !Intrinsics.d(this.f16238e, rgb.f16238e) || !Arrays.equals(this.f16242i, rgb.f16242i)) {
            return false;
        }
        TransferParameters transferParameters = this.f16241h;
        if (transferParameters != null) {
            return Intrinsics.d(transferParameters, rgb.f16241h);
        }
        if (rgb.f16241h == null) {
            return true;
        }
        if (!Intrinsics.d(this.f16245l, rgb.f16245l)) {
            return false;
        }
        return Intrinsics.d(this.f16248o, rgb.f16248o);
    }

    public float f(int i2) {
        return this.f16239f;
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f16238e.hashCode()) * 31) + Arrays.hashCode(this.f16242i)) * 31;
        float f2 = this.f16239f;
        int i2 = 0;
        int floatToIntBits = (hashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.f16240g;
        int floatToIntBits2 = (floatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        TransferParameters transferParameters = this.f16241h;
        if (transferParameters != null) {
            i2 = transferParameters.hashCode();
        }
        int i3 = floatToIntBits2 + i2;
        return this.f16241h == null ? (((i3 * 31) + this.f16245l.hashCode()) * 31) + this.f16248o.hashCode() : i3;
    }

    public boolean i() {
        return this.f16252s;
    }

    public long j(float f2, float f3, float f4) {
        float a2 = (float) this.f16250q.a((double) f2);
        float a3 = (float) this.f16250q.a((double) f3);
        float a4 = (float) this.f16250q.a((double) f4);
        float[] fArr = this.f16243j;
        if (fArr.length < 9) {
            return 0;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * a2) + (fArr[3] * a3)) + (fArr[6] * a4))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * a2) + (fArr[4] * a3) + (fArr[7] * a4))) & 4294967295L);
    }

    public float[] l(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.f16250q.a((double) fArr[0]);
        fArr[1] = (float) this.f16250q.a((double) fArr[1]);
        fArr[2] = (float) this.f16250q.a((double) fArr[2]);
        return ColorSpaceKt.n(this.f16243j, fArr);
    }

    public float m(float f2, float f3, float f4) {
        float a2 = (float) this.f16250q.a((double) f2);
        float a3 = (float) this.f16250q.a((double) f3);
        float a4 = (float) this.f16250q.a((double) f4);
        float[] fArr = this.f16243j;
        return (fArr[2] * a2) + (fArr[5] * a3) + (fArr[8] * a4);
    }

    public long n(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = this.f16244k;
        return ColorKt.a((float) this.f16247n.a((double) ((fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4))), (float) this.f16247n.a((double) ((fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4))), (float) this.f16247n.a((double) ((fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4))), f5, colorSpace);
    }

    public final Function1 z() {
        return this.f16249p;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r12, float[] r13, androidx.compose.ui.graphics.colorspace.WhitePoint r14, androidx.compose.ui.graphics.colorspace.TransferParameters r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = f16236t
            androidx.compose.ui.graphics.colorspace.DoubleFunction r5 = r0.x(r15)
            androidx.compose.ui.graphics.colorspace.DoubleFunction r6 = r0.s(r15)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, androidx.compose.ui.graphics.colorspace.TransferParameters, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Rgb(java.lang.String r21, float[] r22, androidx.compose.ui.graphics.colorspace.WhitePoint r23, double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = f16237u
        L_0x000a:
            r17 = r3
            goto L_0x0013
        L_0x000d:
            androidx.compose.ui.graphics.colorspace.j r3 = new androidx.compose.ui.graphics.colorspace.j
            r3.<init>(r1)
            goto L_0x000a
        L_0x0013:
            if (r0 != 0) goto L_0x001a
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = f16237u
        L_0x0017:
            r18 = r0
            goto L_0x0020
        L_0x001a:
            androidx.compose.ui.graphics.colorspace.k r0 = new androidx.compose.ui.graphics.colorspace.k
            r0.<init>(r1)
            goto L_0x0017
        L_0x0020:
            androidx.compose.ui.graphics.colorspace.TransferParameters r19 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.h(), rgb.f16242i, whitePoint, fArr, rgb.f16245l, rgb.f16248o, rgb.f16239f, rgb.f16240g, rgb.f16241h, -1);
    }
}
