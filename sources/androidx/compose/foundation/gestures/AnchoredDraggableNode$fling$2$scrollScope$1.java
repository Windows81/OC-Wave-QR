package androidx.compose.foundation.gestures;

import kotlin.Metadata;

@Metadata
public final class AnchoredDraggableNode$fling$2$scrollScope$1 implements ScrollScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableNode f3353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AnchoredDragScope f3354b;

    public AnchoredDraggableNode$fling$2$scrollScope$1(AnchoredDraggableNode anchoredDraggableNode, AnchoredDragScope anchoredDragScope) {
        this.f3353a = anchoredDraggableNode;
        this.f3354b = anchoredDragScope;
    }

    public float g(float f2) {
        float z2 = this.f3353a.Y.z(f2);
        float r2 = z2 - this.f3353a.Y.r();
        AnchoredDragScope.b(this.f3354b, z2, 0.0f, 2, (Object) null);
        return r2;
    }
}
