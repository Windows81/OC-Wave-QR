package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public TransformableState P;
    public Function1 Q;
    public boolean R;
    public boolean S;
    public final Function1 T = new TransformableNode$updatedCanPan$1(this);
    public final Channel U = ChannelKt.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
    public ScrollConfig V;
    public final SuspendingPointerInputModifierNode W = ((SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new TransformableNode$pointerInputNode$1(this))));
    public PointerInputModifierNode X;

    public TransformableNode(TransformableState transformableState, Function1 function1, boolean z2, boolean z3) {
        this.P = transformableState;
        this.Q = function1;
        this.R = z2;
        this.S = z3;
    }

    public void I2() {
        super.I2();
        this.V = AndroidScrollable_androidKt.a(this);
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        ScrollConfig scrollConfig = this.V;
        if (this.S) {
            List c2 = pointerEvent.c();
            int size = c2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (!PointerType.h(((PointerInputChange) c2.get(i2)).n(), PointerType.f16933b.b())) {
                    i2++;
                } else if (scrollConfig != null && this.X == null) {
                    this.X = (PointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new TransformableNode$onPointerEvent$2(this, scrollConfig)));
                }
            }
        }
        this.W.S0(pointerEvent, pointerEventPass, j2);
        PointerInputModifierNode pointerInputModifierNode = this.X;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.S0(pointerEvent, pointerEventPass, j2);
        }
    }

    public void X0() {
        this.W.X0();
        PointerInputModifierNode pointerInputModifierNode = this.X;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.X0();
        }
    }

    public final void l3(TransformableState transformableState, Function1 function1, boolean z2, boolean z3) {
        this.Q = function1;
        if (!Intrinsics.d(this.P, transformableState) || this.S != z3 || this.R != z2) {
            this.P = transformableState;
            this.S = z3;
            this.R = z2;
            this.W.u2();
        }
    }
}
