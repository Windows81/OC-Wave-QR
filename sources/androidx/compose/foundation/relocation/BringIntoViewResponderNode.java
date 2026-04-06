package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public BringIntoViewResponder N;
    public final boolean O;
    public boolean P;

    public BringIntoViewResponderNode(BringIntoViewResponder bringIntoViewResponder) {
        this.N = bringIntoViewResponder;
    }

    public static final Rect a3(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
        Rect rect;
        if (!bringIntoViewResponderNode.F2() || !bringIntoViewResponderNode.P) {
            return null;
        }
        LayoutCoordinates m2 = DelegatableNodeKt.m(bringIntoViewResponderNode);
        if (!layoutCoordinates.b()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (rect = (Rect) function0.invoke()) == null) {
            return null;
        }
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.b(m2, layoutCoordinates, rect);
    }

    public boolean D2() {
        return this.O;
    }

    public Object W1(LayoutCoordinates layoutCoordinates, Function0 function0, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new BringIntoViewResponderNode$bringIntoView$2(this, layoutCoordinates, function0, new BringIntoViewResponderNode$bringIntoView$parentRect$1(this, layoutCoordinates, function0), (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final BringIntoViewResponder b3() {
        return this.N;
    }

    public final void c3(BringIntoViewResponder bringIntoViewResponder) {
        this.N = bringIntoViewResponder;
    }

    public void u(LayoutCoordinates layoutCoordinates) {
        this.P = true;
    }
}
