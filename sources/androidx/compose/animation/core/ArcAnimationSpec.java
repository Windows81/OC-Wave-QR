package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2489a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2490b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2491c;

    /* renamed from: d  reason: collision with root package name */
    public final Easing f2492d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.d(this.f2489a, arcAnimationSpec.f2489a) && this.f2490b == arcAnimationSpec.f2490b && this.f2491c == arcAnimationSpec.f2491c) {
            return Intrinsics.d(this.f2492d, arcAnimationSpec.f2492d);
        }
        return false;
    }

    public int hashCode() {
        return (((((ArcMode.e(this.f2489a) * 31) + this.f2490b) * 31) + this.f2491c) * 31) + this.f2492d.hashCode();
    }

    public VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedKeyframesSpec(IntListKt.c(0, this.f2490b), IntObjectMapKt.a(), this.f2490b, this.f2491c, this.f2492d, this.f2489a, (DefaultConstructorMarker) null);
    }
}
