package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollableKt$CanDragCalculation$1 extends Lambda implements Function1<PointerInputChange, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final ScrollableKt$CanDragCalculation$1 f3567z = new ScrollableKt$CanDragCalculation$1();

    public ScrollableKt$CanDragCalculation$1() {
        super(1);
    }

    /* renamed from: b */
    public final Boolean invoke(PointerInputChange pointerInputChange) {
        return Boolean.valueOf(!PointerType.h(pointerInputChange.n(), PointerType.f16933b.b()));
    }
}
