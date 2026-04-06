package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropStartTransferScope;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragAndDropSourceNode$dragAndDropModifierNode$1 extends Lambda implements Function2<DragAndDropStartTransferScope, Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropSourceNode f3300z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragAndDropSourceNode$dragAndDropModifierNode$1(DragAndDropSourceNode dragAndDropSourceNode) {
        super(2);
        this.f3300z = dragAndDropSourceNode;
    }

    public final void b(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
        DragAndDropTransferData dragAndDropTransferData = (DragAndDropTransferData) this.f3300z.j3().invoke(Offset.d(j2));
        if (dragAndDropTransferData != null) {
            dragAndDropStartTransferScope.a(dragAndDropTransferData, IntSizeKt.e(this.f3300z.S), this.f3300z.i3());
        }
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((DragAndDropStartTransferScope) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
