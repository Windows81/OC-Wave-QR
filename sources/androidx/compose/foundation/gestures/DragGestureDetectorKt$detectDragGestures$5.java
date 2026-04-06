package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragGestureDetectorKt$detectDragGestures$5 extends Lambda implements Function3<PointerInputChange, PointerInputChange, Offset, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f3467z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(Function1 function1) {
        super(3);
        this.f3467z = function1;
    }

    public final void b(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j2) {
        this.f3467z.invoke(Offset.d(pointerInputChange2.h()));
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PointerInputChange) obj, (PointerInputChange) obj2, ((Offset) obj3).t());
        return Unit.f40552a;
    }
}
