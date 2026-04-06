package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PaddingValuesInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final PaddingValues f4131b;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.f4131b = paddingValues;
    }

    public int a(Density density) {
        return density.P1(this.f4131b.d());
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return density.P1(this.f4131b.c(layoutDirection));
    }

    public int c(Density density) {
        return density.P1(this.f4131b.a());
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return density.P1(this.f4131b.b(layoutDirection));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesInsets)) {
            return false;
        }
        return Intrinsics.d(((PaddingValuesInsets) obj).f4131b, this.f4131b);
    }

    public int hashCode() {
        return this.f4131b.hashCode();
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float b2 = this.f4131b.b(layoutDirection);
        float d2 = this.f4131b.d();
        float c2 = this.f4131b.c(layoutDirection);
        float a2 = this.f4131b.a();
        return "PaddingValues(" + Dp.r(b2) + ", " + Dp.r(d2) + ", " + Dp.r(c2) + ", " + Dp.r(a2) + ')';
    }
}
