package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", l = {167}, m = "getContextMenuItemsAvailability")
public final class ContextMenu_androidKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    public Object C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public int H;

    public ContextMenu_androidKt$getContextMenuItemsAvailability$2(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.G = obj;
        this.H |= Integer.MIN_VALUE;
        return ContextMenu_androidKt.e((TextFieldSelectionManager) null, this);
    }
}
