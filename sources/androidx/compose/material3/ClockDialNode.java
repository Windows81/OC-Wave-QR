package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {
    public AnalogTimePickerState P;
    public boolean Q;
    public int R;
    public AnimationSpec S;
    public float T;
    public float U;
    public final MutableState V;
    public final SuspendingPointerInputModifierNode W;
    public final SuspendingPointerInputModifierNode X;

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, AnimationSpec animationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z2, i2, animationSpec);
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.W.S0(pointerEvent, pointerEventPass, j2);
        this.X.S0(pointerEvent, pointerEventPass, j2);
    }

    public void X0() {
        this.W.X0();
        this.X.X0();
    }

    public final long o3() {
        return ((IntOffset) this.V.getValue()).r();
    }

    public final float p3() {
        Density k2 = DelegatableNodeKt.k(this);
        return (k2.B1(TimePickerKt.f11475h) * ((float) k2.P1(this.P.t()))) / ((float) k2.P1(TimePickerTokens.f14264a.a()));
    }

    public void q(long j2) {
        q3(IntSizeKt.b(j2));
        this.P.B(DelegatableNodeKt.k(this).D((int) (j2 >> 32)));
    }

    public final void q3(long j2) {
        this.V.setValue(IntOffset.c(j2));
    }

    public final void r3(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, AnimationSpec animationSpec) {
        this.P = analogTimePickerState;
        this.Q = z2;
        this.S = animationSpec;
        if (!TimePickerSelectionMode.f(this.R, i2)) {
            this.R = i2;
            Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new ClockDialNode$updateNode$1(analogTimePickerState, animationSpec, (Continuation) null), 3, (Object) null);
        }
    }

    public ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, AnimationSpec animationSpec) {
        this.P = analogTimePickerState;
        this.Q = z2;
        this.R = i2;
        this.S = animationSpec;
        this.V = SnapshotStateKt__SnapshotStateKt.e(IntOffset.c(IntOffset.f19160b.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.W = (SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new ClockDialNode$pointerInputTapNode$1(this)));
        this.X = (SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new ClockDialNode$pointerInputDragNode$1(this)));
    }
}
