package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2635a;

    /* renamed from: b  reason: collision with root package name */
    public final DurationBasedAnimationSpec f2636b;

    /* renamed from: c  reason: collision with root package name */
    public final RepeatMode f2637c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2638d;

    public /* synthetic */ RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
        return repeatableSpec.f2635a == this.f2635a && Intrinsics.d(repeatableSpec.f2636b, this.f2636b) && repeatableSpec.f2637c == this.f2637c && StartOffset.e(repeatableSpec.f2638d, this.f2638d);
    }

    public int hashCode() {
        return (((((this.f2635a * 31) + this.f2636b.hashCode()) * 31) + this.f2637c.hashCode()) * 31) + StartOffset.f(this.f2638d);
    }

    public RepeatableSpec(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2635a = i2;
        this.f2636b = durationBasedAnimationSpec;
        this.f2637c = repeatMode;
        this.f2638d = j2;
    }

    public VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedRepeatableSpec(this.f2635a, this.f2636b.a(twoWayConverter), this.f2637c, this.f2638d, (DefaultConstructorMarker) null);
    }
}
