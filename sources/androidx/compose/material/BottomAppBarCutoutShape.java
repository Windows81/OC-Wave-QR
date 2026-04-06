package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BottomAppBarCutoutShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final Shape f7300a;

    /* renamed from: b  reason: collision with root package name */
    public final FabPlacement f7301b;

    public BottomAppBarCutoutShape(Shape shape, FabPlacement fabPlacement) {
        this.f7300a = shape;
        this.f7301b = fabPlacement;
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        Path a2 = AndroidPath_androidKt.a();
        Path.d(a2, new Rect(0.0f, 0.0f, Size.i(j2), Size.g(j2)), (Path.Direction) null, 2, (Object) null);
        Path a3 = AndroidPath_androidKt.a();
        b(a3, layoutDirection, density);
        a3.u(a2, a3, PathOperation.f16081b.a());
        return new Outline.Generic(a3);
    }

    public final void b(Path path, LayoutDirection layoutDirection, Density density) {
        float B1 = density.B1(AppBarKt.f7146e);
        float f2 = ((float) 2) * B1;
        long a2 = SizeKt.a(((float) this.f7301b.c()) + f2, ((float) this.f7301b.a()) + f2);
        float b2 = ((float) this.f7301b.b()) - B1;
        float i2 = b2 + Size.i(a2);
        float g2 = Size.g(a2) / 2.0f;
        OutlineKt.a(path, this.f7300a.a(a2, layoutDirection, density));
        path.v(OffsetKt.a(b2, -g2));
        if (Intrinsics.d(this.f7300a, RoundedCornerShapeKt.f())) {
            c(path, b2, i2, g2, density.B1(AppBarKt.f7147f), 0.0f);
        }
    }

    public final void c(Path path, float f2, float f3, float f4, float f5, float f6) {
        float f7 = -((float) Math.sqrt((double) ((f4 * f4) - (f6 * f6))));
        float f8 = f4 + f7;
        float f9 = f2 + f8;
        float f10 = f3 - f8;
        Pair o2 = AppBarKt.o(f7 - 1.0f, f6, f4);
        float floatValue = ((Number) o2.a()).floatValue() + f4;
        float floatValue2 = ((Number) o2.b()).floatValue() - f6;
        float f11 = f9 - f5;
        path.q(f11, 0.0f);
        path.n(f9 - 1.0f, 0.0f, f2 + floatValue, floatValue2);
        path.z(f3 - floatValue, floatValue2);
        path.n(f10 + 1.0f, 0.0f, f5 + f10, 0.0f);
        path.close();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        return Intrinsics.d(this.f7300a, bottomAppBarCutoutShape.f7300a) && Intrinsics.d(this.f7301b, bottomAppBarCutoutShape.f7301b);
    }

    public int hashCode() {
        return (this.f7300a.hashCode() * 31) + this.f7301b.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.f7300a + ", fabPlacement=" + this.f7301b + ')';
    }
}
