package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class DragAndDropNodeKt$DragAndDropModifierNode$1 extends Lambda implements Function1<DragAndDropEvent, DragAndDropTarget> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DragAndDropTarget f15680A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15681z;

    /* renamed from: b */
    public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
        if (((Boolean) this.f15681z.invoke(dragAndDropEvent)).booleanValue()) {
            return this.f15680A;
        }
        return null;
    }
}
