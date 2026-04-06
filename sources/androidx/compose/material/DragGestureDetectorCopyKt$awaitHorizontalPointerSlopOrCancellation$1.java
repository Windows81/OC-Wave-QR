package androidx.compose.material;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {125, 163}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public float G;
    public float H;
    public /* synthetic */ Object I;
    public int J;

    public DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.I = obj;
        this.J |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.a((AwaitPointerEventScope) null, 0, 0, (Function2) null, this);
    }
}
