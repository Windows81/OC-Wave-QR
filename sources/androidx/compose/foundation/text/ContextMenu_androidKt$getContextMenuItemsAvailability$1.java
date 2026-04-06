package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", l = {154}, m = "getContextMenuItemsAvailability")
public final class ContextMenu_androidKt$getContextMenuItemsAvailability$1 extends ContinuationImpl {
    public Object C;
    public boolean D;
    public /* synthetic */ Object E;
    public int F;

    public ContextMenu_androidKt$getContextMenuItemsAvailability$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return ContextMenu_androidKt.d((TextFieldSelectionState) null, this);
    }
}
