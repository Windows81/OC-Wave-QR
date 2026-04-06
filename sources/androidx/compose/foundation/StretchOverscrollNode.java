package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata
final class StretchOverscrollNode extends DelegatingNode implements DrawModifierNode {
    public final AndroidEdgeEffectOverscrollEffect P;
    public final EdgeEffectWrapper Q;
    public RenderNode R;

    public StretchOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper) {
        this.P = androidEdgeEffectOverscrollEffect;
        this.Q = edgeEffectWrapper;
        Z2(delegatableNode);
    }

    public void U(ContentDrawScope contentDrawScope) {
        boolean z2;
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        this.P.m(contentDrawScope.c());
        Canvas d2 = AndroidCanvas_androidKt.d(contentDrawScope.G1().j());
        this.P.f().getValue();
        if (Size.k(contentDrawScope.c())) {
            contentDrawScope.q2();
        } else if (!d2.isHardwareAccelerated()) {
            this.Q.f();
            contentDrawScope.q2();
        } else {
            float B1 = contentDrawScope2.B1(ClipScrollableContainerKt.b());
            EdgeEffectWrapper edgeEffectWrapper = this.Q;
            boolean m3 = m3();
            boolean l3 = l3();
            if (m3 && l3) {
                boolean unused = k3().setPosition(0, 0, d2.getWidth(), d2.getHeight());
            } else if (m3) {
                boolean unused2 = k3().setPosition(0, 0, d2.getWidth() + (MathKt.d(B1) * 2), d2.getHeight());
            } else if (l3) {
                boolean unused3 = k3().setPosition(0, 0, d2.getWidth(), d2.getHeight() + (MathKt.d(B1) * 2));
            } else {
                contentDrawScope.q2();
                return;
            }
            RecordingCanvas a2 = k3().beginRecording();
            if (edgeEffectWrapper.t()) {
                EdgeEffect j2 = edgeEffectWrapper.j();
                h3(j2, a2);
                j2.finish();
            }
            if (edgeEffectWrapper.s()) {
                EdgeEffect i2 = edgeEffectWrapper.i();
                z2 = g3(i2, a2);
                if (edgeEffectWrapper.u()) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (this.P.e() & 4294967295L));
                    EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.f3052a;
                    edgeEffectCompat.e(edgeEffectWrapper.j(), edgeEffectCompat.c(i2), ((float) 1) - intBitsToFloat);
                }
            } else {
                z2 = false;
            }
            if (edgeEffectWrapper.A()) {
                EdgeEffect n2 = edgeEffectWrapper.n();
                f3(n2, a2);
                n2.finish();
            }
            if (edgeEffectWrapper.z()) {
                EdgeEffect m2 = edgeEffectWrapper.m();
                z2 = i3(m2, a2) || z2;
                if (edgeEffectWrapper.B()) {
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (this.P.e() >> 32));
                    EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.f3052a;
                    edgeEffectCompat2.e(edgeEffectWrapper.n(), edgeEffectCompat2.c(m2), intBitsToFloat2);
                }
            }
            if (edgeEffectWrapper.w()) {
                EdgeEffect l2 = edgeEffectWrapper.l();
                g3(l2, a2);
                l2.finish();
            }
            if (edgeEffectWrapper.v()) {
                EdgeEffect k2 = edgeEffectWrapper.k();
                z2 = h3(k2, a2) || z2;
                if (edgeEffectWrapper.x()) {
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (this.P.e() & 4294967295L));
                    EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.f3052a;
                    edgeEffectCompat3.e(edgeEffectWrapper.l(), edgeEffectCompat3.c(k2), intBitsToFloat3);
                }
            }
            if (edgeEffectWrapper.q()) {
                EdgeEffect h2 = edgeEffectWrapper.h();
                i3(h2, a2);
                h2.finish();
            }
            if (edgeEffectWrapper.p()) {
                EdgeEffect g2 = edgeEffectWrapper.g();
                boolean z3 = f3(g2, a2) || z2;
                if (edgeEffectWrapper.r()) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (this.P.e() >> 32));
                    EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.f3052a;
                    edgeEffectCompat4.e(edgeEffectWrapper.h(), edgeEffectCompat4.c(g2), ((float) 1) - intBitsToFloat4);
                }
                z2 = z3;
            }
            if (z2) {
                this.P.g();
            }
            float f2 = l3 ? 0.0f : B1;
            if (m3) {
                B1 = 0.0f;
            }
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            androidx.compose.ui.graphics.Canvas b2 = AndroidCanvas_androidKt.b(a2);
            long c2 = contentDrawScope.c();
            Density density = contentDrawScope.G1().getDensity();
            LayoutDirection layoutDirection2 = contentDrawScope.G1().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas j3 = contentDrawScope.G1().j();
            long c3 = contentDrawScope.G1().c();
            GraphicsLayer h3 = contentDrawScope.G1().h();
            DrawContext G1 = contentDrawScope.G1();
            G1.a(contentDrawScope2);
            G1.d(layoutDirection);
            G1.i(b2);
            G1.f(c2);
            G1.g((GraphicsLayer) null);
            b2.o();
            try {
                contentDrawScope.G1().e().d(f2, B1);
                contentDrawScope.q2();
                float f3 = -f2;
                float f4 = -B1;
                contentDrawScope.G1().e().d(f3, f4);
                b2.t();
                DrawContext G12 = contentDrawScope.G1();
                G12.a(density);
                G12.d(layoutDirection2);
                G12.i(j3);
                G12.f(c3);
                G12.g(h3);
                k3().endRecording();
                int save = d2.save();
                d2.translate(f3, f4);
                d2.drawRenderNode(k3());
                d2.restoreToCount(save);
            } catch (Throwable th) {
                b2.t();
                DrawContext G13 = contentDrawScope.G1();
                G13.a(density);
                G13.d(layoutDirection2);
                G13.i(j3);
                G13.f(c3);
                G13.g(h3);
                throw th;
            }
        }
    }

    public final boolean f3(EdgeEffect edgeEffect, Canvas canvas) {
        return j3(180.0f, edgeEffect, canvas);
    }

    public final boolean g3(EdgeEffect edgeEffect, Canvas canvas) {
        return j3(270.0f, edgeEffect, canvas);
    }

    public final boolean h3(EdgeEffect edgeEffect, Canvas canvas) {
        return j3(90.0f, edgeEffect, canvas);
    }

    public final boolean i3(EdgeEffect edgeEffect, Canvas canvas) {
        return j3(0.0f, edgeEffect, canvas);
    }

    public final boolean j3(float f2, EdgeEffect edgeEffect, Canvas canvas) {
        if (f2 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f2);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode k3() {
        RenderNode renderNode = this.R;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a2 = j.a("AndroidEdgeEffectOverscrollEffect");
        this.R = a2;
        return a2;
    }

    public final boolean l3() {
        EdgeEffectWrapper edgeEffectWrapper = this.Q;
        return edgeEffectWrapper.s() || edgeEffectWrapper.t() || edgeEffectWrapper.v() || edgeEffectWrapper.w();
    }

    public final boolean m3() {
        EdgeEffectWrapper edgeEffectWrapper = this.Q;
        return edgeEffectWrapper.z() || edgeEffectWrapper.A() || edgeEffectWrapper.p() || edgeEffectWrapper.q();
    }
}
