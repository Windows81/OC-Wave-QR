package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a  reason: collision with root package name */
    public final float f2675a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2676b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2677c;

    public SpringSpec(float f2, float f3, Object obj) {
        this.f2675a = f2;
        this.f2676b = f3;
        this.f2677c = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) obj;
        return springSpec.f2675a == this.f2675a && springSpec.f2676b == this.f2676b && Intrinsics.d(springSpec.f2677c, this.f2677c);
    }

    public final float f() {
        return this.f2675a;
    }

    public final float g() {
        return this.f2676b;
    }

    public final Object h() {
        return this.f2677c;
    }

    public int hashCode() {
        Object obj = this.f2677c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f2675a)) * 31) + Float.hashCode(this.f2676b);
    }

    /* renamed from: i */
    public VectorizedSpringSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedSpringSpec(this.f2675a, this.f2676b, AnimationSpecKt.b(twoWayConverter, this.f2677c));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpringSpec(float f2, float f3, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? null : obj);
    }
}
