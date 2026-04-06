package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata
public final class AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1 implements DragAndDropStartTransferScope {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f15660a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AndroidDragAndDropManager f15661b;

    public AndroidDragAndDropManager$requestDragAndDropTransfer$dragAndDropSourceScope$1(Ref.BooleanRef booleanRef, AndroidDragAndDropManager androidDragAndDropManager) {
        this.f15660a = booleanRef;
        this.f15661b = androidDragAndDropManager;
    }

    public boolean a(DragAndDropTransferData dragAndDropTransferData, long j2, Function1 function1) {
        this.f15660a.f40901z = ((Boolean) this.f15661b.f15654a.d(dragAndDropTransferData, Size.c(j2), function1)).booleanValue();
        return this.f15660a.f40901z;
    }
}
