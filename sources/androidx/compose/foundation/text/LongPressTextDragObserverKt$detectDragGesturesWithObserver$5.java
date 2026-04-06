package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LongPressTextDragObserverKt$detectDragGesturesWithObserver$5 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f5828z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.f5828z = textDragObserver;
    }

    public final void b(PointerInputChange pointerInputChange, long j2) {
        this.f5828z.p(j2);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((PointerInputChange) obj, ((Offset) obj2).t());
        return Unit.f40552a;
    }
}
