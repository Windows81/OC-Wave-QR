package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class NavigationRailItemColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10478a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10479b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10480c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10481d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10482e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10483f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10484g;

    public final long a() {
        return this.f10480c;
    }

    public final long b(boolean z2, boolean z3) {
        return !z3 ? this.f10483f : z2 ? this.f10478a : this.f10481d;
    }

    public final long c(boolean z2, boolean z3) {
        return !z3 ? this.f10484g : z2 ? this.f10479b : this.f10482e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        return Color.n(this.f10478a, navigationRailItemColors.f10478a) && Color.n(this.f10481d, navigationRailItemColors.f10481d) && Color.n(this.f10479b, navigationRailItemColors.f10479b) && Color.n(this.f10482e, navigationRailItemColors.f10482e) && Color.n(this.f10480c, navigationRailItemColors.f10480c) && Color.n(this.f10483f, navigationRailItemColors.f10483f) && Color.n(this.f10484g, navigationRailItemColors.f10484g);
    }

    public int hashCode() {
        return (((((((((((Color.t(this.f10478a) * 31) + Color.t(this.f10481d)) * 31) + Color.t(this.f10479b)) * 31) + Color.t(this.f10482e)) * 31) + Color.t(this.f10480c)) * 31) + Color.t(this.f10483f)) * 31) + Color.t(this.f10484g);
    }
}
