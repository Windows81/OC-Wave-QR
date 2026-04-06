package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {

    /* renamed from: A  reason: collision with root package name */
    public DrawModifierNode f17298A;

    /* renamed from: z  reason: collision with root package name */
    public final CanvasDrawScope f17299z;

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.f17299z = canvasDrawScope;
    }

    public long A(float f2) {
        return this.f17299z.A(f2);
    }

    public void B0(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.B0(path, j2, f2, drawStyle, colorFilter, i2);
    }

    public float B1(float f2) {
        return this.f17299z.B1(f2);
    }

    public float D(int i2) {
        return this.f17299z.D(i2);
    }

    public void D0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.D0(j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    public void D1(List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4) {
        this.f17299z.D1(list, i2, j2, f2, i3, pathEffect, f3, colorFilter, i4);
    }

    public float E(float f2) {
        return this.f17299z.E(f2);
    }

    public DrawContext G1() {
        return this.f17299z.G1();
    }

    public void J1(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f17299z.J1(brush, j2, j3, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    public int K1(long j2) {
        return this.f17299z.K1(j2);
    }

    public void O0(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.O0(j2, f2, j3, f3, drawStyle, colorFilter, i2);
    }

    public int P1(float f2) {
        return this.f17299z.P1(f2);
    }

    public long T1() {
        return this.f17299z.T1();
    }

    public long V(long j2) {
        return this.f17299z.V(j2);
    }

    public void Y1(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        this.f17299z.Y1(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
    }

    public void a1(long j2, float f2, float f3, boolean z2, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.a1(j2, f2, f3, z2, j3, j4, f4, drawStyle, colorFilter, i2);
    }

    public void b2(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2) {
        this.f17299z.b2(j2, j3, j4, j5, drawStyle, f2, colorFilter, i2);
    }

    public long c() {
        return this.f17299z.c();
    }

    public float f2(long j2) {
        return this.f17299z.f2(j2);
    }

    public float getDensity() {
        return this.f17299z.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f17299z.getLayoutDirection();
    }

    public void l1(GraphicsLayer graphicsLayer, long j2, Function1 function1) {
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        long j3 = j2;
        graphicsLayer2.G(this, getLayoutDirection(), j3, new LayoutNodeDrawScope$record$1(this, this.f17298A, function1));
    }

    public void p1(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.p1(brush, j2, j3, j4, f2, drawStyle, colorFilter, i2);
    }

    public final void q(Canvas canvas, long j2, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        int a2 = NodeKind.a(4);
        Modifier.Node node2 = node;
        MutableVector mutableVector = null;
        while (node2 != null) {
            if (node2 instanceof DrawModifierNode) {
                t(canvas, j2, nodeCoordinator, (DrawModifierNode) node2, graphicsLayer);
            } else if ((node2.A2() & a2) != 0 && (node2 instanceof DelegatingNode)) {
                int i2 = 0;
                for (Modifier.Node a3 = ((DelegatingNode) node2).a3(); a3 != null; a3 = a3.w2()) {
                    if ((a3.A2() & a2) != 0) {
                        i2++;
                        if (i2 == 1) {
                            node2 = a3;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node2 != null) {
                                mutableVector.d(node2);
                                node2 = null;
                            }
                            mutableVector.d(a3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            node2 = DelegatableNodeKt.h(mutableVector);
        }
    }

    public void q2() {
        Canvas j2 = G1().j();
        DrawModifierNode drawModifierNode = this.f17298A;
        if (drawModifierNode != null) {
            Modifier.Node a2 = LayoutNodeDrawScopeKt.b(drawModifierNode);
            if (a2 != null) {
                int a3 = NodeKind.a(4);
                MutableVector mutableVector = null;
                while (a2 != null) {
                    if (a2 instanceof DrawModifierNode) {
                        u((DrawModifierNode) a2, j2, G1().h());
                    } else if ((a2.A2() & a3) != 0 && (a2 instanceof DelegatingNode)) {
                        int i2 = 0;
                        for (Modifier.Node a32 = ((DelegatingNode) a2).a3(); a32 != null; a32 = a32.w2()) {
                            if ((a32.A2() & a3) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    a2 = a32;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (a2 != null) {
                                        mutableVector.d(a2);
                                        a2 = null;
                                    }
                                    mutableVector.d(a32);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    a2 = DelegatableNodeKt.h(mutableVector);
                }
                return;
            }
            NodeCoordinator j3 = DelegatableNodeKt.j(drawModifierNode, NodeKind.a(4));
            if (j3.U2() == drawModifierNode.M()) {
                j3 = j3.V2();
                Intrinsics.f(j3);
            }
            j3.v3(j2, G1().h());
            return;
        }
        InlineClassHelperKt.d("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new KotlinNothingValueException();
    }

    public long r(float f2) {
        return this.f17299z.r(f2);
    }

    public void r0(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.r0(imageBitmap, j2, f2, drawStyle, colorFilter, i2);
    }

    public long s(long j2) {
        return this.f17299z.s(j2);
    }

    public final void t(Canvas canvas, long j2, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = drawModifierNode;
        DrawModifierNode drawModifierNode3 = this.f17298A;
        this.f17298A = drawModifierNode2;
        CanvasDrawScope canvasDrawScope = this.f17299z;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.G1().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.G1().getLayoutDirection();
        Canvas j3 = canvasDrawScope.G1().j();
        long c2 = canvasDrawScope.G1().c();
        GraphicsLayer h2 = canvasDrawScope.G1().h();
        DrawContext G1 = canvasDrawScope.G1();
        G1.a(nodeCoordinator);
        G1.d(layoutDirection);
        Canvas canvas2 = canvas;
        G1.i(canvas);
        G1.f(j2);
        G1.g(graphicsLayer);
        canvas.o();
        try {
            drawModifierNode2.U(this);
            canvas.t();
            DrawContext G12 = canvasDrawScope.G1();
            G12.a(density);
            G12.d(layoutDirection2);
            G12.i(j3);
            G12.f(c2);
            G12.g(h2);
            this.f17298A = drawModifierNode3;
        } catch (Throwable th) {
            Throwable th2 = th;
            canvas.t();
            DrawContext G13 = canvasDrawScope.G1();
            G13.a(density);
            G13.d(layoutDirection2);
            G13.i(j3);
            G13.f(c2);
            G13.g(h2);
            throw th2;
        }
    }

    public final void u(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator j2 = DelegatableNodeKt.j(drawModifierNode, NodeKind.a(4));
        j2.X1().m0().t(canvas, IntSizeKt.e(j2.a()), j2, drawModifierNode, graphicsLayer);
    }

    public float u1() {
        return this.f17299z.u1();
    }

    public float v(long j2) {
        return this.f17299z.v(j2);
    }

    public void w0(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.w0(brush, j2, j3, f2, drawStyle, colorFilter, i2);
    }

    public void y1(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        this.f17299z.y1(path, brush, f2, drawStyle, colorFilter, i2);
    }

    public void z0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3) {
        this.f17299z.z0(j2, j3, j4, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
