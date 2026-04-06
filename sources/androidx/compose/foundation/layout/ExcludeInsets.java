package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
final class ExcludeInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsets f3889b;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f3890c;

    public ExcludeInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f3889b = windowInsets;
        this.f3890c = windowInsets2;
    }

    public int a(Density density) {
        return RangesKt.e(this.f3889b.a(density) - this.f3890c.a(density), 0);
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return RangesKt.e(this.f3889b.b(density, layoutDirection) - this.f3890c.b(density, layoutDirection), 0);
    }

    public int c(Density density) {
        return RangesKt.e(this.f3889b.c(density) - this.f3890c.c(density), 0);
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return RangesKt.e(this.f3889b.d(density, layoutDirection) - this.f3890c.d(density, layoutDirection), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return Intrinsics.d(excludeInsets.f3889b, this.f3889b) && Intrinsics.d(excludeInsets.f3890c, this.f3890c);
    }

    public int hashCode() {
        return (this.f3889b.hashCode() * 31) + this.f3890c.hashCode();
    }

    public String toString() {
        return '(' + this.f3889b + " - " + this.f3890c + ')';
    }
}
