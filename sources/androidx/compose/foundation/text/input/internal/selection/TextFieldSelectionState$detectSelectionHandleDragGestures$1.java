package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {984}, m = "detectSelectionHandleDragGestures")
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ TextFieldSelectionState H;
    public int I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.H = textFieldSelectionState;
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.O((PointerInputScope) null, false, this);
    }
}
