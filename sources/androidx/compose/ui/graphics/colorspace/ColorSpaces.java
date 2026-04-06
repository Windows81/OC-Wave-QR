package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class ColorSpaces {

    /* renamed from: A  reason: collision with root package name */
    public static final Rgb f16174A;

    /* renamed from: B  reason: collision with root package name */
    public static final ColorSpace f16175B;
    public static final ColorSpace[] C;

    /* renamed from: a  reason: collision with root package name */
    public static final ColorSpaces f16176a = new ColorSpaces();

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f16177b;

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f16178c;

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f16179d;

    /* renamed from: e  reason: collision with root package name */
    public static final TransferParameters f16180e;

    /* renamed from: f  reason: collision with root package name */
    public static final TransferParameters f16181f;

    /* renamed from: g  reason: collision with root package name */
    public static final TransferParameters f16182g;

    /* renamed from: h  reason: collision with root package name */
    public static final TransferParameters f16183h;

    /* renamed from: i  reason: collision with root package name */
    public static final Rgb f16184i;

    /* renamed from: j  reason: collision with root package name */
    public static final Rgb f16185j;

    /* renamed from: k  reason: collision with root package name */
    public static final Rgb f16186k;

    /* renamed from: l  reason: collision with root package name */
    public static final Rgb f16187l;

    /* renamed from: m  reason: collision with root package name */
    public static final Rgb f16188m;

    /* renamed from: n  reason: collision with root package name */
    public static final Rgb f16189n;

    /* renamed from: o  reason: collision with root package name */
    public static final Rgb f16190o;

    /* renamed from: p  reason: collision with root package name */
    public static final Rgb f16191p;

    /* renamed from: q  reason: collision with root package name */
    public static final Rgb f16192q;

    /* renamed from: r  reason: collision with root package name */
    public static final Rgb f16193r;

    /* renamed from: s  reason: collision with root package name */
    public static final Rgb f16194s;

    /* renamed from: t  reason: collision with root package name */
    public static final Rgb f16195t;

    /* renamed from: u  reason: collision with root package name */
    public static final Rgb f16196u;

    /* renamed from: v  reason: collision with root package name */
    public static final Rgb f16197v;

    /* renamed from: w  reason: collision with root package name */
    public static final ColorSpace f16198w;

    /* renamed from: x  reason: collision with root package name */
    public static final ColorSpace f16199x;

    /* renamed from: y  reason: collision with root package name */
    public static final Rgb f16200y;

    /* renamed from: z  reason: collision with root package name */
    public static final Rgb f16201z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f16177b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f16178c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        f16179d = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f16180e = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null);
        f16181f = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f16182g = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f16183h = transferParameters4;
        Illuminant illuminant = Illuminant.f16213a;
        float[] fArr4 = fArr;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr4, illuminant.e(), transferParameters, 0);
        f16184i = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr4, illuminant.e(), 1.0d, 0.0f, 1.0f, 1);
        f16185j = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr4, illuminant.e(), (float[]) null, new a(), new b(), -0.799f, 2.399f, transferParameters, 2);
        f16186k = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr4, illuminant.e(), 1.0d, -0.5f, 7.499f, 3);
        f16187l = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 4);
        f16188m = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.e(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 5);
        f16189n = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f16190o = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.e(), transferParameters, 7);
        f16191p = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.a(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 8);
        f16192q = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.e(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 9);
        f16193r = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.e(), 2.2d, 0.0f, 1.0f, 10);
        f16194s = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.b(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (DefaultConstructorMarker) null), 11);
        f16195t = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, illuminant.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f16196u = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f16197v = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        f16198w = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        f16199x = lab;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.e(), transferParameters2, 16);
        f16200y = rgb15;
        float[] fArr5 = fArr3;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr5, illuminant.e(), (float[]) null, new c(), new d(), 0.0f, 1.0f, transferParameters3, 17);
        f16201z = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr5, illuminant.e(), (float[]) null, new e(), new f(), 0.0f, 1.0f, transferParameters4, 18);
        f16174A = rgb17;
        Oklab oklab = new Oklab("Oklab", 19);
        f16175B = oklab;
        C = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
    }

    public static final double g(double d2) {
        return f16176a.K(f16182g, d2);
    }

    public static final double h(double d2) {
        return f16176a.J(f16182g, d2);
    }

    public static final double i(double d2) {
        return f16176a.M(f16183h, d2);
    }

    public static final double j(double d2) {
        return f16176a.L(f16183h, d2);
    }

    public static final double k(double d2) {
        return ColorSpaceKt.a(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double l(double d2) {
        return ColorSpaceKt.b(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final Rgb A() {
        return f16185j;
    }

    public final Rgb B() {
        return f16192q;
    }

    public final float[] C() {
        return f16178c;
    }

    public final ColorSpace D() {
        return f16175B;
    }

    public final Rgb E() {
        return f16195t;
    }

    public final Rgb F() {
        return f16193r;
    }

    public final Rgb G() {
        return f16184i;
    }

    public final float[] H() {
        return f16177b;
    }

    public final Rgb I() {
        return f16200y;
    }

    public final double J(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double a2 = transferParameters.a();
        double b2 = transferParameters.b();
        double c2 = transferParameters.c();
        double d5 = transferParameters.d();
        double e2 = transferParameters.e();
        double d6 = a2 * d4;
        return (transferParameters.f() + 1.0d) * d3 * (d6 <= 1.0d ? Math.pow(d6, b2) : Math.exp((d4 - e2) * c2) + d5);
    }

    public final double K(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double a2 = 1.0d / transferParameters.a();
        double b2 = 1.0d / transferParameters.b();
        double c2 = 1.0d / transferParameters.c();
        double d4 = transferParameters.d();
        double e2 = transferParameters.e();
        double f2 = (d2 * d3) / (transferParameters.f() + 1.0d);
        return d3 * (f2 <= 1.0d ? a2 * Math.pow(f2, b2) : (c2 * Math.log(f2 - d4)) + e2);
    }

    public final double L(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        return d3 * Math.pow(RangesKt.c(transferParameters.a() + (transferParameters.b() * Math.pow(d4, transferParameters.c())), 0.0d) / (transferParameters.d() + (transferParameters.e() * Math.pow(d4, transferParameters.c()))), transferParameters.f());
    }

    public final double M(TransferParameters transferParameters, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = transferParameters.d();
        double f2 = 1.0d / transferParameters.f();
        return d3 * Math.pow(Math.max((-transferParameters.a()) + (d5 * Math.pow(d4, f2)), 0.0d) / (transferParameters.b() + ((-transferParameters.e()) * Math.pow(d4, f2))), 1.0d / transferParameters.c());
    }

    public final Rgb m() {
        return f16196u;
    }

    public final Rgb n() {
        return f16197v;
    }

    public final Rgb o() {
        return f16194s;
    }

    public final Rgb p() {
        return f16189n;
    }

    public final Rgb q() {
        return f16201z;
    }

    public final Rgb r() {
        return f16174A;
    }

    public final Rgb s() {
        return f16188m;
    }

    public final ColorSpace t() {
        return f16199x;
    }

    public final ColorSpace u() {
        return f16198w;
    }

    public final ColorSpace[] v() {
        return C;
    }

    public final Rgb w() {
        return f16190o;
    }

    public final Rgb x() {
        return f16191p;
    }

    public final Rgb y() {
        return f16186k;
    }

    public final Rgb z() {
        return f16187l;
    }
}
