package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Scale {

    /* renamed from: a  reason: collision with root package name */
    public final float f2297a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2298b;

    /* renamed from: c  reason: collision with root package name */
    public final FiniteAnimationSpec f2299c;

    public /* synthetic */ Scale(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, j2, finiteAnimationSpec);
    }

    public final FiniteAnimationSpec a() {
        return this.f2299c;
    }

    public final float b() {
        return this.f2297a;
    }

    public final long c() {
        return this.f2298b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) obj;
        return Float.compare(this.f2297a, scale.f2297a) == 0 && TransformOrigin.e(this.f2298b, scale.f2298b) && Intrinsics.d(this.f2299c, scale.f2299c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f2297a) * 31) + TransformOrigin.h(this.f2298b)) * 31) + this.f2299c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f2297a + ", transformOrigin=" + TransformOrigin.i(this.f2298b) + ", animationSpec=" + this.f2299c + ')';
    }

    public Scale(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f2297a = f2;
        this.f2298b = j2;
        this.f2299c = finiteAnimationSpec;
    }
}
