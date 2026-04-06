package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f6837z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1(Ref.LongRef longRef) {
        super(2);
        this.f6837z = longRef;
    }

    public final void b(PointerInputChange pointerInputChange, long j2) {
        pointerInputChange.a();
        this.f6837z.f40907z = j2;
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
