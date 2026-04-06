package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Fade {

    /* renamed from: a  reason: collision with root package name */
    public final float f2281a;

    /* renamed from: b  reason: collision with root package name */
    public final FiniteAnimationSpec f2282b;

    public Fade(float f2, FiniteAnimationSpec finiteAnimationSpec) {
        this.f2281a = f2;
        this.f2282b = finiteAnimationSpec;
    }

    public final float a() {
        return this.f2281a;
    }

    public final FiniteAnimationSpec b() {
        return this.f2282b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        return Float.compare(this.f2281a, fade.f2281a) == 0 && Intrinsics.d(this.f2282b, fade.f2282b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f2281a) * 31) + this.f2282b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f2281a + ", animationSpec=" + this.f2282b + ')';
    }
}
