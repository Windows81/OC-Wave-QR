package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public long X;
    public Shape Y;
    public boolean Z;
    public RenderEffect a0;
    public long b0;
    public long c0;
    public int d0;
    public Function1 e0;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, j2, shape, z2, renderEffect, j3, j4, i2);
    }

    public final float B() {
        return this.V;
    }

    public boolean D2() {
        return false;
    }

    public final float K() {
        return this.R;
    }

    public final void L(long j2) {
        this.b0 = j2;
    }

    public final long N1() {
        return this.X;
    }

    public final float O() {
        return this.W;
    }

    public final float Q() {
        return this.Q;
    }

    public final void Q1(long j2) {
        this.X = j2;
    }

    public final void R(boolean z2) {
        this.Z = z2;
    }

    public final float S() {
        return this.T;
    }

    public final void T(long j2) {
        this.c0 = j2;
    }

    public final float Y() {
        return this.O;
    }

    public final float a3() {
        return this.P;
    }

    public final long b3() {
        return this.b0;
    }

    public final boolean c3() {
        return this.Z;
    }

    public final void d(float f2) {
        this.P = f2;
    }

    public final int d3() {
        return this.d0;
    }

    public final void e(float f2) {
        this.U = f2;
    }

    public final RenderEffect e3() {
        return this.a0;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c02 = measurable.c0(j2);
        return MeasureScope.R1(measureScope, c02.L0(), c02.C0(), (Map) null, new SimpleGraphicsLayerModifier$measure$1(c02, this), 4, (Object) null);
    }

    public final float f3() {
        return this.S;
    }

    public final void g(float f2) {
        this.V = f2;
    }

    public final Shape g3() {
        return this.Y;
    }

    public final void h(float f2) {
        this.R = f2;
    }

    public final long h3() {
        return this.c0;
    }

    public final void i(float f2) {
        this.O = f2;
    }

    public final void i3() {
        NodeCoordinator V2 = DelegatableNodeKt.j(this, NodeKind.a(2)).V2();
        if (V2 != null) {
            V2.P3(this.e0, true);
        }
    }

    public final void j(float f2) {
        this.N = f2;
    }

    public final void k(RenderEffect renderEffect) {
        this.a0 = renderEffect;
    }

    public final void l(float f2) {
        this.Q = f2;
    }

    public final void m(float f2) {
        this.W = f2;
    }

    public final void n(float f2) {
        this.T = f2;
    }

    public final float o() {
        return this.N;
    }

    public final void p(float f2) {
        this.S = f2;
    }

    public final void s1(Shape shape) {
        this.Y = shape;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.N + ", scaleY=" + this.O + ", alpha = " + this.P + ", translationX=" + this.Q + ", translationY=" + this.R + ", shadowElevation=" + this.S + ", rotationX=" + this.T + ", rotationY=" + this.U + ", rotationZ=" + this.V + ", cameraDistance=" + this.W + ", transformOrigin=" + TransformOrigin.i(this.X) + ", shape=" + this.Y + ", clip=" + this.Z + ", renderEffect=" + this.a0 + ", ambientShadowColor=" + Color.u(this.b0) + ", spotShadowColor=" + Color.u(this.c0) + ", compositingStrategy=" + CompositingStrategy.h(this.d0) + ')';
    }

    public final void y(int i2) {
        this.d0 = i2;
    }

    public final float z() {
        return this.U;
    }

    public SimpleGraphicsLayerModifier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        this.N = f2;
        this.O = f3;
        this.P = f4;
        this.Q = f5;
        this.R = f6;
        this.S = f7;
        this.T = f8;
        this.U = f9;
        this.V = f10;
        this.W = f11;
        this.X = j2;
        this.Y = shape;
        this.Z = z2;
        this.a0 = renderEffect;
        this.b0 = j3;
        this.c0 = j4;
        this.d0 = i2;
        this.e0 = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
