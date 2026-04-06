package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
final class FixedIntInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final int f3900b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3901c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3902d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3903e;

    public FixedIntInsets(int i2, int i3, int i4, int i5) {
        this.f3900b = i2;
        this.f3901c = i3;
        this.f3902d = i4;
        this.f3903e = i5;
    }

    public int a(Density density) {
        return this.f3901c;
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return this.f3902d;
    }

    public int c(Density density) {
        return this.f3903e;
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return this.f3900b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedIntInsets)) {
            return false;
        }
        FixedIntInsets fixedIntInsets = (FixedIntInsets) obj;
        return this.f3900b == fixedIntInsets.f3900b && this.f3901c == fixedIntInsets.f3901c && this.f3902d == fixedIntInsets.f3902d && this.f3903e == fixedIntInsets.f3903e;
    }

    public int hashCode() {
        return (((((this.f3900b * 31) + this.f3901c) * 31) + this.f3902d) * 31) + this.f3903e;
    }

    public String toString() {
        return "Insets(left=" + this.f3900b + ", top=" + this.f3901c + ", right=" + this.f3902d + ", bottom=" + this.f3903e + ')';
    }
}
