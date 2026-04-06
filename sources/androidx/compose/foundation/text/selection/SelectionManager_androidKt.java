package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class SelectionManager_androidKt {
    public static final Function1 a(SelectionManager selectionManager, ContextMenuState contextMenuState) {
        return new SelectionManager_androidKt$contextMenuBuilder$1(contextMenuState, selectionManager);
    }

    public static final boolean b(KeyEvent keyEvent) {
        return KeyMapping_androidKt.a().a(keyEvent) == KeyCommand.COPY;
    }

    public static final Modifier c(Modifier modifier, SelectionManager selectionManager) {
        return !Magnifier_androidKt.d(0, 1, (Object) null) ? modifier : ComposedModifierKt.c(modifier, (Function1) null, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager), 1, (Object) null);
    }
}
