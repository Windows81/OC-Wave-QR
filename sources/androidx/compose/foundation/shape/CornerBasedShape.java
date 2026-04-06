package androidx.compose.foundation.shape;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public abstract class CornerBasedShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final CornerSize f5450a;

    /* renamed from: b  reason: collision with root package name */
    public final CornerSize f5451b;

    /* renamed from: c  reason: collision with root package name */
    public final CornerSize f5452c;

    /* renamed from: d  reason: collision with root package name */
    public final CornerSize f5453d;

    public CornerBasedShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        this.f5450a = cornerSize;
        this.f5451b = cornerSize2;
        this.f5452c = cornerSize3;
        this.f5453d = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape d(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                cornerSize = cornerBasedShape.f5450a;
            }
            if ((i2 & 2) != 0) {
                cornerSize2 = cornerBasedShape.f5451b;
            }
            if ((i2 & 4) != 0) {
                cornerSize3 = cornerBasedShape.f5452c;
            }
            if ((i2 & 8) != 0) {
                cornerSize4 = cornerBasedShape.f5453d;
            }
            return cornerBasedShape.c(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        float a2 = this.f5450a.a(j2, density);
        float a3 = this.f5451b.a(j2, density);
        float a4 = this.f5452c.a(j2, density);
        float a5 = this.f5453d.a(j2, density);
        float h2 = Size.h(j2);
        float f2 = a2 + a5;
        if (f2 > h2) {
            float f3 = h2 / f2;
            a2 *= f3;
            a5 *= f3;
        }
        float f4 = a5;
        float f5 = a3 + a4;
        if (f5 > h2) {
            float f6 = h2 / f5;
            a3 *= f6;
            a4 *= f6;
        }
        if (!(a2 >= 0.0f && a3 >= 0.0f && a4 >= 0.0f && f4 >= 0.0f)) {
            InlineClassHelperKt.a("Corner size in Px can't be negative(topStart = " + a2 + ", topEnd = " + a3 + ", bottomEnd = " + a4 + ", bottomStart = " + f4 + ")!");
        }
        return e(j2, a2, a3, a4, f4, layoutDirection);
    }

    public final CornerBasedShape b(CornerSize cornerSize) {
        return c(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public abstract CornerBasedShape c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4);

    public abstract Outline e(long j2, float f2, float f3, float f4, float f5, LayoutDirection layoutDirection);

    public final CornerSize f() {
        return this.f5452c;
    }

    public final CornerSize g() {
        return this.f5453d;
    }

    public final CornerSize h() {
        return this.f5451b;
    }

    public final CornerSize i() {
        return this.f5450a;
    }
}
