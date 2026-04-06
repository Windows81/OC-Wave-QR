package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TextFieldSelectionManager_androidKt {
    public static final Function1 a(TextFieldSelectionManager textFieldSelectionManager, ContextMenuState contextMenuState, State state) {
        return new TextFieldSelectionManager_androidKt$contextMenuBuilder$1(state, contextMenuState, textFieldSelectionManager);
    }

    public static final boolean b(PointerEvent pointerEvent) {
        return false;
    }

    public static final Modifier c(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.d(0, 1, (Object) null) ? modifier : ComposedModifierKt.c(modifier, (Function1) null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager), 1, (Object) null);
    }
}
