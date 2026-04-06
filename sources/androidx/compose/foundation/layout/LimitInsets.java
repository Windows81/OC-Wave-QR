package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LimitInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsets f4082b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4083c;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i2);
    }

    public int a(Density density) {
        if (WindowInsetsSides.o(this.f4083c, WindowInsetsSides.f4266b.k())) {
            return this.f4082b.a(density);
        }
        return 0;
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.o(this.f4083c, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.f4266b.c() : WindowInsetsSides.f4266b.d())) {
            return this.f4082b.b(density, layoutDirection);
        }
        return 0;
    }

    public int c(Density density) {
        if (WindowInsetsSides.o(this.f4083c, WindowInsetsSides.f4266b.e())) {
            return this.f4082b.c(density);
        }
        return 0;
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.o(this.f4083c, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.f4266b.a() : WindowInsetsSides.f4266b.b())) {
            return this.f4082b.d(density, layoutDirection);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return Intrinsics.d(this.f4082b, limitInsets.f4082b) && WindowInsetsSides.n(this.f4083c, limitInsets.f4083c);
    }

    public int hashCode() {
        return (this.f4082b.hashCode() * 31) + WindowInsetsSides.p(this.f4083c);
    }

    public String toString() {
        return '(' + this.f4082b + " only " + WindowInsetsSides.r(this.f4083c) + ')';
    }

    public LimitInsets(WindowInsets windowInsets, int i2) {
        this.f4082b = windowInsets;
        this.f4083c = i2;
    }
}
