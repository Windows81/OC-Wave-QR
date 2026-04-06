package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

@Metadata
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier b(Modifier modifier, LegacyTextFieldState legacyTextFieldState, FocusManager focusManager) {
        return KeyInputModifierKt.b(modifier, new TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(focusManager, legacyTextFieldState));
    }

    public static final boolean c(KeyEvent keyEvent, int i2) {
        return Key_androidKt.b(KeyEvent_androidKt.a(keyEvent)) == i2;
    }
}
