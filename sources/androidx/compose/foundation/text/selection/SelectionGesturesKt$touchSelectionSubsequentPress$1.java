package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {281, 322}, m = "touchSelectionSubsequentPress")
public final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public long G;
    public /* synthetic */ Object H;
    public int I;

    public SelectionGesturesKt$touchSelectionSubsequentPress$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.I |= Integer.MIN_VALUE;
        return SelectionGesturesKt.q((AwaitPointerEventScope) null, (TextDragObserver) null, (PointerEvent) null, this);
    }
}
