package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
final class DragAndDropNode$drag$1 extends Lambda implements Function2<DragAndDropStartTransferScope, Offset, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f15673A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f15674B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragAndDropTransferData f15675z;

    public final void b(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
        dragAndDropStartTransferScope.a(this.f15675z, this.f15673A, this.f15674B);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((DragAndDropStartTransferScope) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
