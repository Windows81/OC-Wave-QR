package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1048}, m = "drag-VnAYq1g")
public final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public /* synthetic */ Object I;
    public int J;

    public DragGestureDetectorKt$drag$2(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.p((AwaitPointerEventScope) null, 0, (Function1) null, (Orientation) null, (Function1) null, this);
    }
}
