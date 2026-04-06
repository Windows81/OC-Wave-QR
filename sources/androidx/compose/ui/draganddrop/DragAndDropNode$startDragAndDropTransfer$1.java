package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragAndDropNode$startDragAndDropTransfer$1 extends Lambda implements Function1<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f15677A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DragAndDropStartTransferScope f15678B;
    public final /* synthetic */ Function0 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f15679z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$startDragAndDropTransfer$1(long j2, LayoutCoordinates layoutCoordinates, DragAndDropStartTransferScope dragAndDropStartTransferScope, Function0 function0) {
        super(1);
        this.f15679z = j2;
        this.f15677A = layoutCoordinates;
        this.f15678B = dragAndDropStartTransferScope;
        this.C = function0;
    }

    /* renamed from: b */
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        if (!dragAndDropNode.F2()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        Function2 c3 = dragAndDropNode.N;
        if (c3 == null) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        long j2 = this.f15679z;
        Offset.Companion companion = Offset.f15855b;
        if (!Offset.j(j2, companion.b())) {
            long N = DelegatableNodeKt.o(dragAndDropNode).w().N(this.f15677A, this.f15679z);
            if (!SizeKt.c(IntSizeKt.e(dragAndDropNode.h3())).f(N)) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            c3.m(this.f15678B, Offset.d(N));
        } else {
            c3.m(this.f15678B, Offset.d(companion.b()));
        }
        return ((Boolean) this.C.invoke()).booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
