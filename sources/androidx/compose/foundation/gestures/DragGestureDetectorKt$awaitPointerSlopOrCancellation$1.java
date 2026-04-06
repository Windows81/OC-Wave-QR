package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {802, 825}, m = "awaitPointerSlopOrCancellation-6ksA65w")
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public float H;
    public /* synthetic */ Object I;
    public int J;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.h((AwaitPointerEventScope) null, 0, 0, (Orientation) null, 0, (Function2) null, this);
    }
}
