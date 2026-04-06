package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    public static final Companion T = new Companion((DefaultConstructorMarker) null);
    public static final int U = 8;
    public Function2 N;
    public final Function1 O;
    public final Object P;
    public DragAndDropNode Q;
    public DragAndDropTarget R;
    public long S;

    @Metadata
    public static final class Companion {

        @Metadata
        public static final class DragAndDropTraversableKey {

            /* renamed from: a  reason: collision with root package name */
            public static final DragAndDropTraversableKey f15669a = new DragAndDropTraversableKey();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DragAndDropNode(Function2 function2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : function2, (i2 & 2) != 0 ? null : function1);
    }

    /* access modifiers changed from: private */
    public final DragAndDropManager g3() {
        return DelegatableNodeKt.p(this).getDragAndDropManager();
    }

    public boolean H() {
        return g3().H();
    }

    public void J2() {
        this.R = null;
        this.Q = null;
    }

    public void M1(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.R;
        if (dragAndDropTarget == null) {
            DragAndDropNode dragAndDropNode = this.Q;
            if (dragAndDropNode != null) {
                dragAndDropNode.M1(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.M1(dragAndDropEvent);
    }

    public void N0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.R;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.N0(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.Q;
        if (dragAndDropNode != null) {
            dragAndDropNode.N0(dragAndDropEvent);
        }
        this.Q = null;
    }

    public boolean Z2(DragAndDropEvent dragAndDropEvent) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        DragAndDropNodeKt.i(this, new DragAndDropNode$acceptDragAndDropTransfer$1(dragAndDropEvent, this, booleanRef));
        return booleanRef.f40901z;
    }

    public boolean d0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.Q;
        if (dragAndDropNode != null) {
            return dragAndDropNode.d0(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.R;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.d0(dragAndDropEvent);
        }
        return false;
    }

    public void f0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.R;
        if (dragAndDropTarget == null) {
            DragAndDropNode dragAndDropNode = this.Q;
            if (dragAndDropNode != null) {
                dragAndDropNode.f0(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.f0(dragAndDropEvent);
    }

    public void h0(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode;
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode2 = this.Q;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.g(dragAndDropNode2, DragAndDrop_androidKt.a(dragAndDropEvent))) {
            if (!M().F2()) {
                traversableNode = null;
            } else {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                TraversableNodeKt.f(this, new DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(objectRef, this, dragAndDropEvent));
                traversableNode = (TraversableNode) objectRef.f40908z;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.h(dragAndDropNode, dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.R;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.N0(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.R;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.h(dragAndDropTarget2, dragAndDropEvent);
            }
            dragAndDropNode2.N0(dragAndDropEvent);
        } else if (!Intrinsics.d(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.h(dragAndDropNode, dragAndDropEvent);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.N0(dragAndDropEvent);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.h0(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.R;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.h0(dragAndDropEvent);
            }
        }
        this.Q = dragAndDropNode;
    }

    public final long h3() {
        return this.S;
    }

    public Object i0() {
        return this.P;
    }

    public final void i3(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2, Function0 function0) {
        DragAndDropNodeKt.i(this, new DragAndDropNode$startDragAndDropTransfer$1(j2, DelegatableNodeKt.o(this).w(), dragAndDropStartTransferScope, function0));
    }

    public void q(long j2) {
        this.S = j2;
    }

    public void r2(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.i(this, new DragAndDropNode$onEnded$1(dragAndDropEvent));
    }

    public void x(long j2) {
        if (!(this.N != null)) {
            InlineClassHelperKt.c("Check failed.");
        }
        g3().I(this, j2);
    }

    public DragAndDropNode(Function2 function2, Function1 function1) {
        this.N = function2;
        this.O = function1;
        this.P = Companion.DragAndDropTraversableKey.f15669a;
        this.S = IntSize.f19170b.a();
    }
}
