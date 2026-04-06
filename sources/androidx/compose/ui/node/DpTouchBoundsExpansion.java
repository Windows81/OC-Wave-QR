package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DpTouchBoundsExpansion {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f17248f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final float f17249a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17250b;

    /* renamed from: c  reason: collision with root package name */
    public final float f17251c;

    /* renamed from: d  reason: collision with root package name */
    public final float f17252d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17253e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f2, float f3, float f4, float f5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z2);
    }

    public final long a(Density density) {
        return TouchBoundsExpansion.d(TouchBoundsExpansion.f17451b.c(density.P1(this.f17249a), density.P1(this.f17250b), density.P1(this.f17251c), density.P1(this.f17252d), this.f17253e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.o(this.f17249a, dpTouchBoundsExpansion.f17249a) && Dp.o(this.f17250b, dpTouchBoundsExpansion.f17250b) && Dp.o(this.f17251c, dpTouchBoundsExpansion.f17251c) && Dp.o(this.f17252d, dpTouchBoundsExpansion.f17252d) && this.f17253e == dpTouchBoundsExpansion.f17253e;
    }

    public int hashCode() {
        return (((((((Dp.p(this.f17249a) * 31) + Dp.p(this.f17250b)) * 31) + Dp.p(this.f17251c)) * 31) + Dp.p(this.f17252d)) * 31) + Boolean.hashCode(this.f17253e);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + Dp.r(this.f17249a) + ", top=" + Dp.r(this.f17250b) + ", end=" + Dp.r(this.f17251c) + ", bottom=" + Dp.r(this.f17252d) + ", isLayoutDirectionAware=" + this.f17253e + ')';
    }

    public DpTouchBoundsExpansion(float f2, float f3, float f4, float f5, boolean z2) {
        this.f17249a = f2;
        this.f17250b = f3;
        this.f17251c = f4;
        this.f17252d = f5;
        this.f17253e = z2;
        boolean z3 = false;
        if (!(f2 >= 0.0f)) {
            InlineClassHelperKt.a("Left must be non-negative");
        }
        if (!(f3 >= 0.0f)) {
            InlineClassHelperKt.a("Top must be non-negative");
        }
        if (!(f4 >= 0.0f)) {
            InlineClassHelperKt.a("Right must be non-negative");
        }
        if (!(f5 >= 0.0f ? true : z3)) {
            InlineClassHelperKt.a("Bottom must be non-negative");
        }
    }
}
