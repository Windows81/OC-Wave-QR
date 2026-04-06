package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {
    public SharedTransitionScopeImpl N;
    public Function0 O;
    public Function2 P;
    public final MutableFloatState Q;
    public LayerWithRenderer R;

    @Metadata
    public final class LayerWithRenderer implements LayerRenderer {

        /* renamed from: z  reason: collision with root package name */
        public final GraphicsLayer f2292z;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.f2292z = graphicsLayer;
        }

        public float a() {
            return RenderInTransitionOverlayNode.this.d3();
        }

        public void b(DrawScope drawScope) {
            if (((Boolean) RenderInTransitionOverlayNode.this.b3().invoke()).booleanValue()) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                long N = renderInTransitionOverlayNode.c3().k().N(DelegatableNodeKt.m(renderInTransitionOverlayNode), Offset.f15855b.c());
                float intBitsToFloat = Float.intBitsToFloat((int) (N >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (N & 4294967295L));
                Path path = (Path) renderInTransitionOverlayNode.Z2().m(drawScope.getLayoutDirection(), DelegatableNodeKt.k(renderInTransitionOverlayNode));
                if (path != null) {
                    int b2 = ClipOp.f15971b.b();
                    DrawContext G1 = drawScope.G1();
                    long c2 = G1.c();
                    G1.j().o();
                    try {
                        G1.e().c(path, b2);
                        drawScope.G1().e().d(intBitsToFloat, intBitsToFloat2);
                        GraphicsLayerKt.a(drawScope, this.f2292z);
                        drawScope.G1().e().d(-intBitsToFloat, -intBitsToFloat2);
                        G1.j().t();
                        G1.f(c2);
                    } catch (Throwable th) {
                        G1.j().t();
                        G1.f(c2);
                        throw th;
                    }
                } else {
                    drawScope.G1().e().d(intBitsToFloat, intBitsToFloat2);
                    try {
                        GraphicsLayerKt.a(drawScope, this.f2292z);
                    } finally {
                        drawScope.G1().e().d(-intBitsToFloat, -intBitsToFloat2);
                    }
                }
            }
        }

        public final GraphicsLayer c() {
            return this.f2292z;
        }
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0 function0, float f2, Function2 function2) {
        this.N = sharedTransitionScopeImpl;
        this.O = function0;
        this.P = function2;
        this.Q = PrimitiveSnapshotStateKt.a(f2);
    }

    public void I2() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.l(this).b());
        this.N.o(layerWithRenderer);
        this.R = layerWithRenderer;
    }

    public void J2() {
        LayerWithRenderer layerWithRenderer = this.R;
        if (layerWithRenderer != null) {
            this.N.p(layerWithRenderer);
            DelegatableNodeKt.l(this).a(layerWithRenderer.c());
        }
    }

    public void U(ContentDrawScope contentDrawScope) {
        GraphicsLayer a3 = a3();
        if (a3 != null) {
            DrawScope.Z1(contentDrawScope, a3, 0, new RenderInTransitionOverlayNode$draw$1(contentDrawScope), 1, (Object) null);
            if (!((Boolean) this.O.invoke()).booleanValue()) {
                GraphicsLayerKt.a(contentDrawScope, a3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Error: layer never initialized");
    }

    public final Function2 Z2() {
        return this.P;
    }

    public final GraphicsLayer a3() {
        LayerWithRenderer layerWithRenderer = this.R;
        if (layerWithRenderer != null) {
            return layerWithRenderer.c();
        }
        return null;
    }

    public final Function0 b3() {
        return this.O;
    }

    public final SharedTransitionScopeImpl c3() {
        return this.N;
    }

    public final float d3() {
        return this.Q.c();
    }

    public final void e3(Function2 function2) {
        this.P = function2;
    }

    public final void f3(Function0 function0) {
        this.O = function0;
    }

    public final void g3(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.N = sharedTransitionScopeImpl;
    }

    public final void h3(float f2) {
        this.Q.j(f2);
    }
}
