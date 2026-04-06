package androidx.compose.animation.core;

import com.google.api.Endpoint;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata
public final class ArcSpline {

    /* renamed from: a  reason: collision with root package name */
    public final Arc[][] f2498a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2499b = true;

    @Metadata
    public static final class Arc {

        /* renamed from: a  reason: collision with root package name */
        public final float f2500a;

        /* renamed from: b  reason: collision with root package name */
        public final float f2501b;

        /* renamed from: c  reason: collision with root package name */
        public final float f2502c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2503d;

        /* renamed from: e  reason: collision with root package name */
        public final float f2504e;

        /* renamed from: f  reason: collision with root package name */
        public final float f2505f;

        /* renamed from: g  reason: collision with root package name */
        public float f2506g;

        /* renamed from: h  reason: collision with root package name */
        public float f2507h;

        /* renamed from: i  reason: collision with root package name */
        public float f2508i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f2509j;

        /* renamed from: k  reason: collision with root package name */
        public final float f2510k;

        /* renamed from: l  reason: collision with root package name */
        public final float f2511l;

        /* renamed from: m  reason: collision with root package name */
        public final float f2512m;

        /* renamed from: n  reason: collision with root package name */
        public final float f2513n;

        /* renamed from: o  reason: collision with root package name */
        public final float f2514o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f2515p;

        /* renamed from: q  reason: collision with root package name */
        public final float f2516q;

        /* renamed from: r  reason: collision with root package name */
        public final float f2517r;

        public Arc(int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.f2500a = f2;
            this.f2501b = f3;
            this.f2502c = f4;
            this.f2503d = f5;
            this.f2504e = f6;
            this.f2505f = f7;
            float f8 = f6 - f4;
            float f9 = f7 - f5;
            boolean z2 = false;
            boolean z3 = true;
            boolean z4 = i2 == 1 || (i2 == 4 ? f9 > 0.0f : !(i2 != 5 || f9 >= 0.0f));
            float f10 = z4 ? -1.0f : 1.0f;
            this.f2512m = f10;
            float f11 = ((float) 1) / (f3 - f2);
            this.f2510k = f11;
            this.f2509j = new float[Endpoint.TARGET_FIELD_NUMBER];
            z2 = i2 == 3 ? true : z2;
            if (z2 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
                float hypot = (float) Math.hypot((double) f9, (double) f8);
                this.f2506g = hypot;
                this.f2511l = hypot * f11;
                this.f2516q = f8 * f11;
                this.f2517r = f9 * f11;
                this.f2513n = Float.NaN;
                this.f2514o = Float.NaN;
            } else {
                this.f2513n = f8 * f10;
                this.f2514o = f9 * (-f10);
                this.f2516q = z4 ? f6 : f4;
                this.f2517r = z4 ? f5 : f7;
                c(f4, f5, f6, f7);
                this.f2511l = this.f2506g * f11;
                z3 = z2;
            }
            this.f2515p = z3;
        }

        public final void c(float f2, float f3, float f4, float f5) {
            float f6;
            float f7;
            float f8 = f4 - f2;
            float f9 = f3 - f5;
            float[] a2 = ArcSplineKt.f2518a;
            int length = a2.length - 1;
            float f10 = (float) length;
            float[] fArr = this.f2509j;
            if (1 <= length) {
                float f11 = f9;
                int i2 = 1;
                f7 = 0.0f;
                float f12 = 0.0f;
                while (true) {
                    f6 = f10;
                    double radians = (double) ((float) Math.toRadians((((double) i2) * 90.0d) / ((double) length)));
                    float sin = ((float) Math.sin(radians)) * f8;
                    float cos = ((float) Math.cos(radians)) * f9;
                    f7 += (float) Math.hypot((double) (sin - f12), (double) (cos - f11));
                    a2[i2] = f7;
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    f10 = f6;
                    f12 = sin;
                    f11 = cos;
                }
            } else {
                f6 = f10;
                f7 = 0.0f;
            }
            this.f2506g = f7;
            if (1 <= length) {
                int i3 = 1;
                while (true) {
                    a2[i3] = a2[i3] / f7;
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            int length2 = fArr.length;
            for (int i4 = 0; i4 < length2; i4++) {
                float f13 = ((float) i4) / 100.0f;
                int f14 = ArraysKt.f(a2, f13, 0, 0, 6, (Object) null);
                if (f14 >= 0) {
                    fArr[i4] = ((float) f14) / f6;
                } else if (f14 == -1) {
                    fArr[i4] = 0.0f;
                } else {
                    int i5 = -f14;
                    int i6 = i5 - 2;
                    float f15 = (float) i6;
                    float f16 = a2[i6];
                    fArr[i4] = (f15 + ((f13 - f16) / (a2[i5 - 1] - f16))) / f6;
                }
            }
        }

        public final float d() {
            float f2 = this.f2513n * this.f2508i;
            return f2 * this.f2512m * (this.f2511l / ((float) Math.hypot((double) f2, (double) ((-this.f2514o) * this.f2507h))));
        }

        public final float e() {
            float f2 = this.f2513n * this.f2508i;
            float f3 = (-this.f2514o) * this.f2507h;
            return f3 * this.f2512m * (this.f2511l / ((float) Math.hypot((double) f2, (double) f3)));
        }

        public final float f(float f2) {
            float f3 = (f2 - this.f2500a) * this.f2510k;
            float f4 = this.f2502c;
            return f4 + (f3 * (this.f2504e - f4));
        }

        public final float g(float f2) {
            float f3 = (f2 - this.f2500a) * this.f2510k;
            float f4 = this.f2503d;
            return f4 + (f3 * (this.f2505f - f4));
        }

        public final float h() {
            return this.f2500a;
        }

        public final float i() {
            return this.f2501b;
        }

        public final float j(float f2) {
            if (f2 <= 0.0f) {
                return 0.0f;
            }
            if (f2 >= 1.0f) {
                return 1.0f;
            }
            float f3 = f2 * ((float) 100);
            int i2 = (int) f3;
            float f4 = f3 - ((float) i2);
            float[] fArr = this.f2509j;
            float f5 = fArr[i2];
            return f5 + (f4 * (fArr[i2 + 1] - f5));
        }

        public final void k(float f2) {
            double j2 = (double) (j((this.f2512m == -1.0f ? this.f2501b - f2 : f2 - this.f2500a) * this.f2510k) * 1.5707964f);
            this.f2507h = (float) Math.sin(j2);
            this.f2508i = (float) Math.cos(j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r9 != 5) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r7 == 1) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[LOOP:1: B:17:0x0045->B:18:0x0047, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ArcSpline(int[] r27, float[] r28, float[][] r29) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            r26.<init>()
            r2 = 1
            r0.f2499b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L_0x0012:
            if (r6 >= r3) goto L_0x0070
            r9 = r27[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L_0x0027
            if (r9 == r2) goto L_0x0030
            if (r9 == r11) goto L_0x002e
            if (r9 == r10) goto L_0x0029
            r10 = 4
            if (r9 == r10) goto L_0x0027
            r10 = 5
            if (r9 == r10) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r8 = r10
            goto L_0x0032
        L_0x0029:
            if (r7 != r2) goto L_0x0030
            goto L_0x002e
        L_0x002c:
            r8 = r7
            goto L_0x0032
        L_0x002e:
            r7 = r11
            goto L_0x002c
        L_0x0030:
            r7 = r2
            goto L_0x002c
        L_0x0032:
            r9 = r29[r6]
            int r10 = r6 + 1
            r20 = r29[r10]
            r21 = r1[r6]
            r22 = r1[r10]
            int r12 = r9.length
            int r12 = r12 / r11
            int r13 = r9.length
            int r13 = r13 % r11
            int r11 = r12 + r13
            androidx.compose.animation.core.ArcSpline$Arc[] r15 = new androidx.compose.animation.core.ArcSpline.Arc[r11]
            r14 = r5
        L_0x0045:
            if (r14 >= r11) goto L_0x006a
            int r12 = r14 * 2
            androidx.compose.animation.core.ArcSpline$Arc r23 = new androidx.compose.animation.core.ArcSpline$Arc
            r16 = r9[r12]
            int r13 = r12 + 1
            r17 = r9[r13]
            r18 = r20[r12]
            r19 = r20[r13]
            r12 = r23
            r13 = r8
            r24 = r14
            r14 = r21
            r25 = r15
            r15 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r25[r24] = r23
            int r14 = r24 + 1
            r15 = r25
            goto L_0x0045
        L_0x006a:
            r25 = r15
            r4[r6] = r25
            r6 = r10
            goto L_0x0012
        L_0x0070:
            r0.f2498a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    public final void a(float f2, float[] fArr) {
        Arc[][] arcArr = this.f2498a;
        int length = arcArr.length - 1;
        int i2 = 0;
        float h2 = arcArr[0][0].h();
        float i3 = arcArr[length][0].i();
        int length2 = fArr.length;
        if (!this.f2499b) {
            f2 = Math.min(Math.max(f2, h2), i3);
        } else if (f2 < h2 || f2 > i3) {
            if (f2 > i3) {
                h2 = i3;
            } else {
                length = 0;
            }
            float f3 = f2 - h2;
            int i4 = 0;
            while (i2 < length2 - 1) {
                Arc arc = arcArr[length][i4];
                if (arc.f2515p) {
                    fArr[i2] = arc.f(h2) + (arc.f2516q * f3);
                    fArr[i2 + 1] = arc.g(h2) + (arc.f2517r * f3);
                } else {
                    arc.k(h2);
                    fArr[i2] = arc.f2516q + (arc.f2513n * arc.f2507h) + (arc.d() * f3);
                    fArr[i2 + 1] = arc.f2517r + (arc.f2514o * arc.f2508i) + (arc.e() * f3);
                }
                i2 += 2;
                i4++;
            }
            return;
        }
        int length3 = arcArr.length;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < length3) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < length2 - 1) {
                Arc arc2 = arcArr[i5][i7];
                if (f2 <= arc2.i()) {
                    if (arc2.f2515p) {
                        fArr[i6] = arc2.f(f2);
                        fArr[i6 + 1] = arc2.g(f2);
                    } else {
                        arc2.k(f2);
                        fArr[i6] = arc2.f2516q + (arc2.f2513n * arc2.f2507h);
                        fArr[i6 + 1] = arc2.f2517r + (arc2.f2514o * arc2.f2508i);
                    }
                    z2 = true;
                }
                i6 += 2;
                i7++;
            }
            if (!z2) {
                i5++;
            } else {
                return;
            }
        }
    }

    public final void b(float f2, float[] fArr) {
        Arc[][] arcArr = this.f2498a;
        float h2 = arcArr[0][0].h();
        float i2 = arcArr[arcArr.length - 1][0].i();
        if (f2 < h2) {
            f2 = h2;
        }
        if (f2 <= i2) {
            i2 = f2;
        }
        int length = fArr.length;
        int length2 = arcArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length2) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < length - 1) {
                Arc arc = arcArr[i3][i5];
                if (i2 <= arc.i()) {
                    if (arc.f2515p) {
                        fArr[i4] = arc.f2516q;
                        fArr[i4 + 1] = arc.f2517r;
                    } else {
                        arc.k(i2);
                        fArr[i4] = arc.d();
                        fArr[i4 + 1] = arc.e();
                    }
                    z2 = true;
                }
                i4 += 2;
                i5++;
            }
            if (!z2) {
                i3++;
            } else {
                return;
            }
        }
    }
}
