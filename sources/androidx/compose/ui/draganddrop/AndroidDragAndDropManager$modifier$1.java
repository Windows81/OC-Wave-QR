package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;

@Metadata
public final class AndroidDragAndDropManager$modifier$1 extends ModifierNodeElement<DragAndDropNode> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidDragAndDropManager f15658z;

    public AndroidDragAndDropManager$modifier$1(AndroidDragAndDropManager androidDragAndDropManager) {
        this.f15658z = androidDragAndDropManager;
    }

    /* renamed from: c */
    public DragAndDropNode a() {
        return this.f15658z.f15655b;
    }

    /* renamed from: d */
    public void b(DragAndDropNode dragAndDropNode) {
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.f15658z.f15655b.hashCode();
    }
}
