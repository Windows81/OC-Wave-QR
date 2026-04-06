package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class ChipColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9395a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9396b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9397c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9398d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9399e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9400f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9401g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9402h;

    public final long a(boolean z2) {
        return z2 ? this.f9397c : this.f9401g;
    }

    public final long b(boolean z2) {
        return z2 ? this.f9398d : this.f9402h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        return Color.n(this.f9395a, chipColors.f9395a) && Color.n(this.f9396b, chipColors.f9396b) && Color.n(this.f9397c, chipColors.f9397c) && Color.n(this.f9398d, chipColors.f9398d) && Color.n(this.f9399e, chipColors.f9399e) && Color.n(this.f9400f, chipColors.f9400f) && Color.n(this.f9401g, chipColors.f9401g) && Color.n(this.f9402h, chipColors.f9402h);
    }

    public int hashCode() {
        return (((((((((((((Color.t(this.f9395a) * 31) + Color.t(this.f9396b)) * 31) + Color.t(this.f9397c)) * 31) + Color.t(this.f9398d)) * 31) + Color.t(this.f9399e)) * 31) + Color.t(this.f9400f)) * 31) + Color.t(this.f9401g)) * 31) + Color.t(this.f9402h);
    }
}
