package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f3297A;

    /* renamed from: B  reason: collision with root package name */
    public final Function1 f3298B;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3299z;

    /* renamed from: c */
    public DragAndDropSourceNode a() {
        return new DragAndDropSourceNode(this.f3299z, this.f3297A, this.f3298B);
    }

    /* renamed from: d */
    public void b(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.l3(this.f3299z);
        dragAndDropSourceNode.k3(this.f3297A);
        dragAndDropSourceNode.m3(this.f3298B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return Intrinsics.d(this.f3299z, dragAndDropSourceElement.f3299z) && Intrinsics.d(this.f3297A, dragAndDropSourceElement.f3297A) && Intrinsics.d(this.f3298B, dragAndDropSourceElement.f3298B);
    }

    public int hashCode() {
        return (((this.f3299z.hashCode() * 31) + this.f3297A.hashCode()) * 31) + this.f3298B.hashCode();
    }

    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.f3299z + ", detectDragStart=" + this.f3297A + ", transferData=" + this.f3298B + ')';
    }
}
