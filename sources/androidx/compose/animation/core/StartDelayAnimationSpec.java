package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f2678a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2679b;

    public StartDelayAnimationSpec(AnimationSpec animationSpec, long j2) {
        this.f2678a = animationSpec;
        this.f2679b = j2;
    }

    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.f2678a.a(twoWayConverter), this.f2679b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.f2679b == this.f2679b && Intrinsics.d(startDelayAnimationSpec.f2678a, this.f2678a);
    }

    public int hashCode() {
        return (this.f2678a.hashCode() * 31) + Long.hashCode(this.f2679b);
    }
}
