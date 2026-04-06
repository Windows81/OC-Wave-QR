package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RoundedCornerShape extends CornerBasedShape {
    public RoundedCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public Outline e(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        LayoutDirection layoutDirection2 = layoutDirection;
        if (f2 + f3 + f4 + f5 == 0.0f) {
            return new Outline.Rectangle(SizeKt.c(j2));
        }
        Rect c2 = SizeKt.c(j2);
        LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
        float f6 = layoutDirection2 == layoutDirection3 ? f2 : f3;
        long b2 = CornerRadius.b((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        float f7 = layoutDirection2 == layoutDirection3 ? f3 : f2;
        long b3 = CornerRadius.b((((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32));
        float f8 = layoutDirection2 == layoutDirection3 ? f4 : f5;
        long b4 = CornerRadius.b((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L));
        float f9 = layoutDirection2 == layoutDirection3 ? f5 : f4;
        return new Outline.Rounded(RoundRectKt.c(c2, b2, b3, b4, CornerRadius.b((((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (((long) Float.floatToRawIntBits(f9)) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
        return Intrinsics.d(i(), roundedCornerShape.i()) && Intrinsics.d(h(), roundedCornerShape.h()) && Intrinsics.d(f(), roundedCornerShape.f()) && Intrinsics.d(g(), roundedCornerShape.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public RoundedCornerShape c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new RoundedCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
