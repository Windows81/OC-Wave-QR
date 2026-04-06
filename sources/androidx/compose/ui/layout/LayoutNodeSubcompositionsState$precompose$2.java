package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNodeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class LayoutNodeSubcompositionsState$precompose$2 implements SubcomposeLayoutState.PrecomposedSlotHandle {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LayoutNodeSubcompositionsState f17094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17095b;

    public LayoutNodeSubcompositionsState$precompose$2(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, Object obj) {
        this.f17094a = layoutNodeSubcompositionsState;
        this.f17095b = obj;
    }

    public void a(int i2, long j2) {
        LayoutNode layoutNode = (LayoutNode) this.f17094a.I.e(this.f17095b);
        if (layoutNode != null && layoutNode.b()) {
            int size = layoutNode.M().size();
            if (i2 < 0 || i2 >= size) {
                InlineClassHelperKt.e("Index (" + i2 + ") is out of bound of [0, " + size + ')');
            }
            if (layoutNode.u()) {
                InlineClassHelperKt.a("Pre-measure called on node that is not placed");
            }
            LayoutNode k2 = this.f17094a.f17063z;
            k2.R = true;
            LayoutNodeKt.b(layoutNode).e((LayoutNode) layoutNode.M().get(i2), j2);
            k2.R = false;
        }
    }

    public int b() {
        List M;
        LayoutNode layoutNode = (LayoutNode) this.f17094a.I.e(this.f17095b);
        if (layoutNode == null || (M = layoutNode.M()) == null) {
            return 0;
        }
        return M.size();
    }

    public void c(Object obj, Function1 function1) {
        NodeChain u0;
        Modifier.Node k2;
        LayoutNode layoutNode = (LayoutNode) this.f17094a.I.e(this.f17095b);
        if (layoutNode != null && (u0 = layoutNode.u0()) != null && (k2 = u0.k()) != null) {
            TraversableNodeKt.e(k2, obj, function1);
        }
    }

    public void d() {
        this.f17094a.B();
        LayoutNode layoutNode = (LayoutNode) this.f17094a.I.u(this.f17095b);
        if (layoutNode != null) {
            boolean z2 = false;
            if (!(this.f17094a.N > 0)) {
                InlineClassHelperKt.c("No pre-composed items to dispose");
            }
            int indexOf = this.f17094a.f17063z.R().indexOf(layoutNode);
            if (indexOf >= this.f17094a.f17063z.R().size() - this.f17094a.N) {
                z2 = true;
            }
            if (!z2) {
                InlineClassHelperKt.c("Item is not in pre-composed item range");
            }
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f17094a;
            layoutNodeSubcompositionsState.M = layoutNodeSubcompositionsState.M + 1;
            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.f17094a;
            layoutNodeSubcompositionsState2.N = layoutNodeSubcompositionsState2.N - 1;
            int size = (this.f17094a.f17063z.R().size() - this.f17094a.N) - this.f17094a.M;
            this.f17094a.D(indexOf, size, 1);
            this.f17094a.x(size);
        }
    }
}
