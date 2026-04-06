package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragGestureDetectorKt$detectDragGestures$6 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f3468z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$6(Function0 function0) {
        super(1);
        this.f3468z = function0;
    }

    public final void b(PointerInputChange pointerInputChange) {
        this.f3468z.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PointerInputChange) obj);
        return Unit.f40552a;
    }
}
