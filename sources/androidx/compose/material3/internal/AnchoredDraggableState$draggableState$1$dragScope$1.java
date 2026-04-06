package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;

@Metadata
public final class AnchoredDraggableState$draggableState$1$dragScope$1 implements DragScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState f12137a;

    public AnchoredDraggableState$draggableState$1$dragScope$1(AnchoredDraggableState anchoredDraggableState) {
        this.f12137a = anchoredDraggableState;
    }

    public void a(float f2) {
        AnchoredDragScope.b(this.f12137a.f12133o, this.f12137a.A(f2), 0.0f, 2, (Object) null);
    }
}
