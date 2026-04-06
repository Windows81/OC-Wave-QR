package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragAndDropNodeKt$DragAndDropTargetModifierNode$1 extends Lambda implements Function1<DragAndDropEvent, DragAndDropTarget> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DragAndDropTarget f15682A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15683z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropNodeKt$DragAndDropTargetModifierNode$1(Function1 function1, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.f15683z = function1;
        this.f15682A = dragAndDropTarget;
    }

    /* renamed from: b */
    public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
        if (((Boolean) this.f15683z.invoke(dragAndDropEvent)).booleanValue()) {
            return this.f15682A;
        }
        return null;
    }
}
