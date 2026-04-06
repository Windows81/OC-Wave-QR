package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;

@Metadata
public interface PointerInputModifierNode extends DelegatableNode {
    void G() {
        X0();
    }

    void S0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    boolean V1() {
        return false;
    }

    void X0();

    void e2() {
        X0();
    }

    boolean h1() {
        return false;
    }

    long n0() {
        return TouchBoundsExpansion.f17451b.b();
    }
}
