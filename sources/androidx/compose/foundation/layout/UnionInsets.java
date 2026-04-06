package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class UnionInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsets f4197b;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f4198c;

    public UnionInsets(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.f4197b = windowInsets;
        this.f4198c = windowInsets2;
    }

    public int a(Density density) {
        return Math.max(this.f4197b.a(density), this.f4198c.a(density));
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f4197b.b(density, layoutDirection), this.f4198c.b(density, layoutDirection));
    }

    public int c(Density density) {
        return Math.max(this.f4197b.c(density), this.f4198c.c(density));
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return Math.max(this.f4197b.d(density, layoutDirection), this.f4198c.d(density, layoutDirection));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return Intrinsics.d(unionInsets.f4197b, this.f4197b) && Intrinsics.d(unionInsets.f4198c, this.f4198c);
    }

    public int hashCode() {
        return this.f4197b.hashCode() + (this.f4198c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f4197b + " ∪ " + this.f4198c + ')';
    }
}
