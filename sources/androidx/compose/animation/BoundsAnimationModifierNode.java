package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public LookaheadScope N;
    public BoundsTransform O;
    public Function2 P;
    public boolean Q;
    public boolean R = true;
    public final BoundsTransformDeferredAnimation S = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, Function2 function2, boolean z2) {
        this.N = lookaheadScope;
        this.O = boundsTransform;
        this.P = function2;
        this.Q = z2;
    }

    public void I2() {
        this.R = true;
    }

    public final boolean a3() {
        return this.Q;
    }

    public final LookaheadScope b3() {
        return this.N;
    }

    public final void c3(boolean z2) {
        this.Q = z2;
    }

    public final void d3(BoundsTransform boundsTransform) {
        this.O = boundsTransform;
    }

    public final void e3(LookaheadScope lookaheadScope) {
        this.N = lookaheadScope;
    }

    public final void f3(Function2 function2) {
        this.P = function2;
    }

    public boolean g0(long j2) {
        this.S.k(IntSizeKt.e(j2));
        return !this.S.f();
    }

    public MeasureResult n2(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        long e2 = this.S.d() == 9205357640488583168L ? IntSizeKt.e(approachMeasureScope.b0()) : this.S.d();
        Rect e3 = this.S.e();
        if (e3 != null) {
            e2 = e3.q();
        }
        long c2 = IntSizeKt.c(e2);
        long r2 = ((Constraints) this.P.m(IntSize.b(c2), Constraints.a(j2))).r();
        Placeable c0 = measurable.c0(r2);
        long d2 = ConstraintsKt.d(r2, c2);
        return MeasureScope.R1(approachMeasureScope, (int) (d2 >> 32), (int) (d2 & 4294967295L), (Map) null, new BoundsAnimationModifierNode$approachMeasure$1(this, c0), 4, (Object) null);
    }

    public boolean s2(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        this.S.j(this.N, placementScope, y2(), this.R, this.Q, this.O);
        this.R = this.Q;
        return !this.S.f();
    }
}
