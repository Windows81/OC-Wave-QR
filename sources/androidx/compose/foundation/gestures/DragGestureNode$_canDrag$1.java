package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DragGestureNode$_canDrag$1 extends Lambda implements Function1<PointerInputChange, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DragGestureNode f3488z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureNode$_canDrag$1(DragGestureNode dragGestureNode) {
        super(1);
        this.f3488z = dragGestureNode;
    }

    /* renamed from: b */
    public final Boolean invoke(PointerInputChange pointerInputChange) {
        return (Boolean) this.f3488z.p3().invoke(pointerInputChange);
    }
}
