package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata
public final class LightingColorFilter extends ColorFilter {

    /* renamed from: c  reason: collision with root package name */
    public final long f16046c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16047d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.n(this.f16046c, lightingColorFilter.f16046c) && Color.n(this.f16047d, lightingColorFilter.f16047d);
    }

    public int hashCode() {
        return (Color.t(this.f16046c) * 31) + Color.t(this.f16047d);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + Color.u(this.f16046c) + ", add=" + Color.u(this.f16047d) + ')';
    }
}
