package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CutCornerShape extends CornerBasedShape {
    public CutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public Outline e(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f5 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.c(j2));
        }
        Path a2 = AndroidPath_androidKt.a();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f6 = layoutDirection == layoutDirection2 ? f2 : f3;
        a2.q(0.0f, f6);
        a2.z(f6, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f2 = f3;
        }
        int i2 = (int) (j2 >> 32);
        a2.z(Float.intBitsToFloat(i2) - f2, 0.0f);
        a2.z(Float.intBitsToFloat(i2), f2);
        float f7 = layoutDirection == layoutDirection2 ? f4 : f5;
        int i3 = (int) (j2 & 4294967295L);
        a2.z(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) - f7);
        a2.z(Float.intBitsToFloat(i2) - f7, Float.intBitsToFloat(i3));
        if (layoutDirection == layoutDirection2) {
            f4 = f5;
        }
        a2.z(f4, Float.intBitsToFloat(i3));
        a2.z(0.0f, Float.intBitsToFloat(i3) - f4);
        a2.close();
        return new Outline.Generic(a2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        return Intrinsics.d(i(), cutCornerShape.i()) && Intrinsics.d(h(), cutCornerShape.h()) && Intrinsics.d(f(), cutCornerShape.f()) && Intrinsics.d(g(), cutCornerShape.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public CutCornerShape c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "CutCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
