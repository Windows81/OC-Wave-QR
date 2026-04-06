package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    public Painter N;
    public boolean O;
    public Alignment P;
    public ContentScale Q;
    public float R;
    public ColorFilter S;

    public PainterNode(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.N = painter;
        this.O = z2;
        this.P = alignment;
        this.Q = contentScale;
        this.R = f2;
        this.S = colorFilter;
    }

    public boolean D2() {
        return false;
    }

    public int I(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!c3()) {
            return intrinsicMeasurable.a0(i2);
        }
        long f3 = f3(ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null));
        return Math.max(Constraints.n(f3), intrinsicMeasurable.a0(i2));
    }

    /* JADX INFO: finally extract failed */
    public void U(ContentDrawScope contentDrawScope) {
        long k2 = this.N.k();
        long d2 = Size.d((((long) Float.floatToRawIntBits(d3(k2) ? Float.intBitsToFloat((int) (k2 & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.c() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(e3(k2) ? Float.intBitsToFloat((int) (k2 >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)))) << 32));
        long b2 = (Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.c() & 4294967295L)) == 0.0f) ? Size.f15876b.b() : ScaleFactorKt.a(d2, this.Q.a(d2, contentDrawScope.c()));
        long a2 = this.P.a(IntSize.c((((long) Math.round(Float.intBitsToFloat((int) (b2 & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (b2 >> 32)))) << 32)), IntSize.c((((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.c() & 4294967295L)))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float k3 = (float) IntOffset.k(a2);
        float l2 = (float) IntOffset.l(a2);
        contentDrawScope.G1().e().d(k3, l2);
        try {
            this.N.j(contentDrawScope, b2, this.R, this.S);
            contentDrawScope.G1().e().d(-k3, -l2);
            contentDrawScope.q2();
        } catch (Throwable th) {
            contentDrawScope.G1().e().d(-k3, -l2);
            throw th;
        }
    }

    public int Z(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!c3()) {
            return intrinsicMeasurable.q0(i2);
        }
        long f3 = f3(ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m(f3), intrinsicMeasurable.q0(i2));
    }

    public final long Z2(long j2) {
        if (!c3()) {
            return j2;
        }
        long d2 = Size.d((((long) Float.floatToRawIntBits(!e3(this.N.k()) ? Float.intBitsToFloat((int) (j2 >> 32)) : Float.intBitsToFloat((int) (this.N.k() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!d3(this.N.k()) ? Float.intBitsToFloat((int) (j2 & 4294967295L)) : Float.intBitsToFloat((int) (this.N.k() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j2 & 4294967295L)) == 0.0f) ? Size.f15876b.b() : ScaleFactorKt.a(d2, this.Q.a(d2, j2));
    }

    public final Painter a3() {
        return this.N;
    }

    public final boolean b3() {
        return this.O;
    }

    public final boolean c3() {
        return this.O && this.N.k() != 9205357640488583168L;
    }

    public final void d(float f2) {
        this.R = f2;
    }

    public final boolean d3(long j2) {
        return !Size.f(j2, Size.f15876b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean e3(long j2) {
        return !Size.f(j2, Size.f15876b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(f3(j2));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new PainterNode$measure$1(c0), 4, (Object) null);
    }

    public final long f3(long j2) {
        boolean z2 = false;
        boolean z3 = Constraints.h(j2) && Constraints.g(j2);
        if (Constraints.j(j2) && Constraints.i(j2)) {
            z2 = true;
        }
        if ((c3() || !z3) && !z2) {
            long k2 = this.N.k();
            long Z2 = Z2(Size.d((((long) Float.floatToRawIntBits((float) ConstraintsKt.g(j2, e3(k2) ? Math.round(Float.intBitsToFloat((int) (k2 >> 32))) : Constraints.n(j2)))) << 32) | (((long) Float.floatToRawIntBits((float) ConstraintsKt.f(j2, d3(k2) ? Math.round(Float.intBitsToFloat((int) (k2 & 4294967295L))) : Constraints.m(j2)))) & 4294967295L)));
            return Constraints.d(j2, ConstraintsKt.g(j2, Math.round(Float.intBitsToFloat((int) (Z2 >> 32)))), 0, ConstraintsKt.f(j2, Math.round(Float.intBitsToFloat((int) (Z2 & 4294967295L)))), 0, 10, (Object) null);
        }
        return Constraints.d(j2, Constraints.l(j2), 0, Constraints.k(j2), 0, 10, (Object) null);
    }

    public final void g3(Alignment alignment) {
        this.P = alignment;
    }

    public final void h3(ColorFilter colorFilter) {
        this.S = colorFilter;
    }

    public final void i3(ContentScale contentScale) {
        this.Q = contentScale;
    }

    public final void j3(Painter painter) {
        this.N = painter;
    }

    public final void k3(boolean z2) {
        this.O = z2;
    }

    public int t(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!c3()) {
            return intrinsicMeasurable.C(i2);
        }
        long f3 = f3(ConstraintsKt.b(0, i2, 0, 0, 13, (Object) null));
        return Math.max(Constraints.m(f3), intrinsicMeasurable.C(i2));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.N + ", sizeToIntrinsics=" + this.O + ", alignment=" + this.P + ", alpha=" + this.R + ", colorFilter=" + this.S + ')';
    }

    public int w(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!c3()) {
            return intrinsicMeasurable.Z(i2);
        }
        long f3 = f3(ConstraintsKt.b(0, 0, 0, i2, 7, (Object) null));
        return Math.max(Constraints.n(f3), intrinsicMeasurable.Z(i2));
    }
}
