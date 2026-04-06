package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {

    /* renamed from: A  reason: collision with root package name */
    public final DragAndDropTarget f3308A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3309z;

    /* renamed from: c */
    public DragAndDropTargetNode a() {
        return new DragAndDropTargetNode(this.f3309z, this.f3308A);
    }

    /* renamed from: d */
    public void b(DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.h3(this.f3309z, this.f3308A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        if (!Intrinsics.d(this.f3308A, dropTargetElement.f3308A)) {
            return false;
        }
        return this.f3309z == dropTargetElement.f3309z;
    }

    public int hashCode() {
        return (this.f3308A.hashCode() * 31) + this.f3309z.hashCode();
    }
}
