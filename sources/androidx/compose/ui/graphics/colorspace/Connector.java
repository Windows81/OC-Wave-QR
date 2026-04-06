package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Connector {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f16202g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final ColorSpace f16203a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorSpace f16204b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f16205c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorSpace f16206d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16207e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f16208f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float[] b(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
            if (!RenderIntent.f(i2, RenderIntent.f16230b.a())) {
                return null;
            }
            long g2 = colorSpace.g();
            ColorModel.Companion companion = ColorModel.f16164b;
            boolean f2 = ColorModel.f(g2, companion.b());
            boolean f3 = ColorModel.f(colorSpace2.g(), companion.b());
            if (f2 && f3) {
                return null;
            }
            if (!f2 && !f3) {
                return null;
            }
            if (!f2) {
                colorSpace = colorSpace2;
            }
            Intrinsics.g(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] c2 = f2 ? rgb.J().c() : Illuminant.f16213a.c();
            float[] c3 = f3 ? rgb.J().c() : Illuminant.f16213a.c();
            return new float[]{c2[0] / c3[0], c2[1] / c3[1], c2[2] / c3[2]};
        }

        public final Connector c(ColorSpace colorSpace) {
            return new Connector$Companion$identity$1(colorSpace, RenderIntent.f16230b.c());
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class RgbConnector extends Connector {

        /* renamed from: h  reason: collision with root package name */
        public final Rgb f16209h;

        /* renamed from: i  reason: collision with root package name */
        public final Rgb f16210i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f16211j;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i2);
        }

        public long a(long j2) {
            float s2 = Color.s(j2);
            float r2 = Color.r(j2);
            float p2 = Color.p(j2);
            float o2 = Color.o(j2);
            float a2 = (float) this.f16209h.A().a((double) s2);
            float a3 = (float) this.f16209h.A().a((double) r2);
            float a4 = (float) this.f16209h.A().a((double) p2);
            float[] fArr = this.f16211j;
            return ColorKt.a((float) this.f16210i.E().a((double) ((fArr[0] * a2) + (fArr[3] * a3) + (fArr[6] * a4))), (float) this.f16210i.E().a((double) ((fArr[1] * a2) + (fArr[4] * a3) + (fArr[7] * a4))), (float) this.f16210i.E().a((double) ((fArr[2] * a2) + (fArr[5] * a3) + (fArr[8] * a4))), o2, this.f16210i);
        }

        public final float[] b(Rgb rgb, Rgb rgb2, int i2) {
            if (ColorSpaceKt.f(rgb.J(), rgb2.J())) {
                return ColorSpaceKt.l(rgb2.C(), rgb.I());
            }
            float[] I = rgb.I();
            float[] C = rgb2.C();
            float[] c2 = rgb.J().c();
            float[] c3 = rgb2.J().c();
            WhitePoint J = rgb.J();
            Illuminant illuminant = Illuminant.f16213a;
            if (!ColorSpaceKt.f(J, illuminant.b())) {
                I = ColorSpaceKt.l(ColorSpaceKt.e(Adaptation.f16159b.a().b(), c2, illuminant.f()), rgb.I());
            }
            if (!ColorSpaceKt.f(rgb2.J(), illuminant.b())) {
                C = ColorSpaceKt.k(ColorSpaceKt.l(ColorSpaceKt.e(Adaptation.f16159b.a().b(), c3, illuminant.f()), rgb2.I()));
            }
            if (RenderIntent.f(i2, RenderIntent.f16230b.a())) {
                I = ColorSpaceKt.m(new float[]{c2[0] / c3[0], c2[1] / c3[1], c2[2] / c3[2]}, I);
            }
            return ColorSpaceKt.l(C, I);
        }

        public RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            super(rgb, rgb2, rgb, rgb2, i2, (float[]) null, (DefaultConstructorMarker) null);
            this.f16209h = rgb;
            this.f16210i = rgb2;
            this.f16211j = b(rgb, rgb2, i2);
        }
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i2);
    }

    public long a(long j2) {
        float s2 = Color.s(j2);
        float r2 = Color.r(j2);
        float p2 = Color.p(j2);
        float o2 = Color.o(j2);
        long j3 = this.f16205c.j(s2, r2, p2);
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float m2 = this.f16205c.m(s2, r2, p2);
        float[] fArr = this.f16208f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            m2 *= fArr[2];
        }
        float f2 = intBitsToFloat;
        return this.f16206d.n(f2, intBitsToFloat2, m2, o2, this.f16204b);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i2, fArr);
    }

    public Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr) {
        this.f16203a = colorSpace;
        this.f16204b = colorSpace2;
        this.f16205c = colorSpace3;
        this.f16206d = colorSpace4;
        this.f16207e = i2;
        this.f16208f = fArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Connector(androidx.compose.ui.graphics.colorspace.ColorSpace r13, androidx.compose.ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.g()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.ui.graphics.colorspace.ColorModel.f16164b
            long r3 = r2.b()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.f(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.f16213a
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.g()
            long r8 = r2.b()
            boolean r0 = androidx.compose.ui.graphics.colorspace.ColorModel.f(r4, r8)
            if (r0 == 0) goto L_0x0039
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.ui.graphics.colorspace.Illuminant.f16213a
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.b()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = f16202g
            float[] r10 = r0.b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
