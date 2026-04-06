package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2670a;

    public SnapSpec(int i2) {
        this.f2670a = i2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).f2670a == this.f2670a;
    }

    public int hashCode() {
        return this.f2670a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapSpec(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2);
    }

    public VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedSnapSpec(this.f2670a);
    }
}
