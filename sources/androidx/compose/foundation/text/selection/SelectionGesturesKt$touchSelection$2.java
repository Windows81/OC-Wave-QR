package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionGesturesKt$touchSelection$2 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6834z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelection$2(TextDragObserver textDragObserver) {
        super(1);
        this.f6834z = textDragObserver;
    }

    public final void b(PointerInputChange pointerInputChange) {
        this.f6834z.p(PointerEventKt.g(pointerInputChange));
        pointerInputChange.a();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
