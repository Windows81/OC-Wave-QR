package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2580d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final DurationBasedAnimationSpec f2581a;

    /* renamed from: b  reason: collision with root package name */
    public final RepeatMode f2582b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2583c;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, repeatMode, j2);
    }

    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.f2581a.a(twoWayConverter), this.f2582b, this.f2583c, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        return Intrinsics.d(infiniteRepeatableSpec.f2581a, this.f2581a) && infiniteRepeatableSpec.f2582b == this.f2582b && StartOffset.e(infiniteRepeatableSpec.f2583c, this.f2583c);
    }

    public int hashCode() {
        return (((this.f2581a.hashCode() * 31) + this.f2582b.hashCode()) * 31) + StartOffset.f(this.f2583c);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.f2581a = durationBasedAnimationSpec;
        this.f2582b = repeatMode;
        this.f2583c = j2;
    }
}
