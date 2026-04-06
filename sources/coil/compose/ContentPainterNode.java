package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
public final class ContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode {
    public Painter N;
    public Alignment O;
    public ContentScale P;
    public float Q;
    public ColorFilter R;

    public ContentPainterNode(Painter painter, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.N = painter;
        this.O = alignment;
        this.P = contentScale;
        this.Q = f2;
        this.R = colorFilter;
    }

    private final long Z2(long j2) {
        if (Size.k(j2)) {
            return Size.f15876b.b();
        }
        long k2 = this.N.k();
        if (k2 == Size.f15876b.a()) {
            return j2;
        }
        float i2 = Size.i(k2);
        if (Float.isInfinite(i2) || Float.isNaN(i2)) {
            i2 = Size.i(j2);
        }
        float g2 = Size.g(k2);
        if (Float.isInfinite(g2) || Float.isNaN(g2)) {
            g2 = Size.g(j2);
        }
        long a2 = SizeKt.a(i2, g2);
        long a3 = this.P.a(a2, j2);
        float c2 = ScaleFactor.c(a3);
        if (Float.isInfinite(c2) || Float.isNaN(c2)) {
            return j2;
        }
        float d2 = ScaleFactor.d(a3);
        return (Float.isInfinite(d2) || Float.isNaN(d2)) ? j2 : ScaleFactorKt.b(a3, a2);
    }

    private final long b3(long j2) {
        float f2;
        float f3;
        int m2;
        boolean j3 = Constraints.j(j2);
        boolean i2 = Constraints.i(j2);
        if (j3 && i2) {
            return j2;
        }
        boolean z2 = Constraints.h(j2) && Constraints.g(j2);
        long k2 = this.N.k();
        if (k2 != Size.f15876b.a()) {
            if (!z2 || (!j3 && !i2)) {
                float i3 = Size.i(k2);
                float g2 = Size.g(k2);
                f3 = (Float.isInfinite(i3) || Float.isNaN(i3)) ? (float) Constraints.n(j2) : UtilsKt.b(j2, i3);
                if (Float.isInfinite(g2) || Float.isNaN(g2)) {
                    m2 = Constraints.m(j2);
                } else {
                    f2 = UtilsKt.a(j2, g2);
                    long Z2 = Z2(SizeKt.a(f3, f2));
                    return Constraints.d(j2, ConstraintsKt.g(j2, MathKt.d(Size.i(Z2))), 0, ConstraintsKt.f(j2, MathKt.d(Size.g(Z2))), 0, 10, (Object) null);
                }
            } else {
                f3 = (float) Constraints.l(j2);
                m2 = Constraints.k(j2);
            }
            f2 = (float) m2;
            long Z22 = Z2(SizeKt.a(f3, f2));
            return Constraints.d(j2, ConstraintsKt.g(j2, MathKt.d(Size.i(Z22))), 0, ConstraintsKt.f(j2, MathKt.d(Size.g(Z22))), 0, 10, (Object) null);
        } else if (!z2) {
            return j2;
        } else {
            return Constraints.d(j2, Constraints.l(j2), 0, Constraints.k(j2), 0, 10, (Object) null);
        }
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.N.k() == Size.f15876b.a()) {
            return intrinsicMeasurable.a0(i2);
        }
        int a0 = intrinsicMeasurable.a0(Constraints.k(b3(ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null))));
        return Math.max(MathKt.d(Size.i(Z2(SizeKt.a((float) a0, (float) i2)))), a0);
    }

    public void U(ContentDrawScope contentDrawScope) {
        long Z2 = Z2(contentDrawScope.c());
        long a2 = this.O.a(UtilsKt.h(Z2), UtilsKt.h(contentDrawScope.c()), contentDrawScope.getLayoutDirection());
        float d2 = (float) IntOffset.d(a2);
        float e2 = (float) IntOffset.e(a2);
        contentDrawScope.G1().e().d(d2, e2);
        this.N.j(contentDrawScope, Z2, this.Q, this.R);
        contentDrawScope.G1().e().d(-d2, -e2);
        contentDrawScope.q2();
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.N.k() == Size.f15876b.a()) {
            return intrinsicMeasurable.q0(i2);
        }
        int q0 = intrinsicMeasurable.q0(Constraints.l(b3(ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null))));
        return Math.max(MathKt.d(Size.g(Z2(SizeKt.a((float) i2, (float) q0)))), q0);
    }

    public final Painter a3() {
        return this.N;
    }

    public final void c3(Alignment alignment) {
        this.O = alignment;
    }

    public final void d(float f2) {
        this.Q = f2;
    }

    public final void d3(ColorFilter colorFilter) {
        this.R = colorFilter;
    }

    public final void e3(ContentScale contentScale) {
        this.P = contentScale;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(b3(j2));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new ContentPainterNode$measure$1(c0), 4, (Object) null);
    }

    public final void f3(Painter painter) {
        this.N = painter;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.N.k() == Size.f15876b.a()) {
            return intrinsicMeasurable.C(i2);
        }
        int C = intrinsicMeasurable.C(Constraints.l(b3(ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null))));
        return Math.max(MathKt.d(Size.g(Z2(SizeKt.a((float) i2, (float) C)))), C);
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.N.k() == Size.f15876b.a()) {
            return intrinsicMeasurable.Z(i2);
        }
        int Z = intrinsicMeasurable.Z(Constraints.k(b3(ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null))));
        return Math.max(MathKt.d(Size.i(Z2(SizeKt.a((float) Z, (float) i2)))), Z);
    }
}
