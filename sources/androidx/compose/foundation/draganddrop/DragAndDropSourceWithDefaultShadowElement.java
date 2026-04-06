package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {

    /* renamed from: A  reason: collision with root package name */
    public Function1 f3304A;

    /* renamed from: z  reason: collision with root package name */
    public Function2 f3305z;

    /* renamed from: c */
    public DragSourceNodeWithDefaultPainter a() {
        return new DragSourceNodeWithDefaultPainter(this.f3305z, this.f3304A);
    }

    /* renamed from: d */
    public void b(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.g3(this.f3305z);
        dragSourceNodeWithDefaultPainter.h3(this.f3304A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return Intrinsics.d(this.f3305z, dragAndDropSourceWithDefaultShadowElement.f3305z) && Intrinsics.d(this.f3304A, dragAndDropSourceWithDefaultShadowElement.f3304A);
    }

    public int hashCode() {
        return (this.f3305z.hashCode() * 31) + this.f3304A.hashCode();
    }

    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.f3305z + ", transferData=" + this.f3304A + ')';
    }
}
