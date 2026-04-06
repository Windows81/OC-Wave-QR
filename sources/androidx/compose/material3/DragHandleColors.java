package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
public final class DragHandleColors {

    /* renamed from: a  reason: collision with root package name */
    public final long f9862a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9863b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9864c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleColors)) {
            return false;
        }
        DragHandleColors dragHandleColors = (DragHandleColors) obj;
        return Color.n(this.f9862a, dragHandleColors.f9862a) && Color.n(this.f9863b, dragHandleColors.f9863b) && Color.n(this.f9864c, dragHandleColors.f9864c);
    }

    public int hashCode() {
        return (((Color.t(this.f9862a) * 31) + Color.t(this.f9863b)) * 31) + Color.t(this.f9864c);
    }
}
