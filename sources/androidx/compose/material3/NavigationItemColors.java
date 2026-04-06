package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class NavigationItemColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10455a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10456b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10457c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10458d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10459e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10460f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10461g;

    public final long a(boolean z2, boolean z3) {
        return !z3 ? this.f10461g : z2 ? this.f10456b : this.f10459e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationItemColors)) {
            return false;
        }
        NavigationItemColors navigationItemColors = (NavigationItemColors) obj;
        return Color.n(this.f10455a, navigationItemColors.f10455a) && Color.n(this.f10458d, navigationItemColors.f10458d) && Color.n(this.f10456b, navigationItemColors.f10456b) && Color.n(this.f10459e, navigationItemColors.f10459e) && Color.n(this.f10457c, navigationItemColors.f10457c) && Color.n(this.f10460f, navigationItemColors.f10460f) && Color.n(this.f10461g, navigationItemColors.f10461g);
    }

    public int hashCode() {
        return (((((((((((Color.t(this.f10455a) * 31) + Color.t(this.f10458d)) * 31) + Color.t(this.f10456b)) * 31) + Color.t(this.f10459e)) * 31) + Color.t(this.f10457c)) * 31) + Color.t(this.f10460f)) * 31) + Color.t(this.f10461g);
    }
}
