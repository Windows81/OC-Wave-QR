package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AddedInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsets f3712b;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f3713c;

    public AddedInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f3712b = windowInsets;
        this.f3713c = windowInsets2;
    }

    public int a(Density density) {
        return this.f3712b.a(density) + this.f3713c.a(density);
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return this.f3712b.b(density, layoutDirection) + this.f3713c.b(density, layoutDirection);
    }

    public int c(Density density) {
        return this.f3712b.c(density) + this.f3713c.c(density);
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return this.f3712b.d(density, layoutDirection) + this.f3713c.d(density, layoutDirection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedInsets)) {
            return false;
        }
        AddedInsets addedInsets = (AddedInsets) obj;
        return Intrinsics.d(addedInsets.f3712b, this.f3712b) && Intrinsics.d(addedInsets.f3713c, this.f3713c);
    }

    public int hashCode() {
        return this.f3712b.hashCode() + (this.f3713c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f3712b + " + " + this.f3713c + ')';
    }
}
