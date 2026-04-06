package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Slide {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f2404a;

    /* renamed from: b  reason: collision with root package name */
    public final FiniteAnimationSpec f2405b;

    public Slide(Function1 function1, FiniteAnimationSpec finiteAnimationSpec) {
        this.f2404a = function1;
        this.f2405b = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec a() {
        return this.f2405b;
    }

    public final Function1 b() {
        return this.f2404a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return Intrinsics.d(this.f2404a, slide.f2404a) && Intrinsics.d(this.f2405b, slide.f2405b);
    }

    public int hashCode() {
        return (this.f2404a.hashCode() * 31) + this.f2405b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f2404a + ", animationSpec=" + this.f2405b + ')';
    }
}
