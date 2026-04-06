package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final IntList f2832a;

    /* renamed from: b  reason: collision with root package name */
    public final IntObjectMap f2833b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2834c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2835d;

    /* renamed from: e  reason: collision with root package name */
    public final Easing f2836e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2837f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f2838g;

    /* renamed from: h  reason: collision with root package name */
    public float[] f2839h;

    /* renamed from: i  reason: collision with root package name */
    public AnimationVector f2840i;

    /* renamed from: j  reason: collision with root package name */
    public AnimationVector f2841j;

    /* renamed from: k  reason: collision with root package name */
    public AnimationVector f2842k;

    /* renamed from: l  reason: collision with root package name */
    public AnimationVector f2843l;

    /* renamed from: m  reason: collision with root package name */
    public float[] f2844m;

    /* renamed from: n  reason: collision with root package name */
    public float[] f2845n;

    /* renamed from: o  reason: collision with root package name */
    public ArcSpline f2846o;

    public /* synthetic */ VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(intList, intObjectMap, i2, i3, easing, i4);
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationVector animationVector4 = animationVector3;
        long e2 = VectorizedAnimationSpecKt.e(this, j2 / 1000000);
        if (e2 < 0) {
            return animationVector4;
        }
        k(animationVector, animationVector2, animationVector4);
        AnimationVector animationVector5 = this.f2841j;
        Intrinsics.f(animationVector5);
        int i2 = 0;
        if (this.f2846o != VectorizedAnimationSpecKt.f2812c) {
            float i3 = i((int) e2);
            float[] fArr = this.f2845n;
            this.f2846o.b(i3, fArr);
            int length = fArr.length;
            while (i2 < length) {
                animationVector5.e(i2, fArr[i2]);
                i2++;
            }
            return animationVector5;
        }
        AnimationVector animationVector6 = animationVector;
        AnimationVector animationVector7 = animationVector2;
        AnimationVector animationVector8 = animationVector3;
        AnimationVector g2 = VectorizedAnimationSpecKt.g(this, e2 - 1, animationVector6, animationVector7, animationVector8);
        AnimationVector g3 = VectorizedAnimationSpecKt.g(this, e2, animationVector6, animationVector7, animationVector8);
        int b2 = g2.b();
        while (i2 < b2) {
            animationVector5.e(i2, (g2.a(i2) - g3.a(i2)) * 1000.0f);
            i2++;
        }
        return animationVector5;
    }

    public int d() {
        return this.f2835d;
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationVector c2;
        AnimationVector c3;
        int e2 = (int) VectorizedAnimationSpecKt.e(this, j2 / 1000000);
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(e2);
        if (vectorizedKeyframeSpecElementInfo != null) {
            return vectorizedKeyframeSpecElementInfo.c();
        }
        if (e2 >= g()) {
            return animationVector2;
        }
        if (e2 <= 0) {
            return animationVector;
        }
        k(animationVector, animationVector2, animationVector3);
        AnimationVector animationVector4 = this.f2840i;
        Intrinsics.f(animationVector4);
        int i2 = 0;
        if (this.f2846o != VectorizedAnimationSpecKt.f2812c) {
            float i3 = i(e2);
            float[] fArr = this.f2844m;
            this.f2846o.a(i3, fArr);
            int length = fArr.length;
            while (i2 < length) {
                animationVector4.e(i2, fArr[i2]);
                i2++;
            }
            return animationVector4;
        }
        int h2 = h(e2);
        float j3 = j(h2, e2, true);
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(this.f2832a.e(h2));
        if (!(vectorizedKeyframeSpecElementInfo2 == null || (c3 = vectorizedKeyframeSpecElementInfo2.c()) == null)) {
            animationVector = c3;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo3 = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(this.f2832a.e(h2 + 1));
        if (!(vectorizedKeyframeSpecElementInfo3 == null || (c2 = vectorizedKeyframeSpecElementInfo3.c()) == null)) {
            animationVector2 = c2;
        }
        int b2 = animationVector4.b();
        while (i2 < b2) {
            animationVector4.e(i2, (animationVector.a(i2) * (((float) 1) - j3)) + (animationVector2.a(i2) * j3));
            i2++;
        }
        return animationVector4;
    }

    public int g() {
        return this.f2834c;
    }

    public final int h(int i2) {
        int b2 = IntList.b(this.f2832a, i2, 0, 0, 6, (Object) null);
        return b2 < -1 ? -(b2 + 2) : b2;
    }

    public final float i(int i2) {
        return j(h(i2), i2, false);
    }

    public final float j(int i2, int i3, boolean z2) {
        Easing easing;
        float f2;
        IntList intList = this.f2832a;
        if (i2 >= intList.f1784b - 1) {
            f2 = (float) i3;
        } else {
            int e2 = intList.e(i2);
            int e3 = this.f2832a.e(i2 + 1);
            if (i3 == e2) {
                f2 = (float) e2;
            } else {
                int i4 = e3 - e2;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(e2);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.b()) == null) {
                    easing = this.f2836e;
                }
                float f3 = (float) i4;
                float a2 = easing.a(((float) (i3 - e2)) / f3);
                if (z2) {
                    return a2;
                }
                f2 = (f3 * a2) + ((float) e2);
            }
        }
        return f2 / ((float) 1000);
    }

    public final void k(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        float[] fArr;
        boolean z2 = this.f2846o != VectorizedAnimationSpecKt.f2812c;
        if (this.f2840i == null) {
            this.f2840i = AnimationVectorsKt.g(animationVector);
            this.f2841j = AnimationVectorsKt.g(animationVector3);
            int i2 = this.f2832a.f1784b;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = ((float) this.f2832a.e(i3)) / ((float) 1000);
            }
            this.f2839h = fArr2;
            int i4 = this.f2832a.f1784b;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(this.f2832a.e(i5));
                int a2 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.a() : this.f2837f;
                if (!ArcMode.d(a2, ArcMode.f2493b.a())) {
                    z2 = true;
                }
                iArr[i5] = a2;
            }
            this.f2838g = iArr;
        }
        if (z2) {
            if (this.f2846o == VectorizedAnimationSpecKt.f2812c || !Intrinsics.d(this.f2842k, animationVector) || !Intrinsics.d(this.f2843l, animationVector2)) {
                this.f2842k = animationVector;
                this.f2843l = animationVector2;
                int b2 = (animationVector.b() % 2) + animationVector.b();
                this.f2844m = new float[b2];
                this.f2845n = new float[b2];
                int i6 = this.f2832a.f1784b;
                float[][] fArr3 = new float[i6][];
                for (int i7 = 0; i7 < i6; i7++) {
                    int e2 = this.f2832a.e(i7);
                    VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo2 = (VectorizedKeyframeSpecElementInfo) this.f2833b.b(e2);
                    if (e2 == 0 && vectorizedKeyframeSpecElementInfo2 == null) {
                        fArr = new float[b2];
                        for (int i8 = 0; i8 < b2; i8++) {
                            fArr[i8] = animationVector.a(i8);
                        }
                    } else if (e2 == g() && vectorizedKeyframeSpecElementInfo2 == null) {
                        fArr = new float[b2];
                        for (int i9 = 0; i9 < b2; i9++) {
                            fArr[i9] = animationVector2.a(i9);
                        }
                    } else {
                        Intrinsics.f(vectorizedKeyframeSpecElementInfo2);
                        AnimationVector c2 = vectorizedKeyframeSpecElementInfo2.c();
                        float[] fArr4 = new float[b2];
                        for (int i10 = 0; i10 < b2; i10++) {
                            fArr4[i10] = c2.a(i10);
                        }
                        fArr = fArr4;
                    }
                    fArr3[i7] = fArr;
                }
                this.f2846o = new ArcSpline(this.f2838g, this.f2839h, fArr3);
            }
        }
    }

    public VectorizedKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i2, int i3, Easing easing, int i4) {
        this.f2832a = intList;
        this.f2833b = intObjectMap;
        this.f2834c = i2;
        this.f2835d = i3;
        this.f2836e = easing;
        this.f2837f = i4;
        this.f2838g = VectorizedAnimationSpecKt.f2810a;
        this.f2839h = VectorizedAnimationSpecKt.f2811b;
        this.f2844m = VectorizedAnimationSpecKt.f2811b;
        this.f2845n = VectorizedAnimationSpecKt.f2811b;
        this.f2846o = VectorizedAnimationSpecKt.f2812c;
    }
}
