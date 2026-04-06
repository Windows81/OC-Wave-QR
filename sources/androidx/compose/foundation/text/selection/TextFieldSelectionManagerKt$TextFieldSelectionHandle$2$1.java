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
public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f7007z;

    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(TextDragObserver textDragObserver) {
        this.f7007z = textDragObserver;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object c2 = LongPressTextDragObserverKt.c(pointerInputScope, this.f7007z, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }
}
