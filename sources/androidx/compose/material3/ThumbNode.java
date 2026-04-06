package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    public InteractionSource N;
    public boolean O;
    public FiniteAnimationSpec P;
    public boolean Q;
    public Animatable R;
    public Animatable S;
    public float T = Float.NaN;
    public float U = Float.NaN;

    public ThumbNode(InteractionSource interactionSource, boolean z2, FiniteAnimationSpec finiteAnimationSpec) {
        this.N = interactionSource;
        this.O = z2;
        this.P = finiteAnimationSpec;
    }

    public static final Unit h3(Placeable placeable, ThumbNode thumbNode, float f2, Placeable.PlacementScope placementScope) {
        Animatable animatable = thumbNode.R;
        Placeable.PlacementScope.n(placementScope, placeable, animatable != null ? (int) ((Number) animatable.m()).floatValue() : (int) f2, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public boolean D2() {
        return false;
    }

    public void I2() {
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new ThumbNode$onAttach$1(this, (Continuation) null), 3, (Object) null);
    }

    public final FiniteAnimationSpec e3() {
        return this.P;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        float B1 = measureScope.B1(this.Q ? SwitchTokens.f14193a.n() : ((measurable.C(Constraints.l(j2)) != 0 && measurable.a0(Constraints.k(j2)) != 0) || this.O) ? SwitchKt.k() : SwitchKt.l());
        Animatable animatable = this.S;
        int floatValue = (int) (animatable != null ? ((Number) animatable.m()).floatValue() : B1);
        Placeable c0 = measurable.c0(Constraints.f19137b.c(floatValue, floatValue));
        float B12 = measureScope.B1(Dp.m(Dp.m(SwitchKt.f11253d - measureScope.E(B1)) / 2.0f));
        float B13 = measureScope.B1(Dp.m(Dp.m(SwitchKt.f11252c - SwitchKt.k()) - SwitchKt.f11254e));
        boolean z2 = this.Q;
        if (z2 && this.O) {
            B12 = B13 - measureScope.B1(SwitchTokens.f14193a.u());
        } else if (z2 && !this.O) {
            B12 = measureScope.B1(SwitchTokens.f14193a.u());
        } else if (this.O) {
            B12 = B13;
        }
        Animatable animatable2 = this.S;
        if (!Intrinsics.b(animatable2 != null ? (Float) animatable2.k() : null, B1)) {
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new ThumbNode$measure$1(this, B1, (Continuation) null), 3, (Object) null);
        }
        Animatable animatable3 = this.R;
        if (!Intrinsics.b(animatable3 != null ? (Float) animatable3.k() : null, B12)) {
            Job unused2 = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new ThumbNode$measure$2(this, B12, (Continuation) null), 3, (Object) null);
        }
        if (Float.isNaN(this.U) && Float.isNaN(this.T)) {
            this.U = B1;
            this.T = B12;
        }
        return MeasureScope.R1(measureScope, floatValue, floatValue, (Map) null, new C0233r7(c0, this, B12), 4, (Object) null);
    }

    public final boolean f3() {
        return this.O;
    }

    public final InteractionSource g3() {
        return this.N;
    }

    public final void i3(FiniteAnimationSpec finiteAnimationSpec) {
        this.P = finiteAnimationSpec;
    }

    public final void j3(boolean z2) {
        this.O = z2;
    }

    public final void k3(InteractionSource interactionSource) {
        this.N = interactionSource;
    }

    public final void l3() {
        if (this.S == null && !Float.isNaN(this.U)) {
            this.S = AnimatableKt.b(this.U, 0.0f, 2, (Object) null);
        }
        if (this.R == null && !Float.isNaN(this.T)) {
            this.R = AnimatableKt.b(this.T, 0.0f, 2, (Object) null);
        }
    }
}
