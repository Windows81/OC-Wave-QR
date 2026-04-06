package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class FixedDpInsets implements WindowInsets {

    /* renamed from: b  reason: collision with root package name */
    public final float f3896b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3897c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3898d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3899e;

    public /* synthetic */ FixedDpInsets(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    public int a(Density density) {
        return density.P1(this.f3897c);
    }

    public int b(Density density, LayoutDirection layoutDirection) {
        return density.P1(this.f3898d);
    }

    public int c(Density density) {
        return density.P1(this.f3899e);
    }

    public int d(Density density, LayoutDirection layoutDirection) {
        return density.P1(this.f3896b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.o(this.f3896b, fixedDpInsets.f3896b) && Dp.o(this.f3897c, fixedDpInsets.f3897c) && Dp.o(this.f3898d, fixedDpInsets.f3898d) && Dp.o(this.f3899e, fixedDpInsets.f3899e);
    }

    public int hashCode() {
        return (((((Dp.p(this.f3896b) * 31) + Dp.p(this.f3897c)) * 31) + Dp.p(this.f3898d)) * 31) + Dp.p(this.f3899e);
    }

    public String toString() {
        return "Insets(left=" + Dp.r(this.f3896b) + ", top=" + Dp.r(this.f3897c) + ", right=" + Dp.r(this.f3898d) + ", bottom=" + Dp.r(this.f3899e) + ')';
    }

    public FixedDpInsets(float f2, float f3, float f4, float f5) {
        this.f3896b = f2;
        this.f3897c = f3;
        this.f3898d = f4;
        this.f3899e = f5;
    }
}
