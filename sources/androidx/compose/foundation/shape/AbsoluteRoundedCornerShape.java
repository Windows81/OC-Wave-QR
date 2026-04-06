package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbsoluteRoundedCornerShape extends CornerBasedShape {
    public AbsoluteRoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public Outline e(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(SizeKt.c(j2));
        }
        return new Outline.Rounded(RoundRectKt.c(SizeKt.c(j2), CornerRadius.b((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), CornerRadius.b((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), CornerRadius.b((((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), CornerRadius.b((((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteRoundedCornerShape)) {
            return false;
        }
        AbsoluteRoundedCornerShape absoluteRoundedCornerShape = (AbsoluteRoundedCornerShape) obj;
        return Intrinsics.d(i(), absoluteRoundedCornerShape.i()) && Intrinsics.d(h(), absoluteRoundedCornerShape.h()) && Intrinsics.d(f(), absoluteRoundedCornerShape.f()) && Intrinsics.d(g(), absoluteRoundedCornerShape.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public AbsoluteRoundedCornerShape c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteRoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "AbsoluteRoundedCornerShape(topLeft = " + i() + ", topRight = " + h() + ", bottomRight = " + f() + ", bottomLeft = " + g() + ')';
    }
}
