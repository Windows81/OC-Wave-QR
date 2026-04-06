package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class NavigationBarItemColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10395a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10396b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10397c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10398d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10399e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10400f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10401g;

    public final long a() {
        return this.f10397c;
    }

    public final long b(boolean z2, boolean z3) {
        return !z3 ? this.f10400f : z2 ? this.f10395a : this.f10398d;
    }

    public final long c(boolean z2, boolean z3) {
        return !z3 ? this.f10401g : z2 ? this.f10396b : this.f10399e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationBarItemColors)) {
            return false;
        }
        NavigationBarItemColors navigationBarItemColors = (NavigationBarItemColors) obj;
        return Color.n(this.f10395a, navigationBarItemColors.f10395a) && Color.n(this.f10398d, navigationBarItemColors.f10398d) && Color.n(this.f10396b, navigationBarItemColors.f10396b) && Color.n(this.f10399e, navigationBarItemColors.f10399e) && Color.n(this.f10397c, navigationBarItemColors.f10397c) && Color.n(this.f10400f, navigationBarItemColors.f10400f) && Color.n(this.f10401g, navigationBarItemColors.f10401g);
    }

    public int hashCode() {
        return (((((((((((Color.t(this.f10395a) * 31) + Color.t(this.f10398d)) * 31) + Color.t(this.f10396b)) * 31) + Color.t(this.f10399e)) * 31) + Color.t(this.f10397c)) * 31) + Color.t(this.f10400f)) * 31) + Color.t(this.f10401g);
    }
}
