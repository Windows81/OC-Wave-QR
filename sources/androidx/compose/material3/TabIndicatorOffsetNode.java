package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public State N;
    public int O;
    public boolean P;
    public FiniteAnimationSpec Q;
    public Animatable R;
    public Animatable S;
    public Dp T;
    public Dp U;

    public TabIndicatorOffsetNode(State state, int i2, boolean z2, FiniteAnimationSpec finiteAnimationSpec) {
        this.N = state;
        this.O = i2;
        this.P = z2;
        this.Q = finiteAnimationSpec;
    }

    public static final Unit c3(Placeable.PlacementScope placementScope) {
        return Unit.f40552a;
    }

    public static final Unit d3(Placeable placeable, MeasureScope measureScope, float f2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, measureScope.P1(f2), 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final FiniteAnimationSpec b3() {
        return this.Q;
    }

    public final void e3(FiniteAnimationSpec finiteAnimationSpec) {
        this.Q = finiteAnimationSpec;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        if (((List) this.N.getValue()).isEmpty()) {
            return MeasureScope.R1(measureScope, 0, 0, (Map) null, new N6(), 4, (Object) null);
        }
        float a2 = this.P ? ((TabPosition) ((List) this.N.getValue()).get(this.O)).a() : ((TabPosition) ((List) this.N.getValue()).get(this.O)).d();
        if (this.U != null) {
            Animatable animatable = this.S;
            if (animatable == null) {
                Dp dp = this.U;
                Intrinsics.f(dp);
                animatable = new Animatable(dp, VectorConvertersKt.e(Dp.f19144A), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
                this.S = animatable;
            }
            if (!Dp.o(a2, ((Dp) animatable.k()).t())) {
                Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TabIndicatorOffsetNode$measure$2(animatable, a2, this, (Continuation) null), 3, (Object) null);
            }
        } else {
            this.U = Dp.j(a2);
        }
        float b2 = ((TabPosition) ((List) this.N.getValue()).get(this.O)).b();
        if (this.T != null) {
            Animatable animatable2 = this.R;
            if (animatable2 == null) {
                Dp dp2 = this.T;
                Intrinsics.f(dp2);
                animatable2 = new Animatable(dp2, VectorConvertersKt.e(Dp.f19144A), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
                this.R = animatable2;
            }
            if (!Dp.o(b2, ((Dp) animatable2.k()).t())) {
                Job unused2 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new TabIndicatorOffsetNode$measure$3(animatable2, b2, this, (Continuation) null), 3, (Object) null);
            }
        } else {
            this.T = Dp.j(b2);
        }
        if (measureScope.getLayoutDirection() == LayoutDirection.Ltr) {
            Animatable animatable3 = this.R;
            if (animatable3 != null) {
                b2 = ((Dp) animatable3.m()).t();
            }
        } else {
            Animatable animatable4 = this.R;
            if (animatable4 != null) {
                b2 = ((Dp) animatable4.m()).t();
            }
            b2 = Dp.m(-b2);
        }
        Animatable animatable5 = this.S;
        if (animatable5 != null) {
            a2 = ((Dp) animatable5.m()).t();
        }
        Placeable c0 = measurable.c0(Constraints.d(j2, measureScope.P1(a2), measureScope.P1(a2), 0, 0, 12, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new O6(c0, measureScope, b2), 4, (Object) null);
    }

    public final void f3(boolean z2) {
        this.P = z2;
    }

    public final void g3(int i2) {
        this.O = i2;
    }

    public final void h3(State state) {
        this.N = state;
    }
}
