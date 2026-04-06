package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {

    /* renamed from: A  reason: collision with root package name */
    public final Function2 f3310A;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f3311z;

    /* renamed from: c */
    public LegacyDragAndDropSourceNode a() {
        return new LegacyDragAndDropSourceNode(this.f3311z, this.f3310A);
    }

    /* renamed from: d */
    public void b(LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        legacyDragAndDropSourceNode.h3(this.f3311z);
        legacyDragAndDropSourceNode.g3(this.f3310A);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return Intrinsics.d(this.f3311z, legacyDragAndDropSourceElement.f3311z) && Intrinsics.d(this.f3310A, legacyDragAndDropSourceElement.f3310A);
    }

    public int hashCode() {
        return (this.f3311z.hashCode() * 31) + this.f3310A.hashCode();
    }

    public String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=" + this.f3311z + ", dragAndDropSourceHandler=" + this.f3310A + ')';
    }
}
