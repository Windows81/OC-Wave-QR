package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2859a;

    /* renamed from: b  reason: collision with root package name */
    public final VectorizedDurationBasedAnimationSpec f2860b;

    /* renamed from: c  reason: collision with root package name */
    public final RepeatMode f2861c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2862d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2863e;

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return (((long) this.f2859a) * this.f2862d) - this.f2863e;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2860b.c(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2860b.f(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public final long h(long j2) {
        long j3 = this.f2863e;
        if (j2 + j3 <= 0) {
            return 0;
        }
        long j4 = j2 + j3;
        long min = Math.min(j4 / this.f2862d, ((long) this.f2859a) - 1);
        return (this.f2861c == RepeatMode.Restart || min % ((long) 2) == 0) ? j4 - (min * this.f2862d) : ((min + 1) * this.f2862d) - j4;
    }

    public final AnimationVector i(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2863e;
        long j4 = this.f2862d;
        if (j2 + j3 <= j4) {
            return animationVector2;
        }
        return c(j4 - j3, animationVector, animationVector2, animationVector3);
    }

    public VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2859a = i2;
        this.f2860b = vectorizedDurationBasedAnimationSpec;
        this.f2861c = repeatMode;
        if (i2 >= 1) {
            this.f2862d = ((long) (vectorizedDurationBasedAnimationSpec.d() + vectorizedDurationBasedAnimationSpec.g())) * 1000000;
            this.f2863e = j2 * 1000000;
            return;
        }
        throw new IllegalArgumentException("Iterations count can't be less than 1");
    }
}
