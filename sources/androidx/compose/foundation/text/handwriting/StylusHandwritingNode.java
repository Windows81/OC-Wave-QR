package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public Function0 P;
    public boolean Q;
    public final SuspendingPointerInputModifierNode R = ((SuspendingPointerInputModifierNode) Z2(SuspendingPointerInputFilterKt.a(new StylusHandwritingNode$suspendingPointerInputModifierNode$1(this))));

    public StylusHandwritingNode(Function0 function0) {
        this.P = function0;
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.R.S0(pointerEvent, pointerEventPass, j2);
    }

    public void X(FocusState focusState) {
        this.Q = focusState.f();
    }

    public void X0() {
        this.R.X0();
    }

    public final Function0 g3() {
        return this.P;
    }

    public final void h3(Function0 function0) {
        this.P = function0;
    }

    public long n0() {
        return StylusHandwritingKt.a().a(DelegatableNodeKt.k(this));
    }
}
