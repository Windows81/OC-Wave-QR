package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {851}, m = "awaitAllPointersUpWithSlopDetection")
public final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public float H;
    public /* synthetic */ Object I;
    public int J;

    public DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.b((AwaitPointerEventScope) null, (PointerInputChange) null, (PointerEventPass) null, this);
    }
}
