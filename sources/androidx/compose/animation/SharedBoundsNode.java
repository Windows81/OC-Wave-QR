package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
    public SharedElementInternalState N;
    public GraphicsLayer O;
    public final ModifierLocalMap P;

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.N = sharedElementInternalState;
        this.O = sharedElementInternalState.i();
        this.P = ModifierLocalModifierNodeKt.b(TuplesKt.a(SharedContentNodeKt.a(), sharedElementInternalState));
    }

    /* access modifiers changed from: private */
    public final BoundsAnimation g3() {
        return this.N.d();
    }

    /* access modifiers changed from: private */
    public final SharedElement j3() {
        return this.N.p();
    }

    private final void m3(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.O;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.l(this).a(graphicsLayer2);
            }
        } else {
            this.N.x(graphicsLayer);
        }
        this.O = graphicsLayer;
    }

    public void I2() {
        super.I2();
        T0(SharedContentNodeKt.a(), this.N);
        this.N.A((SharedElementInternalState) b(SharedContentNodeKt.a()));
        m3(DelegatableNodeKt.l(this).b());
        this.N.y(new SharedBoundsNode$onAttach$1(this));
    }

    public void J2() {
        super.J2();
        m3((GraphicsLayer) null);
        this.N.A((SharedElementInternalState) null);
        this.N.y(SharedBoundsNode$onDetach$1.f2312z);
    }

    public void K2() {
        super.K2();
        GraphicsLayer graphicsLayer = this.O;
        if (graphicsLayer != null) {
            DelegatableNodeKt.l(this).a(graphicsLayer);
        }
        m3(DelegatableNodeKt.l(this).b());
    }

    public void U(ContentDrawScope contentDrawScope) {
        this.N.w(true);
        SharedElementInternalState sharedElementInternalState = this.N;
        SharedTransitionScope.OverlayClip k2 = sharedElementInternalState.k();
        SharedTransitionScope.SharedContentState t2 = this.N.t();
        Rect c2 = j3().c();
        Intrinsics.f(c2);
        sharedElementInternalState.v(k2.a(t2, c2, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.k(this)));
        GraphicsLayer i2 = this.N.i();
        if (i2 != null) {
            DrawScope.Z1(contentDrawScope, i2, 0, new SharedBoundsNode$draw$1(contentDrawScope, this), 1, (Object) null);
            if (this.N.s()) {
                GraphicsLayerKt.a(contentDrawScope, i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + j3().e() + ",target: " + this.N.d().f() + ", is attached: " + F2()).toString());
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable c0 = measurable.c0(j2);
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) c0.L0());
        long d2 = Size.d((((long) Float.floatToRawIntBits((float) c0.C0())) & 4294967295L) | (floatToRawIntBits << 32));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new SharedBoundsNode$measure$1(c0, this, d2), 4, (Object) null);
    }

    public final MeasureResult f3(MeasureScope measureScope, Placeable placeable) {
        Placeable placeable2 = placeable;
        if (!j3().d()) {
            return MeasureScope.R1(measureScope, placeable.L0(), placeable.C0(), (Map) null, new SharedBoundsNode$approachPlace$1(this, placeable2), 4, (Object) null);
        }
        long a2 = this.N.m().a(l3().a(), IntSize.c((((long) placeable.L0()) << 32) | (((long) placeable.C0()) & 4294967295L)));
        return MeasureScope.R1(measureScope, (int) (a2 >> 32), (int) (a2 & 4294967295L), (Map) null, new SharedBoundsNode$approachPlace$2(this, placeable2), 4, (Object) null);
    }

    public boolean g0(long j2) {
        return j3().d() && this.N.p().f().q();
    }

    public final LayoutCoordinates h3() {
        return j3().f().k();
    }

    public final LayoutCoordinates i3() {
        return j3().f().j();
    }

    public final SharedElementInternalState k3() {
        return this.N;
    }

    public final LayoutCoordinates l3() {
        return this.N.p().f().f(DelegatableNodeKt.m(this));
    }

    public MeasureResult n2(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        if (j3().d()) {
            Rect h2 = g3().h();
            if (h2 == null) {
                h2 = j3().c();
            }
            if (h2 != null) {
                long c2 = IntSizeKt.c(h2.q());
                int i2 = (int) (c2 >> 32);
                int i3 = (int) (c2 & 4294967295L);
                if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + g3().h() + ", current bounds: " + j3().c()).toString());
                }
                j2 = Constraints.f19137b.c(RangesKt.e(i2, 0), RangesKt.e(i3, 0));
            }
        }
        return f3(approachMeasureScope, measurable.c0(j2));
    }

    public final void n3(SharedElementInternalState sharedElementInternalState) {
        if (!Intrinsics.d(sharedElementInternalState, this.N)) {
            this.N = sharedElementInternalState;
            if (F2()) {
                T0(SharedContentNodeKt.a(), sharedElementInternalState);
                this.N.A((SharedElementInternalState) b(SharedContentNodeKt.a()));
                this.N.x(this.O);
                this.N.y(new SharedBoundsNode$state$1(this));
            }
        }
    }

    public final void o3(LayoutCoordinates layoutCoordinates) {
        j3().p(RectKt.c(h3().N(layoutCoordinates, Offset.f15855b.c()), Size.d((((long) Float.floatToRawIntBits((float) ((int) (layoutCoordinates.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((float) ((int) (layoutCoordinates.a() & 4294967295L)))) & 4294967295L))));
    }

    public ModifierLocalMap q1() {
        return this.P;
    }
}
