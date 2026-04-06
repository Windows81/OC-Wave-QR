package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final VectorizedDurationBasedAnimationSpec f2825a;

    /* renamed from: b  reason: collision with root package name */
    public final RepeatMode f2826b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2827c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2828d;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    private final long h(long j2) {
        long j3 = this.f2828d;
        if (j2 + j3 <= 0) {
            return 0;
        }
        long j4 = j2 + j3;
        long j5 = this.f2827c;
        long j6 = j4 / j5;
        return (this.f2826b == RepeatMode.Restart || j6 % ((long) 2) == 0) ? j4 - (j6 * j5) : ((j6 + 1) * j5) - j4;
    }

    private final AnimationVector i(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2828d;
        long j4 = this.f2827c;
        return j2 + j3 > j4 ? this.f2825a.c(j4 - j3, animationVector, animationVector3, animationVector2) : animationVector2;
    }

    public boolean a() {
        return true;
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Long.MAX_VALUE;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2825a.c(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2825a.f(h(j2), animationVector, animationVector2, i(j2, animationVector, animationVector3, animationVector2));
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2825a = vectorizedDurationBasedAnimationSpec;
        this.f2826b = repeatMode;
        this.f2827c = ((long) (vectorizedDurationBasedAnimationSpec.d() + vectorizedDurationBasedAnimationSpec.g())) * 1000000;
        this.f2828d = j2 * 1000000;
    }
}
