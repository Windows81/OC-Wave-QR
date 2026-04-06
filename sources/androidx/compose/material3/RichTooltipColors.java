package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class RichTooltipColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f10729a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10730b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10731c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10732d;

    public final long a() {
        return this.f10732d;
    }

    public final long b() {
        return this.f10730b;
    }

    public final long c() {
        return this.f10731c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.n(this.f10729a, richTooltipColors.f10729a) && Color.n(this.f10730b, richTooltipColors.f10730b) && Color.n(this.f10731c, richTooltipColors.f10731c) && Color.n(this.f10732d, richTooltipColors.f10732d);
    }

    public int hashCode() {
        return (((((Color.t(this.f10729a) * 31) + Color.t(this.f10730b)) * 31) + Color.t(this.f10731c)) * 31) + Color.t(this.f10732d);
    }
}
