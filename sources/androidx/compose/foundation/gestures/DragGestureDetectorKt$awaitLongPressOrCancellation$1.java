package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {968}, m = "awaitLongPressOrCancellation-rnUCldI")
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public DragGestureDetectorKt$awaitLongPressOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.g((AwaitPointerEventScope) null, 0, this);
    }
}
