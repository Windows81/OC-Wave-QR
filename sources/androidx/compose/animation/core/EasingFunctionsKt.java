package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class EasingFunctionsKt {

    /* renamed from: A  reason: collision with root package name */
    public static final Easing f2536A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);

    /* renamed from: B  reason: collision with root package name */
    public static final Easing f2537B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    public static final Easing C = new a();
    public static final Easing D = new b();
    public static final Easing E = new c();
    public static final Easing F = new d();
    public static final Easing G = new e();
    public static final Easing H = new f();

    /* renamed from: a  reason: collision with root package name */
    public static final Easing f2538a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    public static final Easing f2539b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final Easing f2540c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final Easing f2541d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    public static final Easing f2542e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final Easing f2543f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    public static final Easing f2544g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    public static final Easing f2545h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);

    /* renamed from: i  reason: collision with root package name */
    public static final Easing f2546i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);

    /* renamed from: j  reason: collision with root package name */
    public static final Easing f2547j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);

    /* renamed from: k  reason: collision with root package name */
    public static final Easing f2548k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);

    /* renamed from: l  reason: collision with root package name */
    public static final Easing f2549l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);

    /* renamed from: m  reason: collision with root package name */
    public static final Easing f2550m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);

    /* renamed from: n  reason: collision with root package name */
    public static final Easing f2551n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);

    /* renamed from: o  reason: collision with root package name */
    public static final Easing f2552o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);

    /* renamed from: p  reason: collision with root package name */
    public static final Easing f2553p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);

    /* renamed from: q  reason: collision with root package name */
    public static final Easing f2554q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    /* renamed from: r  reason: collision with root package name */
    public static final Easing f2555r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    /* renamed from: s  reason: collision with root package name */
    public static final Easing f2556s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    /* renamed from: t  reason: collision with root package name */
    public static final Easing f2557t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);

    /* renamed from: u  reason: collision with root package name */
    public static final Easing f2558u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    /* renamed from: v  reason: collision with root package name */
    public static final Easing f2559v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);

    /* renamed from: w  reason: collision with root package name */
    public static final Easing f2560w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);

    /* renamed from: x  reason: collision with root package name */
    public static final Easing f2561x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);

    /* renamed from: y  reason: collision with root package name */
    public static final Easing f2562y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);

    /* renamed from: z  reason: collision with root package name */
    public static final Easing f2563z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    public static final float g(float f2) {
        return ((float) 1) - F.a(1.0f - f2);
    }

    public static final float h(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        float f3 = f2 * 10.0f;
        return (float) (((double) (-((float) Math.pow((double) 2.0f, (double) (f3 - 10.0f))))) * Math.sin(((double) (f3 - 10.75f)) * 2.0943951023931953d));
    }

    public static final float i(float f2) {
        return (((double) f2) < 0.5d ? ((float) 1) - F.a(1.0f - (f2 * 2.0f)) : ((float) 1) + F.a((f2 * 2.0f) - 1.0f)) / 2.0f;
    }

    public static final float j(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f2 || f2 > 0.5f) {
            double d2 = (double) 2.0f;
            return ((float) ((((double) ((float) Math.pow(d2, (double) ((-20.0f * f2) + 10.0f)))) * Math.sin(((double) ((f2 * 20.0f) - 11.125f)) * 1.3962634015954636d)) / d2)) + 1.0f;
        }
        double d3 = (double) 2.0f;
        float f3 = f2 * 20.0f;
        return (float) ((-(((double) ((float) Math.pow(d3, (double) (f3 - 10.0f)))) * Math.sin(((double) (f3 - 11.125f)) * 1.3962634015954636d))) / d3);
    }

    public static final float k(float f2) {
        float f3;
        float f4;
        if (f2 < 0.36363637f) {
            return 7.5625f * f2 * f2;
        }
        if (f2 < 0.72727275f) {
            float f5 = f2 - 0.54545456f;
            f3 = 7.5625f * f5 * f5;
            f4 = 0.75f;
        } else if (f2 < 0.90909094f) {
            float f6 = f2 - 0.8181818f;
            f3 = 7.5625f * f6 * f6;
            f4 = 0.9375f;
        } else {
            float f7 = f2 - 0.95454544f;
            f3 = 7.5625f * f7 * f7;
            f4 = 0.984375f;
        }
        return f3 + f4;
    }

    public static final float l(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 == 1.0f) {
            return 1.0f;
        }
        return (float) ((((double) ((float) Math.pow((double) 2.0f, (double) (-10.0f * f2)))) * Math.sin(((double) ((f2 * 10.0f) - 0.75f)) * 2.0943951023931953d)) + ((double) 1.0f));
    }

    public static final Easing m() {
        return D;
    }
}
