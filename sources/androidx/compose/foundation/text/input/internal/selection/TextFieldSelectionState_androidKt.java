package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class TextFieldSelectionState_androidKt {
    public static final Function1 a(TextFieldSelectionState textFieldSelectionState, ContextMenuState contextMenuState, State state, Function2 function2) {
        return new TextFieldSelectionState_androidKt$contextMenuBuilder$1(state, contextMenuState, function2, textFieldSelectionState);
    }
}
