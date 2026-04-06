package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangeSize {

    /* renamed from: a  reason: collision with root package name */
    public final Alignment f2176a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f2177b;

    /* renamed from: c  reason: collision with root package name */
    public final FiniteAnimationSpec f2178c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2179d;

    public ChangeSize(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z2) {
        this.f2176a = alignment;
        this.f2177b = function1;
        this.f2178c = finiteAnimationSpec;
        this.f2179d = z2;
    }

    public final Alignment a() {
        return this.f2176a;
    }

    public final FiniteAnimationSpec b() {
        return this.f2178c;
    }

    public final boolean c() {
        return this.f2179d;
    }

    public final Function1 d() {
        return this.f2177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return Intrinsics.d(this.f2176a, changeSize.f2176a) && Intrinsics.d(this.f2177b, changeSize.f2177b) && Intrinsics.d(this.f2178c, changeSize.f2178c) && this.f2179d == changeSize.f2179d;
    }

    public int hashCode() {
        return (((((this.f2176a.hashCode() * 31) + this.f2177b.hashCode()) * 31) + this.f2178c.hashCode()) * 31) + Boolean.hashCode(this.f2179d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f2176a + ", size=" + this.f2177b + ", animationSpec=" + this.f2178c + ", clip=" + this.f2179d + ')';
    }
}
