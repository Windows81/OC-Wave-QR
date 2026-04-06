package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f7696A;

    /* renamed from: B  reason: collision with root package name */
    public final Orientation f7697B;

    /* renamed from: z  reason: collision with root package name */
    public final AnchoredDraggableState f7698z;

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, Function2 function2, Orientation orientation) {
        this.f7698z = anchoredDraggableState;
        this.f7696A = function2;
        this.f7697B = orientation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.d(this.f7698z, draggableAnchorsElement.f7698z) && this.f7696A == draggableAnchorsElement.f7696A && this.f7697B == draggableAnchorsElement.f7697B;
    }

    /* renamed from: g */
    public DraggableAnchorsNode a() {
        return new DraggableAnchorsNode(this.f7698z, this.f7696A, this.f7697B);
    }

    /* renamed from: h */
    public void b(DraggableAnchorsNode draggableAnchorsNode) {
        draggableAnchorsNode.d3(this.f7698z);
        draggableAnchorsNode.b3(this.f7696A);
        draggableAnchorsNode.c3(this.f7697B);
    }

    public int hashCode() {
        return (((this.f7698z.hashCode() * 31) + this.f7696A.hashCode()) * 31) + this.f7697B.hashCode();
    }
}
