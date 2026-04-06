package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

@Metadata
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2868a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2869b;

    /* renamed from: c  reason: collision with root package name */
    public final Easing f2870c;

    /* renamed from: d  reason: collision with root package name */
    public final VectorizedFloatAnimationSpec f2871d;

    public VectorizedTweenSpec(int i2, int i3, Easing easing) {
        this.f2868a = i2;
        this.f2869b = i3;
        this.f2870c = easing;
        this.f2871d = new VectorizedFloatAnimationSpec((FloatAnimationSpec) new FloatTweenSpec(g(), d(), easing));
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2871d.c(j2, animationVector, animationVector2, animationVector3);
    }

    public int d() {
        return this.f2869b;
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2871d.f(j2, animationVector, animationVector2, animationVector3);
    }

    public int g() {
        return this.f2868a;
    }
}
