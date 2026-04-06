package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1311}, m = "copy")
public final class TextFieldSelectionState$copy$1 extends ContinuationImpl {
    public Object C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ TextFieldSelectionState F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$copy$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(continuation);
        this.F = textFieldSelectionState;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.H(false, this);
    }
}
