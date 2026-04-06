package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class WideNavigationRailColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f11734a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11735b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11736c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11737d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11738e;

    public final long a() {
        return this.f11734a;
    }

    public final long b() {
        return this.f11735b;
    }

    public final long c() {
        return this.f11736c;
    }

    public final long d() {
        return this.f11738e;
    }

    public final long e() {
        return this.f11737d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WideNavigationRailColors)) {
            return false;
        }
        WideNavigationRailColors wideNavigationRailColors = (WideNavigationRailColors) obj;
        return Color.n(this.f11734a, wideNavigationRailColors.f11734a) && Color.n(this.f11735b, wideNavigationRailColors.f11735b) && Color.n(this.f11736c, wideNavigationRailColors.f11736c) && Color.n(this.f11737d, wideNavigationRailColors.f11737d);
    }

    public int hashCode() {
        return (((((((Color.t(this.f11734a) * 31) + Color.t(this.f11735b)) * 31) + Color.t(this.f11736c)) * 31) + Color.t(this.f11737d)) * 31) + Color.t(this.f11738e);
    }
}
