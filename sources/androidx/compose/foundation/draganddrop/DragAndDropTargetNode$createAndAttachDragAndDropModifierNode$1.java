package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1 extends Lambda implements Function1<DragAndDropEvent, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropTargetNode f3306z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropTargetNode$createAndAttachDragAndDropModifierNode$1(DragAndDropTargetNode dragAndDropTargetNode) {
        super(1);
        this.f3306z = dragAndDropTargetNode;
    }

    /* renamed from: b */
    public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
        return (Boolean) this.f3306z.P.invoke(dragAndDropEvent);
    }
}
