package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1055}, m = "verticalDrag-jO51t88")
public final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public int I;

    public DragGestureDetectorKt$verticalDrag$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.I |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.u((AwaitPointerEventScope) null, 0, (Function1) null, this);
    }
}
