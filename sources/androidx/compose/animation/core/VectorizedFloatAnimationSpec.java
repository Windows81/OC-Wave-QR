package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final Animations f2815a;

    /* renamed from: b  reason: collision with root package name */
    public AnimationVector f2816b;

    /* renamed from: c  reason: collision with root package name */
    public AnimationVector f2817c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationVector f2818d;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.f2815a = animations;
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int b2 = animationVector.b();
        long j2 = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            j2 = Math.max(j2, this.f2815a.get(i2).c(animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)));
        }
        return j2;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2817c == null) {
            this.f2817c = AnimationVectorsKt.g(animationVector3);
        }
        AnimationVector animationVector4 = this.f2817c;
        if (animationVector4 == null) {
            Intrinsics.y("velocityVector");
            animationVector4 = null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.f2817c;
            if (animationVector5 == null) {
                Intrinsics.y("velocityVector");
                animationVector5 = null;
            }
            animationVector5.e(i2, this.f2815a.get(i2).b(j2, animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)));
        }
        AnimationVector animationVector6 = this.f2817c;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.y("velocityVector");
        return null;
    }

    public AnimationVector e(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2818d == null) {
            this.f2818d = AnimationVectorsKt.g(animationVector3);
        }
        AnimationVector animationVector4 = this.f2818d;
        if (animationVector4 == null) {
            Intrinsics.y("endVelocityVector");
            animationVector4 = null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.f2818d;
            if (animationVector5 == null) {
                Intrinsics.y("endVelocityVector");
                animationVector5 = null;
            }
            animationVector5.e(i2, this.f2815a.get(i2).d(animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)));
        }
        AnimationVector animationVector6 = this.f2818d;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.y("endVelocityVector");
        return null;
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.f2816b == null) {
            this.f2816b = AnimationVectorsKt.g(animationVector);
        }
        AnimationVector animationVector4 = this.f2816b;
        if (animationVector4 == null) {
            Intrinsics.y("valueVector");
            animationVector4 = null;
        }
        int b2 = animationVector4.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector5 = this.f2816b;
            if (animationVector5 == null) {
                Intrinsics.y("valueVector");
                animationVector5 = null;
            }
            animationVector5.e(i2, this.f2815a.get(i2).e(j2, animationVector.a(i2), animationVector2.a(i2), animationVector3.a(i2)));
        }
        AnimationVector animationVector6 = this.f2816b;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.y("valueVector");
        return null;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this((Animations) new Animations() {
            public FloatAnimationSpec get(int i2) {
                return floatAnimationSpec;
            }
        });
    }
}
