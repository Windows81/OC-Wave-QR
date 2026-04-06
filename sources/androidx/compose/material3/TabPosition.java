package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class TabPosition {

    /* renamed from: a  reason: collision with root package name */
    public final float f11290a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11291b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11292c;

    public /* synthetic */ TabPosition(float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4);
    }

    public final float a() {
        return this.f11292c;
    }

    public final float b() {
        return this.f11290a;
    }

    public final float c() {
        return Dp.m(this.f11290a + this.f11291b);
    }

    public final float d() {
        return this.f11291b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.o(this.f11290a, tabPosition.f11290a) && Dp.o(this.f11291b, tabPosition.f11291b) && Dp.o(this.f11292c, tabPosition.f11292c);
    }

    public int hashCode() {
        return (((Dp.p(this.f11290a) * 31) + Dp.p(this.f11291b)) * 31) + Dp.p(this.f11292c);
    }

    public String toString() {
        return "TabPosition(left=" + Dp.r(this.f11290a) + ", right=" + Dp.r(c()) + ", width=" + Dp.r(this.f11291b) + ", contentWidth=" + Dp.r(this.f11292c) + ')';
    }

    public TabPosition(float f2, float f3, float f4) {
        this.f11290a = f2;
        this.f11291b = f3;
        this.f11292c = f4;
    }
}
