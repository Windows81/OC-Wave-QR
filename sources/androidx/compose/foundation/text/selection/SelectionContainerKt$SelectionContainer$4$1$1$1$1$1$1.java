package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6813z;

    public SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1(TextDragObserver textDragObserver) {
        this.f6813z = textDragObserver;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object c2 = LongPressTextDragObserverKt.c(pointerInputScope, this.f6813z, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }
}
