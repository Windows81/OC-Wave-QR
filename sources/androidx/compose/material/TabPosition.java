package androidx.compose.material;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TabPosition {

    /* renamed from: a  reason: collision with root package name */
    public final float f8680a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8681b;

    public /* synthetic */ TabPosition(float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3);
    }

    public final float a() {
        return this.f8680a;
    }

    public final float b() {
        return Dp.m(this.f8680a + this.f8681b);
    }

    public final float c() {
        return this.f8681b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.o(this.f8680a, tabPosition.f8680a) && Dp.o(this.f8681b, tabPosition.f8681b);
    }

    public int hashCode() {
        return (Dp.p(this.f8680a) * 31) + Dp.p(this.f8681b);
    }

    public String toString() {
        return "TabPosition(left=" + Dp.r(this.f8680a) + ", right=" + Dp.r(b()) + ", width=" + Dp.r(this.f8681b) + ')';
    }

    public TabPosition(float f2, float f3) {
        this.f8680a = f2;
        this.f8681b = f3;
    }
}
