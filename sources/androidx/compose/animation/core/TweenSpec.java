package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2778a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2779b;

    /* renamed from: c  reason: collision with root package name */
    public final Easing f2780c;

    public TweenSpec(int i2, int i3, Easing easing) {
        this.f2778a = i2;
        this.f2779b = i3;
        this.f2780c = easing;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) obj;
        return tweenSpec.f2778a == this.f2778a && tweenSpec.f2779b == this.f2779b && Intrinsics.d(tweenSpec.f2780c, this.f2780c);
    }

    /* renamed from: f */
    public VectorizedTweenSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f2778a, this.f2779b, this.f2780c);
    }

    public int hashCode() {
        return (((this.f2778a * 31) + this.f2780c.hashCode()) * 31) + this.f2779b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TweenSpec(int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 300 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? EasingKt.d() : easing);
    }
}
