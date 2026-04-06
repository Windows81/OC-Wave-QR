package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final FloatDecayAnimationSpec f2820a;

    /* renamed from: b  reason: collision with root package name */
    public AnimationVector f2821b;

    /* renamed from: c  reason: collision with root package name */
    public AnimationVector f2822c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationVector f2823d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2824e;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f2820a = floatDecayAnimationSpec;
        this.f2824e = floatDecayAnimationSpec.a();
    }

    public float a() {
        return this.f2824e;
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2822c == null) {
            this.f2822c = AnimationVectorsKt.g(animationVector);
        }
        AnimationVector animationVector3 = this.f2822c;
        if (animationVector3 == null) {
            Intrinsics.y("velocityVector");
            animationVector3 = null;
        }
        int b2 = animationVector3.b();
        long j2 = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            j2 = Math.max(j2, this.f2820a.c(animationVector.a(i2), animationVector2.a(i2)));
        }
        return j2;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2822c == null) {
            this.f2822c = AnimationVectorsKt.g(animationVector);
        }
        AnimationVector animationVector3 = this.f2822c;
        if (animationVector3 == null) {
            Intrinsics.y("velocityVector");
            animationVector3 = null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.f2822c;
            if (animationVector4 == null) {
                Intrinsics.y("velocityVector");
                animationVector4 = null;
            }
            animationVector4.e(i2, this.f2820a.b(j2, animationVector.a(i2), animationVector2.a(i2)));
        }
        AnimationVector animationVector5 = this.f2822c;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.y("velocityVector");
        return null;
    }

    public AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2823d == null) {
            this.f2823d = AnimationVectorsKt.g(animationVector);
        }
        AnimationVector animationVector3 = this.f2823d;
        if (animationVector3 == null) {
            Intrinsics.y("targetVector");
            animationVector3 = null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.f2823d;
            if (animationVector4 == null) {
                Intrinsics.y("targetVector");
                animationVector4 = null;
            }
            animationVector4.e(i2, this.f2820a.d(animationVector.a(i2), animationVector2.a(i2)));
        }
        AnimationVector animationVector5 = this.f2823d;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.y("targetVector");
        return null;
    }

    public AnimationVector e(long j2, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.f2821b == null) {
            this.f2821b = AnimationVectorsKt.g(animationVector);
        }
        AnimationVector animationVector3 = this.f2821b;
        if (animationVector3 == null) {
            Intrinsics.y("valueVector");
            animationVector3 = null;
        }
        int b2 = animationVector3.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector4 = this.f2821b;
            if (animationVector4 == null) {
                Intrinsics.y("valueVector");
                animationVector4 = null;
            }
            animationVector4.e(i2, this.f2820a.e(j2, animationVector.a(i2), animationVector2.a(i2)));
        }
        AnimationVector animationVector5 = this.f2821b;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.y("valueVector");
        return null;
    }
}
