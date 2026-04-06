package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final float f2865a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2866b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VectorizedFloatAnimationSpec f2867c;

    public VectorizedSpringSpec(float f2, float f3, Animations animations) {
        this.f2865a = f2;
        this.f2866b = f3;
        this.f2867c = new VectorizedFloatAnimationSpec(animations);
    }

    public boolean a() {
        return this.f2867c.a();
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2867c.b(animationVector, animationVector2, animationVector3);
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2867c.c(j2, animationVector, animationVector2, animationVector3);
    }

    public AnimationVector e(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2867c.e(animationVector, animationVector2, animationVector3);
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2867c.f(j2, animationVector, animationVector2, animationVector3);
    }

    public VectorizedSpringSpec(float f2, float f3, AnimationVector animationVector) {
        this(f2, f3, VectorizedAnimationSpecKt.f(animationVector, f2, f3));
    }
}
