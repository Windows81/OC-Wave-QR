package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public AbsoluteCutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public Outline e(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection) {
        if (f2 + f3 + f5 + f4 == 0.0f) {
            return new Outline.Rectangle(SizeKt.c(j2));
        }
        Path a2 = AndroidPath_androidKt.a();
        a2.q(0.0f, f2);
        a2.z(f2, 0.0f);
        int i2 = (int) (j2 >> 32);
        a2.z(Float.intBitsToFloat(i2) - f3, 0.0f);
        a2.z(Float.intBitsToFloat(i2), f3);
        int i3 = (int) (j2 & 4294967295L);
        a2.z(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) - f4);
        a2.z(Float.intBitsToFloat(i2) - f4, Float.intBitsToFloat(i3));
        a2.z(f5, Float.intBitsToFloat(i3));
        a2.z(0.0f, Float.intBitsToFloat(i3) - f5);
        a2.close();
        return new Outline.Generic(a2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) obj;
        return Intrinsics.d(i(), absoluteCutCornerShape.i()) && Intrinsics.d(h(), absoluteCutCornerShape.h()) && Intrinsics.d(f(), absoluteCutCornerShape.f()) && Intrinsics.d(g(), absoluteCutCornerShape.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public AbsoluteCutCornerShape c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        return new AbsoluteCutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + i() + ", topRight = " + h() + ", bottomRight = " + f() + ", bottomLeft = " + g() + ')';
    }
}
