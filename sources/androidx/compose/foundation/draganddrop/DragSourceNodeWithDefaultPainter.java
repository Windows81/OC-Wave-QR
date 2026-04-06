package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    public final CacheDrawScopeDragShadowCallback P;
    public final DragAndDropSourceNode Q;

    public DragSourceNodeWithDefaultPainter(Function2 function2, Function1 function1) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        Z2(DrawModifierKt.a(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.P = cacheDrawScopeDragShadowCallback;
        this.Q = (DragAndDropSourceNode) Z2(new DragAndDropSourceNode(new DragSourceNodeWithDefaultPainter$dragAndDropModifierNode$1(this), function2, function1));
    }

    public final void g3(Function2 function2) {
        this.Q.k3(function2);
    }

    public final void h3(Function1 function1) {
        this.Q.m3(function1);
    }
}
