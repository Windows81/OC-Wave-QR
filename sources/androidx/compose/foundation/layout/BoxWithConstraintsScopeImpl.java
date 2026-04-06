package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {

    /* renamed from: a  reason: collision with root package name */
    public final Density f3806a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3807b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ BoxScopeInstance f3808c;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j2);
    }

    public Modifier a(Modifier modifier) {
        return this.f3808c.a(modifier);
    }

    public long d() {
        return this.f3807b;
    }

    public float e() {
        return Constraints.h(d()) ? this.f3806a.D(Constraints.l(d())) : Dp.f19144A.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return Intrinsics.d(this.f3806a, boxWithConstraintsScopeImpl.f3806a) && Constraints.f(this.f3807b, boxWithConstraintsScopeImpl.f3807b);
    }

    public Modifier g(Modifier modifier, Alignment alignment) {
        return this.f3808c.g(modifier, alignment);
    }

    public int hashCode() {
        return (this.f3806a.hashCode() * 31) + Constraints.o(this.f3807b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f3806a + ", constraints=" + Constraints.q(this.f3807b) + ')';
    }

    public BoxWithConstraintsScopeImpl(Density density, long j2) {
        this.f3806a = density;
        this.f3807b = j2;
        this.f3808c = BoxScopeInstance.f3797a;
    }
}
