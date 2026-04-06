package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final IntList f2847a;

    /* renamed from: b  reason: collision with root package name */
    public final IntObjectMap f2848b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2849c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2850d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2851e;

    /* renamed from: f  reason: collision with root package name */
    public AnimationVector f2852f;

    /* renamed from: g  reason: collision with root package name */
    public AnimationVector f2853g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2854h;

    /* renamed from: i  reason: collision with root package name */
    public MonoSpline f2855i;

    /* renamed from: j  reason: collision with root package name */
    public float[][] f2856j;

    /* renamed from: k  reason: collision with root package name */
    public AnimationVector f2857k;

    /* renamed from: l  reason: collision with root package name */
    public AnimationVector f2858l;

    public VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, float f2) {
        this.f2847a = intList;
        this.f2848b = intObjectMap;
        this.f2849c = i2;
        this.f2850d = i3;
        this.f2851e = f2;
    }

    private final int h(int i2) {
        int b2 = IntList.b(this.f2847a, i2, 0, 0, 6, (Object) null);
        return b2 < -1 ? -(b2 + 2) : b2;
    }

    private final void k(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        float[] fArr;
        if (this.f2852f == null) {
            this.f2852f = AnimationVectorsKt.g(animationVector);
            this.f2853g = AnimationVectorsKt.g(animationVector3);
            int i2 = this.f2847a.f1784b;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = ((float) this.f2847a.e(i3)) / ((float) 1000);
            }
            this.f2854h = fArr2;
        }
        if (this.f2855i == null || !Intrinsics.d(this.f2857k, animationVector) || !Intrinsics.d(this.f2858l, animationVector2)) {
            boolean d2 = Intrinsics.d(this.f2857k, animationVector);
            boolean d3 = Intrinsics.d(this.f2858l, animationVector2);
            this.f2857k = animationVector;
            this.f2858l = animationVector2;
            int b2 = animationVector.b();
            float[][] fArr3 = this.f2856j;
            if (fArr3 == null) {
                int i4 = this.f2847a.f1784b;
                fArr3 = new float[i4][];
                for (int i5 = 0; i5 < i4; i5++) {
                    int e2 = this.f2847a.e(i5);
                    Pair pair = (Pair) this.f2848b.b(e2);
                    if (e2 == 0 && pair == null) {
                        fArr = new float[b2];
                        for (int i6 = 0; i6 < b2; i6++) {
                            fArr[i6] = animationVector.a(i6);
                        }
                    } else if (e2 == g() && pair == null) {
                        fArr = new float[b2];
                        for (int i7 = 0; i7 < b2; i7++) {
                            fArr[i7] = animationVector2.a(i7);
                        }
                    } else {
                        Intrinsics.f(pair);
                        AnimationVector animationVector4 = (AnimationVector) pair.e();
                        float[] fArr4 = new float[b2];
                        for (int i8 = 0; i8 < b2; i8++) {
                            fArr4[i8] = animationVector4.a(i8);
                        }
                        fArr = fArr4;
                    }
                    fArr3[i5] = fArr;
                }
                this.f2856j = fArr3;
            } else {
                if (!d2 && !this.f2848b.a(0)) {
                    int b3 = IntList.b(this.f2847a, 0, 0, 0, 6, (Object) null);
                    float[] fArr5 = new float[b2];
                    for (int i9 = 0; i9 < b2; i9++) {
                        fArr5[i9] = animationVector.a(i9);
                    }
                    fArr3[b3] = fArr5;
                }
                if (!d3 && !this.f2848b.a(g())) {
                    int b4 = IntList.b(this.f2847a, g(), 0, 0, 6, (Object) null);
                    float[] fArr6 = new float[b2];
                    for (int i10 = 0; i10 < b2; i10++) {
                        fArr6[i10] = animationVector2.a(i10);
                    }
                    fArr3[b4] = fArr6;
                }
            }
            float[] fArr7 = this.f2854h;
            if (fArr7 == null) {
                Intrinsics.y("times");
                fArr7 = null;
            }
            this.f2855i = new MonoSpline(fArr7, fArr3, this.f2851e);
        }
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int e2 = (int) VectorizedAnimationSpecKt.e(this, j2 / 1000000);
        k(animationVector, animationVector2, animationVector3);
        int h2 = h(e2);
        AnimationVector animationVector4 = this.f2853g;
        Intrinsics.f(animationVector4);
        MonoSpline monoSpline = this.f2855i;
        Intrinsics.f(monoSpline);
        monoSpline.b(i(h2, e2), animationVector4, h2);
        return animationVector4;
    }

    public int d() {
        return this.f2850d;
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int e2 = (int) VectorizedAnimationSpecKt.e(this, j2 / 1000000);
        Pair pair = (Pair) this.f2848b.b(e2);
        if (pair != null) {
            return (AnimationVector) pair.e();
        }
        if (e2 >= g()) {
            return animationVector2;
        }
        if (e2 <= 0) {
            return animationVector;
        }
        k(animationVector, animationVector2, animationVector3);
        int h2 = h(e2);
        AnimationVector animationVector4 = this.f2852f;
        Intrinsics.f(animationVector4);
        MonoSpline monoSpline = this.f2855i;
        Intrinsics.f(monoSpline);
        monoSpline.a(i(h2, e2), animationVector4, h2);
        return animationVector4;
    }

    public int g() {
        return this.f2849c;
    }

    public final float i(int i2, int i3) {
        float f2;
        IntList intList = this.f2847a;
        if (i2 >= intList.f1784b - 1) {
            f2 = (float) i3;
        } else {
            int e2 = intList.e(i2);
            int e3 = this.f2847a.e(i2 + 1);
            if (i3 == e2) {
                f2 = (float) e2;
            } else {
                float f3 = (float) (e3 - e2);
                return ((f3 * j(i2).a(((float) (i3 - e2)) / f3)) + ((float) e2)) / ((float) 1000);
            }
        }
        return f2 / ((float) 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = (androidx.compose.animation.core.Easing) r2.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.animation.core.Easing j(int r2) {
        /*
            r1 = this;
            androidx.collection.IntList r0 = r1.f2847a
            int r2 = r0.e(r2)
            androidx.collection.IntObjectMap r0 = r1.f2848b
            java.lang.Object r2 = r0.b(r2)
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 == 0) goto L_0x0018
            java.lang.Object r2 = r2.f()
            androidx.compose.animation.core.Easing r2 = (androidx.compose.animation.core.Easing) r2
            if (r2 != 0) goto L_0x001c
        L_0x0018:
            androidx.compose.animation.core.Easing r2 = androidx.compose.animation.core.EasingKt.e()
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedMonoSplineKeyframesSpec.j(int):androidx.compose.animation.core.Easing");
    }
}
