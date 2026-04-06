package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DraggableElement$Companion$CanDrag$1 extends Lambda implements Function1<PointerInputChange, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final DraggableElement$Companion$CanDrag$1 f3515z = new DraggableElement$Companion$CanDrag$1();

    public DraggableElement$Companion$CanDrag$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(PointerInputChange pointerInputChange) {
        return Boolean.TRUE;
    }
}
