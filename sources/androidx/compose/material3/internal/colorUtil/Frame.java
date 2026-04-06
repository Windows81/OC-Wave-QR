package androidx.compose.material3.internal.colorUtil;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class Frame {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f12409k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f12410l = 8;

    /* renamed from: m  reason: collision with root package name */
    public static final Frame f12411m;

    /* renamed from: a  reason: collision with root package name */
    public final float f12412a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12413b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12414c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12415d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12416e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12417f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f12418g;

    /* renamed from: h  reason: collision with root package name */
    public final float f12419h;

    /* renamed from: i  reason: collision with root package name */
    public final float f12420i;

    /* renamed from: j  reason: collision with root package name */
    public final float f12421j;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Frame a(float[] fArr, float f2, float f3, float f4, boolean z2) {
            float f5 = f2;
            CamUtils camUtils = CamUtils.f12402a;
            float[][] b2 = camUtils.b();
            float f6 = fArr[0];
            float[] fArr2 = b2[0];
            float f7 = fArr[1];
            float f8 = fArr[2];
            float f9 = (fArr2[0] * f6) + (fArr2[1] * f7) + (fArr2[2] * f8);
            float[] fArr3 = b2[1];
            float f10 = (fArr3[0] * f6) + (fArr3[1] * f7) + (fArr3[2] * f8);
            float[] fArr4 = b2[2];
            float f11 = (f6 * fArr4[0]) + (f7 * fArr4[1]) + (f8 * fArr4[2]);
            float f12 = (f4 / 10.0f) + 0.8f;
            float a2 = ((double) f12) >= 0.9d ? Frame_androidKt.b(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : Frame_androidKt.b(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
            float exp = z2 ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f5) - 42.0f) / 92.0f))) * 0.2777778f)) * f12;
            double d2 = (double) exp;
            if (d2 > 1.0d) {
                exp = 1.0f;
            } else if (d2 < 0.0d) {
                exp = 0.0f;
            }
            float[] fArr5 = {(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
            float f13 = 1.0f / ((5.0f * f5) + 1.0f);
            float f14 = f13 * f13 * f13 * f13;
            float f15 = 1.0f - f14;
            float cbrt = (f14 * f5) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f5) * 5.0d)));
            float c2 = ((float) camUtils.c((double) f3)) / fArr[1];
            double d3 = (double) c2;
            float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
            float pow = 0.725f / ((float) Math.pow(d3, (double) 0.2f));
            double d4 = (double) 0.42f;
            float[] fArr6 = {(float) Math.pow((double) (((fArr5[0] * cbrt) * f9) / 100.0f), d4), (float) Math.pow((double) (((fArr5[1] * cbrt) * f10) / 100.0f), d4), (float) Math.pow((double) (((fArr5[2] * cbrt) * f11) / 100.0f), d4)};
            float f16 = fArr6[0];
            float f17 = (f16 * 400.0f) / (f16 + 27.13f);
            float f18 = fArr6[1];
            float f19 = (f18 * 400.0f) / (f18 + 27.13f);
            float f20 = fArr6[2];
            float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
            return new Frame(c2, ((fArr7[0] * 2.0f) + fArr7[1] + (fArr7[2] * 0.05f)) * pow, pow, pow, a2, f12, fArr5, cbrt, (float) Math.pow((double) cbrt, (double) 0.25f), sqrt, (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f12409k = companion;
        CamUtils camUtils = CamUtils.f12402a;
        f12411m = companion.a(camUtils.a(), (float) ((camUtils.c(50.0d) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public /* synthetic */ Frame(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, fArr, f8, f9, f10);
    }

    public Frame(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f12412a = f2;
        this.f12413b = f3;
        this.f12414c = f4;
        this.f12415d = f5;
        this.f12416e = f6;
        this.f12417f = f7;
        this.f12418g = fArr;
        this.f12419h = f8;
        this.f12420i = f9;
        this.f12421j = f10;
    }
}
