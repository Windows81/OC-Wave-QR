package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class Draggable2DElement$Companion$CanDrag$1 extends Lambda implements Function1<PointerInputChange, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final Draggable2DElement$Companion$CanDrag$1 f3502z = new Draggable2DElement$Companion$CanDrag$1();

    public Draggable2DElement$Companion$CanDrag$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(PointerInputChange pointerInputChange) {
        return Boolean.TRUE;
    }
}
