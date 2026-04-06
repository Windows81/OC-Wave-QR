package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a  reason: collision with root package name */
    public final VectorizedAnimationSpec f2680a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2681b;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec vectorizedAnimationSpec, long j2) {
        this.f2680a = vectorizedAnimationSpec;
        this.f2681b = j2;
    }

    public boolean a() {
        return this.f2680a.a();
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f2680a.b(animationVector, animationVector2, animationVector3) + this.f2681b;
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2681b;
        return j2 < j3 ? animationVector3 : this.f2680a.c(j2 - j3, animationVector, animationVector2, animationVector3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.f2681b == this.f2681b && Intrinsics.d(startDelayVectorizedAnimationSpec.f2680a, this.f2680a);
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j3 = this.f2681b;
        return j2 < j3 ? animationVector : this.f2680a.f(j2 - j3, animationVector, animationVector2, animationVector3);
    }

    public int hashCode() {
        return (this.f2680a.hashCode() * 31) + Long.hashCode(this.f2681b);
    }
}
