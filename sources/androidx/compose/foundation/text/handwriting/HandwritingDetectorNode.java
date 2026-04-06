package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    public Function0 P;
    public final Lazy Q = LazyKt.a(LazyThreadSafetyMode.NONE, new HandwritingDetectorNode$composeImm$2(this));
    public final StylusHandwritingNode R = ((StylusHandwritingNode) Z2(new StylusHandwritingNode(new HandwritingDetectorNode$pointerInputNode$1(this))));

    public HandwritingDetectorNode(Function0 function0) {
        this.P = function0;
    }

    /* access modifiers changed from: private */
    public final ComposeInputMethodManager h3() {
        return (ComposeInputMethodManager) this.Q.getValue();
    }

    public void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.R.S0(pointerEvent, pointerEventPass, j2);
    }

    public void X0() {
        this.R.X0();
    }

    public final Function0 g3() {
        return this.P;
    }

    public final void i3(Function0 function0) {
        this.P = function0;
    }

    public long n0() {
        return this.R.n0();
    }
}
