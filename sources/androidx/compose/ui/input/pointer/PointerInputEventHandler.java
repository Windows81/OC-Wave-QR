package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
public interface PointerInputEventHandler {
    Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation);
}
