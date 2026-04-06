package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public final class ChipBorder {

    /* renamed from: a  reason: collision with root package name */
    public final long f9392a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9393b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9394c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.n(this.f9392a, chipBorder.f9392a) && Color.n(this.f9393b, chipBorder.f9393b) && Dp.o(this.f9394c, chipBorder.f9394c);
    }

    public int hashCode() {
        return (((Color.t(this.f9392a) * 31) + Color.t(this.f9393b)) * 31) + Dp.p(this.f9394c);
    }
}
