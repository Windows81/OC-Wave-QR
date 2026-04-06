package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f12218A;

    /* renamed from: B  reason: collision with root package name */
    public final Orientation f12219B;

    /* renamed from: z  reason: collision with root package name */
    public final AnchoredDraggableState f12220z;

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, Function2 function2, Orientation orientation) {
        this.f12220z = anchoredDraggableState;
        this.f12218A = function2;
        this.f12219B = orientation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.d(this.f12220z, draggableAnchorsElement.f12220z) && this.f12218A == draggableAnchorsElement.f12218A && this.f12219B == draggableAnchorsElement.f12219B;
    }

    /* renamed from: g */
    public DraggableAnchorsNode a() {
        return new DraggableAnchorsNode(this.f12220z, this.f12218A, this.f12219B);
    }

    /* renamed from: h */
    public void b(DraggableAnchorsNode draggableAnchorsNode) {
        draggableAnchorsNode.f3(this.f12220z);
        draggableAnchorsNode.d3(this.f12218A);
        draggableAnchorsNode.e3(this.f12219B);
    }

    public int hashCode() {
        return (((this.f12220z.hashCode() * 31) + this.f12218A.hashCode()) * 31) + this.f12219B.hashCode();
    }
}
